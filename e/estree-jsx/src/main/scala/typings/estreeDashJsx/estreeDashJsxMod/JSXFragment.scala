package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.BaseNode
import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXFragment extends BaseNode {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingFragment: JSXClosingFragment
  var openingFragment: JSXOpeningFragment
  @JSName("type")
  var type_JSXFragment: typings.estreeDashJsx.estreeDashJsxStrings.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXFragment,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children, closingFragment = closingFragment, openingFragment = openingFragment)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXFragment]
  }
}

