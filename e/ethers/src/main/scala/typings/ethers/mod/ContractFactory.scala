package typings.ethers.mod

import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectContracts.anon.Nonce
import typings.ethersprojectContracts.anon.Object
import typings.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ContractFactory")
@js.native
class ContractFactory protected ()
  extends typings.ethersprojectContracts.mod.ContractFactory {
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
@JSImport("ethers", "ContractFactory")
@js.native
object ContractFactory extends js.Object {
  
  def fromSolidity(compilerOutput: js.Any): typings.ethersprojectContracts.mod.ContractFactory = js.native
  def fromSolidity(compilerOutput: js.Any, signer: typings.ethersprojectAbstractSigner.mod.Signer): typings.ethersprojectContracts.mod.ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): typings.ethersprojectContracts.mod.Contract = js.native
  def getContract(
    address: String,
    contractInterface: ContractInterface,
    signer: typings.ethersprojectAbstractSigner.mod.Signer
  ): typings.ethersprojectContracts.mod.Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
