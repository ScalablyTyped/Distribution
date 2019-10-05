package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privileges extends js.Object {
  /**
    * Default false.
    */
  var allowServiceWorkers: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false.
    */
  var bypassCSP: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false.
    */
  var corsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false.
    */
  var standard: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false.
    */
  var supportFetchAPI: js.UndefOr[Boolean] = js.undefined
}

object Privileges {
  @scala.inline
  def apply(
    allowServiceWorkers: js.UndefOr[Boolean] = js.undefined,
    bypassCSP: js.UndefOr[Boolean] = js.undefined,
    corsEnabled: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    standard: js.UndefOr[Boolean] = js.undefined,
    supportFetchAPI: js.UndefOr[Boolean] = js.undefined
  ): Privileges = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowServiceWorkers)) __obj.updateDynamic("allowServiceWorkers")(allowServiceWorkers)
    if (!js.isUndefined(bypassCSP)) __obj.updateDynamic("bypassCSP")(bypassCSP)
    if (!js.isUndefined(corsEnabled)) __obj.updateDynamic("corsEnabled")(corsEnabled)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(standard)) __obj.updateDynamic("standard")(standard)
    if (!js.isUndefined(supportFetchAPI)) __obj.updateDynamic("supportFetchAPI")(supportFetchAPI)
    __obj.asInstanceOf[Privileges]
  }
}

