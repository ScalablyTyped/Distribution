package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXClosingElement extends JSXBoundaryElement {
  @JSName("type")
  var type_JSXClosingElement: typings.estreeDashJsx.estreeDashJsxStrings.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXClosingElement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement]
  }
}

