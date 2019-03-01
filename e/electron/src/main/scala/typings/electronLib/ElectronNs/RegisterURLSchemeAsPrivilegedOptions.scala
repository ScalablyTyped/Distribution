package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterURLSchemeAsPrivilegedOptions extends js.Object {
  /**
    * Default true.
    */
  var allowServiceWorkers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default true.
    */
  var bypassCSP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default true.
    */
  var corsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default true.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default true.
    */
  var supportFetchAPI: js.UndefOr[scala.Boolean] = js.undefined
}

object RegisterURLSchemeAsPrivilegedOptions {
  @scala.inline
  def apply(
    allowServiceWorkers: js.UndefOr[scala.Boolean] = js.undefined,
    bypassCSP: js.UndefOr[scala.Boolean] = js.undefined,
    corsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    supportFetchAPI: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterURLSchemeAsPrivilegedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowServiceWorkers)) __obj.updateDynamic("allowServiceWorkers")(allowServiceWorkers)
    if (!js.isUndefined(bypassCSP)) __obj.updateDynamic("bypassCSP")(bypassCSP)
    if (!js.isUndefined(corsEnabled)) __obj.updateDynamic("corsEnabled")(corsEnabled)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(supportFetchAPI)) __obj.updateDynamic("supportFetchAPI")(supportFetchAPI)
    __obj.asInstanceOf[RegisterURLSchemeAsPrivilegedOptions]
  }
}

