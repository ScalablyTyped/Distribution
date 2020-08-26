package typings.gapiClientPeople.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceNames extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Required. A field mask to restrict which fields on each person are returned. Multiple
    * fields can be specified by separating them with commas. Valid values are:
    *
    * &#42; addresses
    * &#42; ageRanges
    * &#42; biographies
    * &#42; birthdays
    * &#42; braggingRights
    * &#42; coverPhotos
    * &#42; emailAddresses
    * &#42; events
    * &#42; genders
    * &#42; imClients
    * &#42; interests
    * &#42; locales
    * &#42; memberships
    * &#42; metadata
    * &#42; names
    * &#42; nicknames
    * &#42; occupations
    * &#42; organizations
    * &#42; phoneNumbers
    * &#42; photos
    * &#42; relations
    * &#42; relationshipInterests
    * &#42; relationshipStatuses
    * &#42; residences
    * &#42; sipAddresses
    * &#42; skills
    * &#42; taglines
    * &#42; urls
    * &#42; userDefined
    */
  var personFields: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Required. Comma-separated list of person fields to be included in the response. Each
    * path should start with `person.`: for example, `person.names` or
    * `person.photos`.
    */
  @JSName("requestMask.includeField")
  var requestMaskDotincludeField: js.UndefOr[String] = js.native
  /**
    * Required. The resource names of the people to provide information about.
    *
    * - To get information about the authenticated user, specify `people/me`.
    * - To get information about a google account, specify
    * `people/{account_id}`.
    * - To get information about a contact, specify the resource name that
    * identifies the contact as returned by
    * [`people.connections.list`](/people/api/rest/v1/people.connections/list).
    *
    * You can include up to 50 resource names in one request.
    */
  var resourceNames: js.UndefOr[String | js.Array[String]] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

object ResourceNames {
  @scala.inline
  def apply(): ResourceNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceNames]
  }
  @scala.inline
  implicit class ResourceNamesOps[Self <: ResourceNames] (val x: Self) extends AnyVal {
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
    def setPersonFields(value: String): Self = this.set("personFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonFields: Self = this.set("personFields", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setRequestMaskDotincludeField(value: String): Self = this.set("requestMask.includeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMaskDotincludeField: Self = this.set("requestMask.includeField", js.undefined)
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    @scala.inline
    def setResourceNames(value: String | js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
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

