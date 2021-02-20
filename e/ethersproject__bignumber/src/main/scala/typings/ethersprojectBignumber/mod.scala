package typings.ethersprojectBignumber

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/bignumber", "BigNumber")
  @js.native
  class BigNumber protected ()
    extends typings.ethersprojectBignumber.bignumberMod.BigNumber {
    def this(constructorGuard: js.Any, hex: String) = this()
  }
  /* static members */
  object BigNumber {
    
    @JSImport("@ethersproject/bignumber", "BigNumber.from")
    @js.native
    def from(value: js.Any): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
    
    @JSImport("@ethersproject/bignumber", "BigNumber.isBigNumber")
    @js.native
    def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/bignumber", "FixedFormat")
  @js.native
  class FixedFormat protected ()
    extends typings.ethersprojectBignumber.fixednumberMod.FixedFormat {
    def this(constructorGuard: js.Any, signed: Boolean, width: Double, decimals: Double) = this()
  }
  /* static members */
  object FixedFormat {
    
    @JSImport("@ethersproject/bignumber", "FixedFormat.from")
    @js.native
    def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedFormat = js.native
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
    
    @JSImport("@ethersproject/bignumber", "FixedNumber.from")
    @js.native
    def from(value: js.Any): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.from")
    @js.native
    def from(value: js.Any, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.from")
    @js.native
    def from(value: js.Any, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromBytes")
    @js.native
    def fromBytes(value: BytesLike): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromBytes")
    @js.native
    def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromBytes")
    @js.native
    def fromBytes(value: BytesLike, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromString")
    @js.native
    def fromString(value: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromString")
    @js.native
    def fromString(value: String, format: String): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromString")
    @js.native
    def fromString(value: String, format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: js.UndefOr[BigNumberish],
      format: String
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(
      value: typings.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: js.UndefOr[BigNumberish],
      format: typings.ethersprojectBignumber.fixednumberMod.FixedFormat
    ): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    @JSImport("@ethersproject/bignumber", "FixedNumber.fromValue")
    @js.native
    def fromValue(value: typings.ethersprojectBignumber.bignumberMod.BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    
    @JSImport("@ethersproject/bignumber", "FixedNumber.isFixedNumber")
    @js.native
    def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/bignumber", "_base16To36")
  @js.native
  def base16To36(value: String): String = js.native
  
  @JSImport("@ethersproject/bignumber", "_base36To16")
  @js.native
  def base36To16(value: String): String = js.native
  
  @JSImport("@ethersproject/bignumber", "formatFixed")
  @js.native
  def formatFixed(value: BigNumberish): String = js.native
  @JSImport("@ethersproject/bignumber", "formatFixed")
  @js.native
  def formatFixed(value: BigNumberish, decimals: String): String = js.native
  @JSImport("@ethersproject/bignumber", "formatFixed")
  @js.native
  def formatFixed(value: BigNumberish, decimals: BigNumberish): String = js.native
  
  @JSImport("@ethersproject/bignumber", "parseFixed")
  @js.native
  def parseFixed(value: String): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
  @JSImport("@ethersproject/bignumber", "parseFixed")
  @js.native
  def parseFixed(value: String, decimals: BigNumberish): typings.ethersprojectBignumber.bignumberMod.BigNumber = js.native
}
