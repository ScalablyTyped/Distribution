package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleLiteral
  extends Literal
     with BaseNode {
  var raw: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_SimpleLiteral: typings.estree.estreeStrings.Literal
  var value: String | Boolean | Double | Null
}

object SimpleLiteral {
  @scala.inline
  def apply(
    `type`: typings.estree.estreeStrings.Literal,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    raw: String = null,
    trailingComments: js.Array[Comment] = null,
    value: String | Boolean | Double = null
  ): SimpleLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLiteral]
  }
}

