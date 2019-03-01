package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfile extends js.Object {
  /** Account ID of the user profile. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this user profile is active. This defaults to false, and must be set true on insert for the user profile to be usable. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Filter that describes which advertisers are visible to the user profile. */
  var advertiserFilter: js.UndefOr[ObjectFilter] = js.undefined
  /** Filter that describes which campaigns are visible to the user profile. */
  var campaignFilter: js.UndefOr[ObjectFilter] = js.undefined
  /** Comments for this user profile. */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /** Email of the user profile. The email addresss must be linked to a Google Account. This field is required on insertion and is read-only after insertion. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user profile. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountUserProfile". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Locale of the user profile. This is a required field.
    * Acceptable values are:
    * - "cs" (Czech)
    * - "de" (German)
    * - "en" (English)
    * - "en-GB" (English United Kingdom)
    * - "es" (Spanish)
    * - "fr" (French)
    * - "it" (Italian)
    * - "ja" (Japanese)
    * - "ko" (Korean)
    * - "pl" (Polish)
    * - "pt-BR" (Portuguese Brazil)
    * - "ru" (Russian)
    * - "sv" (Swedish)
    * - "tr" (Turkish)
    * - "zh-CN" (Chinese Simplified)
    * - "zh-TW" (Chinese Traditional)
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the user profile. This is a required field. Must be less than 64 characters long, must be globally unique, and cannot contain whitespace or any
    * of the following characters: "&;"#%,".
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Filter that describes which sites are visible to the user profile. */
  var siteFilter: js.UndefOr[ObjectFilter] = js.undefined
  /** Subaccount ID of the user profile. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Trafficker type of this user profile. */
  var traffickerType: js.UndefOr[java.lang.String] = js.undefined
  /** User type of the user profile. This is a read-only field that can be left blank. */
  var userAccessType: js.UndefOr[java.lang.String] = js.undefined
  /** Filter that describes which user roles are visible to the user profile. */
  var userRoleFilter: js.UndefOr[ObjectFilter] = js.undefined
  /** User role ID of the user profile. This is a required field. */
  var userRoleId: js.UndefOr[java.lang.String] = js.undefined
}

object AccountUserProfile {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    advertiserFilter: ObjectFilter = null,
    campaignFilter: ObjectFilter = null,
    comments: java.lang.String = null,
    email: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null,
    siteFilter: ObjectFilter = null,
    subaccountId: java.lang.String = null,
    traffickerType: java.lang.String = null,
    userAccessType: java.lang.String = null,
    userRoleFilter: ObjectFilter = null,
    userRoleId: java.lang.String = null
  ): AccountUserProfile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserFilter != null) __obj.updateDynamic("advertiserFilter")(advertiserFilter)
    if (campaignFilter != null) __obj.updateDynamic("campaignFilter")(campaignFilter)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (siteFilter != null) __obj.updateDynamic("siteFilter")(siteFilter)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (traffickerType != null) __obj.updateDynamic("traffickerType")(traffickerType)
    if (userAccessType != null) __obj.updateDynamic("userAccessType")(userAccessType)
    if (userRoleFilter != null) __obj.updateDynamic("userRoleFilter")(userRoleFilter)
    if (userRoleId != null) __obj.updateDynamic("userRoleId")(userRoleId)
    __obj.asInstanceOf[AccountUserProfile]
  }
}

