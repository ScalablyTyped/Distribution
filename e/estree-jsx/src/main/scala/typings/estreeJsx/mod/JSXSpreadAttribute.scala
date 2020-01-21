package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Comment
import typings.estree.mod.Expression
import typings.estree.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXSpreadAttribute extends BaseNode {
  var argument: Expression
  @JSName("type")
  var type_JSXSpreadAttribute: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute
}

object JSXSpreadAttribute {
  @scala.inline
  def apply(
    argument: Expression,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXSpreadAttribute,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
}

