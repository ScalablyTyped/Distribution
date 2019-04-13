package typings
package expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaObject
  extends expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with Schema {
  var discriminator: js.UndefOr[java.lang.String] = js.undefined
  var example: js.Any
  var externalDocs: ExternalDocumentationObject
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var xml: js.UndefOr[XMLObject] = js.undefined
}

object SchemaObject {
  @scala.inline
  def apply(
    example: js.Any,
    externalDocs: ExternalDocumentationObject,
    $schema: java.lang.String = null,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    additionalItems: scala.Boolean | expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema = null,
    additionalProperties: scala.Boolean | expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema = null,
    allOf: js.Array[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    anyOf: js.Array[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    definitions: org.scalablytyped.runtime.StringDictionary[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[
      expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema | js.Array[java.lang.String]
    ] = null,
    description: java.lang.String = null,
    discriminator: java.lang.String = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    items: expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema | js.Array[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxProperties: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minProperties: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    not: expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema = null,
    oneOf: js.Array[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    pattern: java.lang.String = null,
    patternProperties: org.scalablytyped.runtime.StringDictionary[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    properties: org.scalablytyped.runtime.StringDictionary[expressDashOpenapiLib.expressDashOpenapiMod.IJsonSchema] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined,
    xml: XMLObject = null
  ): SchemaObject = {
    val __obj = js.Dynamic.literal(example = example, externalDocs = externalDocs)
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxProperties != null) __obj.updateDynamic("maxProperties")(maxProperties.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minProperties != null) __obj.updateDynamic("minProperties")(minProperties.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not)
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[SchemaObject]
  }
}

