package typings.ethers.mod

import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectContracts.anon.From
import typings.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "BaseContract")
@js.native
open class BaseContract protected ()
  extends typings.ethersprojectContracts.mod.BaseContract {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(
    addressOrName: String,
    contractInterface: ContractInterface,
    signerOrProvider: typings.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
object BaseContract {
  
  @JSImport("ethers", "BaseContract")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContractAddress(transaction: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterface(contractInterface: ContractInterface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(contractInterface.asInstanceOf[js.Any]).asInstanceOf[Interface]
  
  inline def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean]
}
