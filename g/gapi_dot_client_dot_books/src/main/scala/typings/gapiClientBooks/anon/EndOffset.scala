package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOffset extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The content version for the requested volume. */
  var contentVersion: String = js.native
  /** The end offset to end retrieving data from. */
  var endOffset: js.UndefOr[String] = js.native
  /** The end position to end retrieving data from. */
  var endPosition: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The ID for the layer to get the annotations. */
  var layerId: String = js.native
  /** The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. */
  var locale: js.UndefOr[String] = js.native
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** The value of the nextToken from the previous page. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false. */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.native
  /** The start offset to start retrieving data from. */
  var startOffset: js.UndefOr[String] = js.native
  /** The start position to start retrieving data from. */
  var startPosition: js.UndefOr[String] = js.native
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[String] = js.native
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /** The version of the volume annotations that you are requesting. */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
  /** The volume to retrieve annotations for. */
  var volumeId: String = js.native
}

object EndOffset {
  @scala.inline
  def apply(contentVersion: String, layerId: String, volumeId: String): EndOffset = {
    val __obj = js.Dynamic.literal(contentVersion = contentVersion.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOffset]
  }
  @scala.inline
  implicit class EndOffsetOps[Self <: EndOffset] (val x: Self) extends AnyVal {
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
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setEndOffset(value: String): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOffset: Self = this.set("endOffset", js.undefined)
    @scala.inline
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStartOffset(value: String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    @scala.inline
    def setUpdatedMax(value: String): Self = this.set("updatedMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedMax: Self = this.set("updatedMax", js.undefined)
    @scala.inline
    def setUpdatedMin(value: String): Self = this.set("updatedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedMin: Self = this.set("updatedMin", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
    @scala.inline
    def setVolumeAnnotationsVersion(value: String): Self = this.set("volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAnnotationsVersion: Self = this.set("volumeAnnotationsVersion", js.undefined)
  }
  
}

