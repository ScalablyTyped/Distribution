package typings.ethers.anon

import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.ethers.typesProvidersProviderMod.Block
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionReceipt
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ethers.ethers/types/providers/provider.TransactionResponse & {  accessList :ethers.ethers/types/transaction.AccessList,   maxFeePerGas :null,   maxPriorityFeePerGas :null} */
@js.native
trait TransactionResponseaccessGetBlock extends StObject {
  
  /**
    *  The [[link-eip-2930]] access list for transaction types that
    *  support it, otherwise ``null``.
    */
  val accessList: Null | typings.ethers.typesTransactionMod.AccessList = js.native
  
  /**
    *  The blockHash of the block that this transaction was included in.
    *
    *  This is ``null`` for pending transactions.
    */
  val blockHash: Null | String = js.native
  
  /**
    *  The block number of the block that this transaction was included in.
    *
    *  This is ``null`` for pending transactions.
    */
  val blockNumber: Null | Double = js.native
  
  /**
    *  The chain ID.
    */
  val chainId: js.BigInt = js.native
  
  /**
    *  The data.
    */
  val data: String = js.native
  
  /**
    *  The sender of this transaction. It is implicitly computed
    *  from the transaction pre-image hash (as the digest) and the
    *  [[signature]] using ecrecover.
    */
  val from: String = js.native
  
  /**
    *  The maximum units of gas this transaction can consume. If execution
    *  exceeds this, the entries transaction is reverted and the sender
    *  is charged for the full amount, despite not state changes being made.
    */
  val gasLimit: js.BigInt = js.native
  
  /**
    *  The gas price can have various values, depending on the network.
    *
    *  In modern networks, for transactions that are included this is
    *  the //effective gas price// (the fee per gas that was actually
    *  charged), while for transactions that have not been included yet
    *  is the [[maxFeePerGas]].
    *
    *  For legacy transactions, or transactions on legacy networks, this
    *  is the fee that will be charged per unit of gas the transaction
    *  consumes.
    */
  val gasPrice: js.BigInt = js.native
  
  /**
    *  Resolves to the Block that this transaction was included in.
    *
    *  This will return null if the transaction has not been included yet.
    */
  def getBlock(): js.Promise[Null | Block] = js.native
  
  /**
    *  Resolves to this transaction being re-requested from the
    *  provider. This can be used if you have an unmined transaction
    *  and wish to get an up-to-date populated instance.
    */
  def getTransaction(): js.Promise[Null | TransactionResponse] = js.native
  
  /**
    *  The transaction hash.
    */
  val hash: String = js.native
  
  /**
    *  The index within the block that this transaction resides at.
    */
  val index: Double = js.native
  
  /**
    *  Returns true if the transaction is a Berlin (i.e. ``type == 1``)
    *  transaction. See [[link-eip-2070]].
    *
    *  This provides a Type Guard that this transaction will have
    *  the ``null``-ness for hardfork-specific properties set correctly.
    */
  def isBerlin(): Boolean = js.native
  
  /**
    *  Returns true if the transaction is a legacy (i.e. ``type == 0``)
    *  transaction.
    *
    *  This provides a Type Guard that this transaction will have
    *  the ``null``-ness for hardfork-specific properties set correctly.
    */
  def isLegacy(): /* is ethers.anon.TransactionResponseaccessData */ Boolean = js.native
  
  /**
    *  Returns true if the transaction is a London (i.e. ``type == 2``)
    *  transaction. See [[link-eip-1559]].
    *
    *  This provides a Type Guard that this transaction will have
    *  the ``null``-ness for hardfork-specific properties set correctly.
    */
  def isLondon(): Boolean = js.native
  
  /**
    *  Returns ``true`` if this transaction has been included.
    *
    *  This is effective only as of the time the TransactionResponse
    *  was instantiated. To get up-to-date information, use
    *  [[getTransaction]].
    *
    *  This provides a Type Guard that this transaction will have
    *  non-null property values for properties that are null for
    *  unmined transactions.
    */
  def isMined(): /* is ethers.ethers/types/providers/provider.MinedTransactionResponse */ Boolean = js.native
  
  /**
    *  The maximum fee (per unit of gas) to allow this transaction
    *  to charge the sender.
    */
  val maxFeePerGas: Null | js.BigInt = js.native
  
  /**
    *  The maximum priority fee (per unit of gas) to allow a
    *  validator to charge the sender. This is inclusive of the
    *  [[maxFeeFeePerGas]].
    */
  val maxPriorityFeePerGas: Null | js.BigInt = js.native
  
  /**
    *  The nonce, which is used to prevent replay attacks and offer
    *  a method to ensure transactions from a given sender are explicitly
    *  ordered.
    *
    *  When sending a transaction, this must be equal to the number of
    *  transactions ever sent by [[from]].
    */
  val nonce: Double = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    *  The provider this is connected to, which will influence how its
    *  methods will resolve its async inspection methods.
    */
  val provider: Provider = js.native
  
  /**
    *  Returns a filter which can be used to listen for orphan events
    *  that evict this transaction.
    */
  def removedEvent(): OrphanFilter = js.native
  
  /**
    *  Returns a filter which can be used to listen for orphan events
    *  that re-order this event against %%other%%.
    */
  def reorderedEvent(): OrphanFilter = js.native
  def reorderedEvent(other: TransactionResponse): OrphanFilter = js.native
  
  /**
    *  Returns a new TransactionResponse instance which has the ability to
    *  detect (and throw an error) if the transaction is replaced, which
    *  will begin scanning at %%startBlock%%.
    *
    *  This should generally not be used by developers and is intended
    *  primarily for internal use. Setting an incorrect %%startBlock%% can
    *  have devastating performance consequences if used incorrectly.
    */
  def replaceableTransaction(startBlock: Double): TransactionResponse = js.native
  
  /**
    *  The signature.
    */
  val signature: typings.ethers.typesCryptoMod.Signature = js.native
  
  /**
    *  The receiver of this transaction.
    *
    *  If ``null``, then the transaction is an initcode transaction.
    *  This means the result of executing the [[data]] will be deployed
    *  as a new contract on chain (assuming it does not revert) and the
    *  address may be computed using [[getCreateAddress]].
    */
  val to: Null | String = js.native
  
  /**
    *  Returns a JSON representation of this transaction.
    */
  def toJSON(): Any = js.native
  
  /**
    *  The [[link-eip-2718]] transaction envelope type. This is
    *  ``0`` for legacy transactions types.
    */
  val `type`: Double = js.native
  
  /**
    *  The value, in wei. Use [[formatEther]] to format this value
    *  as ether.
    */
  val value: js.BigInt = js.native
  
  def wait(_confirms: Double): js.Promise[Null | TransactionReceipt] = js.native
  def wait(_confirms: Double, _timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
  def wait(_confirms: Unit, _timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
}
