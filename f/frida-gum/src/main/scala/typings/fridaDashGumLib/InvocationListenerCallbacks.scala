package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to invoke synchronously before and after a function call.
  */
trait InvocationListenerCallbacks extends js.Object {
  var onEnter: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, scala.Unit]
  ] = js.undefined
  var onLeave: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, scala.Unit]
  ] = js.undefined
}

object InvocationListenerCallbacks {
  @scala.inline
  def apply(
    onEnter: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, scala.Unit] = null,
    onLeave: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, scala.Unit] = null
  ): InvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave)
    __obj.asInstanceOf[InvocationListenerCallbacks]
  }
}

