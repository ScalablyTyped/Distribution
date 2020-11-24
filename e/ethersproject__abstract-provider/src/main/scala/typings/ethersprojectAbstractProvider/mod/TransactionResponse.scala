package typings.ethersprojectAbstractProvider.mod

import typings.ethersprojectTransactions.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResponse extends Transaction {
  
  var blockHash: js.UndefOr[String] = js.native
  
  var blockNumber: js.UndefOr[Double] = js.native
  
  var confirmations: Double = js.native
  
  @JSName("from")
  var from_TransactionResponse: String = js.native
  
  @JSName("hash")
  var hash_TransactionResponse: String = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  def wait(confirmations: Double): js.Promise[TransactionReceipt] = js.native
}
