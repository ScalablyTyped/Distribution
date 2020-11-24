package typings.ethersprojectAbi.fragmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment")
@js.native
class FunctionFragment () extends ConstructorFragment {
  
  var constant: Boolean = js.native
  
  var outputs: js.UndefOr[js.Array[ParamType]] = js.native
}
/* static members */
@JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment")
@js.native
object FunctionFragment extends js.Object {
  
  def from(value: String): FunctionFragment = js.native
  def from(value: FunctionFragment): FunctionFragment = js.native
  def from(value: JsonFragment): FunctionFragment = js.native
  
  def fromObject(value: FunctionFragment): FunctionFragment = js.native
  def fromObject(value: JsonFragment): FunctionFragment = js.native
  
  def fromString(value: String): FunctionFragment = js.native
  
  def isFunctionFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
}
