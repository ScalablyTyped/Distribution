package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMathsMod {
  
  @JSImport("ethers/types/utils/maths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTwos(_value: BigNumberish, _width: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTwos")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def getBigInt(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def getBigInt(value: BigNumberish, name: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getBigInt")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def getNumber(value: BigNumberish): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getNumber(value: BigNumberish, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getUint(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getUint")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def getUint(value: BigNumberish, name: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getUint")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def mask(_value: BigNumberish, _bits: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(_value.asInstanceOf[js.Any], _bits.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def toBeArray(_value: BigNumberish): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toBeArray")(_value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toBeHex(_value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBeHex")(_value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toBeHex(_value: BigNumberish, _width: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBeHex")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toBigInt(value: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("toBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def toBigInt(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("toBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def toNumber(value: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toNumber(value: BigNumberish): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toQuantity(value: BigNumberish | BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQuantity")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTwos(_value: BigNumberish, _width: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("toTwos")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  type BigNumberish = String | Numeric
  
  type Numeric = Double | js.BigInt
}
