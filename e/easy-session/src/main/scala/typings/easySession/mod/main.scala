package typings.easySession.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "main")
@js.native
object main extends js.Object {
  def apply(session: js.Any): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(session: js.Any, options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

