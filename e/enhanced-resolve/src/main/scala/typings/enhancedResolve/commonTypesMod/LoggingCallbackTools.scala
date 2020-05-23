package typings.enhancedResolve.commonTypesMod

import typings.enhancedResolve.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingCallbackTools extends js.Object {
  var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var missing: js.UndefOr[js.Array[String] | Push] = js.undefined
  var stack: js.UndefOr[js.Array[String]] = js.undefined
}

object LoggingCallbackTools {
  @scala.inline
  def apply(
    log: /* msg */ String => Unit = null,
    missing: js.Array[String] | Push = null,
    stack: js.Array[String] = null
  ): LoggingCallbackTools = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingCallbackTools]
  }
}

