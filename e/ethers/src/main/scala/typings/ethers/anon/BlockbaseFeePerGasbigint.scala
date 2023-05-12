package typings.ethers.anon

import typings.ethers.typesProvidersFormattingMod.BlockParams
import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ethers.ethers/types/providers/provider.Block & {  baseFeePerGas :bigint} */
@js.native
trait BlockbaseFeePerGasbigint extends StObject {
  
  /**
    *  The base fee per gas that all transactions in this block were
    *  charged.
    *
    *  This adjusts after each block, depending on how congested the network
    *  is.
    */
  val baseFeePerGas: Null | js.BigInt = js.native
  
  /**
    *  The [[link-js-date]] this block was included at.
    */
  def date: Null | js.Date = js.native
  
  /**
    *  The difficulty target.
    *
    *  On legacy networks, this is the proof-of-work target required
    *  for a block to meet the protocol rules to be included.
    *
    *  On modern networks, this is a random number arrived at using
    *  randao.  @TODO: Find links?
    */
  val difficulty: js.BigInt = js.native
  
  /**
    *  Any extra data the validator wished to include.
    */
  val extraData: String = js.native
  
  /**
    *  The total gas limit for this block.
    */
  val gasLimit: js.BigInt = js.native
  
  /**
    *  The total gas used in this block.
    */
  val gasUsed: js.BigInt = js.native
  
  def getPrefetchedTransaction(indexOrHash: String): TransactionResponse = js.native
  def getPrefetchedTransaction(indexOrHash: Double): TransactionResponse = js.native
  
  def getTransaction(indexOrHash: String): js.Promise[TransactionResponse] = js.native
  /**
    *  Get the transaction at %%indexe%% within this block.
    */
  def getTransaction(indexOrHash: Double): js.Promise[TransactionResponse] = js.native
  
  /**
    *  The block hash.
    */
  val hash: Null | String = js.native
  
  /**
    *
    */
  def isLondon(): Boolean = js.native
  
  /**
    *  Has this block been mined.
    *
    *  If true, the block has been typed-gaurded that all mined
    *  properties are non-null.
    */
  def isMined(): /* is ethers.ethers/types/providers/provider.MinedBlock */ Boolean = js.native
  
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[String]] = js.native
  
  /**
    *  The number of transactions in this block.
    */
  def length: Double = js.native
  
  /**
    *  The miner coinbase address, wihch receives any subsidies for
    *  including this block.
    */
  val miner: String = js.native
  
  /**
    *  The nonce.
    *
    *  On legacy networks, this is the random number inserted which
    *  permitted the difficulty target to be reached.
    */
  val nonce: String = js.native
  
  /**
    *  The block number, sometimes called the block height. This is a
    *  sequential number that is one higher than the parent block.
    */
  val number: Double = js.native
  
  def orphanedEvent(): OrphanFilter = js.native
  
  /**
    *  The block hash of the parent block.
    */
  val parentHash: String = js.native
  
  /**
    *  Returns the complete transactions for blocks which
    *  prefetched them, by passing ``true`` to %%prefetchTxs%%
    *  into [[provider_getBlock]].
    */
  def prefetchedTransactions: js.Array[TransactionResponse] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    *  The provider connected to the block used to fetch additional details
    *  if necessary.
    */
  val provider: Provider = js.native
  
  /**
    *  The timestamp for this block, which is the number of seconds since
    *  epoch that this block was included.
    */
  val timestamp: Double = js.native
  
  /**
    *  Returns a JSON-friendly value.
    */
  def toJSON(): Any = js.native
  
  /**
    *  Returns the list of transaction hashes.
    */
  def transactions: js.Array[String] = js.native
  @JSName("transactions")
  var transactions_FBlockbaseFeePerGasbigint: js.Array[String | TransactionResponseParams] = js.native
}
