package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  var imported: Identifier
  @JSName("type")
  var type_ImportSpecifier: typings.estree.estreeStrings.ImportSpecifier
}

object ImportSpecifier {
  @scala.inline
  def apply(
    imported: Identifier,
    local: Identifier,
    `type`: typings.estree.estreeStrings.ImportSpecifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported, local = local)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportSpecifier]
  }
}

