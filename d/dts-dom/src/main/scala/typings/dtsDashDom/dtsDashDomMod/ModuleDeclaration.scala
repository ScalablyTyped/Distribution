package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleDeclaration
  extends TopLevelDeclaration
     with DeclarationBase {
  var kind: module
  var members: js.Array[ModuleMember]
  var name: String
}

object ModuleDeclaration {
  @scala.inline
  def apply(
    kind: module,
    members: js.Array[ModuleMember],
    name: String,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, members = members, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ModuleDeclaration]
  }
}

