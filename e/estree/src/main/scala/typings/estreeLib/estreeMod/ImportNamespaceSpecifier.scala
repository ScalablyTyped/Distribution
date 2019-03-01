package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportNamespaceSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  @JSName("type")
  var type_ImportNamespaceSpecifier: estreeLib.estreeLibStrings.ImportNamespaceSpecifier
}

object ImportNamespaceSpecifier {
  @scala.inline
  def apply(
    local: Identifier,
    `type`: estreeLib.estreeLibStrings.ImportNamespaceSpecifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("local")(local)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
}

