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

