package typings.ethers.typesEthersMod

import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsFixednumberMod.FixedFormat
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "FixedNumber")
@js.native
open class FixedNumber protected ()
  extends typings.ethers.typesUtilsMod.FixedNumber {
  /**
    *  @private
    */
  def this(guard: Any, value: js.BigInt, format: Any) = this()
}
/* static members */
object FixedNumber {
  
  @JSImport("ethers/types/ethers", "FixedNumber")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Creates a new [[FixedNumber]] with the big-endian representation
    *  %%value%% with %%format%%.
    *
    *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
    *  in %%format%% due to overflow.
    */
  inline def fromBytes(_value: BytesLike): typings.ethers.typesUtilsFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(_value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  inline def fromBytes(_value: BytesLike, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(_value.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  
  /**
    *  Creates a new [[FixedNumber]] for %%value%% with %%format%%.
    *
    *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
    *  in %%format%%, either due to overflow or underflow (precision loss).
    */
  inline def fromString(_value: String): typings.ethers.typesUtilsFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(_value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  inline def fromString(_value: String, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(_value.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  
  /**
    *  Creates a new [[FixedNumber]] for %%value%% divided by
    *  %%decimal%% places with %%format%%.
    *
    *  This will throw a [[NumericFaultError]] if %%value%% (once adjusted
    *  for %%decimals%%) cannot fit in %%format%%, either due to overflow
    *  or underflow (precision loss).
    */
  inline def fromValue(_value: BigNumberish): typings.ethers.typesUtilsFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  inline def fromValue(_value: BigNumberish, decimals: Double): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  inline def fromValue(_value: BigNumberish, decimals: Double, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  inline def fromValue(_value: BigNumberish, decimals: Unit, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
}
