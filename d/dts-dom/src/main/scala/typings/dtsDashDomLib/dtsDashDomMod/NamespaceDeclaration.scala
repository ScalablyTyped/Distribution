package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.namespace
  var members: js.Array[NamespaceMember]
  var name: java.lang.String
}

object NamespaceDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.namespace,
    members: js.Array[NamespaceMember],
    name: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): NamespaceDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, members = members, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[NamespaceDeclaration]
  }
}

