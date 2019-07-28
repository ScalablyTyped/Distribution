package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern
  extends BaseNode
     with Pattern {
  var left: Pattern
  var right: Expression
  @JSName("type")
  var type_AssignmentPattern: typings.estree.estreeStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.AssignmentPattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left, right = right)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentPattern]
  }
}

