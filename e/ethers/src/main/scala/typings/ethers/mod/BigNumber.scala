package typings.ethers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "BigNumber")
@js.native
open class BigNumber protected ()
  extends typings.ethersprojectBignumber.mod.BigNumber {
  def this(constructorGuard: Any, hex: String) = this()
}
/* static members */
object BigNumber {
  
  @JSImport("ethers", "BigNumber")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(value: Any): typings.ethersprojectBignumber.libBignumberMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.libBignumberMod.BigNumber]
  
  inline def isBigNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean]
}
