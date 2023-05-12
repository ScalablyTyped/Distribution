package typings.ethers.mod.ethers

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
import typings.ethers.typesAddressMod.Addressable
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.BaseContract")
@js.native
open class BaseContract protected ()
  extends typings.ethers.typesEthersMod.BaseContract {
  def this(target: String, abi: InterfaceAbi) = this()
  def this(target: String, abi: typings.ethers.typesAbiMod.Interface) = this()
  def this(target: Addressable, abi: InterfaceAbi) = this()
  def this(target: Addressable, abi: typings.ethers.typesAbiMod.Interface) = this()
  def this(target: String, abi: InterfaceAbi, runner: ContractRunner) = this()
  def this(target: String, abi: typings.ethers.typesAbiMod.Interface, runner: ContractRunner) = this()
  def this(target: Addressable, abi: InterfaceAbi, runner: ContractRunner) = this()
  def this(target: Addressable, abi: typings.ethers.typesAbiMod.Interface, runner: ContractRunner) = this()
  def this(
    target: String,
    abi: InterfaceAbi,
    runner: Null,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: String,
    abi: InterfaceAbi,
    runner: Unit,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: String,
    abi: InterfaceAbi,
    runner: ContractRunner,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: String,
    abi: typings.ethers.typesAbiMod.Interface,
    runner: Null,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: String,
    abi: typings.ethers.typesAbiMod.Interface,
    runner: Unit,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: String,
    abi: typings.ethers.typesAbiMod.Interface,
    runner: ContractRunner,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: Addressable,
    abi: InterfaceAbi,
    runner: Null,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: Addressable,
    abi: InterfaceAbi,
    runner: Unit,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: Addressable,
    abi: InterfaceAbi,
    runner: ContractRunner,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: Addressable,
    abi: typings.ethers.typesAbiMod.Interface,
    runner: Null,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: Addressable,
    abi: typings.ethers.typesAbiMod.Interface,
    runner: Unit,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
  def this(
    target: Addressable,
    abi: typings.ethers.typesAbiMod.Interface,
    runner: ContractRunner,
    _deployTx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
}
/* static members */
object BaseContract {
  
  @JSImport("ethers", "ethers.BaseContract")
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildClass[T](abi: InterfaceAbi): Instantiable2[
    /* target */ String, 
    /* runner */ js.UndefOr[Null | ContractRunner], 
    typings.ethers.typesContractContractMod.BaseContract & (Omit[
      T, 
      /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | typings.ethers.ethersStrings.getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.ethers.ethersStrings.buildClass | from
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClass")(abi.asInstanceOf[js.Any]).asInstanceOf[Instantiable2[
    /* target */ String, 
    /* runner */ js.UndefOr[Null | ContractRunner], 
    typings.ethers.typesContractContractMod.BaseContract & (Omit[
      T, 
      /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | typings.ethers.ethersStrings.getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.ethers.ethersStrings.buildClass | from
    ])
  ]]
  
  inline def from[T](target: String, abi: InterfaceAbi): typings.ethers.typesContractContractMod.BaseContract & (Omit[
    T, 
    /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | typings.ethers.ethersStrings.getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], abi.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesContractContractMod.BaseContract & (Omit[
    T, 
    /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | typings.ethers.ethersStrings.getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
  ])]
  inline def from[T](target: String, abi: InterfaceAbi, runner: ContractRunner): typings.ethers.typesContractContractMod.BaseContract & (Omit[
    T, 
    /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | typings.ethers.ethersStrings.getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
  ]) = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], abi.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesContractContractMod.BaseContract & (Omit[
    T, 
    /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | typings.ethers.ethersStrings.getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.ethers.ethersStrings.from
  ])]
}
