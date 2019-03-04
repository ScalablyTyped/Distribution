package typings
package expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsObject extends js.Object {
  var collectionFormat: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[ItemsObject] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

object ItemsObject {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    collectionFormat: java.lang.String = null,
    default: js.Any = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    items: ItemsObject = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  ): ItemsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    if (default != null) __obj.updateDynamic("default")(default)
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
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[ItemsObject]
  }
}

