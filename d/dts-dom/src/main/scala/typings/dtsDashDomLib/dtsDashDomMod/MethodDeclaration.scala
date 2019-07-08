package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodDeclaration
  extends DeclarationBase
     with ClassMember
     with ObjectTypeMember {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.method
  var name: java.lang.String
  var parameters: js.Array[Parameter]
  var returnType: Type
  var typeParameters: js.Array[TypeParameter]
}

object MethodDeclaration {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.method,
    name: java.lang.String,
    parameters: js.Array[Parameter],
    returnType: Type,
    typeParameters: js.Array[TypeParameter],
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): MethodDeclaration = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, parameters = parameters, returnType = returnType.asInstanceOf[js.Any], typeParameters = typeParameters)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[MethodDeclaration]
  }
}

