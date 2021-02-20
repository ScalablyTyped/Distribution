package typings.ethersprojectUnits

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/units", "commify")
  @js.native
  def commify(value: String): String = js.native
  @JSImport("@ethersproject/units", "commify")
  @js.native
  def commify(value: Double): String = js.native
  
  @JSImport("@ethersproject/units", "formatEther")
  @js.native
  def formatEther(wei: BigNumberish): String = js.native
  
  @JSImport("@ethersproject/units", "formatUnits")
  @js.native
  def formatUnits(value: BigNumberish): String = js.native
  @JSImport("@ethersproject/units", "formatUnits")
  @js.native
  def formatUnits(value: BigNumberish, unitName: String): String = js.native
  @JSImport("@ethersproject/units", "formatUnits")
  @js.native
  def formatUnits(value: BigNumberish, unitName: BigNumberish): String = js.native
  
  @JSImport("@ethersproject/units", "parseEther")
  @js.native
  def parseEther(ether: String): BigNumber = js.native
  
  @JSImport("@ethersproject/units", "parseUnits")
  @js.native
  def parseUnits(value: String): BigNumber = js.native
  @JSImport("@ethersproject/units", "parseUnits")
  @js.native
  def parseUnits(value: String, unitName: BigNumberish): BigNumber = js.native
}
