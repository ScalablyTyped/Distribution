package typings.easyXapiUtils

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-xapi-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def hasRole(role: String): RequestHandler[ParamsDictionary] = js.native
  def isLoggedIn(): RequestHandler[ParamsDictionary] = js.native
  def isLoggedIn(role: String): RequestHandler[ParamsDictionary] = js.native
  def isLoggedOut(): RequestHandler[ParamsDictionary] = js.native
}

