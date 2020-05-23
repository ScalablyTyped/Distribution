package typings.estree.mod

import typings.estree.anon.Flags
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends Literal
     with BaseNode {
  var raw: js.UndefOr[String] = js.undefined
  var regex: Flags
  @JSName("type")
  var type_RegExpLiteral: typings.estree.estreeStrings.Literal
  var value: js.UndefOr[RegExp | Null] = js.undefined
}

object RegExpLiteral {
  @scala.inline
  def apply(
    regex: Flags,
    `type`: typings.estree.estreeStrings.Literal,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    raw: String = null,
    trailingComments: js.Array[Comment] = null,
    value: js.UndefOr[Null | RegExp] = js.undefined
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

