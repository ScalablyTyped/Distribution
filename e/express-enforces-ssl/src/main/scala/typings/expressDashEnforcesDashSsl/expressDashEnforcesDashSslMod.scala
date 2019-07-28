package typings.expressDashEnforcesDashSsl

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-enforces-ssl", JSImport.Namespace)
@js.native
object expressDashEnforcesDashSslMod extends js.Object {
  /**
    * Enforces HTTPS connections on any incoming requests.
    */
  def apply(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

