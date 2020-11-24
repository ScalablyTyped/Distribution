package typings.easySession.mod

import typings.easySession.anon.Call
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("easy-session", "main")
@js.native
object main extends js.Object {
  
  def apply(session: Call): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(session: Call, options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
