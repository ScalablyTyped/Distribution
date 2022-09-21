package typings.ethereumBloomFilters

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ethereum-bloom-filters/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bytesToHex(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keccak256(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def keccak256(data: ArrayLike[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def padLeft(value: String, chars: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(value.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toByteArray(value: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toByteArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toByteArray(value: ArrayLike[Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toByteArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
