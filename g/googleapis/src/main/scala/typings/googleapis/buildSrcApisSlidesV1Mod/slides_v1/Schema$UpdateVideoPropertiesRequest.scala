package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the properties of a Video.
  */
@js.native
trait Schema$UpdateVideoPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `videoProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the video outline color, set `fields` to
    * `&quot;outline.outlineFill.solidFill.color&quot;`.  To reset a property
    * to its default value, include its field name in the field mask but leave
    * the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the video the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The video properties to update.
    */
  var videoProperties: js.UndefOr[Schema$VideoProperties] = js.native
}

object Schema$UpdateVideoPropertiesRequest {
  @scala.inline
  def apply(fields: String = null, objectId: String = null, videoProperties: Schema$VideoProperties = null): Schema$UpdateVideoPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (videoProperties != null) __obj.updateDynamic("videoProperties")(videoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateVideoPropertiesRequest]
  }
}

