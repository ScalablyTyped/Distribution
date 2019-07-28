package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember
     with ObjectTypeReference {
  var baseType: js.UndefOr[ObjectTypeReference] = js.undefined
  var implements: js.Array[InterfaceDeclaration]
  var kind: `class`
  var members: js.Array[ClassMember]
  var name: String
  var typeParameters: js.Array[TypeParameter]
}

object ClassDeclaration {
  @scala.inline
  def apply(
    implements: js.Array[InterfaceDeclaration],
    kind: `class`,
    members: js.Array[ClassMember],
    name: String,
    typeParameters: js.Array[TypeParameter],
    baseType: ObjectTypeReference = null,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(implements = implements, kind = kind, members = members, name = name, typeParameters = typeParameters)
    if (baseType != null) __obj.updateDynamic("baseType")(baseType)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ClassDeclaration]
  }
}

