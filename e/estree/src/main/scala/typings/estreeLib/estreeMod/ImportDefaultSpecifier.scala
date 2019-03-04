package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDefaultSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  @JSName("type")
  var type_ImportDefaultSpecifier: estreeLib.estreeLibStrings.ImportDefaultSpecifier
}

object ImportDefaultSpecifier {
  @scala.inline
  def apply(
    local: Identifier,
    `type`: estreeLib.estreeLibStrings.ImportDefaultSpecifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
}

