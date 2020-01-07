package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the properties of an Image.
  */
@js.native
trait Schema$UpdateImagePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `imageProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the image outline color, set `fields` to
    * `&quot;outline.outlineFill.solidFill.color&quot;`.  To reset a property
    * to its default value, include its field name in the field mask but leave
    * the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The image properties to update.
    */
  var imageProperties: js.UndefOr[Schema$ImageProperties] = js.native
  /**
    * The object ID of the image the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$UpdateImagePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, imageProperties: Schema$ImageProperties = null, objectId: String = null): Schema$UpdateImagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateImagePropertiesRequest]
  }
}

