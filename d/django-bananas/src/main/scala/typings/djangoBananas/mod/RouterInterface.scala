package typings.djangoBananas.mod

import typings.djangoBananas.anon.Action
import typings.djangoBananas.anon.Patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterInterface extends StObject {
  
  def reroute(to: String): Action = js.native
  def reroute(to: RouteData): Action = js.native
  
  def route(to: String): Action = js.native
  def route(to: String, extra: Patch): Action = js.native
  def route(to: RouteData): Action = js.native
  def route(to: RouteData, extra: Patch): Action = js.native
}
