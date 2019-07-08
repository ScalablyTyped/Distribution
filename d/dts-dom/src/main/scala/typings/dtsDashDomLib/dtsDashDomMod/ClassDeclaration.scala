package typings
package dtsDashDomLib.dtsDashDomMod

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
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`class`
  var members: js.Array[ClassMember]
  var name: java.lang.String
  var typeParameters: js.Array[TypeParameter]
}

object ClassDeclaration {
  @scala.inline
  def apply(
    implements: js.Array[InterfaceDeclaration],
    kind: dtsDashDomLib.dtsDashDomLibStrings.`class`,
    members: js.Array[ClassMember],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameter],
    baseType: ObjectTypeReference = null,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(implements = implements, kind = kind, members = members, name = name, typeParameters = typeParameters)
    if (baseType != null) __obj.updateDynamic("baseType")(baseType)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ClassDeclaration]
  }
}

