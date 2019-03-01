package typings
package finalhandlerLib.finalhandlerMod.finalHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var message: js.UndefOr[
    scala.Boolean | (js.Function2[/* err */ js.Any, /* status */ scala.Double, java.lang.String])
  ] = js.undefined
  var onerror: js.UndefOr[
    js.Function3[
      /* err */ js.Any, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var stacktrace: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    message: scala.Boolean | (js.Function2[/* err */ js.Any, /* status */ scala.Double, java.lang.String]) = null,
    onerror: js.Function3[
      /* err */ js.Any, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ] = null,
    stacktrace: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (!js.isUndefined(stacktrace)) __obj.updateDynamic("stacktrace")(stacktrace)
    __obj.asInstanceOf[Options]
  }
}

