package typings.ethers.mod.ethers

import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectContracts.anon.From
import typings.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.Contract")
@js.native
class Contract protected ()
  extends typings.ethers.ethersMod.Contract {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(
    addressOrName: String,
    contractInterface: ContractInterface,
    signerOrProvider: typings.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
@JSImport("ethers", "ethers.Contract")
@js.native
object Contract extends js.Object {
  
  def getContractAddress(transaction: From): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
  
  def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = js.native
}
