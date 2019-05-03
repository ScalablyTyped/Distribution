package typings
package ethereumjsDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util", JSImport.Namespace)
@js.native
object ethereumjsDashUtilMod extends js.Object {
  val SHA3_NULL_S: java.lang.String = js.native
  val SHA3_RLP_ARRAY_S: java.lang.String = js.native
  val SHA3_RLP_S: java.lang.String = js.native
  def addHexPrefix(str: java.lang.String): java.lang.String = js.native
  def baToJSON(ba: js.Array[java.lang.String]): nodeLib.Buffer | stdLib.Uint8Array | js.Array[java.lang.String] | scala.Null = js.native
  def baToJSON(ba: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array | js.Array[java.lang.String] | scala.Null = js.native
  def baToJSON(ba: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array | js.Array[java.lang.String] | scala.Null = js.native
  def bufferToHex(buf: nodeLib.Buffer): java.lang.String = js.native
  def bufferToHex(buf: stdLib.Uint8Array): java.lang.String = js.native
  def bufferToInt(buf: nodeLib.Buffer): scala.Double = js.native
  def bufferToInt(buf: stdLib.Uint8Array): scala.Double = js.native
  def defineProperties(
    self: org.scalablytyped.runtime.StringDictionary[js.Any],
    fields: js.Array[java.lang.String],
    data: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def ecrecover(msgHash: nodeLib.Buffer, v: scala.Double, r: nodeLib.Buffer, s: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: nodeLib.Buffer, v: scala.Double, r: nodeLib.Buffer, s: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: nodeLib.Buffer, v: scala.Double, r: stdLib.Uint8Array, s: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: nodeLib.Buffer, v: scala.Double, r: stdLib.Uint8Array, s: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: stdLib.Uint8Array, v: scala.Double, r: nodeLib.Buffer, s: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: stdLib.Uint8Array, v: scala.Double, r: nodeLib.Buffer, s: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: stdLib.Uint8Array, v: scala.Double, r: stdLib.Uint8Array, s: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecrecover(msgHash: stdLib.Uint8Array, v: scala.Double, r: stdLib.Uint8Array, s: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ecsign(msgHash: nodeLib.Buffer, privateKey: nodeLib.Buffer): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def ecsign(msgHash: nodeLib.Buffer, privateKey: stdLib.Uint8Array): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def ecsign(msgHash: stdLib.Uint8Array, privateKey: nodeLib.Buffer): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def ecsign(msgHash: stdLib.Uint8Array, privateKey: stdLib.Uint8Array): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def fromRpcSig(sig: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def fromSigned(num: nodeLib.Buffer): js.Any = js.native
  def fromSigned(num: stdLib.Uint8Array): js.Any = js.native
  def generateAddress(from: nodeLib.Buffer, nonce: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def generateAddress(from: nodeLib.Buffer, nonce: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def generateAddress(from: stdLib.Uint8Array, nonce: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def generateAddress(from: stdLib.Uint8Array, nonce: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def hashPersonalMessage(message: js.Array[_]): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def hashPersonalMessage(message: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def hashPersonalMessage(message: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def importPublic(publicKey: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def importPublic(publicKey: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def isPrecompiled(address: nodeLib.Buffer): scala.Boolean = js.native
  def isPrecompiled(address: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidAddress(address: java.lang.String): scala.Boolean = js.native
  def isValidChecksumAddress(address: nodeLib.Buffer): scala.Boolean = js.native
  def isValidChecksumAddress(address: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidPrivate(privateKey: nodeLib.Buffer): scala.Boolean = js.native
  def isValidPrivate(privateKey: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidPublic(publicKey: nodeLib.Buffer): js.Any = js.native
  def isValidPublic(publicKey: nodeLib.Buffer, sanitize: scala.Boolean): js.Any = js.native
  def isValidPublic(publicKey: stdLib.Uint8Array): js.Any = js.native
  def isValidPublic(publicKey: stdLib.Uint8Array, sanitize: scala.Boolean): js.Any = js.native
  def isValidSignature(v: nodeLib.Buffer, r: nodeLib.Buffer, s: nodeLib.Buffer): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: nodeLib.Buffer, s: nodeLib.Buffer, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: nodeLib.Buffer, s: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: nodeLib.Buffer, s: stdLib.Uint8Array, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: stdLib.Uint8Array, s: nodeLib.Buffer): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: stdLib.Uint8Array, s: nodeLib.Buffer, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: stdLib.Uint8Array, s: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidSignature(v: nodeLib.Buffer, r: stdLib.Uint8Array, s: stdLib.Uint8Array, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: nodeLib.Buffer, s: nodeLib.Buffer): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: nodeLib.Buffer, s: nodeLib.Buffer, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: nodeLib.Buffer, s: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: nodeLib.Buffer, s: stdLib.Uint8Array, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: stdLib.Uint8Array, s: nodeLib.Buffer): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: stdLib.Uint8Array, s: nodeLib.Buffer, homestead: scala.Boolean): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: stdLib.Uint8Array, s: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidSignature(v: stdLib.Uint8Array, r: stdLib.Uint8Array, s: stdLib.Uint8Array, homestead: scala.Boolean): scala.Boolean = js.native
  def isZeroAddress(address: java.lang.String): scala.Boolean = js.native
  def keccak(a: java.lang.String): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: java.lang.String, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: js.Array[_]): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: js.Array[_], bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: nodeLib.Buffer, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: scala.Double, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak(a: stdLib.Uint8Array, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak256(a: java.lang.String): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak256(a: js.Array[_]): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak256(a: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak256(a: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def keccak256(a: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def privateToAddress(privateKey: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def privateToAddress(privateKey: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def privateToPublic(privateKey: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def privateToPublic(privateKey: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def pubToAddress(pubKey: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def pubToAddress(pubKey: nodeLib.Buffer, sanitize: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def pubToAddress(pubKey: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def pubToAddress(pubKey: stdLib.Uint8Array, sanitize: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ripemd160(a: java.lang.String, padded: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ripemd160(a: js.Array[_], padded: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ripemd160(a: nodeLib.Buffer, padded: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ripemd160(a: scala.Double, padded: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def ripemd160(a: stdLib.Uint8Array, padded: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def rlphash(a: java.lang.String): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def rlphash(a: js.Array[_]): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def rlphash(a: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def rlphash(a: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def rlphash(a: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def setLengthLeft(msg: js.Array[_], length: scala.Double): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: js.Array[_], length: scala.Double, right: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: nodeLib.Buffer, length: scala.Double): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: nodeLib.Buffer, length: scala.Double, right: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: stdLib.Uint8Array, length: scala.Double): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthLeft(msg: stdLib.Uint8Array, length: scala.Double, right: scala.Boolean): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthRight(msg: js.Array[_], length: scala.Double): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthRight(msg: nodeLib.Buffer, length: scala.Double): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def setLengthRight(msg: stdLib.Uint8Array, length: scala.Double): nodeLib.Buffer | stdLib.Uint8Array | js.Array[_] = js.native
  def sha256(a: java.lang.String): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha256(a: js.Array[_]): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha256(a: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha256(a: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha256(a: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: java.lang.String): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: java.lang.String, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: js.Array[_]): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: js.Array[_], bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: nodeLib.Buffer): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: nodeLib.Buffer, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: scala.Double, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: stdLib.Uint8Array): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def sha3(a: stdLib.Uint8Array, bits: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def toBuffer(v: js.Any): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def toChecksumAddress(address: java.lang.String): java.lang.String = js.native
  def toRpcSig(v: scala.Double, r: nodeLib.Buffer, s: nodeLib.Buffer): java.lang.String = js.native
  def toRpcSig(v: scala.Double, r: nodeLib.Buffer, s: stdLib.Uint8Array): java.lang.String = js.native
  def toRpcSig(v: scala.Double, r: stdLib.Uint8Array, s: nodeLib.Buffer): java.lang.String = js.native
  def toRpcSig(v: scala.Double, r: stdLib.Uint8Array, s: stdLib.Uint8Array): java.lang.String = js.native
  def toUnsigned(num: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): nodeLib.Buffer | stdLib.Uint8Array = js.native
  def unpad(a: java.lang.String): java.lang.String = js.native
  def unpad(a: nodeLib.Buffer): nodeLib.Buffer = js.native
  def unpad(a: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def unpad[T /* <: js.Array[_] */](a: T): T = js.native
  def zeroAddress(): java.lang.String = js.native
  def zeros(bytes: scala.Double): nodeLib.Buffer | stdLib.Uint8Array = js.native
}

