package typings.ethers.utilsMod

import typings.ethersprojectAbi.fragmentsMod.JsonFragmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/utils", "ParamType")
@js.native
class ParamType protected ()
  extends typings.ethersprojectAbi.mod.ParamType {
  def this(constructorGuard: js.Any, params: js.Any) = this()
}
/* static members */
@JSImport("ethers/lib/utils", "ParamType")
@js.native
object ParamType extends js.Object {
  
  def from(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def from(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def from(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def from(value: JsonFragmentType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  
  def fromObject(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  
  def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  def fromString(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
  
  def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
}
