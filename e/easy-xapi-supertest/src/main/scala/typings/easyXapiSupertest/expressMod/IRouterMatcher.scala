package typings.easyXapiSupertest.expressMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterMatcher[T] extends js.Object {
  
  def apply(name: String, handlers: RequestHandler*): T = js.native
  def apply(name: RegExp, handlers: RequestHandler*): T = js.native
}
