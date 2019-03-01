package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleLiteral
  extends BaseNode
     with Literal {
  var raw: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_SimpleLiteral: estreeLib.estreeLibStrings.Literal
  var value: java.lang.String | scala.Boolean | scala.Double | scala.Null
}

object SimpleLiteral {
  @scala.inline
  def apply(
    `type`: estreeLib.estreeLibStrings.Literal,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    raw: java.lang.String = null,
    trailingComments: js.Array[Comment] = null,
    value: java.lang.String | scala.Boolean | scala.Double = null
  ): SimpleLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLiteral]
  }
}

