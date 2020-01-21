package typings.ethers.typesMod

import typings.ethers.ethersStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/types", "MinimalProvider")
@js.native
abstract class MinimalProvider () extends OnceBlockable {
  def call(transaction: TransactionRequest): js.Promise[String] = js.native
  def estimateGas(transaction: TransactionRequest): js.Promise[BigNumber] = js.native
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
  def listeners(eventName: EventType): js.Array[Listener] = js.native
  def lookupAddress(address: String): js.Promise[String] = js.native
  def lookupAddress(address: js.Promise[String]): js.Promise[String] = js.native
  def on(eventName: EventType, listener: Listener): MinimalProvider = js.native
  def once(eventName: EventType, listener: Listener): MinimalProvider = js.native
  /* CompleteClass */
  @JSName("once")
  override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
  def removeAllListeners(eventName: EventType): MinimalProvider = js.native
  def removeListener(eventName: EventType, listener: Listener): MinimalProvider = js.native
  def resolveName(name: String): js.Promise[String] = js.native
  def resolveName(name: js.Promise[String]): js.Promise[String] = js.native
  def sendTransaction(signedTransaction: String): js.Promise[TransactionResponse] = js.native
  def sendTransaction(signedTransaction: js.Promise[String]): js.Promise[TransactionResponse] = js.native
  def waitForTransaction(transactionHash: String): js.Promise[TransactionReceipt] = js.native
  def waitForTransaction(transactionHash: String, timeout: Double): js.Promise[TransactionReceipt] = js.native
}

