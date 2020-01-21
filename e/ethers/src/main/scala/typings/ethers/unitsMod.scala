package typings.ethers

import typings.ethers.typesMod.BigNumber
import typings.ethers.typesMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/units", JSImport.Namespace)
@js.native
object unitsMod extends js.Object {
  def formatEther(wei: BigNumberish): String = js.native
  def formatEther(wei: BigNumberish, options: js.Any): String = js.native
  def formatUnits(value: BigNumberish): String = js.native
  def formatUnits(value: BigNumberish, unitType: String): String = js.native
  def formatUnits(value: BigNumberish, unitType: String, options: js.Any): String = js.native
  def formatUnits(value: BigNumberish, unitType: Double): String = js.native
  def formatUnits(value: BigNumberish, unitType: Double, options: js.Any): String = js.native
  def parseEther(ether: String): BigNumber = js.native
  def parseUnits(value: String): BigNumber = js.native
  def parseUnits(value: String, unitType: String): BigNumber = js.native
  def parseUnits(value: String, unitType: Double): BigNumber = js.native
}

