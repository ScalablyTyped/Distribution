package typings.estree.estreeMod

import typings.estree.Anon_Flags
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends Literal
     with BaseNode {
  var raw: js.UndefOr[String] = js.undefined
  var regex: Anon_Flags
  @JSName("type")
  var type_RegExpLiteral: typings.estree.estreeStrings.Literal
  var value: js.UndefOr[RegExp | Null] = js.undefined
}

object RegExpLiteral {
  @scala.inline
  def apply(
    regex: Anon_Flags,
    `type`: typings.estree.estreeStrings.Literal,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    raw: String = null,
    trailingComments: js.Array[Comment] = null,
    value: RegExp = null
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

