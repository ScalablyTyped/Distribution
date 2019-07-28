package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`call-signature`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSignature
  extends DeclarationBase
     with ObjectTypeMember {
  var kind: `call-signature`
  var parameters: js.Array[Parameter]
  var returnType: Type
  var typeParameters: js.Array[TypeParameter]
}

object CallSignature {
  @scala.inline
  def apply(
    kind: `call-signature`,
    parameters: js.Array[Parameter],
    returnType: Type,
    typeParameters: js.Array[TypeParameter],
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): CallSignature = {
    val __obj = js.Dynamic.literal(kind = kind, parameters = parameters, returnType = returnType.asInstanceOf[js.Any], typeParameters = typeParameters)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[CallSignature]
  }
}

