package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeInvocationListenerCallbacks extends InvocationListenerCallbacks {
  /**
    * Called synchronously when a thread is about to enter the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onEnter (GumInvocationContext * ic)`
    */
  var onEnter: js.UndefOr[NativePointer] = js.undefined
  /**
    * Called synchronously when a thread is about to leave the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onLeave (GumInvocationContext * ic)`
    */
  var onLeave: js.UndefOr[NativePointer] = js.undefined
}

object NativeInvocationListenerCallbacks {
  @scala.inline
  def apply(onEnter: NativePointer = null, onLeave: NativePointer = null): NativeInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeInvocationListenerCallbacks]
  }
}

