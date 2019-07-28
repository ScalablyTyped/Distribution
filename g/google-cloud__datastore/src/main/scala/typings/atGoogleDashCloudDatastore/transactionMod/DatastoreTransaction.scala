package typings.atGoogleDashCloudDatastore.transactionMod

import typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreMod.^
import typings.atGoogleDashCloudDatastore.queryMod.Query
import typings.atGoogleDashCloudDatastore.requestMod.CommitCallback
import typings.atGoogleDashCloudDatastore.requestMod.CommitResult
import typings.atGoogleDashCloudDatastore.requestMod.DatastoreRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore/transaction", "DatastoreTransaction")
@js.native
class DatastoreTransaction protected () extends DatastoreRequest {
  def this(datastore: ^) = this()
  def commit(): js.Promise[CommitResult] = js.native
  def commit(callback: CommitCallback): Unit = js.native
  def createQuery(kind: String): Query = js.native
  // tslint:disable-next-line unified-signatures (Arg is semantically different)
  def createQuery(namespace: String, kind: String): Query = js.native
  def rollback(): js.Promise[RollbackResult] = js.native
  def rollback(callback: RollbackCallback): Unit = js.native
  def run(): js.Promise[TransactionResult] = js.native
  def run(callback: TransactionCallback): Unit = js.native
}

