package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSchema
  extends BaseSchema
     with Schema {
  /**
    * Specifies whether additional properties on the object are allowed, and optionally what schema they should
    * adhere to
    * @default false
    */
  var additionalProperties: js.UndefOr[Schema | scala.Boolean] = js.undefined
  /**
    * Describe properties that have keys following a given pattern
    */
  var patternProperties: js.UndefOr[ObjectProperties] = js.undefined
  /**
    * Describe the properties of the object
    */
  var properties: js.UndefOr[ObjectProperties] = js.undefined
  /**
    * The required properties of the object
    */
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.`object`
}

object ObjectSchema {
  @scala.inline
  def apply(
    `type`: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.`object`,
    $comment: java.lang.String = null,
    additionalProperties: Schema | scala.Boolean = null,
    allOf: js.Array[stdLib.Partial[Schema]] = null,
    anyOf: js.Array[stdLib.Partial[Schema]] = null,
    default: js.Any = null,
    definitions: stdLib.Record[java.lang.String, Schema] = null,
    description: java.lang.String = null,
    `else`: stdLib.Partial[Schema] = null,
    examples: js.Array[_] = null,
    `if`: stdLib.Partial[Schema] = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    patternProperties: ObjectProperties = null,
    properties: ObjectProperties = null,
    required: js.Array[java.lang.String] = null,
    `then`: stdLib.Partial[Schema] = null,
    title: java.lang.String = null
  ): ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if ($comment != null) __obj.updateDynamic("$comment")($comment)
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (default != null) __obj.updateDynamic("default")(default)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`else` != null) __obj.updateDynamic("else")(`else`)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (required != null) __obj.updateDynamic("required")(required)
    if (`then` != null) __obj.updateDynamic("then")(`then`)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ObjectSchema]
  }
}

