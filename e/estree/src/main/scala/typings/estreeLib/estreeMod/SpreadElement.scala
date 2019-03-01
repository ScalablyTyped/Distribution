package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadElement
  extends BaseNode
     with _Node {
  var argument: estreeLib.Expression
  @JSName("type")
  var type_SpreadElement: estreeLib.estreeLibStrings.SpreadElement
}

object SpreadElement {
  @scala.inline
  def apply(
    argument: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.SpreadElement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): SpreadElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("argument")(argument)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SpreadElement]
  }
}

