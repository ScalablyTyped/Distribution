package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaItem extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var additionalProperties: js.UndefOr[StringDictionary[SchemaItem]] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[ParameterFormat] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[StringDictionary[SchemaItem]] = js.undefined
  var properties: js.UndefOr[StringDictionary[SchemaItem]] = js.undefined
  var `type`: js.UndefOr[SchemaType] = js.undefined
}

object SchemaItem {
  @scala.inline
  def apply(
    $ref: String = null,
    additionalProperties: StringDictionary[SchemaItem] = null,
    default: String = null,
    description: String = null,
    format: ParameterFormat = null,
    id: String = null,
    items: StringDictionary[SchemaItem] = null,
    properties: StringDictionary[SchemaItem] = null,
    `type`: SchemaType = null
  ): SchemaItem = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItem]
  }
}

