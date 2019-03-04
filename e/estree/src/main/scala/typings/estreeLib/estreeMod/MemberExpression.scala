package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends BaseNode
     with Pattern {
  var computed: scala.Boolean
  var `object`: estreeLib.Expression | Super
  var property: estreeLib.Expression
  @JSName("type")
  var type_MemberExpression: estreeLib.estreeLibStrings.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    `object`: estreeLib.Expression | Super,
    property: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.MemberExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed, property = property)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MemberExpression]
  }
}

