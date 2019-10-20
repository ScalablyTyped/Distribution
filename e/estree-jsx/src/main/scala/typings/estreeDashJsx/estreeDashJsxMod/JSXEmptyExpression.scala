package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.BaseNode
import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXEmptyExpression extends BaseNode {
  @JSName("type")
  var type_JSXEmptyExpression: typings.estreeDashJsx.estreeDashJsxStrings.JSXEmptyExpression
}

object JSXEmptyExpression {
  @scala.inline
  def apply(
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXEmptyExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXEmptyExpression]
  }
}

