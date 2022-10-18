package typings.ethersprojectUnits

import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/units", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commify(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("commify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def commify(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("commify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatEther(wei: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEther")(wei.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatUnits(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unitName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unitName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unitName: BigNumberish): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unitName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseEther(ether: String): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEther")(ether.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
  
  inline def parseUnits(value: String): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
  inline def parseUnits(value: String, unitName: BigNumberish): BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unitName.asInstanceOf[js.Any])).asInstanceOf[BigNumber]
}
