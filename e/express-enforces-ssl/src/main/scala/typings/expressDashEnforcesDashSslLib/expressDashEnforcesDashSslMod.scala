package typings
package expressDashEnforcesDashSslLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-enforces-ssl", JSImport.Namespace)
@js.native
object expressDashEnforcesDashSslMod extends js.Object {
  /**
    * Enforces HTTPS connections on any incoming requests.
    */
  def apply(): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ] = js.native
}

