package typings.expressDashHttpDashProxy.expressDashHttpDashProxyMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(host: String): RequestHandler[ParamsDictionary] = js.native
  def apply(host: String, options: ProxyOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(host: js.Function1[/* req */ Request[ParamsDictionary], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(host: js.Function1[/* req */ Request[ParamsDictionary], String], options: ProxyOptions): RequestHandler[ParamsDictionary] = js.native
}

