package typings.ethers.mod.ethers

import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectContracts.anon.Nonce
import typings.ethersprojectContracts.anon.Object
import typings.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.ContractFactory")
@js.native
open class ContractFactory protected ()
  extends typings.ethers.libEthersMod.ContractFactory {
  def this(contractInterface: ContractInterface, bytecode: BytesLike) = this()
  def this(contractInterface: ContractInterface, bytecode: Object) = this()
  def this(
    contractInterface: ContractInterface,
    bytecode: BytesLike,
    signer: typings.ethersprojectAbstractSigner.mod.Signer
  ) = this()
  def this(
    contractInterface: ContractInterface,
    bytecode: Object,
    signer: typings.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
object ContractFactory {
  
  @JSImport("ethers", "ethers.ContractFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSolidity(compilerOutput: Any): typings.ethersprojectContracts.mod.ContractFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(compilerOutput.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectContracts.mod.ContractFactory]
  inline def fromSolidity(compilerOutput: Any, signer: typings.ethersprojectAbstractSigner.mod.Signer): typings.ethersprojectContracts.mod.ContractFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(compilerOutput.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectContracts.mod.ContractFactory]
  
  inline def getContract(address: String, contractInterface: ContractInterface): typings.ethersprojectContracts.mod.Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getContract")(address.asInstanceOf[js.Any], contractInterface.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectContracts.mod.Contract]
  inline def getContract(
    address: String,
    contractInterface: ContractInterface,
    signer: typings.ethersprojectAbstractSigner.mod.Signer
  ): typings.ethersprojectContracts.mod.Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getContract")(address.asInstanceOf[js.Any], contractInterface.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectContracts.mod.Contract]
  
  inline def getContractAddress(tx: Nonce): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(tx.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterface(contractInterface: ContractInterface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(contractInterface.asInstanceOf[js.Any]).asInstanceOf[Interface]
}
