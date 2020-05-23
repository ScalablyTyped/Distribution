package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseInfo extends js.Object {
  var durationInSecs: js.UndefOr[Double] = js.undefined
  var evictionTimestamp: js.UndefOr[Double] = js.undefined
  var lastRenewalTimestamp: js.UndefOr[Double] = js.undefined
  var registrationTimestamp: js.UndefOr[Double] = js.undefined
  var renewalIntervalInSecs: js.UndefOr[Double] = js.undefined
  var serviceUpTimestamp: js.UndefOr[Double] = js.undefined
}

object LeaseInfo {
  @scala.inline
  def apply(
    durationInSecs: js.UndefOr[Double] = js.undefined,
    evictionTimestamp: js.UndefOr[Double] = js.undefined,
    lastRenewalTimestamp: js.UndefOr[Double] = js.undefined,
    registrationTimestamp: js.UndefOr[Double] = js.undefined,
    renewalIntervalInSecs: js.UndefOr[Double] = js.undefined,
    serviceUpTimestamp: js.UndefOr[Double] = js.undefined
  ): LeaseInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(durationInSecs)) __obj.updateDynamic("durationInSecs")(durationInSecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evictionTimestamp)) __obj.updateDynamic("evictionTimestamp")(evictionTimestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRenewalTimestamp)) __obj.updateDynamic("lastRenewalTimestamp")(lastRenewalTimestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(registrationTimestamp)) __obj.updateDynamic("registrationTimestamp")(registrationTimestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renewalIntervalInSecs)) __obj.updateDynamic("renewalIntervalInSecs")(renewalIntervalInSecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceUpTimestamp)) __obj.updateDynamic("serviceUpTimestamp")(serviceUpTimestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseInfo]
  }
}

