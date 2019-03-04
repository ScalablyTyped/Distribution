package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPattern
  extends BaseNode
     with Pattern {
  var elements: js.Array[Pattern]
  @JSName("type")
  var type_ArrayPattern: estreeLib.estreeLibStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[Pattern],
    `type`: estreeLib.estreeLibStrings.ArrayPattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayPattern]
  }
}

