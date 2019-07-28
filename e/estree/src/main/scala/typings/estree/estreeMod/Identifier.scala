package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.estree.estreeMod.Node because Already inherited */ trait Identifier
  extends BaseNode
     with Expression
     with Pattern {
  var name: String
  @JSName("type")
  var type_Identifier: typings.estree.estreeStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.estree.estreeStrings.Identifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Identifier]
  }
}

