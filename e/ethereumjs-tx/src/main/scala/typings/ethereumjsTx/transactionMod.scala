package typings.ethereumjsTx

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsTx.ethereumjsTxBooleans.`false`
import typings.ethereumjsTx.ethereumjsTxBooleans.`true`
import typings.ethereumjsTx.typesMod.BufferLike
import typings.ethereumjsTx.typesMod.PrefixedHexString
import typings.ethereumjsTx.typesMod.TransactionOptions
import typings.ethereumjsTx.typesMod.TxData
import typings.ethereumjsUtil.mod.BN
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("ethereumjs-tx/dist/transaction", JSImport.Default)
  @js.native
  /**
    * Creates a new transaction from an object with its fields' values.
    *
    * @param data - A transaction can be initialized with its rlp representation, an array containing
    * the value of its fields in order, or an object containing them by name.
    *
    * @param opts - The transaction's options, used to indicate the chain and hardfork the
    * transactions belongs to.
    *
    * @note Transaction objects implement EIP155 by default. To disable it, use the constructor's
    * second parameter to set a chain and hardfork before EIP155 activation (i.e. before Spurious
    * Dragon.)
    *
    * @example
    * ```js
    * const txData = {
    *   nonce: '0x00',
    *   gasPrice: '0x09184e72a000',
    *   gasLimit: '0x2710',
    *   to: '0x0000000000000000000000000000000000000000',
    *   value: '0x00',
    *   data: '0x7f7465737432000000000000000000000000000000000000000000000000000000600057',
    *   v: '0x1c',
    *   r: '0x5e1d3a76fbf824220eafc8c79ad578ad2b67d01b0c2425eb1f1347e8f50882ab',
    *   s: '0x5bd428537f05f9830e93792f90ea6a3e2d1ee84952dd96edbae9f658f831ab13'
    * };
    * const tx = new Transaction(txData);
    * ```
    */
  open class default ()
    extends StObject
       with Transaction {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: TxData) = this()
    def this(data: Buffer) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: Unit, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: TxData, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
  @js.native
  trait Transaction extends StObject {
    
    /* private */ var _common: Any = js.native
    
    /* protected */ var _from: js.UndefOr[Buffer] = js.native
    
    /* private */ var _implementsEIP155: Any = js.native
    
    /* private */ var _isSigned: Any = js.native
    
    /* private */ var _overrideVSetterWithValidation: Any = js.native
    
    /* private */ var _senderPubKey: Any = js.native
    
    /* private */ var _validateV: Any = js.native
    
    var data: Buffer = js.native
    
    var gasLimit: Buffer = js.native
    
    var gasPrice: Buffer = js.native
    
    /**
      * the minimum amount of gas the tx must have (DataFee + TxFee + Creation Fee)
      */
    def getBaseFee(): BN = js.native
    
    /**
      * returns chain ID
      */
    def getChainId(): Double = js.native
    
    /**
      * The amount of gas paid for the data in this tx
      */
    def getDataFee(): BN = js.native
    
    /**
      * returns the sender's address
      */
    def getSenderAddress(): Buffer = js.native
    
    /**
      * returns the public key of the sender
      */
    def getSenderPublicKey(): Buffer = js.native
    
    /**
      * the up front amount that an account must have for this transaction to be valid
      */
    def getUpfrontCost(): BN = js.native
    
    /**
      * Computes a sha3-256 hash of the serialized tx
      * @param includeSignature - Whether or not to include the signature
      */
    def hash(): Buffer = js.native
    def hash(includeSignature: Boolean): Buffer = js.native
    
    var nonce: Buffer = js.native
    
    var r: Buffer = js.native
    
    var raw: js.Array[Buffer] = js.native
    
    var s: Buffer = js.native
    
    /**
      * Returns the rlp encoding of the transaction
      */
    def serialize(): Buffer = js.native
    
    /**
      * sign a transaction with a given private key
      * @param privateKey - Must be 32 bytes in length
      */
    def sign(privateKey: Buffer): Unit = js.native
    
    var to: Buffer = js.native
    
    /**
      * If the tx's `to` is to the creation address
      */
    def toCreationAddress(): Boolean = js.native
    
    /**
      * Returns the transaction in JSON format
      * @see {@link https://github.com/ethereumjs/ethereumjs-util/blob/master/docs/index.md#defineproperties|ethereumjs-util}
      */
    def toJSON(): StringDictionary[String] | js.Array[String] = js.native
    def toJSON(labels: Boolean): StringDictionary[String] | js.Array[String] = js.native
    
    var v: Buffer = js.native
    
    /**
      * Validates the signature and checks to see if it has enough gas.
      */
    def validate(): Boolean = js.native
    @JSName("validate")
    def validate_false(stringError: `false`): Boolean = js.native
    @JSName("validate")
    def validate_true(stringError: `true`): String = js.native
    
    var value: Buffer = js.native
    
    /**
      * Determines if the signature is valid
      */
    def verifySignature(): Boolean = js.native
  }
}
