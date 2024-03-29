package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "ContractTransactionResponse")
@js.native
open class ContractTransactionResponse protected ()
  extends typings.ethers.typesContractMod.ContractTransactionResponse {
  def this(
    iface: typings.ethers.typesAbiMod.Interface,
    provider: Provider,
    tx: typings.ethers.typesProvidersProviderMod.TransactionResponse
  ) = this()
}
