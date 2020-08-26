package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image that is specified by a URL and can have an onclick action.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * The aspect ratio of this image (width/height).
    */
  var aspectRatio: js.UndefOr[Double] = js.native
  /**
    * The URL of the image.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  @scala.inline
  implicit class SchemaImageOps[Self <: SchemaImage] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

