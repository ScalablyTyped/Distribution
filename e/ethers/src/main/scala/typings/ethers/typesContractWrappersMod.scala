package typings.ethers

import typings.ethers.typesAbiMod.EventFragment
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesAbiMod.Result
import typings.ethers.typesContractContractMod.BaseContract
import typings.ethers.typesContractTypesMod.ContractEventName
import typings.ethers.typesProvidersProviderMod.Block
import typings.ethers.typesProvidersProviderMod.Log
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionReceipt
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesUtilsEventsMod.Listener
import typings.ethers.typesUtilsMod.EventPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContractWrappersMod {
  
  @JSImport("ethers/types/contract/wrappers", "ContractEventPayload")
  @js.native
  open class ContractEventPayload protected () extends ContractUnknownEventPayload {
    def this(
      contract: BaseContract,
      listener: Null,
      filter: ContractEventName,
      fragment: EventFragment,
      _log: Log
    ) = this()
    def this(
      contract: BaseContract,
      listener: Listener,
      filter: ContractEventName,
      fragment: EventFragment,
      _log: Log
    ) = this()
    
    val args: Result = js.native
    
    def eventName: String = js.native
    
    def eventSignature: String = js.native
    
    val fragment: EventFragment = js.native
    
    @JSName("log")
    val log_ContractEventPayload: EventLog = js.native
  }
  
  @JSImport("ethers/types/contract/wrappers", "ContractTransactionReceipt")
  @js.native
  open class ContractTransactionReceipt protected () extends TransactionReceipt {
    def this(iface: Interface, provider: Provider, tx: TransactionReceipt) = this()
    
    @JSName("logs")
    def logs_MContractTransactionReceipt: js.Array[EventLog | Log] = js.native
  }
  
  @JSImport("ethers/types/contract/wrappers", "ContractTransactionResponse")
  @js.native
  open class ContractTransactionResponse protected () extends TransactionResponse {
    def this(iface: Interface, provider: Provider, tx: TransactionResponse) = this()
  }
  
  @JSImport("ethers/types/contract/wrappers", "ContractUnknownEventPayload")
  @js.native
  open class ContractUnknownEventPayload protected () extends EventPayload[ContractEventName] {
    def this(contract: BaseContract, listener: Null, filter: ContractEventName, log: Log) = this()
    def this(contract: BaseContract, listener: Listener, filter: ContractEventName, log: Log) = this()
    
    def getBlock(): js.Promise[Block] = js.native
    
    def getTransaction(): js.Promise[TransactionResponse] = js.native
    
    def getTransactionReceipt(): js.Promise[TransactionReceipt] = js.native
    
    val log: Log = js.native
  }
  
  @JSImport("ethers/types/contract/wrappers", "EventLog")
  @js.native
  open class EventLog protected () extends Log {
    def this(log: Log, iface: Interface, fragment: EventFragment) = this()
    
    val args: Result = js.native
    
    def eventName: String = js.native
    
    def eventSignature: String = js.native
    
    val fragment: EventFragment = js.native
    
    val interface: Interface = js.native
  }
}
