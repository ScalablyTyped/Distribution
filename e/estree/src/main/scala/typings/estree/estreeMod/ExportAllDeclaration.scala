package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportAllDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var source: Literal
  @JSName("type")
  var type_ExportAllDeclaration: typings.estree.estreeStrings.ExportAllDeclaration
}

object ExportAllDeclaration {
  @scala.inline
  def apply(
    source: Literal,
    `type`: typings.estree.estreeStrings.ExportAllDeclaration,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

