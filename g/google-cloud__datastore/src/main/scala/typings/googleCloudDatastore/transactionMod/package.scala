package typings.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transactionMod {
  type RollbackCallback = js.Function2[/* err */ typings.std.Error, /* rollbackResponse */ js.Object, scala.Unit]
  type RollbackResult = js.Array[js.Object]
  type TransactionCallback = js.Function3[
    /* err */ typings.std.Error, 
    /* tx */ typings.googleCloudDatastore.transactionMod.DatastoreTransaction, 
    /* beginTxResponse */ typings.googleCloudDatastore.transactionMod.BeginTransactionResponse, 
    scala.Unit
  ]
  type TransactionResult = js.Tuple2[
    typings.googleCloudDatastore.transactionMod.DatastoreTransaction, 
    typings.googleCloudDatastore.transactionMod.BeginTransactionResponse
  ]
}
