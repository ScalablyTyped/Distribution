package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportNamespaceSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  @JSName("type")
  var type_ImportNamespaceSpecifier: typings.estree.estreeStrings.ImportNamespaceSpecifier
}

object ImportNamespaceSpecifier {
  @scala.inline
  def apply(
    local: Identifier,
    `type`: typings.estree.estreeStrings.ImportNamespaceSpecifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
}

