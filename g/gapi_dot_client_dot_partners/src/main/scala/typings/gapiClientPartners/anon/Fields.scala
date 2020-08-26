package typings.gapiClientPartners.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Experiment IDs the current request belongs to. */
  @JSName("requestMetadata.experimentIds")
  var requestMetadataDotexperimentIds: js.UndefOr[String] = js.native
  /** Locale to use for the current request. */
  @JSName("requestMetadata.locale")
  var requestMetadataDotlocale: js.UndefOr[String] = js.native
  /** Google Partners session ID. */
  @JSName("requestMetadata.partnersSessionId")
  var requestMetadataDotpartnersSessionId: js.UndefOr[String] = js.native
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSourceId")
  var requestMetadataDottrafficSourceDottrafficSourceId: js.UndefOr[String] = js.native
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSubId")
  var requestMetadataDottrafficSourceDottrafficSubId: js.UndefOr[String] = js.native
  /** IP address to use instead of the user's geo-located IP address. */
  @JSName("requestMetadata.userOverrides.ipAddress")
  var requestMetadataDotuserOverridesDotipAddress: js.UndefOr[String] = js.native
  /** Logged-in user ID to impersonate instead of the user's ID. */
  @JSName("requestMetadata.userOverrides.userId")
  var requestMetadataDotuserOverridesDotuserId: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

object Fields {
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
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
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setBearer_token(value: String): Self = this.set("bearer_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearer_token: Self = this.set("bearer_token", js.undefined)
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
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
    def setPp(value: Boolean): Self = this.set("pp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePp: Self = this.set("pp", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setRequestMetadataDotexperimentIds(value: String): Self = this.set("requestMetadata.experimentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDotexperimentIds: Self = this.set("requestMetadata.experimentIds", js.undefined)
    @scala.inline
    def setRequestMetadataDotlocale(value: String): Self = this.set("requestMetadata.locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDotlocale: Self = this.set("requestMetadata.locale", js.undefined)
    @scala.inline
    def setRequestMetadataDotpartnersSessionId(value: String): Self = this.set("requestMetadata.partnersSessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDotpartnersSessionId: Self = this.set("requestMetadata.partnersSessionId", js.undefined)
    @scala.inline
    def setRequestMetadataDottrafficSourceDottrafficSourceId(value: String): Self = this.set("requestMetadata.trafficSource.trafficSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDottrafficSourceDottrafficSourceId: Self = this.set("requestMetadata.trafficSource.trafficSourceId", js.undefined)
    @scala.inline
    def setRequestMetadataDottrafficSourceDottrafficSubId(value: String): Self = this.set("requestMetadata.trafficSource.trafficSubId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDottrafficSourceDottrafficSubId: Self = this.set("requestMetadata.trafficSource.trafficSubId", js.undefined)
    @scala.inline
    def setRequestMetadataDotuserOverridesDotipAddress(value: String): Self = this.set("requestMetadata.userOverrides.ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDotuserOverridesDotipAddress: Self = this.set("requestMetadata.userOverrides.ipAddress", js.undefined)
    @scala.inline
    def setRequestMetadataDotuserOverridesDotuserId(value: String): Self = this.set("requestMetadata.userOverrides.userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadataDotuserOverridesDotuserId: Self = this.set("requestMetadata.userOverrides.userId", js.undefined)
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
  
}

