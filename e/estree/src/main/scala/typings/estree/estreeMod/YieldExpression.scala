package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YieldExpression
  extends BaseNode
     with Expression {
  var argument: js.UndefOr[Expression | Null] = js.undefined
  var delegate: Boolean
  @JSName("type")
  var type_YieldExpression: typings.estree.estreeStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: Boolean,
    `type`: typings.estree.estreeStrings.YieldExpression,
    argument: Expression = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate)
    __obj.updateDynamic("type")(`type`)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[YieldExpression]
  }
}

