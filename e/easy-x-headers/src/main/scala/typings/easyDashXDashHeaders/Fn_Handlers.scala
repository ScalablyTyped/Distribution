package typings.easyDashXDashHeaders

import typings.easyDashXDashHeaders.expressMod.Application
import typings.easyDashXDashHeaders.expressMod.RequestHandler
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Handlers extends js.Object {
  def apply(name: String): js.Any = js.native
   // Getter
  def apply(name: String, handlers: RequestHandler*): Application = js.native
  def apply(name: RegExp, handlers: RequestHandler*): Application = js.native
}

