package typings
package atGoogleDashCloudDatastoreLib.transactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionResponse extends js.Object {
  var transaction: java.lang.String
}

object BeginTransactionResponse {
  @scala.inline
  def apply(transaction: java.lang.String): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal(transaction = transaction)
  
    __obj.asInstanceOf[BeginTransactionResponse]
  }
}

