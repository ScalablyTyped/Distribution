package typings.ethersprojectBignumber

import typings.ethersprojectBignumber.bignumberMod.BigNumber
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixednumberMod {
  
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
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedFormat.from")
    @js.native
    def from(value: js.Any): FixedFormat = js.native
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
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.from")
    @js.native
    def from(value: js.Any): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.from")
    @js.native
    def from(value: js.Any, format: String): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.from")
    @js.native
    def from(value: js.Any, format: FixedFormat): FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromBytes")
    @js.native
    def fromBytes(value: BytesLike): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromBytes")
    @js.native
    def fromBytes(value: BytesLike, format: String): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromBytes")
    @js.native
    def fromBytes(value: BytesLike, format: FixedFormat): FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromString")
    @js.native
    def fromString(value: String): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromString")
    @js.native
    def fromString(value: String, format: String): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromString")
    @js.native
    def fromString(value: String, format: FixedFormat): FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(value: BigNumber): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: String): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: FixedFormat): FixedNumber = js.native
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(value: BigNumber, decimals: BigNumberish): FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber/lib/fixednumber", "FixedNumber.isFixedNumber")
    @js.native
    def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "formatFixed")
  @js.native
  def formatFixed(value: BigNumberish): String = js.native
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "formatFixed")
  @js.native
  def formatFixed(value: BigNumberish, decimals: String): String = js.native
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "formatFixed")
  @js.native
  def formatFixed(value: BigNumberish, decimals: BigNumberish): String = js.native
  
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "parseFixed")
  @js.native
  def parseFixed(value: String): BigNumber = js.native
  @JSImport("@ethersproject/bignumber/lib/fixednumber", "parseFixed")
  @js.native
  def parseFixed(value: String, decimals: BigNumberish): BigNumber = js.native
}
