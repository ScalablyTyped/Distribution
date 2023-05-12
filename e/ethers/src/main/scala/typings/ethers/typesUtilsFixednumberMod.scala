package typings.ethers

import typings.ethers.anon.Decimals
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsFixednumberMod {
  
  @JSImport("ethers/types/utils/fixednumber", "FixedNumber")
  @js.native
  open class FixedNumber protected () extends StObject {
    /**
      *  @private
      */
    def this(guard: Any, value: js.BigInt, format: Any) = this()
    
    /**
      *  This is a property so console.log shows a human-meaningful value.
      *
      *  @private
      */
    val _value: String = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% added
      *  to %%other%%. A [[NumericFaultError]] is thrown if overflow
      *  occurs.
      */
    def add(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% added
      *  to %%other%%, ignoring overflow.
      */
    def addUnsafe(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] which is the smallest **integer**
      *  that is greater than or equal to %%this%%.
      *
      *  The decimal component of the result will always be ``0``.
      */
    def ceiling(): FixedNumber = js.native
    
    /**
      *  Returns a comparison result between %%this%% and %%other%%.
      *
      *  This is suitable for use in sorting, where ``-1`` implies %%this%%
      *  is smaller, ``1`` implies %%other%% is larger and ``0`` implies
      *  both are equal.
      */
    def cmp(other: FixedNumber): Double = js.native
    
    /**
      *  The number of decimal places in the fixed-point arithment field.
      */
    def decimals: Double = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% divided
      *  by %%other%%, ignoring underflow (precision loss). A
      *  [[NumericFaultError]] is thrown if overflow occurs.
      */
    def div(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% divided
      *  by %%other%%. A [[NumericFaultError]] is thrown if underflow
      *  (precision loss) occurs.
      */
    def divSignal(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% divided
      *  by %%other%%, ignoring underflow (precision loss). A
      *  [[NumericFaultError]] is thrown if overflow occurs.
      */
    def divUnsafe(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns true if %%other%% is equal to %%this%%.
      */
    def eq(other: FixedNumber): Boolean = js.native
    
    /**
      *  Returns a new [[FixedNumber]] which is the largest **integer**
      *  that is less than or equal to %%this%%.
      *
      *  The decimal component of the result will always be ``0``.
      */
    def floor(): FixedNumber = js.native
    
    /**
      *  The specific fixed-point arithmetic field for this value.
      */
    val format: String = js.native
    
    /**
      *  Returns true if %%other%% is greater than to %%this%%.
      */
    def gt(other: FixedNumber): Boolean = js.native
    
    /**
      *  Returns true if %%other%% is greater than or equal to %%this%%.
      */
    def gte(other: FixedNumber): Boolean = js.native
    
    /**
      *  Returns true if %%this%% is less than ``0``.
      */
    def isNegative(): Boolean = js.native
    
    /**
      *  Returns true if %%this%% is equal to ``0``.
      */
    def isZero(): Boolean = js.native
    
    /**
      *  Returns true if %%other%% is less than to %%this%%.
      */
    def lt(other: FixedNumber): Boolean = js.native
    
    /**
      *  Returns true if %%other%% is less than or equal to %%this%%.
      */
    def lte(other: FixedNumber): Boolean = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% multiplied
      *  by %%other%%. A [[NumericFaultError]] is thrown if overflow
      *  occurs.
      */
    def mul(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% multiplied
      *  by %%other%%. A [[NumericFaultError]] is thrown if overflow
      *  occurs or if underflow (precision loss) occurs.
      */
    def mulSignal(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%this%% multiplied
      *  by %%other%%, ignoring overflow and underflow (precision loss).
      */
    def mulUnsafe(other: FixedNumber): FixedNumber = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the decimal component
      *  rounded up on ties at %%decimals%% places.
      */
    def round(): FixedNumber = js.native
    def round(decimals: Double): FixedNumber = js.native
    
    /**
      *  If true, negative values are permitted, otherwise only
      *  positive values and zero are allowed.
      */
    def signed: Boolean = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%other%% subtracted
      *  from %%this%%. A [[NumericFaultError]] is thrown if overflow
      *  occurs.
      */
    def sub(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Returns a new [[FixedNumber]] with the result of %%other%% subtracted
      *  from %%this%%, ignoring overflow.
      */
    def subUnsafe(other: FixedNumber): FixedNumber = js.native
    
    /**
      *  Return a new [[FixedNumber]] with the same value but has had
      *  its field set to %%format%%.
      *
      *  This will throw if the value cannot fit into %%format%%.
      */
    def toFormat(format: FixedFormat): FixedNumber = js.native
    
    /**
      *  Returns a float approximation.
      *
      *  Due to IEEE 754 precission (or lack thereof), this function
      *  can only return an approximation and most values will contain
      *  rounding errors.
      */
    def toUnsafeFloat(): Double = js.native
    
    /**
      *  The value as an integer, based on the smallest unit the
      *  [[decimals]] allow.
      */
    def value: js.BigInt = js.native
    
    /**
      *  The number of bits available to store the value.
      */
    def width: Double = js.native
  }
  /* static members */
  object FixedNumber {
    
    @JSImport("ethers/types/utils/fixednumber", "FixedNumber")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[FixedNumber]] with the big-endian representation
      *  %%value%% with %%format%%.
      *
      *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
      *  in %%format%% due to overflow.
      */
    inline def fromBytes(_value: BytesLike): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(_value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def fromBytes(_value: BytesLike, _format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(_value.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    
    /**
      *  Creates a new [[FixedNumber]] for %%value%% with %%format%%.
      *
      *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
      *  in %%format%%, either due to overflow or underflow (precision loss).
      */
    inline def fromString(_value: String): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(_value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def fromString(_value: String, _format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(_value.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    
    /**
      *  Creates a new [[FixedNumber]] for %%value%% divided by
      *  %%decimal%% places with %%format%%.
      *
      *  This will throw a [[NumericFaultError]] if %%value%% (once adjusted
      *  for %%decimals%%) cannot fit in %%format%%, either due to overflow
      *  or underflow (precision loss).
      */
    inline def fromValue(_value: BigNumberish): FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any]).asInstanceOf[FixedNumber]
    inline def fromValue(_value: BigNumberish, decimals: Double): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromValue(_value: BigNumberish, decimals: Double, _format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
    inline def fromValue(_value: BigNumberish, decimals: Unit, _format: FixedFormat): FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[FixedNumber]
  }
  
  type FixedFormat = Double | String | Decimals
}
