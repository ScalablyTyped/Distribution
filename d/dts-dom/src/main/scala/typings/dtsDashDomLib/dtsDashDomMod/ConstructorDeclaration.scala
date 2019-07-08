package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorDeclaration
  extends DeclarationBase
     with ClassMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.constructor
  var parameters: js.Array[Parameter]
}

object ConstructorDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.constructor,
    parameters: js.Array[Parameter],
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): ConstructorDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, parameters = parameters)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ConstructorDeclaration]
  }
}

