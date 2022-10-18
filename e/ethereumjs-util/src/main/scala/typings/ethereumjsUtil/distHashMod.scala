package typings.ethereumjsUtil

import typings.node.bufferMod.global.Buffer
import typings.rlp.mod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHashMod {
  
  @JSImport("ethereumjs-util/dist/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keccak(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccak(a: Buffer, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def keccak256(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def keccakFromArray(a: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromArray")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromArray")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def keccakFromHexString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromHexString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccakFromHexString(a: String, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromHexString")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def keccakFromString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccakFromString(a: String, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromString")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ripemd160(a: Buffer, padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160FromArray")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ripemd160FromString(a: String, padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160FromString")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def rlphash(a: Input): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("rlphash")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256FromArray(a: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256FromArray")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256FromString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256FromString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
