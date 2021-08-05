package typings.ethersprojectBignumber

import typings.ethersprojectBignumber.bignumberMod.BigNumber
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixednumberMod {
  
  @JSImport("@ethersproject/bignumber/lib/fixednumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedFormat")
  @js.native
  class FixedFormat protected () extends StObject {
    def this(constructorGuard: js.Any, signed: Boolean, width: Double, decimals: Double) = this()
    
    val _multiplier: String = js.native
    
    val decimals: Double = js.native
    
    val name: String = js.native
    
    val signed: Boolean = js.native
    
    val width: Double = js.native
  }
  /* static members */
  object FixedFormat {
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: js.Any): FixedFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[FixedFormat]
  }
  
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber")
  @js.native
  class FixedNumber protected () extends StObject {
    def this(constructorGuard: js.Any, hex: String, value: String) = this()
    def this(constructorGuard: js.Any, hex: String, value: String, format: FixedFormat) = this()
    
    def _checkFormat(other: FixedNumber): Unit = js.native
    
    val _hex: String = js.native
    
    val _isFixedNumber: Boolean = js.native
    
    val _value: String = js.native
    
    def addUnsafe(other: FixedNumber): FixedNumber = js.native
    
    def ceiling(): FixedNumber = js.native
    
    def divUnsafe(other: FixedNumber): FixedNumber = js.native
    
    def floor(): FixedNumber = js.native
    
    val format: FixedFormat = js.native
    
    def isNegative(): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def mulUnsafe(other: FixedNumber): FixedNumber = js.native
    
    def round(): FixedNumber = js.native
    def round(decimals: Double): FixedNumber = js.native
    
    def subUnsafe(other: FixedNumber): FixedNumber = js.native
    
    def toFormat(format: String): FixedNumber = js.native
    def toFormat(format: FixedFormat): FixedNumber = js.native
    
    def toHexString(): String = js.native
    def toHexString(width: Double): String = js.native
    
    def toUnsafeFloat(): Double = js.native
  }
  /* static members */
  object FixedNumber {
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: js.Any): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def from(value: js.Any, format: String): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def from(value: js.Any, format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    
    inline def fromBytes(value: BytesLike): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def fromBytes(value: BytesLike, format: String): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromBytes(value: BytesLike, format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    
    inline def fromString(value: String): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def fromString(value: String, format: String): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromString(value: String, format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    
    inline def fromValue(value: BigNumber): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def fromValue(value: BigNumber, decimals: Unit, format: String): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromValue(value: BigNumber, decimals: Unit, format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromValue(value: BigNumber, decimals: BigNumberish): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromValue(value: BigNumber, decimals: BigNumberish, format: String): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromValue(value: BigNumber, decimals: BigNumberish, format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    
    inline def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean]
  }
  
  inline def formatFixed(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatFixed(value: BigNumberish, decimals: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatFixed(value: BigNumberish, decimals: BigNumberish): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseFixed(value: String): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFixed")(value.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
  inline def parseFixed(value: String, decimals: BigNumberish): BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[BigNumber]
}
