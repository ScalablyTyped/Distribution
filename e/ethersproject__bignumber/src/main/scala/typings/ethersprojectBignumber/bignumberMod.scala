package typings.ethersprojectBignumber

import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.Hexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bignumberMod {
  
  @JSImport("@ethersproject/bignumber/lib/bignumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/bignumber/lib/bignumber", "BigNumber")
  @js.native
  class BigNumber protected ()
    extends StObject
       with Hexable {
    def this(constructorGuard: js.Any, hex: String) = this()
    
    val _hex: String = js.native
    
    val _isBigNumber: Boolean = js.native
    
    def abs(): BigNumber = js.native
    
    def add(other: BigNumberish): BigNumber = js.native
    
    def and(other: BigNumberish): BigNumber = js.native
    
    def div(other: BigNumberish): BigNumber = js.native
    
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
    
    /* CompleteClass */
    override def toHexString(): String = js.native
    
    def toJSON(): js.Any = js.native
    def toJSON(key: String): js.Any = js.native
    
    def toNumber(): Double = js.native
    
    def toTwos(value: Double): BigNumber = js.native
    
    def xor(other: BigNumberish): BigNumber = js.native
  }
  /* static members */
  object BigNumber {
    
    @JSImport("@ethersproject/bignumber/lib/bignumber", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from(value: js.Any): BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[BigNumber]
    
    @scala.inline
    def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean]
  }
  
  @scala.inline
  def base16To36(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_base16To36")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def base36To16(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_base36To16")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isBigNumberish(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumberish */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumberish")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumberish */ Boolean]
  
  type BigNumberish = BigNumber | Bytes | String | Double
}
