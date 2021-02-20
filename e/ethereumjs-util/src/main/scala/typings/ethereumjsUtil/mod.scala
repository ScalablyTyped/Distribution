package typings.ethereumjsUtil

import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import typings.bnJs.mod.ReductionContext
import typings.bnJs.mod.^
import typings.ethereumjsUtil.accountMod.AccountData
import typings.ethereumjsUtil.ethereumjsUtilStrings.hex
import typings.ethereumjsUtil.signatureMod.ECDSASignature
import typings.ethereumjsUtil.typesMod.PrefixedHexString
import typings.ethereumjsUtil.typesMod.TransformableToArray
import typings.ethereumjsUtil.typesMod.TransformableToBuffer
import typings.node.Buffer
import typings.rlp.typesMod.Decoded
import typings.rlp.typesMod.Input
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-util", "Account")
  @js.native
  /**
    * This constructor assigns and validates the values.
    * Use the static factory methods to assist in creating an Account from varying data types.
    */
  class Account ()
    extends typings.ethereumjsUtil.accountMod.Account {
    def this(nonce: ^) = this()
    def this(nonce: js.UndefOr[scala.Nothing], balance: ^) = this()
    def this(nonce: ^, balance: ^) = this()
    def this(nonce: js.UndefOr[scala.Nothing], balance: js.UndefOr[scala.Nothing], stateRoot: Buffer) = this()
    def this(nonce: js.UndefOr[scala.Nothing], balance: ^, stateRoot: Buffer) = this()
    def this(nonce: ^, balance: js.UndefOr[scala.Nothing], stateRoot: Buffer) = this()
    def this(nonce: ^, balance: ^, stateRoot: Buffer) = this()
    def this(
      nonce: js.UndefOr[scala.Nothing],
      balance: js.UndefOr[scala.Nothing],
      stateRoot: js.UndefOr[scala.Nothing],
      codeHash: Buffer
    ) = this()
    def this(
      nonce: js.UndefOr[scala.Nothing],
      balance: js.UndefOr[scala.Nothing],
      stateRoot: Buffer,
      codeHash: Buffer
    ) = this()
    def this(
      nonce: js.UndefOr[scala.Nothing],
      balance: ^,
      stateRoot: js.UndefOr[scala.Nothing],
      codeHash: Buffer
    ) = this()
    def this(nonce: js.UndefOr[scala.Nothing], balance: ^, stateRoot: Buffer, codeHash: Buffer) = this()
    def this(
      nonce: ^,
      balance: js.UndefOr[scala.Nothing],
      stateRoot: js.UndefOr[scala.Nothing],
      codeHash: Buffer
    ) = this()
    def this(nonce: ^, balance: js.UndefOr[scala.Nothing], stateRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: ^, balance: ^, stateRoot: js.UndefOr[scala.Nothing], codeHash: Buffer) = this()
    def this(nonce: ^, balance: ^, stateRoot: Buffer, codeHash: Buffer) = this()
  }
  /* static members */
  object Account {
    
    @JSImport("ethereumjs-util", "Account.fromAccountData")
    @js.native
    def fromAccountData(accountData: AccountData): typings.ethereumjsUtil.accountMod.Account = js.native
    
    @JSImport("ethereumjs-util", "Account.fromRlpSerializedAccount")
    @js.native
    def fromRlpSerializedAccount(serialized: Buffer): typings.ethereumjsUtil.accountMod.Account = js.native
    
    @JSImport("ethereumjs-util", "Account.fromValuesArray")
    @js.native
    def fromValuesArray(values: js.Array[Buffer]): typings.ethereumjsUtil.accountMod.Account = js.native
  }
  
  @JSImport("ethereumjs-util", "Address")
  @js.native
  class Address protected ()
    extends typings.ethereumjsUtil.addressMod.Address {
    def this(buf: Buffer) = this()
  }
  /* static members */
  object Address {
    
    /**
      * Returns an address for a given private key.
      * @param privateKey A private key must be 256 bits wide
      */
    @JSImport("ethereumjs-util", "Address.fromPrivateKey")
    @js.native
    def fromPrivateKey(privateKey: Buffer): typings.ethereumjsUtil.addressMod.Address = js.native
    
    /**
      * Returns an address for a given public key.
      * @param pubKey The two points of an uncompressed key
      */
    @JSImport("ethereumjs-util", "Address.fromPublicKey")
    @js.native
    def fromPublicKey(pubKey: Buffer): typings.ethereumjsUtil.addressMod.Address = js.native
    
    /**
      * Returns an Address object from a hex-encoded string.
      * @param str - Hex-encoded address
      */
    @JSImport("ethereumjs-util", "Address.fromString")
    @js.native
    def fromString(str: String): typings.ethereumjsUtil.addressMod.Address = js.native
    
    /**
      * Generates an address for a newly created contract.
      * @param from The address which is creating this new address
      * @param nonce The nonce of the from account
      */
    @JSImport("ethereumjs-util", "Address.generate")
    @js.native
    def generate(from: typings.ethereumjsUtil.addressMod.Address, nonce: ^): typings.ethereumjsUtil.addressMod.Address = js.native
    
    /**
      * Generates an address for a contract created using CREATE2.
      * @param from The address which is creating this new address
      * @param salt A salt
      * @param initCode The init code of the contract being created
      */
    @JSImport("ethereumjs-util", "Address.generate2")
    @js.native
    def generate2(from: typings.ethereumjsUtil.addressMod.Address, salt: Buffer, initCode: Buffer): typings.ethereumjsUtil.addressMod.Address = js.native
    
    /**
      * Returns the zero address.
      */
    @JSImport("ethereumjs-util", "Address.zero")
    @js.native
    def zero(): typings.ethereumjsUtil.addressMod.Address = js.native
  }
  
  @JSImport("ethereumjs-util", "BN")
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
  object BN {
    
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    /* static member */
    @JSImport("ethereumjs-util", "BN.isBN")
    @js.native
    def isBN(b: js.Any): /* is bn.js.bn.js.BN */ Boolean = js.native
    
    /**
      * @description returns the maximum of 2 BN instances.
      */
    /* static member */
    @JSImport("ethereumjs-util", "BN.max")
    @js.native
    def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = js.native
    
    /**
      * @description returns the minimum of 2 BN instances.
      */
    /* static member */
    @JSImport("ethereumjs-util", "BN.min")
    @js.native
    def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = js.native
    
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    /* static member */
    @JSImport("ethereumjs-util", "BN.mont")
    @js.native
    def mont(num: typings.bnJs.mod.BN): ReductionContext = js.native
    
    /**
      * @description  create a reduction context
      */
    /* static member */
    @JSImport("ethereumjs-util", "BN.red")
    @js.native
    def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = js.native
    @JSImport("ethereumjs-util", "BN.red")
    @js.native
    def red(reductionContext: IPrimeName): ReductionContext = js.native
  }
  
  @JSImport("ethereumjs-util", "KECCAK256_NULL")
  @js.native
  val KECCAK256_NULL: Buffer = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_NULL_S")
  @js.native
  val KECCAK256_NULL_S: String = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP")
  @js.native
  val KECCAK256_RLP: Buffer = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP_ARRAY")
  @js.native
  val KECCAK256_RLP_ARRAY: Buffer = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP_ARRAY_S")
  @js.native
  val KECCAK256_RLP_ARRAY_S: String = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP_S")
  @js.native
  val KECCAK256_RLP_S: String = js.native
  
  @JSImport("ethereumjs-util", "MAX_INTEGER")
  @js.native
  val MAX_INTEGER: ^ = js.native
  
  @JSImport("ethereumjs-util", "TWO_POW256")
  @js.native
  val TWO_POW256: ^ = js.native
  
  @JSImport("ethereumjs-util", "addHexPrefix")
  @js.native
  def addHexPrefix(str: String): String = js.native
  
  /**
    * @description Returns TRUE if the first specified array contains all elements
    *              from the second one. FALSE otherwise. If `some` is true, will
    *              return true if first specified array contain some elements of
    *              the second.
    */
  @JSImport("ethereumjs-util", "arrayContainsArray")
  @js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_]): Boolean = js.native
  @JSImport("ethereumjs-util", "arrayContainsArray")
  @js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_], some: Boolean): Boolean = js.native
  
  @JSImport("ethereumjs-util", "baToJSON")
  @js.native
  def baToJSON(ba: js.Any): js.Any = js.native
  
  @JSImport("ethereumjs-util", "bnToHex")
  @js.native
  def bnToHex(value: ^): PrefixedHexString = js.native
  
  @JSImport("ethereumjs-util", "bnToRlp")
  @js.native
  def bnToRlp(value: ^): Buffer = js.native
  
  @JSImport("ethereumjs-util", "bufferToHex")
  @js.native
  def bufferToHex(buf: Buffer): String = js.native
  
  @JSImport("ethereumjs-util", "bufferToInt")
  @js.native
  def bufferToInt(buf: Buffer): Double = js.native
  
  @JSImport("ethereumjs-util", "defineProperties")
  @js.native
  def defineProperties(self: js.Any, fields: js.Any): Unit = js.native
  @JSImport("ethereumjs-util", "defineProperties")
  @js.native
  def defineProperties(self: js.Any, fields: js.Any, data: js.Any): Unit = js.native
  
  @JSImport("ethereumjs-util", "ecrecover")
  @js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util", "ecrecover")
  @js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util", "ecsign")
  @js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = js.native
  @JSImport("ethereumjs-util", "ecsign")
  @js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = js.native
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of ascii string
    */
  @JSImport("ethereumjs-util", "fromAscii")
  @js.native
  def fromAscii(stringValue: String): String = js.native
  
  @JSImport("ethereumjs-util", "fromRpcSig")
  @js.native
  def fromRpcSig(sig: String): ECDSASignature = js.native
  
  @JSImport("ethereumjs-util", "fromSigned")
  @js.native
  def fromSigned(num: Buffer): ^ = js.native
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of utf8 string
    */
  @JSImport("ethereumjs-util", "fromUtf8")
  @js.native
  def fromUtf8(stringValue: String): String = js.native
  
  @JSImport("ethereumjs-util", "generateAddress")
  @js.native
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "generateAddress2")
  @js.native
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = js.native
  
  /**
    * @description Get the binary size of a string
    */
  @JSImport("ethereumjs-util", "getBinarySize")
  @js.native
  def getBinarySize(str: String): Double = js.native
  
  /**
    * @description getKeys([{a: 1, b: 2}, {a: 3, b: 4}], 'a') => [1, 3]
    */
  @JSImport("ethereumjs-util", "getKeys")
  @js.native
  def getKeys(params: js.Array[_], key: String): js.Array[_] = js.native
  @JSImport("ethereumjs-util", "getKeys")
  @js.native
  def getKeys(params: js.Array[_], key: String, allowEmpty: Boolean): js.Array[_] = js.native
  
  @JSImport("ethereumjs-util", "hashPersonalMessage")
  @js.native
  def hashPersonalMessage(message: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "importPublic")
  @js.native
  def importPublic(publicKey: Buffer): Buffer = js.native
  
  /**
    * @description Converts an `Number` to a `Buffer`
    */
  @JSImport("ethereumjs-util", "intToBuffer")
  @js.native
  def intToBuffer(i: Double): Buffer = js.native
  
  /**
    * @description Converts a `Number` into a hex `String`
    */
  @JSImport("ethereumjs-util", "intToHex")
  @js.native
  def intToHex(i: Double): String = js.native
  
  /**
    * @description Returns a `Boolean` on whether or not the a `String` starts with '0x'
    */
  @JSImport("ethereumjs-util", "isHexPrefixed")
  @js.native
  def isHexPrefixed(str: String): Boolean = js.native
  
  /**
    * @description check if string is hex string of specific length
    */
  @JSImport("ethereumjs-util", "isHexString")
  @js.native
  def isHexString(value: String): Boolean = js.native
  @JSImport("ethereumjs-util", "isHexString")
  @js.native
  def isHexString(value: String, length: Double): Boolean = js.native
  
  @JSImport("ethereumjs-util", "isValidAddress")
  @js.native
  def isValidAddress(hexAddress: String): Boolean = js.native
  
  @JSImport("ethereumjs-util", "isValidChecksumAddress")
  @js.native
  def isValidChecksumAddress(hexAddress: String): Boolean = js.native
  @JSImport("ethereumjs-util", "isValidChecksumAddress")
  @js.native
  def isValidChecksumAddress(hexAddress: String, eip1191ChainId: Double): Boolean = js.native
  
  @JSImport("ethereumjs-util", "isValidPrivate")
  @js.native
  def isValidPrivate(privateKey: Buffer): Boolean = js.native
  
  @JSImport("ethereumjs-util", "isValidPublic")
  @js.native
  def isValidPublic(publicKey: Buffer): Boolean = js.native
  @JSImport("ethereumjs-util", "isValidPublic")
  @js.native
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = js.native
  
  @JSImport("ethereumjs-util", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer): Boolean = js.native
  @JSImport("ethereumjs-util", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: js.UndefOr[scala.Nothing], chainId: Double): Boolean = js.native
  @JSImport("ethereumjs-util", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = js.native
  @JSImport("ethereumjs-util", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = js.native
  
  @JSImport("ethereumjs-util", "isZeroAddress")
  @js.native
  def isZeroAddress(hexAddress: String): Boolean = js.native
  
  @JSImport("ethereumjs-util", "keccak")
  @js.native
  def keccak(a: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util", "keccak")
  @js.native
  def keccak(a: Buffer, bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util", "keccak256")
  @js.native
  def keccak256(a: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "keccakFromArray")
  @js.native
  def keccakFromArray(a: js.Array[Double]): Buffer = js.native
  @JSImport("ethereumjs-util", "keccakFromArray")
  @js.native
  def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util", "keccakFromHexString")
  @js.native
  def keccakFromHexString(a: String): Buffer = js.native
  @JSImport("ethereumjs-util", "keccakFromHexString")
  @js.native
  def keccakFromHexString(a: String, bits: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util", "keccakFromString")
  @js.native
  def keccakFromString(a: String): Buffer = js.native
  @JSImport("ethereumjs-util", "keccakFromString")
  @js.native
  def keccakFromString(a: String, bits: Double): Buffer = js.native
  
  /**
    * @description Pads a `String` to have an even length
    */
  @JSImport("ethereumjs-util", "padToEven")
  @js.native
  def padToEven(value: String): String = js.native
  
  @JSImport("ethereumjs-util", "privateToAddress")
  @js.native
  def privateToAddress(privateKey: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "privateToPublic")
  @js.native
  def privateToPublic(privateKey: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "pubToAddress")
  @js.native
  def pubToAddress(pubKey: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util", "pubToAddress")
  @js.native
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util", "publicToAddress")
  @js.native
  def publicToAddress(pubKey: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util", "publicToAddress")
  @js.native
  def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util", "ripemd160")
  @js.native
  def ripemd160(a: Buffer, padded: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util", "ripemd160FromArray")
  @js.native
  def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util", "ripemd160FromString")
  @js.native
  def ripemd160FromString(a: String, padded: Boolean): Buffer = js.native
  
  object rlp {
    
    @JSImport("ethereumjs-util", "rlp.decode")
    @js.native
    def decode(input: js.Array[Buffer]): js.Array[Buffer] = js.native
    @JSImport("ethereumjs-util", "rlp.decode")
    @js.native
    def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = js.native
    @JSImport("ethereumjs-util", "rlp.decode")
    @js.native
    def decode(input: Buffer): Buffer = js.native
    @JSImport("ethereumjs-util", "rlp.decode")
    @js.native
    def decode(input: Buffer, stream: Boolean): Buffer = js.native
    @JSImport("ethereumjs-util", "rlp.decode")
    @js.native
    def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = js.native
    @JSImport("ethereumjs-util", "rlp.decode")
    @js.native
    def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = js.native
    
    @JSImport("ethereumjs-util", "rlp.encode")
    @js.native
    def encode(input: Input): Buffer = js.native
    
    @JSImport("ethereumjs-util", "rlp.getLength")
    @js.native
    def getLength(input: Input): Buffer | Double = js.native
  }
  
  @JSImport("ethereumjs-util", "rlphash")
  @js.native
  def rlphash(a: Input): Buffer = js.native
  
  @JSImport("ethereumjs-util", "setLengthLeft")
  @js.native
  def setLengthLeft(msg: Buffer, length: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util", "setLengthRight")
  @js.native
  def setLengthRight(msg: Buffer, length: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util", "sha256")
  @js.native
  def sha256(a: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "sha256FromArray")
  @js.native
  def sha256FromArray(a: js.Array[Double]): Buffer = js.native
  
  @JSImport("ethereumjs-util", "sha256FromString")
  @js.native
  def sha256FromString(a: String): Buffer = js.native
  
  /**
    * @description Removes '0x' from a given `String` if present
    */
  @JSImport("ethereumjs-util", "stripHexPrefix")
  @js.native
  def stripHexPrefix(str: String): String = js.native
  
  /**
    * @description Should be called to get ascii from it's hex representation
    */
  @JSImport("ethereumjs-util", "toAscii")
  @js.native
  def toAscii(hex: String): String = js.native
  
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: String): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: js.Array[Double]): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: Double): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: ^): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: TransformableToArray): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: TransformableToBuffer): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util", "toBuffer")
  @js.native
  def toBuffer(v: Uint8Array): Buffer = js.native
  
  @JSImport("ethereumjs-util", "toChecksumAddress")
  @js.native
  def toChecksumAddress(hexAddress: String): String = js.native
  @JSImport("ethereumjs-util", "toChecksumAddress")
  @js.native
  def toChecksumAddress(hexAddress: String, eip1191ChainId: Double): String = js.native
  
  @JSImport("ethereumjs-util", "toRpcSig")
  @js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer): String = js.native
  @JSImport("ethereumjs-util", "toRpcSig")
  @js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer, chainId: Double): String = js.native
  
  @JSImport("ethereumjs-util", "toUnsigned")
  @js.native
  def toUnsigned(num: ^): Buffer = js.native
  
  /**
    * @description Should be called to get utf8 from it's hex representation
    */
  @JSImport("ethereumjs-util", "toUtf8")
  @js.native
  def toUtf8(hex: String): String = js.native
  
  @JSImport("ethereumjs-util", "unpadArray")
  @js.native
  def unpadArray(a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("ethereumjs-util", "unpadBuffer")
  @js.native
  def unpadBuffer(a: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util", "unpadHexString")
  @js.native
  def unpadHexString(a: String): String = js.native
  
  @JSImport("ethereumjs-util", "zeroAddress")
  @js.native
  def zeroAddress(): String = js.native
  
  @JSImport("ethereumjs-util", "zeros")
  @js.native
  def zeros(bytes: Double): Buffer = js.native
}
