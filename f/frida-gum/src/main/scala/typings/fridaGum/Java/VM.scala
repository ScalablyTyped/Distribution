package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VM extends js.Object {
  /**
    * Gets a wrapper for the current thread's `JNIEnv`.
    *
    * Throws an exception if the current thread is not attached to the VM.
    */
  def getEnv(): Env = js.native
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def perform(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Tries to get a wrapper for the current thread's `JNIEnv`.
    *
    * Returns `null` if the current thread is not attached to the VM.
    */
  def tryGetEnv(): Env | Null = js.native
}

object VM {
  @scala.inline
  def apply(getEnv: () => Env, perform: js.Function0[Unit] => Unit, tryGetEnv: () => Env | Null): VM = {
    val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv), perform = js.Any.fromFunction1(perform), tryGetEnv = js.Any.fromFunction0(tryGetEnv))
    __obj.asInstanceOf[VM]
  }
  @scala.inline
  implicit class VMOps[Self <: VM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetEnv(value: () => Env): Self = this.set("getEnv", js.Any.fromFunction0(value))
    @scala.inline
    def setPerform(value: js.Function0[Unit] => Unit): Self = this.set("perform", js.Any.fromFunction1(value))
    @scala.inline
    def setTryGetEnv(value: () => Env | Null): Self = this.set("tryGetEnv", js.Any.fromFunction0(value))
  }
  
}

