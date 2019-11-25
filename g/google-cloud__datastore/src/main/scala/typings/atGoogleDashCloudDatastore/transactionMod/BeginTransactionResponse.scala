package typings.atGoogleDashCloudDatastore.transactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionResponse extends js.Object {
  var transaction: String
}

object BeginTransactionResponse {
  @scala.inline
  def apply(transaction: String): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal(transaction = transaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeginTransactionResponse]
  }
}

