package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClient

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
    durationInSecs: Int | Double = null,
    evictionTimestamp: Int | Double = null,
    lastRenewalTimestamp: Int | Double = null,
    registrationTimestamp: Int | Double = null,
    renewalIntervalInSecs: Int | Double = null,
    serviceUpTimestamp: Int | Double = null
  ): LeaseInfo = {
    val __obj = js.Dynamic.literal()
    if (durationInSecs != null) __obj.updateDynamic("durationInSecs")(durationInSecs.asInstanceOf[js.Any])
    if (evictionTimestamp != null) __obj.updateDynamic("evictionTimestamp")(evictionTimestamp.asInstanceOf[js.Any])
    if (lastRenewalTimestamp != null) __obj.updateDynamic("lastRenewalTimestamp")(lastRenewalTimestamp.asInstanceOf[js.Any])
    if (registrationTimestamp != null) __obj.updateDynamic("registrationTimestamp")(registrationTimestamp.asInstanceOf[js.Any])
    if (renewalIntervalInSecs != null) __obj.updateDynamic("renewalIntervalInSecs")(renewalIntervalInSecs.asInstanceOf[js.Any])
    if (serviceUpTimestamp != null) __obj.updateDynamic("serviceUpTimestamp")(serviceUpTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseInfo]
  }
}

