package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversion extends js.Object {
  /** Whether the conversion was directed toward children. */
  var childDirectedTreatment: js.UndefOr[scala.Boolean] = js.undefined
  /** Custom floodlight variables. */
  var customVariables: js.UndefOr[js.Array[CustomFloodlightVariable]] = js.undefined
  /**
    * The alphanumeric encrypted user ID. When set, encryptionInfo should also be specified. This field is mutually exclusive with
    * encryptedUserIdCandidates[], mobileDeviceId and gclid. This or encryptedUserIdCandidates[] or mobileDeviceId or gclid is a required field.
    */
  var encryptedUserId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of the alphanumeric encrypted user IDs. Any user ID with exposure prior to the conversion timestamp will be used in the inserted conversion. If
    * no such user ID is found then the conversion will be rejected with NO_COOKIE_MATCH_FOUND error. When set, encryptionInfo should also be specified. This
    * field may only be used when calling batchinsert; it is not supported by batchupdate. This field is mutually exclusive with encryptedUserId,
    * mobileDeviceId and gclid. This or encryptedUserId or mobileDeviceId or gclid is a required field.
    */
  var encryptedUserIdCandidates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Floodlight Activity ID of this conversion. This is a required field. */
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  /** Floodlight Configuration ID of this conversion. This is a required field. */
  var floodlightConfigurationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Google click ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[] and mobileDeviceId. This or encryptedUserId or
    * encryptedUserIdCandidates[] or mobileDeviceId is a required field.
    */
  var gclid: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversion". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether Limit Ad Tracking is enabled. When set to true, the conversion will be used for reporting but not targeting. This will prevent remarketing. */
  var limitAdTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The mobile device ID. This field is mutually exclusive with encryptedUserId, encryptedUserIdCandidates[] and gclid. This or encryptedUserId or
    * encryptedUserIdCandidates[] or gclid is a required field.
    */
  var mobileDeviceId: js.UndefOr[java.lang.String] = js.undefined
  /** The ordinal of the conversion. Use this field to control how conversions of the same user and day are de-duplicated. This is a required field. */
  var ordinal: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity of the conversion. */
  var quantity: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp of conversion, in Unix epoch micros. This is a required field. */
  var timestampMicros: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the conversion. */
  var value: js.UndefOr[scala.Double] = js.undefined
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
    ordinal: java.lang.String = null,
    quantity: java.lang.String = null,
    timestampMicros: java.lang.String = null,
    value: scala.Int | scala.Double = null
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
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (timestampMicros != null) __obj.updateDynamic("timestampMicros")(timestampMicros)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversion]
  }
}

