package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamedDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var declaration: js.UndefOr[Declaration | scala.Null] = js.undefined
  var source: js.UndefOr[Literal | scala.Null] = js.undefined
  var specifiers: js.Array[ExportSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: estreeLib.estreeLibStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifier],
    `type`: estreeLib.estreeLibStrings.ExportNamedDeclaration,
    declaration: Declaration = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    source: Literal = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("specifiers")(specifiers)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (source != null) __obj.updateDynamic("source")(source)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

