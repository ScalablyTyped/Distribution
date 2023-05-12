package typings.ethers.anon

import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ethers.ethers/types/transaction/transaction.Transaction & {  type :1,   gasPrice :bigint,   accessList :ethers.ethers/types/transaction.AccessList} */
@js.native
/**
  *  Creates a new Transaction with default values.
  */
trait Transactiontype1gasPricebChainId extends StObject {
  
  /**
    *  The access list.
    *
    *  An access list permits discounted (but pre-paid) access to
    *  bytecode and state variable access within contract execution.
    */
  def accessList: Null | typings.ethers.typesTransactionMod.AccessList = js.native
  def accessList_=(value: Null | AccessListish): Unit = js.native
  /**
    *  The access list for berlin and london transactions.
    */
  @JSName("accessList")
  var accessList_FTransactiontype1gasPricebChainId: js.UndefOr[Null | AccessListish] = js.native
  
  /**
    *  The chain ID this transaction is valid on.
    */
  def chainId: js.BigInt = js.native
  def chainId_=(value: BigNumberish): Unit = js.native
  /**
    *  The chain ID the transaction is valid on.
    */
  @JSName("chainId")
  var chainId_FTransactiontype1gasPricebChainId: js.UndefOr[Null | BigNumberish] = js.native
  
  /**
    *  The transaction data. For ``init`` transactions this is the
    *  deployment code.
    */
  def data: String = js.native
  def data_=(value: BytesLike): Unit = js.native
  /**
    *  The data.
    */
  @JSName("data")
  var data_FTransactiontype1gasPricebChainId: js.UndefOr[Null | String] = js.native
  
  /**
    *  The sending address, if signed. Otherwise, ``null``.
    */
  def from: Null | String = js.native
  
  /**
    *  The public key of the sender, if signed. Otherwise, ``null``.
    */
  def fromPublicKey: Null | String = js.native
  
  /**
    *  The sender.
    */
  @JSName("from")
  var from_FTransactiontype1gasPricebChainId: js.UndefOr[Null | String] = js.native
  
  /**
    *  The gas limit.
    */
  def gasLimit: js.BigInt = js.native
  def gasLimit_=(value: BigNumberish): Unit = js.native
  /**
    *  The maximum amount of gas that can be used.
    */
  @JSName("gasLimit")
  var gasLimit_FTransactiontype1gasPricebChainId: js.UndefOr[Null | BigNumberish] = js.native
  
  /**
    *  The gas price.
    *
    *  On legacy networks this defines the fee that will be paid. On
    *  EIP-1559 networks, this should be ``null``.
    */
  def gasPrice: Null | js.BigInt = js.native
  def gasPrice_=(value: Null | BigNumberish): Unit = js.native
  /**
    *  The gas price for legacy and berlin transactions.
    */
  @JSName("gasPrice")
  var gasPrice_FTransactiontype1gasPricebChainId: js.UndefOr[Null | BigNumberish] = js.native
  
  /**
    *  The transaction hash, if signed. Otherwise, ``null``.
    */
  def hash: Null | String = js.native
  /**
    *  The transaction hash.
    */
  @JSName("hash")
  var hash_FTransactiontype1gasPricebChainId: js.UndefOr[Null | String] = js.native
  
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
  def isBerlin(): Boolean = js.native
  
  /**
    *  Returns true if this transaction is a legacy transaction (i.e.
    *  ``type === 0``).
    *
    *  This provides a Type Guard that the related properties are
    *  non-null.
    */
  def isLegacy(): Boolean = js.native
  
  /**
    *  Returns true if this transaction is london hardform transaction (i.e.
    *  ``type === 2``).
    *
    *  This provides a Type Guard that the related properties are
    *  non-null.
    */
  def isLondon(): /* is ethers.anon.Transactiontype2accessLis */ Boolean = js.native
  
  /**
    *  Returns true if signed.
    *
    *  This provides a Type Guard that properties requiring a signed
    *  transaction are non-null.
    */
  def isSigned(): /* is ethers.anon.TransactiontypenumbertypeChainId */ Boolean = js.native
  
  /**
    *  The maximum total fee per unit of gas to pay. On legacy
    *  networks this should be ``null``.
    */
  def maxFeePerGas: Null | js.BigInt = js.native
  def maxFeePerGas_=(value: Null | BigNumberish): Unit = js.native
  /**
    *  The maximum total fee per gas for london transactions.
    */
  @JSName("maxFeePerGas")
  var maxFeePerGas_FTransactiontype1gasPricebChainId: js.UndefOr[Null | BigNumberish] = js.native
  
  /**
    *  The maximum priority fee per unit of gas to pay. On legacy
    *  networks this should be ``null``.
    */
  def maxPriorityFeePerGas: Null | js.BigInt = js.native
  def maxPriorityFeePerGas_=(value: Null | BigNumberish): Unit = js.native
  /**
    *  The maximum priority fee per gas for london transactions.
    */
  @JSName("maxPriorityFeePerGas")
  var maxPriorityFeePerGas_FTransactiontype1gasPricebChainId: js.UndefOr[Null | BigNumberish] = js.native
  
  /**
    *  The transaction nonce.
    */
  def nonce: Double = js.native
  def nonce_=(value: BigNumberish): Unit = js.native
  /**
    *  The nonce.
    */
  @JSName("nonce")
  var nonce_FTransactiontype1gasPricebChainId: js.UndefOr[Null | Double] = js.native
  
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
  def signature: Null | typings.ethers.typesCryptoMod.Signature = js.native
  def signature_=(value: Null | SignatureLike): Unit = js.native
  /**
    *  The signature provided by the sender.
    */
  @JSName("signature")
  var signature_FTransactiontype1gasPricebChainId: js.UndefOr[Null | SignatureLike] = js.native
  
  /**
    *  The ``to`` address for the transaction or ``null`` if the
    *  transaction is an ``init`` transaction.
    */
  def to: Null | String = js.native
  
  /**
    *  Return a JSON-friendly object.
    */
  def toJSON(): Any = js.native
  
  def to_=(value: Null | String): Unit = js.native
  /**
    *  The recipient address or ``null`` for an ``init`` transaction.
    */
  @JSName("to")
  var to_FTransactiontype1gasPricebChainId: js.UndefOr[Null | String] = js.native
  
  /**
    *  The transaction type.
    *
    *  If null, the type will be automatically inferred based on
    *  explicit properties.
    */
  def `type`: Null | Double = js.native
  
  /**
    *  The name of the transaction type.
    */
  def typeName: Null | String = js.native
  
  def type_=(value: Null | Double | String): Unit = js.native
  /**
    *  The type.
    */
  @JSName("type")
  var type_FTransactiontype1gasPricebChainId: js.UndefOr[Null | Double] = js.native
  
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
  def value: js.BigInt = js.native
  def value_=(value: BigNumberish): Unit = js.native
  /**
    *  The value (in wei) to send.
    */
  @JSName("value")
  var value_FTransactiontype1gasPricebChainId: js.UndefOr[Null | BigNumberish] = js.native
}
