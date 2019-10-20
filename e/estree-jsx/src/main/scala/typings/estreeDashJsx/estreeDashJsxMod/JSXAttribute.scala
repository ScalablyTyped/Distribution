package typings.estreeDashJsx.estreeDashJsxMod

import typings.estree.estreeMod.BaseNode
import typings.estree.estreeMod.Comment
import typings.estree.estreeMod.Literal
import typings.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXAttribute extends BaseNode {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: typings.estreeDashJsx.estreeDashJsxStrings.JSXAttribute
  var value: Literal | JSXExpressionContainer | JSXElement | JSXFragment | Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXNamespacedName,
    `type`: typings.estreeDashJsx.estreeDashJsxStrings.JSXAttribute,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null,
    value: Literal | JSXExpressionContainer | JSXElement | JSXFragment = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

