package typings.ethers

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.ethersStrings.addListener
import typings.ethers.ethersStrings.buildClass
import typings.ethers.ethersStrings.connect
import typings.ethers.ethersStrings.constructor
import typings.ethers.ethersStrings.deploymentTransaction
import typings.ethers.ethersStrings.emit
import typings.ethers.ethersStrings.fallback
import typings.ethers.ethersStrings.filters
import typings.ethers.ethersStrings.from
import typings.ethers.ethersStrings.getAddress
import typings.ethers.ethersStrings.getDeployedCode
import typings.ethers.ethersStrings.getEvent
import typings.ethers.ethersStrings.getFunction
import typings.ethers.ethersStrings.interface
import typings.ethers.ethersStrings.listenerCount
import typings.ethers.ethersStrings.listeners
import typings.ethers.ethersStrings.off
import typings.ethers.ethersStrings.on
import typings.ethers.ethersStrings.once
import typings.ethers.ethersStrings.queryFilter
import typings.ethers.ethersStrings.queryTransaction
import typings.ethers.ethersStrings.removeAllListeners
import typings.ethers.ethersStrings.removeListener
import typings.ethers.ethersStrings.runner
import typings.ethers.ethersStrings.target
import typings.ethers.ethersStrings.waitForDeployment
import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import typings.ethers.typesAbiMod.EventFragment
import typings.ethers.typesAbiMod.FunctionFragment
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesAbiMod.ParamType
import typings.ethers.typesAddressMod.Addressable
import typings.ethers.typesContractTypesMod.ContractEvent
import typings.ethers.typesContractTypesMod.ContractEventName
import typings.ethers.typesContractTypesMod.ContractMethod
import typings.ethers.typesContractTypesMod.ContractTransaction
import typings.ethers.typesContractTypesMod.WrappedFallback
import typings.ethers.typesContractWrappersMod.ContractTransactionResponse
import typings.ethers.typesContractWrappersMod.EventLog
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesProvidersProviderMod.BlockTag
import typings.ethers.typesProvidersProviderMod.Log
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesUtilsEventsMod.EventEmitterable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContractContractMod {
  
  @JSImport("ethers/types/contract/contract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/contract/contract", "BaseContract")
  @js.native
  open class BaseContract protected ()
    extends StObject
       with Addressable
       with EventEmitterable[ContractEventName] {
    def this(target: String, abi: InterfaceAbi) = this()
    def this(target: String, abi: Interface) = this()
    def this(target: Addressable, abi: InterfaceAbi) = this()
    def this(target: Addressable, abi: Interface) = this()
    def this(target: String, abi: InterfaceAbi, runner: ContractRunner) = this()
    def this(target: String, abi: Interface, runner: ContractRunner) = this()
    def this(target: Addressable, abi: InterfaceAbi, runner: ContractRunner) = this()
    def this(target: Addressable, abi: Interface, runner: ContractRunner) = this()
    def this(target: String, abi: InterfaceAbi, runner: Null, _deployTx: TransactionResponse) = this()
    def this(target: String, abi: InterfaceAbi, runner: Unit, _deployTx: TransactionResponse) = this()
    def this(target: String, abi: InterfaceAbi, runner: ContractRunner, _deployTx: TransactionResponse) = this()
    def this(target: String, abi: Interface, runner: Null, _deployTx: TransactionResponse) = this()
    def this(target: String, abi: Interface, runner: Unit, _deployTx: TransactionResponse) = this()
    def this(target: String, abi: Interface, runner: ContractRunner, _deployTx: TransactionResponse) = this()
    def this(target: Addressable, abi: InterfaceAbi, runner: Null, _deployTx: TransactionResponse) = this()
    def this(target: Addressable, abi: InterfaceAbi, runner: Unit, _deployTx: TransactionResponse) = this()
    def this(target: Addressable, abi: InterfaceAbi, runner: ContractRunner, _deployTx: TransactionResponse) = this()
    def this(target: Addressable, abi: Interface, runner: Null, _deployTx: TransactionResponse) = this()
    def this(target: Addressable, abi: Interface, runner: Unit, _deployTx: TransactionResponse) = this()
    def this(target: Addressable, abi: Interface, runner: ContractRunner, _deployTx: TransactionResponse) = this()
    
    def connect(): BaseContract = js.native
    def connect(runner: ContractRunner): BaseContract = js.native
    
    def deploymentTransaction(): Null | ContractTransactionResponse = js.native
    
    val fallback: Null | WrappedFallback = js.native
    
    val filters: Record[String, ContractEvent[js.Array[Any]]] = js.native
    
    /**
      *  Get the object address.
      */
    /* CompleteClass */
    override def getAddress(): js.Promise[String] = js.native
    
    def getDeployedCode(): js.Promise[Null | String] = js.native
    
    def getEvent(key: String): ContractEvent[js.Array[Any]] = js.native
    def getEvent(key: EventFragment): ContractEvent[js.Array[Any]] = js.native
    
    def getFunction[T /* <: ContractMethod[js.Array[Any], Any, Any | ContractTransactionResponse] */](key: String): T = js.native
    def getFunction[T /* <: ContractMethod[js.Array[Any], Any, Any | ContractTransactionResponse] */](key: FunctionFragment): T = js.native
    
    val interface: Interface = js.native
    
    def queryFilter(event: ContractEventName): js.Promise[js.Array[EventLog | Log]] = js.native
    def queryFilter(event: ContractEventName, fromBlock: Unit, toBlock: BlockTag): js.Promise[js.Array[EventLog | Log]] = js.native
    def queryFilter(event: ContractEventName, fromBlock: BlockTag): js.Promise[js.Array[EventLog | Log]] = js.native
    def queryFilter(event: ContractEventName, fromBlock: BlockTag, toBlock: BlockTag): js.Promise[js.Array[EventLog | Log]] = js.native
    
    def queryTransaction(hash: String): js.Promise[js.Array[EventLog]] = js.native
    
    val runner: Null | ContractRunner = js.native
    
    val target: String | Addressable = js.native
    
    def waitForDeployment(): js.Promise[this.type] = js.native
  }
  /* static members */
  object BaseContract {
    
    @JSImport("ethers/types/contract/contract", "BaseContract")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildClass[T](abi: InterfaceAbi): Instantiable2[
        /* target */ String, 
        /* runner */ js.UndefOr[Null | ContractRunner], 
        BaseContract & (Omit[
          T, 
          /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.ethers.ethersStrings.buildClass | from
        ])
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClass")(abi.asInstanceOf[js.Any]).asInstanceOf[Instantiable2[
        /* target */ String, 
        /* runner */ js.UndefOr[Null | ContractRunner], 
        BaseContract & (Omit[
          T, 
          /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.ethers.ethersStrings.buildClass | from
        ])
      ]]
    
    inline def from[T](target: String, abi: InterfaceAbi): BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ])]
    inline def from[T](target: String, abi: InterfaceAbi, runner: ContractRunner): BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], abi.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ])]
  }
  
  @JSImport("ethers/types/contract/contract", "Contract")
  @js.native
  open class Contract () extends StObject
  
  inline def copyOverrides[O /* <: String */](arg: Any): js.Promise[Omit[ContractTransaction, O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyOverrides")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Omit[ContractTransaction, O]]]
  inline def copyOverrides[O /* <: String */](arg: Any, allowed: js.Array[String]): js.Promise[Omit[ContractTransaction, O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyOverrides")(arg.asInstanceOf[js.Any], allowed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Omit[ContractTransaction, O]]]
  
  inline def resolveArgs(_runner: Null, inputs: js.Array[ParamType], args: js.Array[Any]): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgs")(_runner.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def resolveArgs(_runner: ContractRunner, inputs: js.Array[ParamType], args: js.Array[Any]): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgs")(_runner.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
}
