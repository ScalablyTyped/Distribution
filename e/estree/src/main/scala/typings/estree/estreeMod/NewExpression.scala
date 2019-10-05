package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.estree.estreeMod.Node because Already inherited
- typings.estree.estreeMod.Expression because Already inherited */ trait NewExpression
  extends BaseCallExpression
     with CallExpression {
  @JSName("type")
  var type_NewExpression: typings.estree.estreeStrings.NewExpression
}

object NewExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typings.estree.estreeStrings.NewExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[NewExpression]
  }
}

