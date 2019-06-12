package typings
package fridaDashGumLib.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VM extends js.Object {
  /**
    * Gets a wrapper for the current thread's `JNIEnv`.
    *
    * Throws an exception if the current thread is not attached to the VM.
    */
  def getEnv(): Env
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def perform(fn: js.Function0[scala.Unit]): scala.Unit
  /**
    * Tries to get a wrapper for the current thread's `JNIEnv`.
    *
    * Returns `null` if the current thread is not attached to the VM.
    */
  def tryGetEnv(): Env | scala.Null
}

object VM {
  @scala.inline
  def apply(
    getEnv: () => Env,
    perform: js.Function0[scala.Unit] => scala.Unit,
    tryGetEnv: () => Env | scala.Null
  ): VM = {
    val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv), perform = js.Any.fromFunction1(perform), tryGetEnv = js.Any.fromFunction0(tryGetEnv))
  
    __obj.asInstanceOf[VM]
  }
}

