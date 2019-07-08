package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionType extends _Type {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`function-type`
  var parameters: js.Array[Parameter]
  var returnType: Type
}

object FunctionType {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.`function-type`,
    parameters: js.Array[Parameter],
    returnType: Type
  ): FunctionType = {
    val __obj = js.Dynamic.literal(kind = kind, parameters = parameters, returnType = returnType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionType]
  }
}

