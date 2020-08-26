package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLayersVolumeannotationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.native
  /**
    * The end offset to end retrieving data from.
    */
  var endOffset: js.UndefOr[String] = js.native
  /**
    * The end position to end retrieving data from.
    */
  var endPosition: js.UndefOr[String] = js.native
  /**
    * The ID for the layer to get the annotations.
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1
    * country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The value of the nextToken from the previous page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Set to true to return deleted annotations. updatedMin must be in the
    * request to use this. Defaults to false.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The start offset to start retrieving data from.
    */
  var startOffset: js.UndefOr[String] = js.native
  /**
    * The start position to start retrieving data from.
    */
  var startPosition: js.UndefOr[String] = js.native
  /**
    * RFC 3339 timestamp to restrict to items updated prior to this timestamp
    * (exclusive).
    */
  var updatedMax: js.UndefOr[String] = js.native
  /**
    * RFC 3339 timestamp to restrict to items updated since this timestamp
    * (inclusive).
    */
  var updatedMin: js.UndefOr[String] = js.native
  /**
    * The version of the volume annotations that you are requesting.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object ParamsResourceLayersVolumeannotationsList {
  @scala.inline
  def apply(): ParamsResourceLayersVolumeannotationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersVolumeannotationsList]
  }
  @scala.inline
  implicit class ParamsResourceLayersVolumeannotationsListOps[Self <: ParamsResourceLayersVolumeannotationsList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    @scala.inline
    def setEndOffset(value: String): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOffset: Self = this.set("endOffset", js.undefined)
    @scala.inline
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
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
    def setVolumeAnnotationsVersion(value: String): Self = this.set("volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAnnotationsVersion: Self = this.set("volumeAnnotationsVersion", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

