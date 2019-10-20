package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.BaseNode
import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXElement extends BaseNode {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingElement: JSXClosingElement | Null
  var openingElement: JSXOpeningElement
  @JSName("type")
  var type_JSXElement: typings.estreeDashJsx.estreeDashJsxStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement,
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXElement,
    closingElement: JSXClosingElement = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children, openingElement = openingElement)
    __obj.updateDynamic("type")(`type`)
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXElement]
  }
}

