package typings
package expressDashToDashKoaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-to-koa", JSImport.Namespace)
@js.native
object expressDashToDashKoaMod extends js.Object {
  def apply(
    middleware: js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
}

