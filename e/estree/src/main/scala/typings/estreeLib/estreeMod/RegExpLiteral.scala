package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends BaseNode
     with Literal {
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var regex: estreeLib.Anon_Flags
  @JSName("type")
  var type_RegExpLiteral: estreeLib.estreeLibStrings.Literal
  var value: js.UndefOr[stdLib.RegExp | scala.Null] = js.undefined
}

object RegExpLiteral {
  @scala.inline
  def apply(
    regex: estreeLib.Anon_Flags,
    `type`: estreeLib.estreeLibStrings.Literal,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    raw: java.lang.String = null,
    trailingComments: js.Array[Comment] = null,
    value: stdLib.RegExp = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RegExpLiteral]
  }
}

