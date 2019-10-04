package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`function-type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionType extends _Type {
  var kind: `function-type`
  var parameters: js.Array[Parameter]
  var returnType: Type
  var typeParameters: js.Array[TypeParameter]
}

object FunctionType {
  @scala.inline
  def apply(
    kind: `function-type`,
    parameters: js.Array[Parameter],
    returnType: Type,
    typeParameters: js.Array[TypeParameter]
  ): FunctionType = {
    val __obj = js.Dynamic.literal(kind = kind, parameters = parameters, returnType = returnType.asInstanceOf[js.Any], typeParameters = typeParameters)
  
    __obj.asInstanceOf[FunctionType]
  }
}

