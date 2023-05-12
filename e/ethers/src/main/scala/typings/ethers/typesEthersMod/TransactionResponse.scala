package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "TransactionResponse")
@js.native
open class TransactionResponse protected ()
  extends typings.ethers.typesProvidersMod.TransactionResponse {
  /**
    *  Create a new TransactionResponse with %%tx%% parameters
    *  connected to %%provider%%.
    */
  def this(tx: TransactionResponseParams, provider: Provider) = this()
}
