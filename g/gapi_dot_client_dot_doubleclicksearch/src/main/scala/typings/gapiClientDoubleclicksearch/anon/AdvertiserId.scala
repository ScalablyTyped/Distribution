package typings.gapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserId extends js.Object {
  /** Numeric ID of the advertiser. */
  var advertiserId: String = js.native
  /** Numeric ID of the agency. */
  var agencyId: String = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd. */
  var endDate: Double = js.native
  /** Numeric ID of the engine account. */
  var engineAccountId: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** The number of conversions to return per call. */
  var rowCount: Double = js.native
  /** First date (inclusive) on which to retrieve conversions. Format is yyyymmdd. */
  var startDate: Double = js.native
  /** The 0-based starting index for retrieving conversions results. */
  var startRow: Double = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object AdvertiserId {
  @scala.inline
  def apply(
    advertiserId: String,
    agencyId: String,
    endDate: Double,
    engineAccountId: String,
    rowCount: Double,
    startDate: Double,
    startRow: Double
  ): AdvertiserId = {
    val __obj = js.Dynamic.literal(advertiserId = advertiserId.asInstanceOf[js.Any], agencyId = agencyId.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], engineAccountId = engineAccountId.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiserId]
  }
  @scala.inline
  implicit class AdvertiserIdOps[Self <: AdvertiserId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: Double): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEngineAccountId(value: String): Self = this.set("engineAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Double): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

