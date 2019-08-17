package typings.atGoogleDashCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transactionMod {
  import typings.std.Error

  type RollbackCallback = js.Function2[/* err */ Error, /* rollbackResponse */ js.Object, Unit]
  type RollbackResult = js.Array[js.Object]
  type TransactionCallback = js.Function3[
    /* err */ Error, 
    /* tx */ DatastoreTransaction, 
    /* beginTxResponse */ BeginTransactionResponse, 
    Unit
  ]
  type TransactionResult = js.Tuple2[DatastoreTransaction, BeginTransactionResponse]
}
