package typings
package easyDashXDashHeadersLib.expressMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T] extends js.Object {
  def apply(name: java.lang.String, handlers: RequestHandler*): T = js.native
  def apply(name: stdLib.RegExp, handlers: RequestHandler*): T = js.native
}

