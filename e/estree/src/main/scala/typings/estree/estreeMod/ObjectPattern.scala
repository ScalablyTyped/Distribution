package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPattern
  extends BaseNode
     with Pattern {
  var properties: js.Array[AssignmentProperty]
  @JSName("type")
  var type_ObjectPattern: typings.estree.estreeStrings.ObjectPattern
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[AssignmentProperty],
    `type`: typings.estree.estreeStrings.ObjectPattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectPattern]
  }
}

