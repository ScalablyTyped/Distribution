package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: namespace
  var members: js.Array[NamespaceMember]
  var name: String
}

object NamespaceDeclaration {
  @scala.inline
  def apply(
    kind: namespace,
    members: js.Array[NamespaceMember],
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): NamespaceDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, members = members, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[NamespaceDeclaration]
  }
}

