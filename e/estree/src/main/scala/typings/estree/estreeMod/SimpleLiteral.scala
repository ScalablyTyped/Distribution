package typings.estree.estreeMod

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
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    raw: String = null,
    trailingComments: js.Array[Comment] = null,
    value: String | Boolean | Double = null
  ): SimpleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLiteral]
  }
}

