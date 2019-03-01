package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- estreeLib.estreeMod._Node because Already inherited */ trait Identifier
  extends BaseNode
     with Pattern {
  var name: java.lang.String
  @JSName("type")
  var type_Identifier: estreeLib.estreeLibStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: estreeLib.estreeLibStrings.Identifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Identifier]
  }
}

