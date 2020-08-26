package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerIds extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The content version for the requested volume. */
  var contentVersion: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The layer ID to limit annotation by. */
  var layerId: js.UndefOr[String] = js.native
  /** The layer ID(s) to limit annotation by. */
  var layerIds: js.UndefOr[String] = js.native
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
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[String] = js.native
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /** The volume to restrict annotations to. */
  var volumeId: js.UndefOr[String] = js.native
}

object LayerIds {
  @scala.inline
  def apply(): LayerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerIds]
  }
  @scala.inline
  implicit class LayerIdsOps[Self <: LayerIds] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLayerIds(value: String): Self = this.set("layerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerIds: Self = this.set("layerIds", js.undefined)
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
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

