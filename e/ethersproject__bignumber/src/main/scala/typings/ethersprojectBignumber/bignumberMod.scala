package typings.ethersprojectBignumber

import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.Hexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bignumberMod {
  
  @JSImport("@ethersproject/bignumber/lib/bignumber", "BigNumber")
  @js.native
  class BigNumber protected () extends Hexable {
    def this(constructorGuard: js.Any, hex: String) = this()
    
    val _hex: String = js.native
    
    val _isBigNumber: Boolean = js.native
    
    def abs(): BigNumber = js.native
    
    def add(other: BigNumberish): BigNumber = js.native
    
    def and(other: BigNumberish): BigNumber = js.native
    
    def div(other: BigNumberish): BigNumber = js.native
    
    def eq(other: BigNumberish): Boolean = js.native
    
    def fromTwos(value: Double): BigNumber = js.native
    
    def gt(other: BigNumberish): Boolean = js.native
    
    def gte(other: BigNumberish): Boolean = js.native
    
    def isNegative(): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def lt(other: BigNumberish): Boolean = js.native
    
    def lte(other: BigNumberish): Boolean = js.native
    
    def mask(value: Double): BigNumber = js.native
    
    def mod(other: BigNumberish): BigNumber = js.native
    
    def mul(other: BigNumberish): BigNumber = js.native
    
    def or(other: BigNumberish): BigNumber = js.native
    
    def pow(other: BigNumberish): BigNumber = js.native
    
    def shl(value: Double): BigNumber = js.native
    
    def shr(value: Double): BigNumber = js.native
    
    def sub(other: BigNumberish): BigNumber = js.native
    
    def toJSON(): js.Any = js.native
    def toJSON(key: String): js.Any = js.native
    
    def toNumber(): Double = js.native
    
    def toTwos(value: Double): BigNumber = js.native
    
    def xor(other: BigNumberish): BigNumber = js.native
  }
  /* static members */
  object BigNumber {
    
    @JSImport("@ethersproject/bignumber/lib/bignumber", "BigNumber.from")
    @js.native
    def from(value: js.Any): BigNumber = js.native
    
    @JSImport("@ethersproject/bignumber/lib/bignumber", "BigNumber.isBigNumber")
    @js.native
    def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/bignumber/lib/bignumber", "_base16To36")
  @js.native
  def base16To36(value: String): String = js.native
  
  @JSImport("@ethersproject/bignumber/lib/bignumber", "_base36To16")
  @js.native
  def base36To16(value: String): String = js.native
  
  @JSImport("@ethersproject/bignumber/lib/bignumber", "isBigNumberish")
  @js.native
  def isBigNumberish(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumberish */ Boolean = js.native
  
  type BigNumberish = BigNumber | Bytes | String | Double
}
