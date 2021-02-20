package typings.ethereumjsUtil

import typings.node.Buffer
import typings.rlp.typesMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashMod {
  
  @JSImport("ethereumjs-util/dist/hash", "keccak")
  @js.native
  def keccak(a: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util/dist/hash", "keccak")
  @js.native
  def keccak(a: Buffer, bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "keccak256")
  @js.native
  def keccak256(a: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "keccakFromArray")
  @js.native
  def keccakFromArray(a: js.Array[Double]): Buffer = js.native
  @JSImport("ethereumjs-util/dist/hash", "keccakFromArray")
  @js.native
  def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "keccakFromHexString")
  @js.native
  def keccakFromHexString(a: String): Buffer = js.native
  @JSImport("ethereumjs-util/dist/hash", "keccakFromHexString")
  @js.native
  def keccakFromHexString(a: String, bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "keccakFromString")
  @js.native
  def keccakFromString(a: String): Buffer = js.native
  @JSImport("ethereumjs-util/dist/hash", "keccakFromString")
  @js.native
  def keccakFromString(a: String, bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "ripemd160")
  @js.native
  def ripemd160(a: Buffer, padded: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "ripemd160FromArray")
  @js.native
  def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "ripemd160FromString")
  @js.native
  def ripemd160FromString(a: String, padded: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "rlphash")
  @js.native
  def rlphash(a: Input): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "sha256")
  @js.native
  def sha256(a: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "sha256FromArray")
  @js.native
  def sha256FromArray(a: js.Array[Double]): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/hash", "sha256FromString")
  @js.native
  def sha256FromString(a: String): Buffer = js.native
}
