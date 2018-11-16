package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalRootRouter extends DurandalRouterBase[DurandalRootRouter] {
  /**
       * Activates the router and the underlying history tracking mechanism.
       * @returns {Promise} A promise that resolves when the router is ready.
       */
  def activate(): DurandalPromise[_] = js.native
  /**
       * Activates the router and the underlying history tracking mechanism.
       * @returns {Promise} A promise that resolves when the router is ready.
       */
  def activate(options: DurandalHistoryOptions): DurandalPromise[_] = js.native
  /**
       * Disable history, perhaps temporarily. Not useful in a real app, but possibly useful for unit testing Routers.
       */
  def deactivate(): scala.Unit = js.native
  /**
       * Installs the router's custom ko binding handler.
       */
  def install(): scala.Unit = js.native
  /**
       * Makes the RegExp generated for routes case sensitive, rather than the default of case insensitive.
       */
  def makeRoutesCaseSensitive(): scala.Unit = js.native
}

