package typings.ethers.mod.ethers

import typings.ethers.typesContractTypesMod.ContractEventName
import typings.ethers.typesUtilsEventsMod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.ContractEventPayload")
@js.native
open class ContractEventPayload protected ()
  extends typings.ethers.typesEthersMod.ContractEventPayload {
  def this(
    contract: typings.ethers.typesContractContractMod.BaseContract,
    listener: Null,
    filter: ContractEventName,
    fragment: typings.ethers.typesAbiMod.EventFragment,
    _log: typings.ethers.typesProvidersProviderMod.Log
  ) = this()
  def this(
    contract: typings.ethers.typesContractContractMod.BaseContract,
    listener: Listener,
    filter: ContractEventName,
    fragment: typings.ethers.typesAbiMod.EventFragment,
    _log: typings.ethers.typesProvidersProviderMod.Log
  ) = this()
}
