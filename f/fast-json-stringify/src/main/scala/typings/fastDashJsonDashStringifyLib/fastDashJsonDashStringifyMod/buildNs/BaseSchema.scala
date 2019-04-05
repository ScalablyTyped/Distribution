package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod.buildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSchema extends js.Object {
  /**
    * A comment to be added to the schema
    */
  @JSName("$comment")
  var $comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of schemas which must all match
    */
  var allOf: js.UndefOr[js.Array[stdLib.Partial[Schema]]] = js.undefined
  /**
    * A set of schemas of which at least one must match
    */
  var anyOf: js.UndefOr[js.Array[stdLib.Partial[Schema]]] = js.undefined
  /**
    * Default value to be assigned when no value is given in the document
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * Additional schema definition to reference from within the schema
    */
  var definitions: js.UndefOr[stdLib.Record[java.lang.String, Schema]] = js.undefined
  /**
    * Schema description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A schema to apply if the conditional schema from `if` fails
    */
  var `else`: js.UndefOr[stdLib.Partial[Schema]] = js.undefined
  /**
    * A list of example values that match this schema
    */
  var examples: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * A conditional schema to check, controls schemas defined in `then` and `else`
    */
  var `if`: js.UndefOr[stdLib.Partial[Schema]] = js.undefined
  /**
    * Open API 3.0 spec states that any value that can be null must be declared `nullable`
    * @default false
    */
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A schema to apply if the conditional schema from `if` passes
    */
  var `then`: js.UndefOr[stdLib.Partial[Schema]] = js.undefined
  /**
    * Schema title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object BaseSchema {
  @scala.inline
  def apply(
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
  ): BaseSchema = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[BaseSchema]
  }
}

