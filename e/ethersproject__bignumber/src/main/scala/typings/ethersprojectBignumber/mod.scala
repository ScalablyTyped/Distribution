package typings.ethersprojectBignumber

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/bignumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/bignumber", "BigNumber")
  @js.native
  class BigNumber protected ()
    extends typings.ethersprojectBignumber.bignumberMod.BigNumber {
    def this(constructorGuard: js.Any, hex: String) = this()
  }
  /* static members */
  object BigNumber {
    
    @JSImport("@ethersproject/bignumber", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from(value: js.Any): typings.ethersprojectBignumber.bignumberMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.bignumberMod.BigNumber]
    
    @scala.inline
    def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean]
  }
  
  @JSImport("@ethersproject/bignumber", "FixedFormat")
  @js.native
  class FixedFormat protected ()
    extends typings.ethersprojectBignumber.fixednumberMod.FixedFormat {
    def this(constructorGuard: js.Any, signed: Boolean, width: Double, decimals: Double) = this()
  }
  /* static members */
  object FixedFormat {
    
    @JSImport("@ethersproject/bignumber", "FixedFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedFormat]
  }
  
  @JSImport("@ethersproject/bignumber", "FixedNumber")
  @js.native
  class FixedNumber protected ()
    extends typings.ethersprojectBignumber.fixednumberMod.FixedNumber {
    def this(constructorGuard: js.Any, hex: String, value: String) = this()
    def this(
      constructorGuard: js.Any,
      hex: String,
      value: String,
      format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat
    ) = this()
  }
  /* static members */
  object FixedNumber {
    
    @JSImport("@ethersproject/bignumber", "FixedNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def from(value: js.Any, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def from(value: js.Any, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    
    @scala.inline
    def fromBytes(value: BytesLike): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromBytes(value: BytesLike, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    
    @scala.inline
    def fromString(value: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromString(value: String, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromString(value: String, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    
    @scala.inline
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber, decimals: Unit, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: Unit,
      format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: BigNumberish,
      format: String
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    @scala.inline
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: BigNumberish,
      format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.fixednumberMod.FixedNumber]
    
    @scala.inline
    def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean]
  }
  
  @scala.inline
  def base16To36(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_base16To36")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def base36To16(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_base36To16")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatFixed(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatFixed(value: BigNumberish, decimals: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatFixed(value: BigNumberish, decimals: BigNumberish): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parseFixed(value: String): typings.ethersprojectBignumber.bignumberMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFixed")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.bignumberMod.BigNumber]
  @scala.inline
  def parseFixed(value: String, decimals: BigNumberish): typings.ethersprojectBignumber.bignumberMod.BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.bignumberMod.BigNumber]
}
