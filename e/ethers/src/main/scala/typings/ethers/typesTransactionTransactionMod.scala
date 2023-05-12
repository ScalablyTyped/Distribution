package typings.ethers

import typings.ethers.typesCryptoMod.Signature
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListEntry
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransactionTransactionMod {
  
  @JSImport("ethers/types/transaction/transaction", "Transaction")
  @js.native
  /**
    *  Creates a new Transaction with default values.
    */
  open class Transaction ()
    extends StObject
       with TransactionLike[String] {
    
    /**
      *  The access list.
      *
      *  An access list permits discounted (but pre-paid) access to
      *  bytecode and state variable access within contract execution.
      */
    @JSName("accessList")
    def accessList_MTransaction: Null | AccessList = js.native
    
    /**
      *  The chain ID this transaction is valid on.
      */
    @JSName("chainId")
    def chainId_MTransaction: js.BigInt = js.native
    
    /**
      *  The transaction data. For ``init`` transactions this is the
      *  deployment code.
      */
    @JSName("data")
    def data_MTransaction: String = js.native
    
    /**
      *  The public key of the sender, if signed. Otherwise, ``null``.
      */
    def fromPublicKey: Null | String = js.native
    
    /**
      *  The sending address, if signed. Otherwise, ``null``.
      */
    @JSName("from")
    def from_MTransaction: Null | String = js.native
    
    /**
      *  The gas limit.
      */
    @JSName("gasLimit")
    def gasLimit_MTransaction: js.BigInt = js.native
    
    /**
      *  The gas price.
      *
      *  On legacy networks this defines the fee that will be paid. On
      *  EIP-1559 networks, this should be ``null``.
      */
    @JSName("gasPrice")
    def gasPrice_MTransaction: Null | js.BigInt = js.native
    
    /**
      *  The transaction hash, if signed. Otherwise, ``null``.
      */
    @JSName("hash")
    def hash_MTransaction: Null | String = js.native
    
    /**
      *  Return the most "likely" type; currently the highest
      *  supported transaction type.
      */
    def inferType(): Double = js.native
    
    /**
      *  Validates the explicit properties and returns a list of compatible
      *  transaction types.
      */
    def inferTypes(): js.Array[Double] = js.native
    
    /**
      *  Returns true if this transaction is berlin hardform transaction (i.e.
      *  ``type === 1``).
      *
      *  This provides a Type Guard that the related properties are
      *  non-null.
      */
    def isBerlin(): /* is ethers.anon.Transactiontype1gasPricebClone */ Boolean = js.native
    
    /**
      *  Returns true if this transaction is a legacy transaction (i.e.
      *  ``type === 0``).
      *
      *  This provides a Type Guard that the related properties are
      *  non-null.
      */
    def isLegacy(): /* is ethers.anon.Transactiontype0gasPricebChainId */ Boolean = js.native
    
    /**
      *  Returns true if this transaction is london hardform transaction (i.e.
      *  ``type === 2``).
      *
      *  This provides a Type Guard that the related properties are
      *  non-null.
      */
    def isLondon(): /* is ethers.anon.Transactiontype2accessLisConstructor */ Boolean = js.native
    
    /**
      *  Returns true if signed.
      *
      *  This provides a Type Guard that properties requiring a signed
      *  transaction are non-null.
      */
    def isSigned(): /* is ethers.anon.Transactiontypenumbertype */ Boolean = js.native
    
    /**
      *  The maximum total fee per unit of gas to pay. On legacy
      *  networks this should be ``null``.
      */
    @JSName("maxFeePerGas")
    def maxFeePerGas_MTransaction: Null | js.BigInt = js.native
    
    /**
      *  The maximum priority fee per unit of gas to pay. On legacy
      *  networks this should be ``null``.
      */
    @JSName("maxPriorityFeePerGas")
    def maxPriorityFeePerGas_MTransaction: Null | js.BigInt = js.native
    
    /**
      *  The transaction nonce.
      */
    @JSName("nonce")
    def nonce_MTransaction: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The serialized transaction.
      *
      *  This throws if the transaction is unsigned. For the pre-image,
      *  use [[unsignedSerialized]].
      */
    def serialized: String = js.native
    
    /**
      *  If signed, the signature for this transaction.
      */
    @JSName("signature")
    def signature_MTransaction: Null | Signature = js.native
    
    /**
      *  Return a JSON-friendly object.
      */
    def toJSON(): Any = js.native
    
    /**
      *  The ``to`` address for the transaction or ``null`` if the
      *  transaction is an ``init`` transaction.
      */
    @JSName("to")
    def to_MTransaction: Null | String = js.native
    
    /**
      *  The name of the transaction type.
      */
    def typeName: Null | String = js.native
    
    /**
      *  The transaction type.
      *
      *  If null, the type will be automatically inferred based on
      *  explicit properties.
      */
    @JSName("type")
    def type_MTransaction: Null | Double = js.native
    
    /**
      *  The pre-image hash of this transaction.
      *
      *  This is the digest that a [[Signer]] must sign to authorize
      *  this transaction.
      */
    def unsignedHash: String = js.native
    
    /**
      *  The transaction pre-image.
      *
      *  The hash of this is the digest which needs to be signed to
      *  authorize this transaction.
      */
    def unsignedSerialized: String = js.native
    
    /**
      *  The amount of ether to send in this transactions.
      */
    @JSName("value")
    def value_MTransaction: js.BigInt = js.native
  }
  /* static members */
  object Transaction {
    
    @JSImport("ethers/types/transaction/transaction", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Create a **Transaction** from a serialized transaction or a
      *  Transaction-like object.
      */
    inline def from(): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Transaction]
    inline def from(tx: String): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(tx.asInstanceOf[js.Any]).asInstanceOf[Transaction]
    inline def from(tx: TransactionLike[String]): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(tx.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  }
  
  trait TransactionLike[A] extends StObject {
    
    /**
      *  The access list for berlin and london transactions.
      */
    var accessList: js.UndefOr[Null | AccessListish] = js.undefined
    
    /**
      *  The chain ID the transaction is valid on.
      */
    var chainId: js.UndefOr[Null | BigNumberish] = js.undefined
    
    /**
      *  The data.
      */
    var data: js.UndefOr[Null | String] = js.undefined
    
    /**
      *  The sender.
      */
    var from: js.UndefOr[Null | A] = js.undefined
    
    /**
      *  The maximum amount of gas that can be used.
      */
    var gasLimit: js.UndefOr[Null | BigNumberish] = js.undefined
    
    /**
      *  The gas price for legacy and berlin transactions.
      */
    var gasPrice: js.UndefOr[Null | BigNumberish] = js.undefined
    
    /**
      *  The transaction hash.
      */
    var hash: js.UndefOr[Null | String] = js.undefined
    
    /**
      *  The maximum total fee per gas for london transactions.
      */
    var maxFeePerGas: js.UndefOr[Null | BigNumberish] = js.undefined
    
    /**
      *  The maximum priority fee per gas for london transactions.
      */
    var maxPriorityFeePerGas: js.UndefOr[Null | BigNumberish] = js.undefined
    
    /**
      *  The nonce.
      */
    var nonce: js.UndefOr[Null | Double] = js.undefined
    
    /**
      *  The signature provided by the sender.
      */
    var signature: js.UndefOr[Null | SignatureLike] = js.undefined
    
    /**
      *  The recipient address or ``null`` for an ``init`` transaction.
      */
    var to: js.UndefOr[Null | A] = js.undefined
    
    /**
      *  The type.
      */
    var `type`: js.UndefOr[Null | Double] = js.undefined
    
    /**
      *  The value (in wei) to send.
      */
    var value: js.UndefOr[Null | BigNumberish] = js.undefined
  }
  object TransactionLike {
    
    inline def apply[A](): TransactionLike[A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionLike[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionLike[?], A] (val x: Self & TransactionLike[A]) extends AnyVal {
      
      inline def setAccessList(value: AccessListish): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListNull: Self = StObject.set(x, "accessList", null)
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (AccessListEntry | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setChainId(value: BigNumberish): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdNull: Self = StObject.set(x, "chainId", null)
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: A): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitNull: Self = StObject.set(x, "gasLimit", null)
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceNull: Self = StObject.set(x, "gasPrice", null)
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMaxFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasNull: Self = StObject.set(x, "maxFeePerGas", null)
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasNull: Self = StObject.set(x, "maxPriorityFeePerGas", null)
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceNull: Self = StObject.set(x, "nonce", null)
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setSignature(value: SignatureLike): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureNull: Self = StObject.set(x, "signature", null)
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setTo(value: A): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
