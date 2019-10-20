package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXOpeningElement extends JSXBoundaryElement {
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  var selfClosing: Boolean
  @JSName("type")
  var type_JSXOpeningElement: typings.estreeDashJsx.estreeDashJsxStrings.JSXOpeningElement
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXOpeningElement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name.asInstanceOf[js.Any], selfClosing = selfClosing)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

