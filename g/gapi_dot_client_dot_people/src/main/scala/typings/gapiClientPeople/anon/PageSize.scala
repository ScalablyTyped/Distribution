package typings.gapiClientPeople.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSize extends js.Object {
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
    * Optional. The number of connections to include in the response. Valid values are
    * between 1 and 2000, inclusive. Defaults to 100 if not set or set to 0.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. A page token, received from a previous `ListConnections` call.
    * Provide this to retrieve the subsequent page.
    *
    * When paginating, all other parameters provided to `ListConnections`
    * must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.native
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
    * Optional. Whether the response should include `next_sync_token`, which can be used to
    * get all changes since the last request. For subsequent sync requests use
    * the `sync_token` param instead. Initial sync requests that specify
    * `request_sync_token` have an additional rate limit.
    */
  var requestSyncToken: js.UndefOr[Boolean] = js.native
  /** Required. The resource name to return connections for. Only `people/me` is valid. */
  var resourceName: String = js.native
  /**
    * Optional. The order in which the connections should be sorted. Defaults to
    * `LAST_MODIFIED_ASCENDING`.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Optional. A sync token, received from a previous `ListConnections` call.
    * Provide this to retrieve only the resources changed since the last request.
    * Sync requests that specify `sync_token` have an additional rate limit.
    *
    * When syncing, all other parameters provided to `ListConnections`
    * must match the call that provided the sync token.
    */
  var syncToken: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

object PageSize {
  @scala.inline
  def apply(resourceName: String): PageSize = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSize]
  }
  @scala.inline
  implicit class PageSizeOps[Self <: PageSize] (val x: Self) extends AnyVal {
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
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
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
    def setRequestSyncToken(value: Boolean): Self = this.set("requestSyncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestSyncToken: Self = this.set("requestSyncToken", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
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

