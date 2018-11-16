package typings
package atGoogleDashCloudDatastoreLib.transactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore/transaction", "DatastoreTransaction")
@js.native
class DatastoreTransaction protected ()
  extends atGoogleDashCloudDatastoreLib.requestMod.DatastoreRequest {
  def this(datastore: atGoogleDashCloudDatastoreLib.datastoreMod.namespaced) = this()
  def commit(): stdLib.Promise[atGoogleDashCloudDatastoreLib.requestMod.CommitResult] = js.native
  def commit(callback: atGoogleDashCloudDatastoreLib.requestMod.CommitCallback): scala.Unit = js.native
  def createQuery(kind: java.lang.String): atGoogleDashCloudDatastoreLib.queryMod.Query = js.native
  // tslint:disable-next-line unified-signatures (Arg is semantically different)
  def createQuery(namespace: java.lang.String, kind: java.lang.String): atGoogleDashCloudDatastoreLib.queryMod.Query = js.native
  def rollback(): stdLib.Promise[RollbackResult] = js.native
  def rollback(callback: RollbackCallback): scala.Unit = js.native
  def run(): stdLib.Promise[TransactionResult] = js.native
  def run(callback: TransactionCallback): scala.Unit = js.native
}

