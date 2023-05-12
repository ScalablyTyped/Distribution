package typings.ethers

import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.ethers.typesUtilsMathsMod.Numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsUnitsMod {
  
  @JSImport("ethers/types/utils/units", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatEther(wei: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEther")(wei.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatUnits(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unit: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseEther(ether: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEther")(ether.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def parseUnits(value: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def parseUnits(value: String, unit: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  inline def parseUnits(value: String, unit: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
}
