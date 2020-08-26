package typings.ethereumjsUtil

import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import typings.bnJs.mod.ReductionContext
import typings.bnJs.mod.^
import typings.ethereumjsUtil.ethereumjsUtilStrings.hex
import typings.ethereumjsUtil.signatureMod.ECDSASignature
import typings.node.Buffer
import typings.rlp.typesMod.Decoded
import typings.rlp.typesMod.Input
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BN protected ()
    extends typings.ethereumjsUtil.externalsMod.BN {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: Double) = this()
    def this(number: typings.bnJs.mod.BN) = this()
    def this(number: Buffer) = this()
    def this(number: Uint8Array) = this()
    def this(number: String, base: Double) = this()
    def this(number: String, base: hex) = this()
    def this(number: String, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double) = this()
    def this(number: js.Array[Double], base: hex) = this()
    def this(number: js.Array[Double], endian: Endianness) = this()
    def this(number: Double, base: Double) = this()
    def this(number: Double, base: hex) = this()
    def this(number: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double) = this()
    def this(number: typings.bnJs.mod.BN, base: hex) = this()
    def this(number: typings.bnJs.mod.BN, endian: Endianness) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: Buffer, endian: Endianness) = this()
    def this(number: Uint8Array, base: Double) = this()
    def this(number: Uint8Array, base: hex) = this()
    def this(number: Uint8Array, endian: Endianness) = this()
    def this(number: String, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: Double, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
    def this(number: Uint8Array, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: Uint8Array, base: hex, endian: Endianness) = this()
  }
  
  val KECCAK256_NULL: Buffer = js.native
  val KECCAK256_NULL_S: String = js.native
  val KECCAK256_RLP: Buffer = js.native
  val KECCAK256_RLP_ARRAY: Buffer = js.native
  val KECCAK256_RLP_ARRAY_S: String = js.native
  val KECCAK256_RLP_S: String = js.native
  val MAX_INTEGER: ^ = js.native
  val TWO_POW256: ^ = js.native
  def addHexPrefix(str: String): String = js.native
  /**
    * @description Returns TRUE if the first specified array contains all elements
    *              from the second one. FALSE otherwise. If `some` is true, will
    *              return true if first specified array contain some elements of
    *              the second.
    */
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_]): Boolean = js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_], some: Boolean): Boolean = js.native
  def baToJSON(ba: js.Any): js.Any = js.native
  def bufferToHex(buf: Buffer): String = js.native
  def bufferToInt(buf: Buffer): Double = js.native
  def defineProperties(self: js.Any, fields: js.Any): Unit = js.native
  def defineProperties(self: js.Any, fields: js.Any, data: js.Any): Unit = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = js.native
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of ascii string
    */
  def fromAscii(stringValue: String): String = js.native
  def fromRpcSig(sig: String): ECDSASignature = js.native
  def fromSigned(num: Buffer): ^ = js.native
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of utf8 string
    */
  def fromUtf8(stringValue: String): String = js.native
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = js.native
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = js.native
  /**
    * @description Get the binary size of a string
    */
  def getBinarySize(str: String): Double = js.native
  /**
    * @description getKeys([{a: 1, b: 2}, {a: 3, b: 4}], 'a') => [1, 3]
    */
  def getKeys(params: js.Array[_], key: String): js.Array[_] = js.native
  def getKeys(params: js.Array[_], key: String, allowEmpty: Boolean): js.Array[_] = js.native
  def hashPersonalMessage(message: Buffer): Buffer = js.native
  def importPublic(publicKey: Buffer): Buffer = js.native
  /**
    * @description Converts an `Number` to a `Buffer`
    */
  def intToBuffer(i: Double): Buffer = js.native
  /**
    * @description Converts a `Number` into a hex `String`
    */
  def intToHex(i: Double): String = js.native
  /**
    * @description Returns a `Boolean` on whether or not the a `String` starts with '0x'
    */
  def isHexPrefixed(str: String): Boolean = js.native
  /**
    * @description check if string is hex string of specific length
    */
  def isHexString(value: String): Boolean = js.native
  def isHexString(value: String, length: Double): Boolean = js.native
  def isValidAddress(hexAddress: String): Boolean = js.native
  def isValidChecksumAddress(hexAddress: String): Boolean = js.native
  def isValidChecksumAddress(hexAddress: String, eip1191ChainId: Double): Boolean = js.native
  def isValidPrivate(privateKey: Buffer): Boolean = js.native
  def isValidPublic(publicKey: Buffer): Boolean = js.native
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: js.UndefOr[scala.Nothing], chainId: Double): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = js.native
  def isZeroAddress(hexAddress: String): Boolean = js.native
  def keccak(a: Buffer): Buffer = js.native
  def keccak(a: Buffer, bits: Double): Buffer = js.native
  def keccak256(a: Buffer): Buffer = js.native
  def keccakFromArray(a: js.Array[Double]): Buffer = js.native
  def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = js.native
  def keccakFromHexString(a: String): Buffer = js.native
  def keccakFromHexString(a: String, bits: Double): Buffer = js.native
  def keccakFromString(a: String): Buffer = js.native
  def keccakFromString(a: String, bits: Double): Buffer = js.native
  /**
    * @description Pads a `String` to have an even length
    */
  def padToEven(value: String): String = js.native
  def privateToAddress(privateKey: Buffer): Buffer = js.native
  def privateToPublic(privateKey: Buffer): Buffer = js.native
  def pubToAddress(pubKey: Buffer): Buffer = js.native
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  def publicToAddress(pubKey: Buffer): Buffer = js.native
  def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  def ripemd160(a: Buffer, padded: Boolean): Buffer = js.native
  def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = js.native
  def ripemd160FromString(a: String, padded: Boolean): Buffer = js.native
  def rlphash(a: Input): Buffer = js.native
  def setLengthLeft(msg: Buffer, length: Double): Buffer = js.native
  def setLengthRight(msg: Buffer, length: Double): Buffer = js.native
  def sha256(a: Buffer): Buffer = js.native
  def sha256FromArray(a: js.Array[Double]): Buffer = js.native
  def sha256FromString(a: String): Buffer = js.native
  /**
    * @description Removes '0x' from a given `String` if present
    */
  def stripHexPrefix(str: String): String = js.native
  /**
    * @description Should be called to get ascii from it's hex representation
    */
  def toAscii(hex: String): String = js.native
  def toBuffer(v: js.Any): Buffer = js.native
  def toChecksumAddress(hexAddress: String): String = js.native
  def toChecksumAddress(hexAddress: String, eip1191ChainId: Double): String = js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer): String = js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer, chainId: Double): String = js.native
  def toUnsigned(num: ^): Buffer = js.native
  /**
    * @description Should be called to get utf8 from it's hex representation
    */
  def toUtf8(hex: String): String = js.native
  def unpadArray(a: js.Array[Double]): js.Array[Double] = js.native
  def unpadBuffer(a: Buffer): Buffer = js.native
  def unpadHexString(a: String): String = js.native
  def zeroAddress(): String = js.native
  def zeros(bytes: Double): Buffer = js.native
  /* static members */
  @js.native
  object BN extends js.Object {
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    def isBN(b: js.Any): /* is bn.js.bn.js.BN */ Boolean = js.native
    /**
      * @description returns the maximum of 2 BN instances.
      */
    def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = js.native
    /**
      * @description returns the minimum of 2 BN instances.
      */
    def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = js.native
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    def mont(num: typings.bnJs.mod.BN): ReductionContext = js.native
    /**
      * @description  create a reduction context
      */
    def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = js.native
    def red(reductionContext: IPrimeName): ReductionContext = js.native
  }
  
  @js.native
  object rlp extends js.Object {
    def decode(input: js.Array[Buffer]): js.Array[Buffer] = js.native
    def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = js.native
    def decode(input: Buffer): Buffer = js.native
    def decode(input: Buffer, stream: Boolean): Buffer = js.native
    def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = js.native
    def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = js.native
    def encode(input: Input): Buffer = js.native
    def getLength(input: Input): Buffer | Double = js.native
  }
  
}

