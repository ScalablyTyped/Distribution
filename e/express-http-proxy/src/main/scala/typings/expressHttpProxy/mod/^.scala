package typings.expressHttpProxy.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(host: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(host: String, options: ProxyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    host: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String],
    options: ProxyOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
