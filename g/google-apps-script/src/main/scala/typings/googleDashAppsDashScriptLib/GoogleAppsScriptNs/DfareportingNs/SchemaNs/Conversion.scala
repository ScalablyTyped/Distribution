package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversion extends js.Object {
  var childDirectedTreatment: js.UndefOr[scala.Boolean] = js.undefined
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.undefined
  var encryptedUserId: js.UndefOr[java.lang.String] = js.undefined
  var encryptedUserIdCandidates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  var floodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  var gclid: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var limitAdTracking: js.UndefOr[scala.Boolean] = js.undefined
  var mobileDeviceId: js.UndefOr[java.lang.String] = js.undefined
  var nonPersonalizedAd: js.UndefOr[scala.Boolean] = js.undefined
  var ordinal: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[java.lang.String] = js.undefined
  var timestampMicros: js.UndefOr[java.lang.String] = js.undefined
  var treatmentForUnderage: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[stdLib.Number] = js.undefined
}

object Conversion {
  @scala.inline
  def apply(
    childDirectedTreatment: js.UndefOr[scala.Boolean] = js.undefined,
    customVariables: js.Array[CustomFloodlightVariable] = null,
    encryptedUserId: java.lang.String = null,
    encryptedUserIdCandidates: js.Array[java.lang.String] = null,
    floodlightActivityId: java.lang.String = null,
    floodlightConfigurationId: java.lang.String = null,
    gclid: java.lang.String = null,
    kind: java.lang.String = null,
    limitAdTracking: js.UndefOr[scala.Boolean] = js.undefined,
    mobileDeviceId: java.lang.String = null,
    nonPersonalizedAd: js.UndefOr[scala.Boolean] = js.undefined,
    ordinal: java.lang.String = null,
    quantity: java.lang.String = null,
    timestampMicros: java.lang.String = null,
    treatmentForUnderage: js.UndefOr[scala.Boolean] = js.undefined,
    value: stdLib.Number = null
  ): Conversion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childDirectedTreatment)) __obj.updateDynamic("childDirectedTreatment")(childDirectedTreatment)
    if (customVariables != null) __obj.updateDynamic("customVariables")(customVariables)
    if (encryptedUserId != null) __obj.updateDynamic("encryptedUserId")(encryptedUserId)
    if (encryptedUserIdCandidates != null) __obj.updateDynamic("encryptedUserIdCandidates")(encryptedUserIdCandidates)
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId)
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId)
    if (gclid != null) __obj.updateDynamic("gclid")(gclid)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(limitAdTracking)) __obj.updateDynamic("limitAdTracking")(limitAdTracking)
    if (mobileDeviceId != null) __obj.updateDynamic("mobileDeviceId")(mobileDeviceId)
    if (!js.isUndefined(nonPersonalizedAd)) __obj.updateDynamic("nonPersonalizedAd")(nonPersonalizedAd)
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (timestampMicros != null) __obj.updateDynamic("timestampMicros")(timestampMicros)
    if (!js.isUndefined(treatmentForUnderage)) __obj.updateDynamic("treatmentForUnderage")(treatmentForUnderage)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Conversion]
  }
}

