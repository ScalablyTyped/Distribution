package typings.easyXHeaders.expressMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T] extends js.Object {
  def apply(name: String, handlers: RequestHandler*): T = js.native
  def apply(name: RegExp, handlers: RequestHandler*): T = js.native
}

