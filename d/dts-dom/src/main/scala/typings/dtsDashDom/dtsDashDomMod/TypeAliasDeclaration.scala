package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.alias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAliasDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: alias
  var name: String
  var `type`: Type
  var typeParameters: js.Array[TypeParameter]
}

object TypeAliasDeclaration {
  @scala.inline
  def apply(
    kind: alias,
    name: String,
    `type`: Type,
    typeParameters: js.Array[TypeParameter],
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): TypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[TypeAliasDeclaration]
  }
}

