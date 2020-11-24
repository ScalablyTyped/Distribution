package typings.ethersprojectContracts.mod

import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectContracts.anon.Nonce
import typings.ethersprojectContracts.anon.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/contracts", "ContractFactory")
@js.native
class ContractFactory protected () extends js.Object {
  def this(contractInterface: ContractInterface, bytecode: BytesLike) = this()
  def this(contractInterface: ContractInterface, bytecode: Object) = this()
  def this(contractInterface: ContractInterface, bytecode: BytesLike, signer: Signer) = this()
  def this(contractInterface: ContractInterface, bytecode: Object, signer: Signer) = this()
  
  def attach(address: String): Contract = js.native
  
  val bytecode: String = js.native
  
  def connect(signer: Signer): ContractFactory = js.native
  
  def deploy(args: js.Any*): js.Promise[Contract] = js.native
  
  def getDeployTransaction(args: js.Any*): TransactionRequest = js.native
  
  val interface: Interface = js.native
  
  val signer: Signer = js.native
}
/* static members */
@JSImport("@ethersproject/contracts", "ContractFactory")
@js.native
object ContractFactory extends js.Object {
  
  def fromSolidity(compilerOutput: js.Any): ContractFactory = js.native
  def fromSolidity(compilerOutput: js.Any, signer: Signer): ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): Contract = js.native
  def getContract(address: String, contractInterface: ContractInterface, signer: Signer): Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
