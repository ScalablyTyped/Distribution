package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLayersAnnotationdataList extends StandardParameters {
  /**
    * The list of Annotation Data Ids to retrieve. Pagination is ignored if
    * this is set.
    */
  var annotationDataId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.native
  /**
    * The requested pixel height for any images. If height is provided width
    * must also be provided.
    */
  var h: js.UndefOr[Double] = js.native
  /**
    * The ID for the layer to get the annotation data.
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
    * The requested scale for the image.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
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
    * The volume to retrieve annotation data for.
    */
  var volumeId: js.UndefOr[String] = js.native
  /**
    * The requested pixel width for any images. If width is provided height
    * must also be provided.
    */
  var w: js.UndefOr[Double] = js.native
}

object ParamsResourceLayersAnnotationdataList {
  @scala.inline
  def apply(): ParamsResourceLayersAnnotationdataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataList]
  }
  @scala.inline
  implicit class ParamsResourceLayersAnnotationdataListOps[Self <: ParamsResourceLayersAnnotationdataList] (val x: Self) extends AnyVal {
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
    def setAnnotationDataIdVarargs(value: String*): Self = this.set("annotationDataId", js.Array(value :_*))
    @scala.inline
    def setAnnotationDataId(value: js.Array[String]): Self = this.set("annotationDataId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationDataId: Self = this.set("annotationDataId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
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
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
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
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
  
}

