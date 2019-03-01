package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleMetaData extends js.Object {
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var docs: js.UndefOr[eslintLib.Anon_Category] = js.undefined
  var fixable: js.UndefOr[eslintLib.eslintLibStrings.code | eslintLib.eslintLibStrings.whitespace] = js.undefined
  var messages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var schema: js.UndefOr[
    jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | js.Array[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]
  ] = js.undefined
}

object RuleMetaData {
  @scala.inline
  def apply(
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    docs: eslintLib.Anon_Category = null,
    fixable: eslintLib.eslintLibStrings.code | eslintLib.eslintLibStrings.whitespace = null,
    messages: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | js.Array[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = null
  ): RuleMetaData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (docs != null) __obj.updateDynamic("docs")(docs)
    if (fixable != null) __obj.updateDynamic("fixable")(fixable.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMetaData]
  }
}

