package typings.ethereumjsUtil

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import typings.bnJs.mod.ReductionContext
import typings.ethereumjsUtil.distAccountMod.AccountData
import typings.ethereumjsUtil.distBytesMod.ToBufferInputTypes
import typings.ethereumjsUtil.distSignatureMod.ECDSASignature
import typings.ethereumjsUtil.distSignatureMod.ECDSASignatureBuffer
import typings.ethereumjsUtil.distTypesMod.BNLike
import typings.ethereumjsUtil.distTypesMod.NestedBufferArray
import typings.ethereumjsUtil.distTypesMod.NestedUint8Array
import typings.ethereumjsUtil.distTypesMod.PrefixedHexString
import typings.ethereumjsUtil.distTypesMod.TypeOutput
import typings.ethereumjsUtil.ethereumjsUtilBooleans.`false`
import typings.ethereumjsUtil.ethereumjsUtilBooleans.`true`
import typings.ethereumjsUtil.ethereumjsUtilInts.`26`
import typings.ethereumjsUtil.ethereumjsUtilStrings.hex
import typings.node.bufferMod.global.Buffer
import typings.rlp.anon.FnCall
import typings.rlp.mod.Decoded
import typings.rlp.mod.Input
import typings.std.Record
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
  open class Account ()
    extends typings.ethereumjsUtil.distAccountMod.Account {
    def this(nonce: typings.ethereumjsUtil.distExternalsMod.BN) = this()
    def this(nonce: Unit, balance: typings.ethereumjsUtil.distExternalsMod.BN) = this()
    def this(
      nonce: typings.ethereumjsUtil.distExternalsMod.BN,
      balance: typings.ethereumjsUtil.distExternalsMod.BN
    ) = this()
    def this(nonce: Unit, balance: Unit, stateRoot: Buffer) = this()
    def this(nonce: Unit, balance: typings.ethereumjsUtil.distExternalsMod.BN, stateRoot: Buffer) = this()
    def this(nonce: typings.ethereumjsUtil.distExternalsMod.BN, balance: Unit, stateRoot: Buffer) = this()
    def this(
      nonce: typings.ethereumjsUtil.distExternalsMod.BN,
      balance: typings.ethereumjsUtil.distExternalsMod.BN,
      stateRoot: Buffer
    ) = this()
    def this(nonce: Unit, balance: Unit, stateRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: Unit, stateRoot: Buffer, codeHash: Buffer) = this()
    def this(
      nonce: Unit,
      balance: typings.ethereumjsUtil.distExternalsMod.BN,
      stateRoot: Unit,
      codeHash: Buffer
    ) = this()
    def this(
      nonce: Unit,
      balance: typings.ethereumjsUtil.distExternalsMod.BN,
      stateRoot: Buffer,
      codeHash: Buffer
    ) = this()
    def this(
      nonce: typings.ethereumjsUtil.distExternalsMod.BN,
      balance: Unit,
      stateRoot: Unit,
      codeHash: Buffer
    ) = this()
    def this(
      nonce: typings.ethereumjsUtil.distExternalsMod.BN,
      balance: Unit,
      stateRoot: Buffer,
      codeHash: Buffer
    ) = this()
    def this(
      nonce: typings.ethereumjsUtil.distExternalsMod.BN,
      balance: typings.ethereumjsUtil.distExternalsMod.BN,
      stateRoot: Unit,
      codeHash: Buffer
    ) = this()
    def this(
      nonce: typings.ethereumjsUtil.distExternalsMod.BN,
      balance: typings.ethereumjsUtil.distExternalsMod.BN,
      stateRoot: Buffer,
      codeHash: Buffer
    ) = this()
  }
  /* static members */
  object Account {
    
    @JSImport("ethereumjs-util", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAccountData(accountData: AccountData): typings.ethereumjsUtil.distAccountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAccountData")(accountData.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distAccountMod.Account]
    
    inline def fromRlpSerializedAccount(serialized: Buffer): typings.ethereumjsUtil.distAccountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRlpSerializedAccount")(serialized.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distAccountMod.Account]
    
    inline def fromValuesArray(values: js.Array[Buffer]): typings.ethereumjsUtil.distAccountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distAccountMod.Account]
  }
  
  @JSImport("ethereumjs-util", "Address")
  @js.native
  open class Address protected ()
    extends typings.ethereumjsUtil.distAddressMod.Address {
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
    inline def fromPrivateKey(privateKey: Buffer): typings.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Returns an address for a given public key.
      * @param pubKey The two points of an uncompressed key
      */
    inline def fromPublicKey(pubKey: Buffer): typings.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(pubKey.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Returns an Address object from a hex-encoded string.
      * @param str - Hex-encoded address
      */
    inline def fromString(str: String): typings.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Generates an address for a newly created contract.
      * @param from The address which is creating this new address
      * @param nonce The nonce of the from account
      */
    inline def generate(
      from: typings.ethereumjsUtil.distAddressMod.Address,
      nonce: typings.ethereumjsUtil.distExternalsMod.BN
    ): typings.ethereumjsUtil.distAddressMod.Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Generates an address for a contract created using CREATE2.
      * @param from The address which is creating this new address
      * @param salt A salt
      * @param initCode The init code of the contract being created
      */
    inline def generate2(from: typings.ethereumjsUtil.distAddressMod.Address, salt: Buffer, initCode: Buffer): typings.ethereumjsUtil.distAddressMod.Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Returns the zero address.
      */
    inline def zero(): typings.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.ethereumjsUtil.distAddressMod.Address]
  }
  
  @JSImport("ethereumjs-util", "BN")
  @js.native
  open class BN protected ()
    extends typings.ethereumjsUtil.distExternalsMod.BN {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: js.typedarray.Uint8Array) = this()
    def this(number: Double) = this()
    def this(number: typings.bnJs.mod.BN) = this()
    def this(number: Buffer) = this()
    def this(number: String, base: Double) = this()
    def this(number: String, base: hex) = this()
    def this(number: String, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double) = this()
    def this(number: js.Array[Double], base: hex) = this()
    def this(number: js.Array[Double], endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double) = this()
    def this(number: js.typedarray.Uint8Array, base: hex) = this()
    def this(number: js.typedarray.Uint8Array, endian: Endianness) = this()
    def this(number: Double, base: Double) = this()
    def this(number: Double, base: hex) = this()
    def this(number: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double) = this()
    def this(number: typings.bnJs.mod.BN, base: hex) = this()
    def this(number: typings.bnJs.mod.BN, endian: Endianness) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: Buffer, endian: Endianness) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: Unit, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: Unit, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: Unit, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
  }
  object BN extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ethereumjs-util", "BN")
    @js.native
    open class ^ protected ()
      extends StObject
         with typings.bnJs.mod.BN {
      def this(number: String) = this()
      def this(number: js.Array[Double]) = this()
      def this(number: js.typedarray.Uint8Array) = this()
      def this(number: Double) = this()
      def this(number: typings.bnJs.mod.BN) = this()
      def this(number: Buffer) = this()
      def this(number: String, base: Double) = this()
      def this(number: String, base: hex) = this()
      def this(number: js.Array[Double], base: Double) = this()
      def this(number: js.Array[Double], base: hex) = this()
      def this(number: js.typedarray.Uint8Array, base: Double) = this()
      def this(number: js.typedarray.Uint8Array, base: hex) = this()
      def this(number: Double, base: Double) = this()
      def this(number: Double, base: hex) = this()
      def this(number: typings.bnJs.mod.BN, base: Double) = this()
      def this(number: typings.bnJs.mod.BN, base: hex) = this()
      def this(number: Buffer, base: Double) = this()
      def this(number: Buffer, base: hex) = this()
      def this(number: String, base: Double, endian: Endianness) = this()
      def this(number: String, base: Unit, endian: Endianness) = this()
      def this(number: String, base: hex, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
      def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
      def this(number: Double, base: Double, endian: Endianness) = this()
      def this(number: Double, base: Unit, endian: Endianness) = this()
      def this(number: Double, base: hex, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
      def this(number: Buffer, base: Double, endian: Endianness) = this()
      def this(number: Buffer, base: Unit, endian: Endianness) = this()
      def this(number: Buffer, base: hex, endian: Endianness) = this()
    }
    
    @JSImport("ethereumjs-util", "BN")
    @js.native
    val ^ : js.Object & (Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ]) = js.native
    /* static member */
    @JSImport("ethereumjs-util", "BN.BN")
    @js.native
    def BN: Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("ethereumjs-util", "BN.BN")
    @js.native
    open class BNCls protected ()
      extends StObject
         with typings.bnJs.mod.BN {
      def this(number: String) = this()
      def this(number: js.Array[Double]) = this()
      def this(number: js.typedarray.Uint8Array) = this()
      def this(number: Double) = this()
      def this(number: typings.bnJs.mod.BN) = this()
      def this(number: Buffer) = this()
      def this(number: String, base: Double) = this()
      def this(number: String, base: hex) = this()
      def this(number: js.Array[Double], base: Double) = this()
      def this(number: js.Array[Double], base: hex) = this()
      def this(number: js.typedarray.Uint8Array, base: Double) = this()
      def this(number: js.typedarray.Uint8Array, base: hex) = this()
      def this(number: Double, base: Double) = this()
      def this(number: Double, base: hex) = this()
      def this(number: typings.bnJs.mod.BN, base: Double) = this()
      def this(number: typings.bnJs.mod.BN, base: hex) = this()
      def this(number: Buffer, base: Double) = this()
      def this(number: Buffer, base: hex) = this()
      def this(number: String, base: Double, endian: Endianness) = this()
      def this(number: String, base: Unit, endian: Endianness) = this()
      def this(number: String, base: hex, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
      def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
      def this(number: Double, base: Double, endian: Endianness) = this()
      def this(number: Double, base: Unit, endian: Endianness) = this()
      def this(number: Double, base: hex, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
      def this(number: Buffer, base: Double, endian: Endianness) = this()
      def this(number: Buffer, base: Unit, endian: Endianness) = this()
      def this(number: Buffer, base: hex, endian: Endianness) = this()
    }
    
    inline def BN_=(
      x: Instantiable3[
          /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
          /* base */ js.UndefOr[Double | hex], 
          /* endian */ js.UndefOr[Endianness], 
          typings.bnJs.mod.BN
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BN")(x.asInstanceOf[js.Any])
    
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    /* static member */
    inline def isBN(b: Any): /* is bn.js.bn.js.BN */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(b.asInstanceOf[js.Any]).asInstanceOf[/* is bn.js.bn.js.BN */ Boolean]
    
    /**
      * @description returns the maximum of 2 BN instances.
      */
    /* static member */
    inline def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description returns the minimum of 2 BN instances.
      */
    /* static member */
    inline def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    /* static member */
    inline def mont(num: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("mont")(num.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    
    /**
      * @description  create a reduction context
      */
    /* static member */
    inline def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    inline def red(reductionContext: IPrimeName): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    
    /* static member */
    @JSImport("ethereumjs-util", "BN.wordSize")
    @js.native
    def wordSize: `26` = js.native
    inline def wordSize_=(x: `26`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordSize")(x.asInstanceOf[js.Any])
    
    type _To = js.Object & (Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ])
    
    /* This means you don't have to write `^`, but can instead just say `BN.foo` */
    override def _to: js.Object & (Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ]) = ^
  }
  
  @JSImport("ethereumjs-util", "KECCAK256_NULL")
  @js.native
  val KECCAK256_NULL: typings.buffer.mod.Buffer = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_NULL_S")
  @js.native
  val KECCAK256_NULL_S: /* "c5d2460186f7233c927e7db2dcc703c0e500b653ca82273b7bfad8045d85a470" */ String = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP")
  @js.native
  val KECCAK256_RLP: typings.buffer.mod.Buffer = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP_ARRAY")
  @js.native
  val KECCAK256_RLP_ARRAY: typings.buffer.mod.Buffer = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP_ARRAY_S")
  @js.native
  val KECCAK256_RLP_ARRAY_S: /* "1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347" */ String = js.native
  
  @JSImport("ethereumjs-util", "KECCAK256_RLP_S")
  @js.native
  val KECCAK256_RLP_S: /* "56e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421" */ String = js.native
  
  @JSImport("ethereumjs-util", "MAX_INTEGER")
  @js.native
  val MAX_INTEGER: typings.ethereumjsUtil.distExternalsMod.BN = js.native
  
  @JSImport("ethereumjs-util", "MAX_UINT64")
  @js.native
  val MAX_UINT64: typings.ethereumjsUtil.distExternalsMod.BN = js.native
  
  @JSImport("ethereumjs-util", "TWO_POW256")
  @js.native
  val TWO_POW256: typings.ethereumjsUtil.distExternalsMod.BN = js.native
  
  @JSImport("ethereumjs-util", "TypeOutput")
  @js.native
  object TypeOutput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ethereumjsUtil.distTypesMod.TypeOutput & Double] = js.native
    
    /* 1 */ val BN: typings.ethereumjsUtil.distTypesMod.TypeOutput.BN & Double = js.native
    
    /* 2 */ val Buffer: typings.ethereumjsUtil.distTypesMod.TypeOutput.Buffer & Double = js.native
    
    /* 0 */ val Number: typings.ethereumjsUtil.distTypesMod.TypeOutput.Number & Double = js.native
    
    /* 3 */ val PrefixedHexString: typings.ethereumjsUtil.distTypesMod.TypeOutput.PrefixedHexString & Double = js.native
  }
  
  inline def addHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arrToBufArr(arr: js.typedarray.Uint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  inline def arrToBufArr(arr: NestedUint8Array): NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedBufferArray]
  
  inline def arrToBufArr_Buffer(arr: js.typedarray.Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def arrToBufArr_Union(arr: NestedUint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  
  inline def arrayContainsArray(superset: js.Array[Any], subset: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arrayContainsArray(superset: js.Array[Any], subset: js.Array[Any], some: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], some.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def baToJSON(ba: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("baToJSON")(ba.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def bnToHex(value: typings.ethereumjsUtil.distExternalsMod.BN): PrefixedHexString = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToHex")(value.asInstanceOf[js.Any]).asInstanceOf[PrefixedHexString]
  
  inline def bnToRlp(value: typings.ethereumjsUtil.distExternalsMod.BN): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToRlp")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bnToUnpaddedBuffer(value: typings.ethereumjsUtil.distExternalsMod.BN): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToUnpaddedBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bufArrToArr(arr: NestedBufferArray): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  inline def bufArrToArr(arr: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bufArrToArr_NestedUint8Array(arr: NestedBufferArray): NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedUint8Array]
  
  inline def bufArrToArr_Union(arr: Buffer): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  
  inline def bufferToHex(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHex")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bufferToInt(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToInt")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defineProperties(self: Any, fields: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(self.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineProperties(self: Any, fields: Any, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(self.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ecrecover(msgHash: Buffer, v: BNLike, r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def ecrecover(msgHash: Buffer, v: BNLike, r: Buffer, s: Buffer, chainId: BNLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  inline def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  inline def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: BNLike): ECDSASignatureBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[ECDSASignatureBuffer]
  
  inline def fromAscii(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromRpcSig(sig: String): ECDSASignature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRpcSig")(sig.asInstanceOf[js.Any]).asInstanceOf[ECDSASignature]
  
  inline def fromSigned(num: Buffer): typings.ethereumjsUtil.distExternalsMod.BN = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSigned")(num.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsUtil.distExternalsMod.BN]
  
  inline def fromUtf8(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateAddress(from: Buffer, nonce: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def getBinarySize(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinarySize")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getKeys(params: js.Array[Record[String, String]], key: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getKeys(params: js.Array[Record[String, String]], key: String, allowEmpty: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def hashPersonalMessage(message: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPersonalMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def importPublic(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("importPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isHexPrefixed(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexPrefixed")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHexString(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHexString(value: String, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidChecksumAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidChecksumAddress(hexAddress: String, eip1191ChainId: BNLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPrivate(privateKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPublic(publicKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidSignature(v: BNLike, r: Buffer, s: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: BNLike, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: BNLike, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: BNLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: BNLike, r: Buffer, s: Buffer, homesteadOrLater: Unit, chainId: BNLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isZeroAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keccak(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccak(a: Buffer, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def keccak256(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def keccakFromArray(a: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromArray")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccakFromArray(a: js.Array[Double], bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromArray")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def keccakFromHexString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromHexString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccakFromHexString(a: String, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromHexString")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def keccakFromString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def keccakFromString(a: String, bits: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("keccakFromString")(a.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def padToEven(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("padToEven")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def privateToAddress(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToAddress")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def privateToPublic(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToPublic")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def pubToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def publicToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ripemd160(a: Buffer, padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ripemd160FromArray(a: js.Array[Double], padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160FromArray")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ripemd160FromString(a: String, padded: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160FromString")(a.asInstanceOf[js.Any], padded.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  object rlp {
    
    @JSImport("ethereumjs-util", "rlp")
    @js.native
    val ^ : js.Any = js.native
    
    object default {
      
      @JSImport("ethereumjs-util", "rlp.default")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ethereumjs-util", "rlp.default.decode")
      @js.native
      def decode: FnCall = js.native
      inline def decode(input: Input): Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Decoded]
      inline def decode_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
      
      inline def decode_Union(input: Input): js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array]
      
      inline def decode_false(input: Input, stream: `false`): js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array]
      
      inline def decode_true(input: Input, stream: `true`): Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Decoded]
      
      @JSImport("ethereumjs-util", "rlp.default.encode")
      @js.native
      def encode: js.Function1[/* input */ Input, js.typedarray.Uint8Array] = js.native
      inline def encode(input: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      inline def encode_=(x: js.Function1[/* input */ Input, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    }
    
    inline def decode(input: Input): Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Decoded]
    
    inline def decode_Union(input: Input): js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array]
    
    inline def decode_false(input: Input, stream: `false`): js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | typings.rlp.mod.NestedUint8Array]
    
    inline def decode_true(input: Input, stream: `true`): Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Decoded]
    
    inline def encode(input: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    object utils {
      
      @JSImport("ethereumjs-util", "rlp.utils")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ethereumjs-util", "rlp.utils.bytesToHex")
      @js.native
      def bytesToHex: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String] = js.native
      inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def bytesToHex_=(x: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesToHex")(x.asInstanceOf[js.Any])
      
      @JSImport("ethereumjs-util", "rlp.utils.concatBytes")
      @js.native
      def concatBytes: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
      inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
      inline def concatBytes_=(x: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatBytes")(x.asInstanceOf[js.Any])
      
      @JSImport("ethereumjs-util", "rlp.utils.hexToBytes")
      @js.native
      def hexToBytes: js.Function1[/* hex */ String, js.typedarray.Uint8Array] = js.native
      inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      inline def hexToBytes_=(x: js.Function1[/* hex */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexToBytes")(x.asInstanceOf[js.Any])
      
      @JSImport("ethereumjs-util", "rlp.utils.utf8ToBytes")
      @js.native
      def utf8ToBytes: js.Function1[/* utf */ String, js.typedarray.Uint8Array] = js.native
      inline def utf8ToBytes(utf: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ToBytes")(utf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      inline def utf8ToBytes_=(x: js.Function1[/* utf */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8ToBytes")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def rlphash(a: Input): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("rlphash")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def setLengthLeft(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthLeft")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def setLengthRight(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthRight")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def sha256(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256FromArray(a: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256FromArray")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256FromString(a: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256FromString")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def stripHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toAscii(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toBuffer(v: ToBufferInputTypes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toChecksumAddress(hexAddress: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toChecksumAddress(hexAddress: String, eip1191ChainId: BNLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toCompactSig(v: BNLike, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCompactSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toCompactSig(v: BNLike, r: Buffer, s: Buffer, chainId: BNLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCompactSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toRpcSig(v: BNLike, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toRpcSig(v: BNLike, r: Buffer, s: Buffer, chainId: BNLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toType[T /* <: TypeOutput */](input: Null, outputType: T): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def toType[T /* <: TypeOutput */](input: Unit, outputType: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toType[T /* <: TypeOutput */](input: ToBufferInputTypes, outputType: T): /* import warning: importer.ImportType#apply Failed type conversion: ethereumjs-util.ethereumjs-util/dist/types.TypeOutputReturnType[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ethereumjs-util.ethereumjs-util/dist/types.TypeOutputReturnType[T] */ js.Any]
  
  inline def toUnsigned(num: typings.ethereumjsUtil.distExternalsMod.BN): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnsigned")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unpadArray(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def unpadBuffer(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpadHexString(a: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadHexString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateNoLeadingZeroes(values: StringDictionary[js.UndefOr[Buffer]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoLeadingZeroes")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def zeroAddress(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroAddress")().asInstanceOf[String]
  
  inline def zeros(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
