package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Super
  extends BaseNode
     with Node {
  @JSName("type")
  var type_Super: typings.estree.estreeStrings.Super
}

object Super {
  @scala.inline
  def apply(
    `type`: typings.estree.estreeStrings.Super,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Super]
  }
}

