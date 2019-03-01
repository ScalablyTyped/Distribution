package typings
package expressDashWsDashRoutesLib.expressDashWsDashRoutesMod.expressWsRoutesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var origin: java.lang.String
  var req: expressLib.expressMod.eNs.Request
  var secure: scala.Boolean
}

object ClientInfo {
  @scala.inline
  def apply(origin: java.lang.String, req: expressLib.expressMod.eNs.Request, secure: scala.Boolean): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ClientInfo]
  }
}

