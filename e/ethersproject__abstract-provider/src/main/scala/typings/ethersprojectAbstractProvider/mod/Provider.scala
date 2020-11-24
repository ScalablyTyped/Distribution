package typings.ethersprojectAbstractProvider.mod

import typings.ethersprojectAbstractProvider.anon.DeferrableTransactionRequ
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectWeb.mod.OnceBlockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-provider", "Provider")
@js.native
abstract class Provider () extends OnceBlockable {
  
  val _isProvider: Boolean = js.native
  
  def addListener(eventName: EventType, listener: Listener): Provider = js.native
  
  def call(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
  def call(transaction: DeferrableTransactionRequ, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
  def call(transaction: DeferrableTransactionRequ, blockTag: BlockTag): js.Promise[String] = js.native
  
  def emit(eventName: EventType, args: js.Any*): Boolean = js.native
  
  def estimateGas(transaction: DeferrableTransactionRequ): js.Promise[BigNumber] = js.native
  
  def getBalance(addressOrName: String): js.Promise[BigNumber] = js.native
  def getBalance(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[BigNumber] = js.native
  def getBalance(addressOrName: String, blockTag: BlockTag): js.Promise[BigNumber] = js.native
  def getBalance(addressOrName: js.Promise[String]): js.Promise[BigNumber] = js.native
  def getBalance(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[BigNumber] = js.native
  def getBalance(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[BigNumber] = js.native
  
  def getBlock(blockHashOrBlockTag: String): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[Block] = js.native
  def getBlock(blockHashOrBlockTag: BlockTag): js.Promise[Block] = js.native
  
  def getBlockNumber(): js.Promise[Double] = js.native
  
  def getBlockWithTransactions(blockHashOrBlockTag: String): js.Promise[BlockWithTransactions] = js.native
  def getBlockWithTransactions(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[BlockWithTransactions] = js.native
  def getBlockWithTransactions(blockHashOrBlockTag: BlockTag): js.Promise[BlockWithTransactions] = js.native
  
  def getCode(addressOrName: String): js.Promise[String] = js.native
  def getCode(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
  def getCode(addressOrName: String, blockTag: BlockTag): js.Promise[String] = js.native
  def getCode(addressOrName: js.Promise[String]): js.Promise[String] = js.native
  def getCode(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
  def getCode(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[String] = js.native
  
  def getGasPrice(): js.Promise[BigNumber] = js.native
  
  def getLogs(filter: Filter): js.Promise[js.Array[Log]] = js.native
  
  def getNetwork(): js.Promise[Network] = js.native
  
  def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish]): js.Promise[String] = js.native
  def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish], blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
  def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish], blockTag: BlockTag): js.Promise[String] = js.native
  def getStorageAt(addressOrName: String, position: BigNumberish): js.Promise[String] = js.native
  def getStorageAt(addressOrName: String, position: BigNumberish, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
  def getStorageAt(addressOrName: String, position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
  def getStorageAt(addressOrName: js.Promise[String], position: js.Promise[BigNumberish]): js.Promise[String] = js.native
  def getStorageAt(
    addressOrName: js.Promise[String],
    position: js.Promise[BigNumberish],
    blockTag: js.Promise[BlockTag]
  ): js.Promise[String] = js.native
  def getStorageAt(addressOrName: js.Promise[String], position: js.Promise[BigNumberish], blockTag: BlockTag): js.Promise[String] = js.native
  def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish): js.Promise[String] = js.native
  def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
  def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
  
  def getTransaction(transactionHash: String): js.Promise[TransactionResponse] = js.native
  
  def getTransactionCount(addressOrName: String): js.Promise[Double] = js.native
  def getTransactionCount(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[Double] = js.native
  def getTransactionCount(addressOrName: String, blockTag: BlockTag): js.Promise[Double] = js.native
  def getTransactionCount(addressOrName: js.Promise[String]): js.Promise[Double] = js.native
  def getTransactionCount(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[Double] = js.native
  def getTransactionCount(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[Double] = js.native
  
  def getTransactionReceipt(transactionHash: String): js.Promise[TransactionReceipt] = js.native
  
  def listenerCount(): Double = js.native
  def listenerCount(eventName: EventType): Double = js.native
  
  def listeners(): js.Array[Listener] = js.native
  def listeners(eventName: EventType): js.Array[Listener] = js.native
  
  def lookupAddress(address: String): js.Promise[String] = js.native
  def lookupAddress(address: js.Promise[String]): js.Promise[String] = js.native
  
  def off(eventName: EventType): Provider = js.native
  def off(eventName: EventType, listener: Listener): Provider = js.native
  
  def on(eventName: EventType, listener: Listener): Provider = js.native
  
  def once(eventName: EventType, listener: Listener): Provider = js.native
  
  def removeAllListeners(): Provider = js.native
  def removeAllListeners(eventName: EventType): Provider = js.native
  
  def removeListener(eventName: EventType, listener: Listener): Provider = js.native
  
  def resolveName(name: String): js.Promise[String] = js.native
  def resolveName(name: js.Promise[String]): js.Promise[String] = js.native
  
  def sendTransaction(signedTransaction: String): js.Promise[TransactionResponse] = js.native
  def sendTransaction(signedTransaction: js.Promise[String]): js.Promise[TransactionResponse] = js.native
  
  def waitForTransaction(transactionHash: String): js.Promise[TransactionReceipt] = js.native
  def waitForTransaction(transactionHash: String, confirmations: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[TransactionReceipt] = js.native
  def waitForTransaction(transactionHash: String, confirmations: Double): js.Promise[TransactionReceipt] = js.native
  def waitForTransaction(transactionHash: String, confirmations: Double, timeout: Double): js.Promise[TransactionReceipt] = js.native
}
/* static members */
@JSImport("@ethersproject/abstract-provider", "Provider")
@js.native
object Provider extends js.Object {
  
  def isProvider(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = js.native
}
