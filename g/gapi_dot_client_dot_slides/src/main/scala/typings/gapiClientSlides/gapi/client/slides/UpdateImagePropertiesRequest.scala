package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateImagePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `imageProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the image outline color, set `fields` to
    * `"outline.outlineFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /** The image properties to update. */
  var imageProperties: js.UndefOr[ImageProperties] = js.native
  /** The object ID of the image the updates are applied to. */
  var objectId: js.UndefOr[String] = js.native
}

object UpdateImagePropertiesRequest {
  @scala.inline
  def apply(): UpdateImagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateImagePropertiesRequest]
  }
  @scala.inline
  implicit class UpdateImagePropertiesRequestOps[Self <: UpdateImagePropertiesRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setImageProperties(value: ImageProperties): Self = this.set("imageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageProperties: Self = this.set("imageProperties", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

