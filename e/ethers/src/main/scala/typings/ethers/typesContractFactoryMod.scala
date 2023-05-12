package typings.ethers

import typings.ethers.anon.DeploymentTransaction
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
import typings.ethers.ethersStrings.listenerCount
import typings.ethers.ethersStrings.listeners
import typings.ethers.ethersStrings.off
import typings.ethers.ethersStrings.on
import typings.ethers.ethersStrings.once
import typings.ethers.ethersStrings.queryFilter
import typings.ethers.ethersStrings.queryTransaction
import typings.ethers.ethersStrings.removeAllListeners
import typings.ethers.ethersStrings.removeListener
import typings.ethers.ethersStrings.target
import typings.ethers.ethersStrings.waitForDeployment
import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesContractContractMod.BaseContract
import typings.ethers.typesContractTypesMod.ContractDeployTransaction
import typings.ethers.typesContractTypesMod.ContractMethodArgs
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContractFactoryMod {
  
  @JSImport("ethers/types/contract/factory", "ContractFactory")
  @js.native
  open class ContractFactory[A /* <: js.Array[Any] */, I] protected () extends StObject {
    def this(abi: InterfaceAbi, bytecode: Object) = this()
    def this(abi: InterfaceAbi, bytecode: BytesLike) = this()
    def this(abi: Interface, bytecode: Object) = this()
    def this(abi: Interface, bytecode: BytesLike) = this()
    def this(abi: InterfaceAbi, bytecode: Object, runner: ContractRunner) = this()
    def this(abi: InterfaceAbi, bytecode: BytesLike, runner: ContractRunner) = this()
    def this(abi: Interface, bytecode: Object, runner: ContractRunner) = this()
    def this(abi: Interface, bytecode: BytesLike, runner: ContractRunner) = this()
    
    val bytecode: String = js.native
    
    def connect(): ContractFactory[A, I] = js.native
    def connect(runner: ContractRunner): ContractFactory[A, I] = js.native
    
    def deploy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[
        BaseContract & DeploymentTransaction & (Omit[
          I, 
          /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | typings.ethers.ethersStrings.interface | typings.ethers.ethersStrings.runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | from
        ])
      ] = js.native
    
    def getDeployTransaction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ContractMethodArgs<A> is not an array type */ args: ContractMethodArgs[A]
    ): js.Promise[ContractDeployTransaction] = js.native
    
    val interface: Interface = js.native
    
    val runner: Null | ContractRunner = js.native
  }
  /* static members */
  object ContractFactory {
    
    @JSImport("ethers/types/contract/factory", "ContractFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSolidity[A /* <: js.Array[Any] */, I](output: Any): ContractFactory[A, I] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(output.asInstanceOf[js.Any]).asInstanceOf[ContractFactory[A, I]]
    inline def fromSolidity[A /* <: js.Array[Any] */, I](output: Any, runner: ContractRunner): ContractFactory[A, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(output.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[ContractFactory[A, I]]
  }
}
