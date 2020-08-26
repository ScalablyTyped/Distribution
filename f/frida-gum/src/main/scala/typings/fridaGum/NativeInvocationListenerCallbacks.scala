package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeInvocationListenerCallbacks extends InvocationListenerCallbacks {
  /**
    * Called synchronously when a thread is about to enter the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onEnter (GumInvocationContext * ic)`
    */
  var onEnter: js.UndefOr[NativePointer] = js.native
  /**
    * Called synchronously when a thread is about to leave the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onLeave (GumInvocationContext * ic)`
    */
  var onLeave: js.UndefOr[NativePointer] = js.native
}

object NativeInvocationListenerCallbacks {
  @scala.inline
  def apply(): NativeInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeInvocationListenerCallbacks]
  }
  @scala.inline
  implicit class NativeInvocationListenerCallbacksOps[Self <: NativeInvocationListenerCallbacks] (val x: Self) extends AnyVal {
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
    def setOnEnter(value: NativePointer): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnLeave(value: NativePointer): Self = this.set("onLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
  }
  
}

