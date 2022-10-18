package typings.ethers.mod

import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import typings.ethersprojectBignumber.libFixednumberMod.FixedFormat
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "FixedNumber")
@js.native
open class FixedNumber protected ()
  extends typings.ethersprojectBignumber.mod.FixedNumber {
  def this(constructorGuard: Any, hex: String, value: String) = this()
  def this(constructorGuard: Any, hex: String, value: String, format: FixedFormat) = this()
}
/* static members */
object FixedNumber {
  
  @JSImport("ethers", "FixedNumber")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(value: Any): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def from(value: Any, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def from(value: Any, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def from(value: Any, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def fromBytes(value: BytesLike): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromBytes(value: BytesLike, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromBytes(value: BytesLike, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromBytes(value: BytesLike, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def fromString(value: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromString(value: String, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromString(value: String, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromString(value: String, format: FixedFormat): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def fromValue(value: typings.ethersprojectBignumber.libBignumberMod.BigNumber): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(value: typings.ethersprojectBignumber.libBignumberMod.BigNumber, decimals: Unit, format: String): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(value: typings.ethersprojectBignumber.libBignumberMod.BigNumber, decimals: Unit, format: Double): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typings.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: Unit,
    format: FixedFormat
  ): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(value: typings.ethersprojectBignumber.libBignumberMod.BigNumber, decimals: BigNumberish): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typings.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: BigNumberish,
    format: String
  ): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typings.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: BigNumberish,
    format: Double
  ): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typings.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: BigNumberish,
    format: FixedFormat
  ): typings.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def isFixedNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean]
}
