package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesconfiguration.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageConfigurationsResource extends js.Object {
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(request: Fields): Request[ImageConfiguration] = js.native
}

object ImageConfigurationsResource {
  @scala.inline
  def apply(upload: Fields => Request[ImageConfiguration]): ImageConfigurationsResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ImageConfigurationsResource]
  }
  @scala.inline
  implicit class ImageConfigurationsResourceOps[Self <: ImageConfigurationsResource] (val x: Self) extends AnyVal {
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
    def setUpload(value: Fields => Request[ImageConfiguration]): Self = this.set("upload", js.Any.fromFunction1(value))
  }
  
}

