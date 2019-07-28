package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDefaultDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var declaration: Declaration | Expression
  @JSName("type")
  var type_ExportDefaultDeclaration: typings.estree.estreeStrings.ExportDefaultDeclaration
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    declaration: Declaration | Expression,
    `type`: typings.estree.estreeStrings.ExportDefaultDeclaration,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
}

