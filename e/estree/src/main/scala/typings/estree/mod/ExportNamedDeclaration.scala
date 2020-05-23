package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamedDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var declaration: js.UndefOr[Declaration | Null] = js.undefined
  var source: js.UndefOr[Literal | Null] = js.undefined
  var specifiers: js.Array[ExportSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: typings.estree.estreeStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifier],
    `type`: typings.estree.estreeStrings.ExportNamedDeclaration,
    declaration: js.UndefOr[Null | Declaration] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    source: js.UndefOr[Null | Literal] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(declaration)) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

