package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleDeclaration
  extends TopLevelDeclaration
     with DeclarationBase {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.module
  var members: js.Array[ModuleMember]
  var name: java.lang.String
}

object ModuleDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.module,
    members: js.Array[ModuleMember],
    name: java.lang.String,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ModuleDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, members = members, name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ModuleDeclaration]
  }
}

