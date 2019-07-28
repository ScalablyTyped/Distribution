package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadElement
  extends BaseNode
     with Node {
  var argument: Expression
  @JSName("type")
  var type_SpreadElement: typings.estree.estreeStrings.SpreadElement
}

object SpreadElement {
  @scala.inline
  def apply(
    argument: Expression,
    `type`: typings.estree.estreeStrings.SpreadElement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SpreadElement]
  }
}

