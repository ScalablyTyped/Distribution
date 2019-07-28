package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodDeclaration
  extends DeclarationBase
     with ClassMember
     with ObjectTypeMember {
  var kind: method
  var name: String
  var parameters: js.Array[Parameter]
  var returnType: Type
  var typeParameters: js.Array[TypeParameter]
}

object MethodDeclaration {
  @scala.inline
  def apply(
    kind: method,
    name: String,
    parameters: js.Array[Parameter],
    returnType: Type,
    typeParameters: js.Array[TypeParameter],
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): MethodDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, parameters = parameters, returnType = returnType.asInstanceOf[js.Any], typeParameters = typeParameters)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[MethodDeclaration]
  }
}

