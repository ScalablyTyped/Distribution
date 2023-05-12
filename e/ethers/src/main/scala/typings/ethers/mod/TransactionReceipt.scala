package typings.ethers.mod

import typings.ethers.typesProvidersFormattingMod.TransactionReceiptParams
import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "TransactionReceipt")
@js.native
open class TransactionReceipt protected ()
  extends typings.ethers.typesEthersMod.TransactionReceipt {
  def this(tx: TransactionReceiptParams, provider: Provider) = this()
}
