package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Page.
  */
@js.native
trait Schema$UpdatePagePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `pageProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the page background solid fill color, set `fields`
    * to `&quot;pageBackgroundFill.solidFill.color&quot;`.  To reset a property
    * to its default value, include its field name in the field mask but leave
    * the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the page the update is applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The page properties to update.
    */
  var pageProperties: js.UndefOr[Schema$PageProperties] = js.native
}

object Schema$UpdatePagePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, objectId: String = null, pageProperties: Schema$PageProperties = null): Schema$UpdatePagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (pageProperties != null) __obj.updateDynamic("pageProperties")(pageProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdatePagePropertiesRequest]
  }
}

