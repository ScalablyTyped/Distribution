package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMylibraryAnnotationsSummary extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Array of layer IDs to get the summary for.
    */
  var layerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Volume id to get the summary for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object ParamsResourceMylibraryAnnotationsSummary {
  @scala.inline
  def apply(): ParamsResourceMylibraryAnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsSummary]
  }
  @scala.inline
  implicit class ParamsResourceMylibraryAnnotationsSummaryOps[Self <: ParamsResourceMylibraryAnnotationsSummary] (val x: Self) extends AnyVal {
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
    def setLayerIdsVarargs(value: String*): Self = this.set("layerIds", js.Array(value :_*))
    @scala.inline
    def setLayerIds(value: js.Array[String]): Self = this.set("layerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerIds: Self = this.set("layerIds", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

