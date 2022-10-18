package typings.ethers.mod

import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "Contract")
@js.native
open class Contract protected ()
  extends typings.ethersprojectContracts.mod.Contract {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(
    addressOrName: String,
    contractInterface: ContractInterface,
    signerOrProvider: typings.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
