package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptInvocationListenerCallbacks extends InvocationListenerCallbacks {
  /**
    * Called synchronously when a thread is about to enter the target function.
    */
  var onEnter: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]
  ] = js.undefined
  /**
    * Called synchronously when a thread is about to leave the target function.
    */
  var onLeave: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]
  ] = js.undefined
}

object ScriptInvocationListenerCallbacks {
  @scala.inline
  def apply(
    onEnter: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit] = null,
    onLeave: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit] = null
  ): ScriptInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptInvocationListenerCallbacks]
  }
}

