package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to invoke synchronously before and after a function call.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ScriptInvocationListenerCallbacks
  - typings.fridaGum.NativeInvocationListenerCallbacks
*/
trait InvocationListenerCallbacks extends js.Object

object InvocationListenerCallbacks {
  @scala.inline
  def ScriptInvocationListenerCallbacks(
    onEnter: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit] = null,
    onLeave: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit] = null
  ): InvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationListenerCallbacks]
  }
  @scala.inline
  def NativeInvocationListenerCallbacks(onEnter: NativePointer = null, onLeave: NativePointer = null): InvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationListenerCallbacks]
  }
}

