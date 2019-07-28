package typings.ethereumjsDashUtil

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util", JSImport.Namespace)
@js.native
object ethereumjsDashUtilMod extends js.Object {
  val SHA3_NULL_S: String = js.native
  val SHA3_RLP_ARRAY_S: String = js.native
  val SHA3_RLP_S: String = js.native
  def addHexPrefix(str: String): String = js.native
  def baToJSON(ba: js.Array[String]): Buffer | Uint8Array | js.Array[String] | Null = js.native
  def baToJSON(ba: Buffer): Buffer | Uint8Array | js.Array[String] | Null = js.native
  def baToJSON(ba: Uint8Array): Buffer | Uint8Array | js.Array[String] | Null = js.native
  def bufferToHex(buf: Buffer): String = js.native
  def bufferToHex(buf: Uint8Array): String = js.native
  def bufferToInt(buf: Buffer): Double = js.native
  def bufferToInt(buf: Uint8Array): Double = js.native
  def defineProperties(self: StringDictionary[js.Any], fields: js.Array[String], data: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Uint8Array): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Uint8Array, s: Buffer): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Uint8Array, s: Uint8Array): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Uint8Array, v: Double, r: Buffer, s: Buffer): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Uint8Array, v: Double, r: Buffer, s: Uint8Array): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Uint8Array, v: Double, r: Uint8Array, s: Buffer): Buffer | Uint8Array = js.native
  def ecrecover(msgHash: Uint8Array, v: Double, r: Uint8Array, s: Uint8Array): Buffer | Uint8Array = js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer): StringDictionary[js.Any] = js.native
  def ecsign(msgHash: Buffer, privateKey: Uint8Array): StringDictionary[js.Any] = js.native
  def ecsign(msgHash: Uint8Array, privateKey: Buffer): StringDictionary[js.Any] = js.native
  def ecsign(msgHash: Uint8Array, privateKey: Uint8Array): StringDictionary[js.Any] = js.native
  def fromRpcSig(sig: String): StringDictionary[js.Any] = js.native
  def fromSigned(num: Buffer): js.Any = js.native
  def fromSigned(num: Uint8Array): js.Any = js.native
  def generateAddress(from: Buffer, nonce: Buffer): Buffer | Uint8Array = js.native
  def generateAddress(from: Buffer, nonce: Uint8Array): Buffer | Uint8Array = js.native
  def generateAddress(from: Uint8Array, nonce: Buffer): Buffer | Uint8Array = js.native
  def generateAddress(from: Uint8Array, nonce: Uint8Array): Buffer | Uint8Array = js.native
  def hashPersonalMessage(message: js.Array[_]): Buffer | Uint8Array = js.native
  def hashPersonalMessage(message: Buffer): Buffer | Uint8Array = js.native
  def hashPersonalMessage(message: Uint8Array): Buffer | Uint8Array = js.native
  def importPublic(publicKey: Buffer): Buffer | Uint8Array = js.native
  def importPublic(publicKey: Uint8Array): Buffer | Uint8Array = js.native
  def isPrecompiled(address: Buffer): Boolean = js.native
  def isPrecompiled(address: Uint8Array): Boolean = js.native
  def isValidAddress(address: String): Boolean = js.native
  def isValidChecksumAddress(address: Buffer): Boolean = js.native
  def isValidChecksumAddress(address: Uint8Array): Boolean = js.native
  def isValidPrivate(privateKey: Buffer): Boolean = js.native
  def isValidPrivate(privateKey: Uint8Array): Boolean = js.native
  def isValidPublic(publicKey: Buffer): js.Any = js.native
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): js.Any = js.native
  def isValidPublic(publicKey: Uint8Array): js.Any = js.native
  def isValidPublic(publicKey: Uint8Array, sanitize: Boolean): js.Any = js.native
  def isValidSignature(v: Buffer, r: Buffer, s: Buffer): Boolean = js.native
  def isValidSignature(v: Buffer, r: Buffer, s: Buffer, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Buffer, r: Buffer, s: Uint8Array): Boolean = js.native
  def isValidSignature(v: Buffer, r: Buffer, s: Uint8Array, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Buffer, r: Uint8Array, s: Buffer): Boolean = js.native
  def isValidSignature(v: Buffer, r: Uint8Array, s: Buffer, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Buffer, r: Uint8Array, s: Uint8Array): Boolean = js.native
  def isValidSignature(v: Buffer, r: Uint8Array, s: Uint8Array, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Buffer, s: Buffer): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Buffer, s: Buffer, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Buffer, s: Uint8Array): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Buffer, s: Uint8Array, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Uint8Array, s: Buffer): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Uint8Array, s: Buffer, homestead: Boolean): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Uint8Array, s: Uint8Array): Boolean = js.native
  def isValidSignature(v: Uint8Array, r: Uint8Array, s: Uint8Array, homestead: Boolean): Boolean = js.native
  def isZeroAddress(address: String): Boolean = js.native
  def keccak(a: String): Buffer | Uint8Array = js.native
  def keccak(a: String, bits: Double): Buffer | Uint8Array = js.native
  def keccak(a: js.Array[_]): Buffer | Uint8Array = js.native
  def keccak(a: js.Array[_], bits: Double): Buffer | Uint8Array = js.native
  def keccak(a: Double): Buffer | Uint8Array = js.native
  def keccak(a: Double, bits: Double): Buffer | Uint8Array = js.native
  def keccak(a: Buffer): Buffer | Uint8Array = js.native
  def keccak(a: Buffer, bits: Double): Buffer | Uint8Array = js.native
  def keccak(a: Uint8Array): Buffer | Uint8Array = js.native
  def keccak(a: Uint8Array, bits: Double): Buffer | Uint8Array = js.native
  def keccak256(a: String): Buffer | Uint8Array = js.native
  def keccak256(a: js.Array[_]): Buffer | Uint8Array = js.native
  def keccak256(a: Double): Buffer | Uint8Array = js.native
  def keccak256(a: Buffer): Buffer | Uint8Array = js.native
  def keccak256(a: Uint8Array): Buffer | Uint8Array = js.native
  def privateToAddress(privateKey: Buffer): Buffer | Uint8Array = js.native
  def privateToAddress(privateKey: Uint8Array): Buffer | Uint8Array = js.native
  def privateToPublic(privateKey: Buffer): Buffer | Uint8Array = js.native
  def privateToPublic(privateKey: Uint8Array): Buffer | Uint8Array = js.native
  def pubToAddress(pubKey: Buffer): Buffer | Uint8Array = js.native
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer | Uint8Array = js.native
  def pubToAddress(pubKey: Uint8Array): Buffer | Uint8Array = js.native
  def pubToAddress(pubKey: Uint8Array, sanitize: Boolean): Buffer | Uint8Array = js.native
  def ripemd160(a: String, padded: Boolean): Buffer | Uint8Array = js.native
  def ripemd160(a: js.Array[_], padded: Boolean): Buffer | Uint8Array = js.native
  def ripemd160(a: Double, padded: Boolean): Buffer | Uint8Array = js.native
  def ripemd160(a: Buffer, padded: Boolean): Buffer | Uint8Array = js.native
  def ripemd160(a: Uint8Array, padded: Boolean): Buffer | Uint8Array = js.native
  def rlphash(a: String): Buffer | Uint8Array = js.native
  def rlphash(a: js.Array[_]): Buffer | Uint8Array = js.native
  def rlphash(a: Double): Buffer | Uint8Array = js.native
  def rlphash(a: Buffer): Buffer | Uint8Array = js.native
  def rlphash(a: Uint8Array): Buffer | Uint8Array = js.native
  def setLengthLeft(msg: js.Array[_], length: Double): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: js.Array[_], length: Double, right: Boolean): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: Buffer, length: Double): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: Buffer, length: Double, right: Boolean): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: Uint8Array, length: Double): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: Uint8Array, length: Double, right: Boolean): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthRight(msg: js.Array[_], length: Double): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthRight(msg: Buffer, length: Double): Buffer | Uint8Array | js.Array[_] = js.native
  def setLengthRight(msg: Uint8Array, length: Double): Buffer | Uint8Array | js.Array[_] = js.native
  def sha256(a: String): Buffer | Uint8Array = js.native
  def sha256(a: js.Array[_]): Buffer | Uint8Array = js.native
  def sha256(a: Double): Buffer | Uint8Array = js.native
  def sha256(a: Buffer): Buffer | Uint8Array = js.native
  def sha256(a: Uint8Array): Buffer | Uint8Array = js.native
  def sha3(a: String): Buffer | Uint8Array = js.native
  def sha3(a: String, bits: Double): Buffer | Uint8Array = js.native
  def sha3(a: js.Array[_]): Buffer | Uint8Array = js.native
  def sha3(a: js.Array[_], bits: Double): Buffer | Uint8Array = js.native
  def sha3(a: Double): Buffer | Uint8Array = js.native
  def sha3(a: Double, bits: Double): Buffer | Uint8Array = js.native
  def sha3(a: Buffer): Buffer | Uint8Array = js.native
  def sha3(a: Buffer, bits: Double): Buffer | Uint8Array = js.native
  def sha3(a: Uint8Array): Buffer | Uint8Array = js.native
  def sha3(a: Uint8Array, bits: Double): Buffer | Uint8Array = js.native
  def toBuffer(v: js.Any): Buffer | Uint8Array = js.native
  def toChecksumAddress(address: String): String = js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer): String = js.native
  def toRpcSig(v: Double, r: Buffer, s: Uint8Array): String = js.native
  def toRpcSig(v: Double, r: Uint8Array, s: Buffer): String = js.native
  def toRpcSig(v: Double, r: Uint8Array, s: Uint8Array): String = js.native
  def toUnsigned(num: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): Buffer | Uint8Array = js.native
  def unpad(a: String): String = js.native
  def unpad(a: Buffer): Buffer = js.native
  def unpad(a: Uint8Array): Uint8Array = js.native
  def unpad[T /* <: js.Array[_] */](a: T): T = js.native
  def zeroAddress(): String = js.native
  def zeros(bytes: Double): Buffer | Uint8Array = js.native
}

