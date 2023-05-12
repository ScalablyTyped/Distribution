package typings.ethers

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.anon.Object
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
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesAddressMod.Addressable
import typings.ethers.typesContractTypesMod.ContractEventName
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesProvidersProviderMod.Log
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionReceipt
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsEventsMod.Listener
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object contractMod {
  
  @JSImport("ethers/contract", "BaseContract")
  @js.native
  open class BaseContract protected ()
    extends typings.ethers.typesContractMod.BaseContract {
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
  }
  /* static members */
  object BaseContract {
    
    @JSImport("ethers/contract", "BaseContract")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildClass[T](abi: InterfaceAbi): Instantiable2[
        /* target */ String, 
        /* runner */ js.UndefOr[Null | ContractRunner], 
        typings.ethers.typesContractContractMod.BaseContract & (Omit[
          T, 
          /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.ethers.ethersStrings.buildClass | from
        ])
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClass")(abi.asInstanceOf[js.Any]).asInstanceOf[Instantiable2[
        /* target */ String, 
        /* runner */ js.UndefOr[Null | ContractRunner], 
        typings.ethers.typesContractContractMod.BaseContract & (Omit[
          T, 
          /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.ethers.ethersStrings.buildClass | from
        ])
      ]]
    
    inline def from[T](target: String, abi: InterfaceAbi): typings.ethers.typesContractContractMod.BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesContractContractMod.BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ])]
    inline def from[T](target: String, abi: InterfaceAbi, runner: ContractRunner): typings.ethers.typesContractContractMod.BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], abi.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesContractContractMod.BaseContract & (Omit[
        T, 
        /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
      ])]
  }
  
  @JSImport("ethers/contract", "Contract")
  @js.native
  open class Contract ()
    extends typings.ethers.typesContractMod.Contract
  
  @JSImport("ethers/contract", "ContractEventPayload")
  @js.native
  open class ContractEventPayload protected ()
    extends typings.ethers.typesContractMod.ContractEventPayload {
    def this(
      contract: typings.ethers.typesContractContractMod.BaseContract,
      listener: Null,
      filter: ContractEventName,
      fragment: EventFragment,
      _log: Log
    ) = this()
    def this(
      contract: typings.ethers.typesContractContractMod.BaseContract,
      listener: Listener,
      filter: ContractEventName,
      fragment: EventFragment,
      _log: Log
    ) = this()
  }
  
  @JSImport("ethers/contract", "ContractFactory")
  @js.native
  open class ContractFactory[A /* <: js.Array[Any] */, I] protected ()
    extends typings.ethers.typesContractMod.ContractFactory[A, I] {
    def this(abi: InterfaceAbi, bytecode: Object) = this()
    def this(abi: InterfaceAbi, bytecode: BytesLike) = this()
    def this(abi: Interface, bytecode: Object) = this()
    def this(abi: Interface, bytecode: BytesLike) = this()
    def this(abi: InterfaceAbi, bytecode: Object, runner: ContractRunner) = this()
    def this(abi: InterfaceAbi, bytecode: BytesLike, runner: ContractRunner) = this()
    def this(abi: Interface, bytecode: Object, runner: ContractRunner) = this()
    def this(abi: Interface, bytecode: BytesLike, runner: ContractRunner) = this()
  }
  /* static members */
  object ContractFactory {
    
    @JSImport("ethers/contract", "ContractFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSolidity[A /* <: js.Array[Any] */, I](output: Any): typings.ethers.typesContractFactoryMod.ContractFactory[A, I] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(output.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesContractFactoryMod.ContractFactory[A, I]]
    inline def fromSolidity[A /* <: js.Array[Any] */, I](output: Any, runner: ContractRunner): typings.ethers.typesContractFactoryMod.ContractFactory[A, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(output.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesContractFactoryMod.ContractFactory[A, I]]
  }
  
  @JSImport("ethers/contract", "ContractTransactionReceipt")
  @js.native
  open class ContractTransactionReceipt protected ()
    extends typings.ethers.typesContractMod.ContractTransactionReceipt {
    def this(iface: Interface, provider: Provider, tx: TransactionReceipt) = this()
  }
  
  @JSImport("ethers/contract", "ContractTransactionResponse")
  @js.native
  open class ContractTransactionResponse protected ()
    extends typings.ethers.typesContractMod.ContractTransactionResponse {
    def this(iface: Interface, provider: Provider, tx: TransactionResponse) = this()
  }
  
  @JSImport("ethers/contract", "ContractUnknownEventPayload")
  @js.native
  open class ContractUnknownEventPayload protected ()
    extends typings.ethers.typesContractMod.ContractUnknownEventPayload {
    def this(
      contract: typings.ethers.typesContractContractMod.BaseContract,
      listener: Null,
      filter: ContractEventName,
      log: Log
    ) = this()
    def this(
      contract: typings.ethers.typesContractContractMod.BaseContract,
      listener: Listener,
      filter: ContractEventName,
      log: Log
    ) = this()
  }
  
  @JSImport("ethers/contract", "EventLog")
  @js.native
  open class EventLog protected ()
    extends typings.ethers.typesContractMod.EventLog {
    def this(log: Log, iface: Interface, fragment: EventFragment) = this()
  }
}
