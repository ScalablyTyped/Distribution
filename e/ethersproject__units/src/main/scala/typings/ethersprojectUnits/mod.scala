package typings.ethersprojectUnits

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/units", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def commify(value: String): String = js.native
  def commify(value: Double): String = js.native
  
  def formatEther(wei: BigNumberish): String = js.native
  
  def formatUnits(value: BigNumberish): String = js.native
  def formatUnits(value: BigNumberish, unitName: String): String = js.native
  def formatUnits(value: BigNumberish, unitName: BigNumberish): String = js.native
  
  def parseEther(ether: String): BigNumber = js.native
  
  def parseUnits(value: String): BigNumber = js.native
  def parseUnits(value: String, unitName: BigNumberish): BigNumber = js.native
}
