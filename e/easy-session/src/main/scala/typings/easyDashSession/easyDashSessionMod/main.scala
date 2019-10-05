package typings.easyDashSession.easyDashSessionMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "main")
@js.native
object main extends js.Object {
  def apply(session: js.Any): RequestHandler = js.native
  def apply(session: js.Any, options: SessionOptions): RequestHandler = js.native
}

