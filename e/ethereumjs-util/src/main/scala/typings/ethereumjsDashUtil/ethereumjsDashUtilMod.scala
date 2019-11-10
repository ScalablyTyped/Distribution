package typings.ethereumjsDashUtil

import typings.bnDotJs.bnDotJsMod.Endianness
import typings.bnDotJs.bnDotJsMod.IPrimeName
import typings.bnDotJs.bnDotJsMod.ReductionContext
import typings.bnDotJs.bnDotJsMod.^
import typings.ethereumjsDashUtil.distSignatureMod.ECDSASignature
import typings.ethereumjsDashUtil.ethereumjsDashUtilStrings.hex
import typings.node.Buffer
import typings.rlp.distTypesMod.Decoded
import typings.rlp.distTypesMod.Input
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util", JSImport.Namespace)
@js.native
object ethereumjsDashUtilMod extends js.Object {
  @js.native
  class BN protected () extends ^ {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: Double) = this()
    def this(number: typings.bnDotJs.bnDotJsMod.BN) = this()
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
    def this(number: typings.bnDotJs.bnDotJsMod.BN, base: Double) = this()
    def this(number: typings.bnDotJs.bnDotJsMod.BN, base: hex) = this()
    def this(number: typings.bnDotJs.bnDotJsMod.BN, endian: Endianness) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: Buffer, endian: Endianness) = this()
    def this(number: Uint8Array, base: Double) = this()
    def this(number: Uint8Array, base: hex) = this()
    def this(number: Uint8Array, endian: Endianness) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnDotJs.bnDotJsMod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnDotJs.bnDotJsMod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
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
  val secp256k1: js.Any = js.native
  def addHexPrefix(str: String): String = js.native
  def baToJSON(ba: js.Any): js.Any = js.native
  def bufferToHex(buf: Buffer): String = js.native
  def bufferToInt(buf: Buffer): Double = js.native
  def defineProperties(self: js.Any, fields: js.Any, data: js.Any): Unit = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = js.native
  def fromRpcSig(sig: String): ECDSASignature = js.native
  def fromSigned(num: Buffer): ^ = js.native
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = js.native
  def generateAddress2(from: String, salt: String, initCode: String): Buffer = js.native
  def generateAddress2(from: String, salt: String, initCode: Buffer): Buffer = js.native
  def generateAddress2(from: String, salt: Buffer, initCode: String): Buffer = js.native
  def generateAddress2(from: String, salt: Buffer, initCode: Buffer): Buffer = js.native
  def generateAddress2(from: Buffer, salt: String, initCode: String): Buffer = js.native
  def generateAddress2(from: Buffer, salt: String, initCode: Buffer): Buffer = js.native
  def generateAddress2(from: Buffer, salt: Buffer, initCode: String): Buffer = js.native
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = js.native
  def hashPersonalMessage(message: Buffer): Buffer = js.native
  def importPublic(publicKey: Buffer): Buffer = js.native
  def isPrecompiled(address: String): Boolean = js.native
  def isPrecompiled(address: Buffer): Boolean = js.native
  def isValidAddress(address: String): Boolean = js.native
  def isValidChecksumAddress(address: String): Boolean = js.native
  def isValidChecksumAddress(address: String, eip1191ChainId: Double): Boolean = js.native
  def isValidPrivate(privateKey: Buffer): Boolean = js.native
  def isValidPublic(publicKey: Buffer): Boolean = js.native
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = js.native
  def isZeroAddress(address: String): Boolean = js.native
  def keccak(a: js.Any): Buffer = js.native
  def keccak(a: js.Any, bits: Double): Buffer = js.native
  def keccak256(a: js.Any): Buffer = js.native
  def privateToAddress(privateKey: Buffer): Buffer = js.native
  def privateToPublic(privateKey: Buffer): Buffer = js.native
  def pubToAddress(pubKey: Buffer): Buffer = js.native
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  def publicToAddress(pubKey: Buffer): Buffer = js.native
  def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  def ripemd160(a: js.Any, padded: Boolean): Buffer = js.native
  def rlphash(a: Input): Buffer = js.native
  def setLength(msg: js.Any, length: Double): js.Any = js.native
  def setLength(msg: js.Any, length: Double, right: Boolean): js.Any = js.native
  def setLengthLeft(msg: js.Any, length: Double): js.Any = js.native
  def setLengthLeft(msg: js.Any, length: Double, right: Boolean): js.Any = js.native
  def setLengthRight(msg: js.Any, length: Double): js.Any = js.native
  def sha256(a: js.Any): Buffer = js.native
  def stripZeros(a: js.Any): js.Any = js.native
  def toBuffer(v: js.Any): Buffer = js.native
  def toChecksumAddress(address: String): String = js.native
  def toChecksumAddress(address: String, eip1191ChainId: Double): String = js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer): String = js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer, chainId: Double): String = js.native
  def toUnsigned(num: ^): Buffer = js.native
  def unpad(a: js.Any): js.Any = js.native
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
    def max(left: typings.bnDotJs.bnDotJsMod.BN, right: typings.bnDotJs.bnDotJsMod.BN): typings.bnDotJs.bnDotJsMod.BN = js.native
    /**
      * @description returns the minimum of 2 BN instances.
      */
    def min(left: typings.bnDotJs.bnDotJsMod.BN, right: typings.bnDotJs.bnDotJsMod.BN): typings.bnDotJs.bnDotJsMod.BN = js.native
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    def mont(num: typings.bnDotJs.bnDotJsMod.BN): ReductionContext = js.native
    /**
      * @description  create a reduction context
      */
    def red(reductionContext: typings.bnDotJs.bnDotJsMod.BN): ReductionContext = js.native
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

