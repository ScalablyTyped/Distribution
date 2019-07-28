package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember
     with ObjectTypeReference {
  var baseTypes: js.UndefOr[js.Array[ObjectTypeReference]] = js.undefined
  var kind: interface
  var members: js.Array[ObjectTypeMember]
  var name: String
}

object InterfaceDeclaration {
  @scala.inline
  def apply(
    kind: interface,
    members: js.Array[ObjectTypeMember],
    name: String,
    baseTypes: js.Array[ObjectTypeReference] = null,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, members = members, name = name)
    if (baseTypes != null) __obj.updateDynamic("baseTypes")(baseTypes)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[InterfaceDeclaration]
  }
}

