package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalRootRouter extends DurandalRouterBase[DurandalRootRouter] {
  
  /**
    * Activates the router and the underlying history tracking mechanism.
    * @returns {Promise} A promise that resolves when the router is ready.
    */
  def activate(): DurandalPromise[_] = js.native
  def activate(options: DurandalHistoryOptions): DurandalPromise[_] = js.native
  
  /**
    * Disable history, perhaps temporarily. Not useful in a real app, but possibly useful for unit testing Routers.
    */
  def deactivate(): Unit = js.native
  
  /**
    * Installs the router's custom ko binding handler.
    */
  def install(): Unit = js.native
  
  /**
    * Makes the RegExp generated for routes case sensitive, rather than the default of case insensitive.
    */
  def makeRoutesCaseSensitive(): Unit = js.native
}
