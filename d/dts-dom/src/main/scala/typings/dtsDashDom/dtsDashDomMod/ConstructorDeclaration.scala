package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorDeclaration
  extends DeclarationBase
     with ClassMember {
  var kind: constructor
  var parameters: js.Array[Parameter]
}

object ConstructorDeclaration {
  @scala.inline
  def apply(
    kind: constructor,
    parameters: js.Array[Parameter],
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ConstructorDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, parameters = parameters)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ConstructorDeclaration]
  }
}

