package typings.expressDashHttpDashProxy.expressDashHttpDashProxyMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(host: String): RequestHandler = js.native
  def apply(host: String, options: ProxyOptions): RequestHandler = js.native
  def apply(host: js.Function1[/* req */ Request, String]): RequestHandler = js.native
  def apply(host: js.Function1[/* req */ Request, String], options: ProxyOptions): RequestHandler = js.native
}

