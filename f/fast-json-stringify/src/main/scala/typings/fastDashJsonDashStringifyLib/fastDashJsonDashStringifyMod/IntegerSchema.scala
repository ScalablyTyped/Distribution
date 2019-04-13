package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerSchema
  extends BaseSchema
     with Schema {
  var `type`: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.integer
}

object IntegerSchema {
  @scala.inline
  def apply(
    `type`: fastDashJsonDashStringifyLib.fastDashJsonDashStringifyLibStrings.integer,
    $comment: java.lang.String = null,
    allOf: js.Array[stdLib.Partial[Schema]] = null,
    anyOf: js.Array[stdLib.Partial[Schema]] = null,
    default: js.Any = null,
    definitions: stdLib.Record[java.lang.String, Schema] = null,
    description: java.lang.String = null,
    `else`: stdLib.Partial[Schema] = null,
    examples: js.Array[_] = null,
    `if`: stdLib.Partial[Schema] = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    `then`: stdLib.Partial[Schema] = null,
    title: java.lang.String = null
  ): IntegerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if ($comment != null) __obj.updateDynamic("$comment")($comment)
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (default != null) __obj.updateDynamic("default")(default)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`else` != null) __obj.updateDynamic("else")(`else`)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (`then` != null) __obj.updateDynamic("then")(`then`)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IntegerSchema]
  }
}

