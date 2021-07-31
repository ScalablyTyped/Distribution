package typings.ethereumjsUtil

import typings.ethereumjsUtil.typesMod.BNLike
import typings.ethereumjsUtil.typesMod.BufferLike
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountMod {
  
  @JSImport("ethereumjs-util/dist/account", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethereumjs-util/dist/account", "Account")
  @js.native
  /**
    * This constructor assigns and validates the values.
    * Use the static factory methods to assist in creating an Account from varying data types.
    */
  class Account () extends StObject {
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
    
    var _validate: js.Any = js.native
    
    var balance: typings.bnJs.mod.^ = js.native
    
    var codeHash: Buffer = js.native
    
    /**
      * Returns a `Boolean` determining if the account is a contract.
      */
    def isContract(): Boolean = js.native
    
    /**
      * Returns a `Boolean` determining if the account is empty complying to the definition of
      * account emptiness in [EIP-161](https://eips.ethereum.org/EIPS/eip-161):
      * "An account is considered empty when it has no code and zero nonce and zero balance."
      */
    def isEmpty(): Boolean = js.native
    
    var nonce: typings.bnJs.mod.^ = js.native
    
    /**
      * Returns a Buffer Array of the raw Buffers for the account, in order.
      */
    def raw(): js.Array[Buffer] = js.native
    
    /**
      * Returns the RLP serialization of the account as a `Buffer`.
      */
    def serialize(): Buffer = js.native
    
    var stateRoot: Buffer = js.native
  }
  /* static members */
  object Account {
    
    @JSImport("ethereumjs-util/dist/account", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromAccountData(accountData: AccountData): Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAccountData")(accountData.asInstanceOf[js.Any]).asInstanceOf[Account]
    
    @scala.inline
    def fromRlpSerializedAccount(serialized: Buffer): Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRlpSerializedAccount")(serialized.asInstanceOf[js.Any]).asInstanceOf[Account]
    
    @scala.inline
    def fromValuesArray(values: js.Array[Buffer]): Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[Account]
  }
  
  @scala.inline
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def importPublic(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("importPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
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
  def isZeroAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  def toChecksumAddress(hexAddress: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toChecksumAddress(hexAddress: String, eip1191ChainId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def zeroAddress(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroAddress")().asInstanceOf[String]
  
  trait AccountData extends StObject {
    
    var balance: js.UndefOr[BNLike] = js.undefined
    
    var codeHash: js.UndefOr[BufferLike] = js.undefined
    
    var nonce: js.UndefOr[BNLike] = js.undefined
    
    var stateRoot: js.UndefOr[BufferLike] = js.undefined
  }
  object AccountData {
    
    @scala.inline
    def apply(): AccountData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountData]
    }
    
    @scala.inline
    implicit class AccountDataMutableBuilder[Self <: AccountData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBalance(value: BNLike): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      @scala.inline
      def setCodeHash(value: BufferLike): Self = StObject.set(x, "codeHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeHashUndefined: Self = StObject.set(x, "codeHash", js.undefined)
      
      @scala.inline
      def setCodeHashVarargs(value: Double*): Self = StObject.set(x, "codeHash", js.Array(value :_*))
      
      @scala.inline
      def setNonce(value: BNLike): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setStateRoot(value: BufferLike): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
      
      @scala.inline
      def setStateRootVarargs(value: Double*): Self = StObject.set(x, "stateRoot", js.Array(value :_*))
    }
  }
}
