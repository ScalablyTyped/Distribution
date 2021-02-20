package typings.ethereumjsUtil

import typings.bnJs.mod.^
import typings.ethereumjsUtil.typesMod.BNLike
import typings.ethereumjsUtil.typesMod.BufferLike
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountMod {
  
  @JSImport("ethereumjs-util/dist/account", "Account")
  @js.native
  /**
    * This constructor assigns and validates the values.
    * Use the static factory methods to assist in creating an Account from varying data types.
    */
  class Account () extends StObject {
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
    
    var _validate: js.Any = js.native
    
    var balance: ^ = js.native
    
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
    
    var nonce: ^ = js.native
    
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
    
    @JSImport("ethereumjs-util/dist/account", "Account.fromAccountData")
    @js.native
    def fromAccountData(accountData: AccountData): Account = js.native
    
    @JSImport("ethereumjs-util/dist/account", "Account.fromRlpSerializedAccount")
    @js.native
    def fromRlpSerializedAccount(serialized: Buffer): Account = js.native
    
    @JSImport("ethereumjs-util/dist/account", "Account.fromValuesArray")
    @js.native
    def fromValuesArray(values: js.Array[Buffer]): Account = js.native
  }
  
  @JSImport("ethereumjs-util/dist/account", "generateAddress")
  @js.native
  def generateAddress(from: Buffer, nonce: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "generateAddress2")
  @js.native
  def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "importPublic")
  @js.native
  def importPublic(publicKey: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "isValidAddress")
  @js.native
  def isValidAddress(hexAddress: String): Boolean = js.native
  
  @JSImport("ethereumjs-util/dist/account", "isValidChecksumAddress")
  @js.native
  def isValidChecksumAddress(hexAddress: String): Boolean = js.native
  @JSImport("ethereumjs-util/dist/account", "isValidChecksumAddress")
  @js.native
  def isValidChecksumAddress(hexAddress: String, eip1191ChainId: Double): Boolean = js.native
  
  @JSImport("ethereumjs-util/dist/account", "isValidPrivate")
  @js.native
  def isValidPrivate(privateKey: Buffer): Boolean = js.native
  
  @JSImport("ethereumjs-util/dist/account", "isValidPublic")
  @js.native
  def isValidPublic(publicKey: Buffer): Boolean = js.native
  @JSImport("ethereumjs-util/dist/account", "isValidPublic")
  @js.native
  def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = js.native
  
  @JSImport("ethereumjs-util/dist/account", "isZeroAddress")
  @js.native
  def isZeroAddress(hexAddress: String): Boolean = js.native
  
  @JSImport("ethereumjs-util/dist/account", "privateToAddress")
  @js.native
  def privateToAddress(privateKey: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "privateToPublic")
  @js.native
  def privateToPublic(privateKey: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "pubToAddress")
  @js.native
  def pubToAddress(pubKey: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util/dist/account", "pubToAddress")
  @js.native
  def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "publicToAddress")
  @js.native
  def publicToAddress(pubKey: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util/dist/account", "publicToAddress")
  @js.native
  def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/account", "toChecksumAddress")
  @js.native
  def toChecksumAddress(hexAddress: String): String = js.native
  @JSImport("ethereumjs-util/dist/account", "toChecksumAddress")
  @js.native
  def toChecksumAddress(hexAddress: String, eip1191ChainId: Double): String = js.native
  
  @JSImport("ethereumjs-util/dist/account", "zeroAddress")
  @js.native
  def zeroAddress(): String = js.native
  
  @js.native
  trait AccountData extends StObject {
    
    var balance: js.UndefOr[BNLike] = js.native
    
    var codeHash: js.UndefOr[BufferLike] = js.native
    
    var nonce: js.UndefOr[BNLike] = js.native
    
    var stateRoot: js.UndefOr[BufferLike] = js.native
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
