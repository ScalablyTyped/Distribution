package typings.ethereumjsUtil

import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import typings.bnJs.mod.ReductionContext
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethereumjs-util", "Account")
  @js.native
  /**
    * This constructor assigns and validates the values.
    * Use the static factory methods to assist in creating an Account from varying data types.
    */
  class Account ()
    extends typings.ethereumjsUtil.accountMod.Account {
    def this(nonce: typings.bnJs.mod.^) = this()
    def this(nonce: Unit, balance: typings.bnJs.mod.^) = this()
    def this(nonce: typings.bnJs.mod.^, balance: typings.bnJs.mod.^) = this()
    def this(nonce: Unit, balance: Unit, stateRoot: Buffer) = this()
    def this(nonce: Unit, balance: typings.bnJs.mod.^, stateRoot: Buffer) = this()
    def this(nonce: typings.bnJs.mod.^, balance: Unit, stateRoot: Buffer) = this()
    def this(nonce: typings.bnJs.mod.^, balance: typings.bnJs.mod.^, stateRoot: Buffer) = this()
    def this(nonce: Unit, balance: Unit, stateRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: Unit, stateRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: typings.bnJs.mod.^, stateRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: typings.bnJs.mod.^, stateRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: typings.bnJs.mod.^, balance: Unit, stateRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: typings.bnJs.mod.^, balance: Unit, stateRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: typings.bnJs.mod.^, balance: typings.bnJs.mod.^, stateRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: typings.bnJs.mod.^, balance: typings.bnJs.mod.^, stateRoot: Buffer, codeHash: Buffer) = this()
  }
  /* static members */
  object Account {
    
    @JSImport("ethereumjs-util", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromAccountData(accountData: AccountData): typings.ethereumjsUtil.accountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAccountData")(accountData.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.accountMod.Account]
    
    @scala.inline
    def fromRlpSerializedAccount(serialized: Buffer): typings.ethereumjsUtil.accountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRlpSerializedAccount")(serialized.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.accountMod.Account]
    
    @scala.inline
    def fromValuesArray(values: js.Array[Buffer]): typings.ethereumjsUtil.accountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.accountMod.Account]
  }
  
  @JSImport("ethereumjs-util", "Address")
  @js.native
  class Address protected ()
    extends typings.ethereumjsUtil.addressMod.Address {
    def this(buf: Buffer) = this()
  }
  /* static members */
  object Address {
    
    @JSImport("ethereumjs-util", "Address")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an address for a given private key.
      * @param privateKey A private key must be 256 bits wide
      */
    @scala.inline
    def fromPrivateKey(privateKey: Buffer): typings.ethereumjsUtil.addressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.addressMod.Address]
    
    /**
      * Returns an address for a given public key.
      * @param pubKey The two points of an uncompressed key
      */
    @scala.inline
    def fromPublicKey(pubKey: Buffer): typings.ethereumjsUtil.addressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(pubKey.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.addressMod.Address]
    
    /**
      * Returns an Address object from a hex-encoded string.
      * @param str - Hex-encoded address
      */
    @scala.inline
    def fromString(str: String): typings.ethereumjsUtil.addressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.addressMod.Address]
    
    /**
      * Generates an address for a newly created contract.
      * @param from The address which is creating this new address
      * @param nonce The nonce of the from account
      */
    @scala.inline
    def generate(from: typings.ethereumjsUtil.addressMod.Address, nonce: typings.bnJs.mod.^): typings.ethereumjsUtil.addressMod.Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsUtil.addressMod.Address]
    
    /**
      * Generates an address for a contract created using CREATE2.
      * @param from The address which is creating this new address
      * @param salt A salt
      * @param initCode The init code of the contract being created
      */
    @scala.inline
    def generate2(from: typings.ethereumjsUtil.addressMod.Address, salt: Buffer, initCode: Buffer): typings.ethereumjsUtil.addressMod.Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsUtil.addressMod.Address]
    
    /**
      * Returns the zero address.
      */
    @scala.inline
    def zero(): typings.ethereumjsUtil.addressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.ethereumjsUtil.addressMod.Address]
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
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: Unit, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: Unit, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: Unit, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
    def this(number: Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: Uint8Array, base: Unit, endian: Endianness) = this()
    def this(number: Uint8Array, base: hex, endian: Endianness) = this()
  }
  object BN {
    
    @JSImport("ethereumjs-util", "BN")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    /* static member */
    @scala.inline
    def isBN(b: js.Any): /* is bn.js.bn.js.BN */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(b.asInstanceOf[js.Any]).asInstanceOf[/* is bn.js.bn.js.BN */ Boolean]
    
    /**
      * @description returns the maximum of 2 BN instances.
      */
    /* static member */
    @scala.inline
    def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description returns the minimum of 2 BN instances.
      */
    /* static member */
    @scala.inline
    def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    /* static member */
    @scala.inline
    def mont(num: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("mont")(num.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    
    /**
      * @description  create a reduction context
      */
    /* static member */
    @scala.inline
    def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    @scala.inline
    def red(reductionContext: IPrimeName): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
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
  val MAX_INTEGER: typings.bnJs.mod.^ = js.native
  
  @JSImport("ethereumjs-util", "TWO_POW256")
  @js.native
  val TWO_POW256: typings.bnJs.mod.^ = js.native
  
  @scala.inline
  def addHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Returns TRUE if the first specified array contains all elements
    *              from the second one. FALSE otherwise. If `some` is true, will
    *              return true if first specified array contain some elements of
    *              the second.
    */
  @scala.inline
  def arrayContainsArray(superset: js.Array[js.Any], subset: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def arrayContainsArray(superset: js.Array[js.Any], subset: js.Array[js.Any], some: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], some.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def baToJSON(ba: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("baToJSON")(ba.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def bnToHex(value: typings.bnJs.mod.^): PrefixedHexString = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToHex")(value.asInstanceOf[js.Any]).asInstanceOf[PrefixedHexString]
  
  @scala.inline
  def bnToRlp(value: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToRlp")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def bufferToHex(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHex")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def bufferToInt(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToInt")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def defineProperties(self: js.Any, fields: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(self.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def defineProperties(self: js.Any, fields: js.Any, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(self.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  @scala.inline
  def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of ascii string
    */
  @scala.inline
  def fromAscii(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fromRpcSig(sig: String): ECDSASignature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRpcSig")(sig.asInstanceOf[js.Any]).asInstanceOf[ECDSASignature]
  
  @scala.inline
  def fromSigned(num: Buffer): typings.bnJs.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSigned")(num.asInstanceOf[js.Any]).asInstanceOf[typings.bnJs.mod.^]
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of utf8 string
    */
  @scala.inline
  def fromUtf8(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @description Get the binary size of a string
    */
  @scala.inline
  def getBinarySize(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinarySize")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @description getKeys([{a: 1, b: 2}, {a: 3, b: 4}], 'a') => [1, 3]
    */
  @scala.inline
  def getKeys(params: js.Array[js.Any], key: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def getKeys(params: js.Array[js.Any], key: String, allowEmpty: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def hashPersonalMessage(message: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPersonalMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def importPublic(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("importPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * @description Converts an `Number` to a `Buffer`
    */
  @scala.inline
  def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * @description Converts a `Number` into a hex `String`
    */
  @scala.inline
  def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Returns a `Boolean` on whether or not the a `String` starts with '0x'
    */
  @scala.inline
  def isHexPrefixed(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexPrefixed")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * @description check if string is hex string of specific length
    */
  @scala.inline
  def isHexString(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isHexString(value: String, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidChecksumAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidChecksumAddress(hexAddress: String, eip1191ChainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidPrivate(privateKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidPublic(publicKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidSignature(v: Double, r: Buffer, s: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Unit, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isZeroAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def keccak(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def keccak(a: Buffer, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def keccak256(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def keccakFromArray(a: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromArray")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromArray")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def keccakFromHexString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromHexString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def keccakFromHexString(a: String, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromHexString")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def keccakFromString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def keccakFromString(a: String, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromString")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @description Pads a `String` to have an even length
    */
  @scala.inline
  def padToEven(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("padToEven")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def privateToAddress(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToAddress")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def privateToPublic(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToPublic")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def pubToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def publicToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def ripemd160(a: Buffer, padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160FromArray")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def ripemd160FromString(a: String, padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160FromString")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  object rlp {
    
    @JSImport("ethereumjs-util", "rlp")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decode(input: js.Array[Buffer]): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
    @scala.inline
    def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
    @scala.inline
    def decode(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    @scala.inline
    def decode(input: Buffer, stream: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer] | Buffer | Decoded]
    @scala.inline
    def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer] | Buffer | Decoded]
    
    @scala.inline
    def encode(input: Input): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def getLength(input: Input): Buffer | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer | Double]
  }
  
  @scala.inline
  def rlphash(a: Input): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("rlphash")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def setLengthLeft(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthLeft")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def setLengthRight(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthRight")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def sha256(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def sha256FromArray(a: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256FromArray")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def sha256FromString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256FromString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * @description Removes '0x' from a given `String` if present
    */
  @scala.inline
  def stripHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Should be called to get ascii from it's hex representation
    */
  @scala.inline
  def toAscii(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toBuffer(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")().asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: TransformableToArray): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: TransformableToBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def toBuffer(v: Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def toChecksumAddress(hexAddress: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toChecksumAddress(hexAddress: String, eip1191ChainId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toRpcSig(v: Double, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toRpcSig(v: Double, r: Buffer, s: Buffer, chainId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toUnsigned(num: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnsigned")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * @description Should be called to get utf8 from it's hex representation
    */
  @scala.inline
  def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unpadArray(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def unpadBuffer(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def unpadHexString(a: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadHexString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def zeroAddress(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroAddress")().asInstanceOf[String]
  
  @scala.inline
  def zeros(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
