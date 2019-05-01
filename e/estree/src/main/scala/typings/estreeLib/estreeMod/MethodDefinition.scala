package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodDefinition
  extends BaseNode
     with Node {
  var computed: scala.Boolean
  var key: Expression
  var kind: estreeLib.estreeLibStrings.constructor | estreeLib.estreeLibStrings.method | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set
  var static: scala.Boolean
  @JSName("type")
  var type_MethodDefinition: estreeLib.estreeLibStrings.MethodDefinition
  var value: FunctionExpression
}

object MethodDefinition {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: Expression,
    kind: estreeLib.estreeLibStrings.constructor | estreeLib.estreeLibStrings.method | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set,
    static: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.MethodDefinition,
    value: FunctionExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind.asInstanceOf[js.Any], static = static, value = value)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MethodDefinition]
  }
}

