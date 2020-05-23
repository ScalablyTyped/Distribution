package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import typings.estree.mod.Comment
import typings.estree.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXText
  extends BaseNode
     with _Node {
  var raw: String
  @JSName("type")
  var type_JSXText: typings.estreeJsx.estreeJsxStrings.JSXText
  var value: String
}

object JSXText {
  @scala.inline
  def apply(
    raw: String,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXText,
    value: String,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXText]
  }
}

