package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`function-type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionType extends _Type {
  var kind: `function-type`
  var parameters: js.Array[Parameter]
  var returnType: Type
}

object FunctionType {
  @scala.inline
  def apply(kind: `function-type`, parameters: js.Array[Parameter], returnType: Type): FunctionType = {
    val __obj = js.Dynamic.literal(kind = kind, parameters = parameters, returnType = returnType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionType]
  }
}

