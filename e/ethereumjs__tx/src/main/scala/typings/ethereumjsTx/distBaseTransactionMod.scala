package typings.ethereumjsTx

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsCommon.distEnumsMod.Chain
import typings.ethereumjsCommon.distEnumsMod.Hardfork
import typings.ethereumjsCommon.mod.Common
import typings.ethereumjsTx.distTypesMod.AccessListEIP2930TxData
import typings.ethereumjsTx.distTypesMod.AccessListEIP2930ValuesArray
import typings.ethereumjsTx.distTypesMod.Capability
import typings.ethereumjsTx.distTypesMod.FeeMarketEIP1559TxData
import typings.ethereumjsTx.distTypesMod.FeeMarketEIP1559ValuesArray
import typings.ethereumjsTx.distTypesMod.JsonTx
import typings.ethereumjsTx.distTypesMod.TxData
import typings.ethereumjsTx.distTypesMod.TxOptions
import typings.ethereumjsTx.distTypesMod.TxValuesArray
import typings.ethereumjsTx.ethereumjsTxBooleans.`false`
import typings.ethereumjsTx.ethereumjsTxBooleans.`true`
import typings.ethereumjsUtil.distTypesMod.BigIntLike
import typings.ethereumjsUtil.mod.Address
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseTransactionMod {
  
  /* note: abstract class */ @JSImport("@ethereumjs/tx/dist/baseTransaction", "BaseTransaction")
  @js.native
  open class BaseTransaction[TransactionObject] protected () extends StObject {
    def this(txData: AccessListEIP2930TxData, opts: TxOptions) = this()
    def this(txData: FeeMarketEIP1559TxData, opts: TxOptions) = this()
    def this(txData: TxData, opts: TxOptions) = this()
    
    /**
      * The default chain the tx falls back to if no Common
      * is provided and if the chain can't be derived from
      * a passed in chainId (only EIP-2718 typed txs) or
      * EIP-155 signature (legacy txs).
      *
      * @hidden
      */
    /* protected */ var DEFAULT_CHAIN: Chain = js.native
    
    /**
      * The default HF if the tx type is active on that HF
      * or the first greater HF where the tx is active.
      *
      * @hidden
      */
    /* protected */ var DEFAULT_HARDFORK: String | Hardfork = js.native
    
    /**
      * Internal helper function to create an annotated error message
      *
      * @param msg Base error message
      * @hidden
      */
    /* protected */ def _errorMsg(msg: String): String = js.native
    
    /**
      * Does chain ID checks on common and returns a common
      * to be used on instantiation
      * @hidden
      *
      * @param common - {@link Common} instance from tx options
      * @param chainId - Chain ID from tx options (typed txs) or signature (legacy tx)
      */
    /* protected */ def _getCommon(): Common = js.native
    /* protected */ def _getCommon(common: Unit, chainId: BigIntLike): Common = js.native
    /* protected */ def _getCommon(common: Common): Common = js.native
    /* protected */ def _getCommon(common: Common, chainId: BigIntLike): Common = js.native
    
    /**
      * Returns the shared error postfix part for _error() method
      * tx type implementations.
      */
    /* protected */ def _getSharedErrorPostfix(): String = js.native
    
    /* protected */ def _processSignature(v: js.BigInt, r: Buffer, s: Buffer): TransactionObject = js.native
    
    /* private */ val _type: Any = js.native
    
    /**
      * Validates that an object with BigInt values cannot exceed the specified bit limit.
      * @param values Object containing string keys and BigInt values
      * @param bits Number of bits to check (64 or 256)
      * @param cannotEqual Pass true if the number also cannot equal one less the maximum value
      */
    /* protected */ def _validateCannotExceedMaxInteger(values: StringDictionary[js.UndefOr[js.BigInt]]): Unit = js.native
    /* protected */ def _validateCannotExceedMaxInteger(values: StringDictionary[js.UndefOr[js.BigInt]], bits: Double): Unit = js.native
    /* protected */ def _validateCannotExceedMaxInteger(values: StringDictionary[js.UndefOr[js.BigInt]], bits: Double, cannotEqual: Boolean): Unit = js.native
    /* protected */ def _validateCannotExceedMaxInteger(values: StringDictionary[js.UndefOr[js.BigInt]], bits: Unit, cannotEqual: Boolean): Unit = js.native
    
    /**
      * EIP-2: All transaction signatures whose s-value is greater than secp256k1n/2are considered invalid.
      * Reasoning: https://ethereum.stackexchange.com/a/55728
      */
    /* protected */ def _validateHighS(): Unit = js.native
    
    /* protected */ def _validateYParity(): Unit = js.native
    
    /**
      * List of tx type defining EIPs,
      * e.g. 1559 (fee market) and 2930 (access lists)
      * for FeeMarketEIP1559Transaction objects
      */
    /* protected */ var activeCapabilities: js.Array[Double] = js.native
    
    /* protected */ var cache: TransactionCache = js.native
    
    val common: Common = js.native
    
    val data: Buffer = js.native
    
    /**
      * Return a compact error string representation of the object
      */
    def errorStr(): String = js.native
    
    val gasLimit: js.BigInt = js.native
    
    /**
      * The minimum amount of gas the tx must have (DataFee + TxFee + Creation Fee)
      */
    def getBaseFee(): js.BigInt = js.native
    
    /**
      * The amount of gas paid for the data in this tx
      */
    def getDataFee(): js.BigInt = js.native
    
    def getMessageToSign(): Buffer = js.native
    @JSName("getMessageToSign")
    def getMessageToSign_false(hashMessage: `false`): Buffer | js.Array[Buffer] = js.native
    @JSName("getMessageToSign")
    def getMessageToSign_true(hashMessage: `true`): Buffer = js.native
    
    def getMessageToVerifySignature(): Buffer = js.native
    
    /**
      * Returns the sender's address
      */
    def getSenderAddress(): Address = js.native
    
    /**
      * Returns the public key of the sender
      */
    def getSenderPublicKey(): Buffer = js.native
    
    /**
      * The up front amount that an account must have for this transaction to be valid
      */
    def getUpfrontCost(): js.BigInt = js.native
    
    def hash(): Buffer = js.native
    
    def isSigned(): Boolean = js.native
    
    val nonce: js.BigInt = js.native
    
    val r: js.UndefOr[js.BigInt] = js.native
    
    /**
      * Returns a Buffer Array of the raw Buffers of this transaction, in order.
      *
      * Use {@link BaseTransaction.serialize} to add a transaction to a block
      * with {@link Block.fromValuesArray}.
      *
      * For an unsigned tx this method uses the empty Buffer values for the
      * signature parameters `v`, `r` and `s` for encoding. For an EIP-155 compliant
      * representation for external signing use {@link BaseTransaction.getMessageToSign}.
      */
    def raw(): TxValuesArray | AccessListEIP2930ValuesArray | FeeMarketEIP1559ValuesArray = js.native
    
    val s: js.UndefOr[js.BigInt] = js.native
    
    /**
      * Returns the encoding of the transaction.
      */
    def serialize(): Buffer = js.native
    
    /**
      * Signs a transaction.
      *
      * Note that the signed tx is returned as a new object,
      * use as follows:
      * ```javascript
      * const signedTx = tx.sign(privateKey)
      * ```
      */
    def sign(privateKey: Buffer): TransactionObject = js.native
    
    /**
      * Checks if a tx type defining capability is active
      * on a tx, for example the EIP-1559 fee market mechanism
      * or the EIP-2930 access list feature.
      *
      * Note that this is different from the tx type itself,
      * so EIP-2930 access lists can very well be active
      * on an EIP-1559 tx for example.
      *
      * This method can be useful for feature checks if the
      * tx type is unknown (e.g. when instantiated with
      * the tx factory).
      *
      * See `Capabilites` in the `types` module for a reference
      * on all supported capabilities.
      */
    def supports(capability: Capability): Boolean = js.native
    
    val to: js.UndefOr[Address] = js.native
    
    /**
      * If the tx's `to` is to the creation address
      */
    def toCreationAddress(): Boolean = js.native
    
    /**
      * Returns an object with the JSON representation of the transaction
      */
    def toJSON(): JsonTx = js.native
    
    /* protected */ val txOptions: TxOptions = js.native
    
    /**
      * Returns the transaction type.
      *
      * Note: legacy txs will return tx type `0`.
      */
    def `type`: Double = js.native
    
    val v: js.UndefOr[js.BigInt] = js.native
    
    /**
      * Checks if the transaction has the minimum amount of gas required
      * (DataFee + TxFee + Creation Fee).
      */
    def validate(): Boolean = js.native
    @JSName("validate")
    def validate_false(stringError: `false`): Boolean = js.native
    @JSName("validate")
    def validate_true(stringError: `true`): js.Array[String] = js.native
    
    val value: js.BigInt = js.native
    
    /**
      * Determines if the signature is valid
      */
    def verifySignature(): Boolean = js.native
  }
  
  trait TransactionCache extends StObject {
    
    var dataFee: js.UndefOr[typings.ethereumjsTx.anon.Hardfork] = js.undefined
    
    var hash: js.UndefOr[Buffer] = js.undefined
  }
  object TransactionCache {
    
    inline def apply(): TransactionCache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionCache]
    }
    
    extension [Self <: TransactionCache](x: Self) {
      
      inline def setDataFee(value: typings.ethereumjsTx.anon.Hardfork): Self = StObject.set(x, "dataFee", value.asInstanceOf[js.Any])
      
      inline def setDataFeeUndefined: Self = StObject.set(x, "dataFee", js.undefined)
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
}
