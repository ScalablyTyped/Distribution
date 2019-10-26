package typings.googleapisDashCommon.buildSrcSchemaMod

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
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SchemaItem]
  }
}

