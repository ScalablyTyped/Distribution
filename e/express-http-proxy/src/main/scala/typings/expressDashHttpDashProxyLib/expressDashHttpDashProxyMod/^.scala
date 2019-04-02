package typings
package expressDashHttpDashProxyLib.expressDashHttpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    host: java.lang.String | (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String])
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    host: java.lang.String | (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]),
    options: ProxyOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
}

