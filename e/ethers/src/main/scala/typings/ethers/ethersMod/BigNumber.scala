package typings.ethers.ethersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "BigNumber")
@js.native
class BigNumber protected ()
  extends typings.ethersprojectBignumber.mod.BigNumber {
  def this(constructorGuard: js.Any, hex: String) = this()
}
/* static members */
@JSImport("ethers/lib/ethers", "BigNumber")
@js.native
object BigNumber extends js.Object {
  
  def from(value: js.Any): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
  
  def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = js.native
}
