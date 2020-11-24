package typings.ethersprojectAbi.fragmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/fragments", "ParamType")
@js.native
class ParamType protected () extends js.Object {
  def this(constructorGuard: js.Any, params: js.Any) = this()
  
  val _isParamType: Boolean = js.native
  
  val arrayChildren: ParamType = js.native
  
  val arrayLength: Double = js.native
  
  val baseType: String = js.native
  
  val components: js.Array[ParamType] = js.native
  
  def format(): String = js.native
  def format(format: String): String = js.native
  
  val indexed: Boolean = js.native
  
  val name: String = js.native
  
  val `type`: String = js.native
}
/* static members */
@JSImport("@ethersproject/abi/lib/fragments", "ParamType")
@js.native
object ParamType extends js.Object {
  
  def from(value: String): ParamType = js.native
  def from(value: String, allowIndexed: Boolean): ParamType = js.native
  def from(value: JsonFragmentType): ParamType = js.native
  def from(value: JsonFragmentType, allowIndexed: Boolean): ParamType = js.native
  def from(value: ParamType): ParamType = js.native
  def from(value: ParamType, allowIndexed: Boolean): ParamType = js.native
  
  def fromObject(value: JsonFragmentType): ParamType = js.native
  def fromObject(value: ParamType): ParamType = js.native
  
  def fromString(value: String): ParamType = js.native
  def fromString(value: String, allowIndexed: Boolean): ParamType = js.native
  
  def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
}
