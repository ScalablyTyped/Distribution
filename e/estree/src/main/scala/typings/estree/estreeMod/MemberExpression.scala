package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends BaseNode
     with Expression
     with Pattern {
  var computed: Boolean
  var `object`: Expression | Super
  var property: Expression
  @JSName("type")
  var type_MemberExpression: typings.estree.estreeStrings.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: Expression | Super,
    property: Expression,
    `type`: typings.estree.estreeStrings.MemberExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
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

