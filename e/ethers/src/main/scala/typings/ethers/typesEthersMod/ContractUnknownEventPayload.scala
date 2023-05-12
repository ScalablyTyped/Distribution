package typings.ethers.typesEthersMod

import typings.ethers.typesContractTypesMod.ContractEventName
import typings.ethers.typesUtilsEventsMod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "ContractUnknownEventPayload")
@js.native
open class ContractUnknownEventPayload protected ()
  extends typings.ethers.typesContractMod.ContractUnknownEventPayload {
  def this(
    contract: typings.ethers.typesContractContractMod.BaseContract,
    listener: Null,
    filter: ContractEventName,
    log: typings.ethers.typesProvidersProviderMod.Log
  ) = this()
  def this(
    contract: typings.ethers.typesContractContractMod.BaseContract,
    listener: Listener,
    filter: ContractEventName,
    log: typings.ethers.typesProvidersProviderMod.Log
  ) = this()
}
