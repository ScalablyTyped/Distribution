package typings.expressDashOpenapi.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralParameterObject
  extends ParameterObject
     with ItemsObject
     with Parameter {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
}

object GeneralParameterObject {
  @scala.inline
  def apply(
    in: String,
    name: String,
    `type`: String,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    collectionFormat: String = null,
    default: js.Any = null,
    description: String = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    items: ItemsObject = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    pattern: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (format != null) __obj.updateDynamic("format")(format)
    if (items != null) __obj.updateDynamic("items")(items)
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[GeneralParameterObject]
  }
}

