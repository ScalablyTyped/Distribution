package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversion extends js.Object {
  var childDirectedTreatment: js.UndefOr[Boolean] = js.undefined
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.undefined
  var encryptedUserId: js.UndefOr[String] = js.undefined
  var encryptedUserIdCandidates: js.UndefOr[js.Array[String]] = js.undefined
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  var gclid: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var limitAdTracking: js.UndefOr[Boolean] = js.undefined
  var mobileDeviceId: js.UndefOr[String] = js.undefined
  var nonPersonalizedAd: js.UndefOr[Boolean] = js.undefined
  var ordinal: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[String] = js.undefined
  var timestampMicros: js.UndefOr[String] = js.undefined
  var treatmentForUnderage: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Conversion {
  @scala.inline
  def apply(
    childDirectedTreatment: js.UndefOr[Boolean] = js.undefined,
    customVariables: js.Array[CustomFloodlightVariable] = null,
    encryptedUserId: String = null,
    encryptedUserIdCandidates: js.Array[String] = null,
    floodlightActivityId: String = null,
    floodlightConfigurationId: String = null,
    gclid: String = null,
    kind: String = null,
    limitAdTracking: js.UndefOr[Boolean] = js.undefined,
    mobileDeviceId: String = null,
    nonPersonalizedAd: js.UndefOr[Boolean] = js.undefined,
    ordinal: String = null,
    quantity: String = null,
    timestampMicros: String = null,
    treatmentForUnderage: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): Conversion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(childDirectedTreatment)) __obj.updateDynamic("childDirectedTreatment")(childDirectedTreatment.get.asInstanceOf[js.Any])
    if (customVariables != null) __obj.updateDynamic("customVariables")(customVariables.asInstanceOf[js.Any])
    if (encryptedUserId != null) __obj.updateDynamic("encryptedUserId")(encryptedUserId.asInstanceOf[js.Any])
    if (encryptedUserIdCandidates != null) __obj.updateDynamic("encryptedUserIdCandidates")(encryptedUserIdCandidates.asInstanceOf[js.Any])
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (gclid != null) __obj.updateDynamic("gclid")(gclid.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(limitAdTracking)) __obj.updateDynamic("limitAdTracking")(limitAdTracking.get.asInstanceOf[js.Any])
    if (mobileDeviceId != null) __obj.updateDynamic("mobileDeviceId")(mobileDeviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersonalizedAd)) __obj.updateDynamic("nonPersonalizedAd")(nonPersonalizedAd.get.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (timestampMicros != null) __obj.updateDynamic("timestampMicros")(timestampMicros.asInstanceOf[js.Any])
    if (!js.isUndefined(treatmentForUnderage)) __obj.updateDynamic("treatmentForUnderage")(treatmentForUnderage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversion]
  }
}

