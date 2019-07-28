package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var source: Literal
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  @JSName("type")
  var type_ImportDeclaration: typings.estree.estreeStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typings.estree.estreeStrings.ImportDeclaration,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source, specifiers = specifiers)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

