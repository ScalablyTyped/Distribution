package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAliasDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.alias
  var name: java.lang.String
  var `type`: Type
  var typeParameters: js.Array[TypeParameter]
}

object TypeAliasDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.alias,
    name: java.lang.String,
    `type`: Type,
    typeParameters: js.Array[TypeParameter],
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): TypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[TypeAliasDeclaration]
  }
}

