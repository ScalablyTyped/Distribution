package typings.dialogflowFulfillment.anon

import typings.dialogflowFulfillment.mod.Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUrl extends js.Object {
  var imageUrl: String = js.native
  var platform: Platforms = js.native
}

object ImageUrl {
  @scala.inline
  def apply(imageUrl: String, platform: Platforms): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  @scala.inline
  implicit class ImageUrlOps[Self <: ImageUrl] (val x: Self) extends AnyVal {
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: Platforms): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

