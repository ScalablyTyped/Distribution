package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseInfo extends js.Object {
  var durationInSecs: js.UndefOr[scala.Double] = js.undefined
  var evictionTimestamp: js.UndefOr[scala.Double] = js.undefined
  var lastRenewalTimestamp: js.UndefOr[scala.Double] = js.undefined
  var registrationTimestamp: js.UndefOr[scala.Double] = js.undefined
  var renewalIntervalInSecs: js.UndefOr[scala.Double] = js.undefined
  var serviceUpTimestamp: js.UndefOr[scala.Double] = js.undefined
}

object LeaseInfo {
  @scala.inline
  def apply(
    durationInSecs: scala.Int | scala.Double = null,
    evictionTimestamp: scala.Int | scala.Double = null,
    lastRenewalTimestamp: scala.Int | scala.Double = null,
    registrationTimestamp: scala.Int | scala.Double = null,
    renewalIntervalInSecs: scala.Int | scala.Double = null,
    serviceUpTimestamp: scala.Int | scala.Double = null
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

