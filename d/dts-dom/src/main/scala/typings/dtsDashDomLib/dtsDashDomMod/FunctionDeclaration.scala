package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends NamespaceMember
     with DeclarationBase
     with ModuleMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.function
  var name: java.lang.String
  var parameters: js.Array[Parameter]
  var returnType: Type
  var typeParameters: js.Array[TypeParameter]
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.function,
    name: java.lang.String,
    parameters: js.Array[Parameter],
    returnType: Type,
    typeParameters: js.Array[TypeParameter],
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, parameters = parameters, returnType = returnType.asInstanceOf[js.Any], typeParameters = typeParameters)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

