package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLayersVolumeannotationsGet extends StandardParameters {
  /**
    * The ID of the volume annotation to retrieve.
    */
  var annotationId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
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
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object ParamsResourceLayersVolumeannotationsGet {
  @scala.inline
  def apply(): ParamsResourceLayersVolumeannotationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLayersVolumeannotationsGet]
  }
  @scala.inline
  implicit class ParamsResourceLayersVolumeannotationsGetOps[Self <: ParamsResourceLayersVolumeannotationsGet] (val x: Self) extends AnyVal {
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
    def setAnnotationId(value: String): Self = this.set("annotationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationId: Self = this.set("annotationId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

