package typings.ethersprojectContracts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.Listener
import typings.ethersprojectAbstractProvider.mod.Log
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectContracts.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/contracts", "Contract")
@js.native
class Contract protected ()
  extends /* key */ StringDictionary[ContractFunction[_] | js.Any] {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Signer) = this()
  
  var _addEventListener: js.Any = js.native
  
  def _checkRunningEvents(runningEvent: RunningEvent): Unit = js.native
  
  def _deployed(): js.Promise[Contract] = js.native
  def _deployed(blockTag: BlockTag): js.Promise[Contract] = js.native
  
  var _deployedPromise: js.Promise[Contract] = js.native
  
  var _getRunningEvent: js.Any = js.native
  
  var _normalizeRunningEvent: js.Any = js.native
  
  var _runningEvents: StringDictionary[RunningEvent] = js.native
  
  def _wrapEvent(runningEvent: RunningEvent, log: Log, listener: Listener): Event = js.native
  
  var _wrappedEmits: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  val address: String = js.native
  
  def attach(addressOrName: String): Contract = js.native
  
  val callStatic: StringDictionary[ContractFunction[_]] = js.native
  
  def connect(signerOrProvider: String): Contract = js.native
  def connect(signerOrProvider: Provider): Contract = js.native
  def connect(signerOrProvider: Signer): Contract = js.native
  
  val deployTransaction: TransactionResponse = js.native
  
  def deployed(): js.Promise[Contract] = js.native
  
  def emit(eventName: String, args: js.Any*): Boolean = js.native
  def emit(eventName: EventFilter, args: js.Any*): Boolean = js.native
  
  val estimateGas: StringDictionary[ContractFunction[BigNumber]] = js.native
  
  def fallback(): js.Promise[TransactionResponse] = js.native
  def fallback(overrides: TransactionRequest): js.Promise[TransactionResponse] = js.native
  
  val filters: StringDictionary[js.Function1[/* repeated */ js.Any, EventFilter]] = js.native
  
  val functions: StringDictionary[ContractFunction[_]] = js.native
  
  val interface: Interface = js.native
  
  def listenerCount(): Double = js.native
  def listenerCount(eventName: String): Double = js.native
  def listenerCount(eventName: EventFilter): Double = js.native
  
  def listeners(): js.Array[Listener] = js.native
  def listeners(eventName: String): js.Array[Listener] = js.native
  def listeners(eventName: EventFilter): js.Array[Listener] = js.native
  
  def off(eventName: String, listener: Listener): this.type = js.native
  def off(eventName: EventFilter, listener: Listener): this.type = js.native
  
  def on(event: String, listener: Listener): this.type = js.native
  def on(event: EventFilter, listener: Listener): this.type = js.native
  
  def once(event: String, listener: Listener): this.type = js.native
  def once(event: EventFilter, listener: Listener): this.type = js.native
  
  val populateTransaction: StringDictionary[ContractFunction[PopulatedTransaction]] = js.native
  
  val provider: Provider = js.native
  
  def queryFilter(event: EventFilter): js.Promise[js.Array[Event]] = js.native
  def queryFilter(event: EventFilter, fromBlockOrBlockhash: js.UndefOr[BlockTag], toBlock: BlockTag): js.Promise[js.Array[Event]] = js.native
  def queryFilter(event: EventFilter, fromBlockOrBlockhash: String): js.Promise[js.Array[Event]] = js.native
  def queryFilter(event: EventFilter, fromBlockOrBlockhash: String, toBlock: BlockTag): js.Promise[js.Array[Event]] = js.native
  def queryFilter(event: EventFilter, fromBlockOrBlockhash: BlockTag): js.Promise[js.Array[Event]] = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(eventName: String): this.type = js.native
  def removeAllListeners(eventName: EventFilter): this.type = js.native
  
  def removeListener(eventName: String, listener: Listener): this.type = js.native
  def removeListener(eventName: EventFilter, listener: Listener): this.type = js.native
  
  val resolvedAddress: js.Promise[String] = js.native
  
  val signer: Signer = js.native
}
/* static members */
@JSImport("@ethersproject/contracts", "Contract")
@js.native
object Contract extends js.Object {
  
  def getContractAddress(transaction: From): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
  
  def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = js.native
}
