package typings.ethers.typesEthersMod

import typings.ethers.anon.Object
import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "ContractFactory")
@js.native
open class ContractFactory[A /* <: js.Array[Any] */, I] protected ()
  extends typings.ethers.typesContractMod.ContractFactory[A, I] {
  def this(abi: InterfaceAbi, bytecode: Object) = this()
  def this(abi: InterfaceAbi, bytecode: BytesLike) = this()
  def this(abi: typings.ethers.typesAbiMod.Interface, bytecode: Object) = this()
  def this(abi: typings.ethers.typesAbiMod.Interface, bytecode: BytesLike) = this()
  def this(abi: InterfaceAbi, bytecode: Object, runner: ContractRunner) = this()
  def this(abi: InterfaceAbi, bytecode: BytesLike, runner: ContractRunner) = this()
  def this(abi: typings.ethers.typesAbiMod.Interface, bytecode: Object, runner: ContractRunner) = this()
  def this(abi: typings.ethers.typesAbiMod.Interface, bytecode: BytesLike, runner: ContractRunner) = this()
}
/* static members */
object ContractFactory {
  
  @JSImport("ethers/types/ethers", "ContractFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSolidity[A /* <: js.Array[Any] */, I](output: Any): typings.ethers.typesContractFactoryMod.ContractFactory[A, I] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(output.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesContractFactoryMod.ContractFactory[A, I]]
  inline def fromSolidity[A /* <: js.Array[Any] */, I](output: Any, runner: ContractRunner): typings.ethers.typesContractFactoryMod.ContractFactory[A, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(output.asInstanceOf[js.Any], runner.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesContractFactoryMod.ContractFactory[A, I]]
}
