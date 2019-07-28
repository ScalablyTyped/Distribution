package typings.atGoogleDashCloudDatastore.requestMod

import typings.atGoogleDashCloudDatastore.entityMod.DatastoreKey
import typings.atGoogleDashCloudDatastore.entityMod.OneOrMany
import typings.atGoogleDashCloudDatastore.queryMod.Query
import typings.atGoogleDashCloudDatastore.queryMod.QueryCallback
import typings.atGoogleDashCloudDatastore.queryMod.QueryOptions
import typings.atGoogleDashCloudDatastore.queryMod.QueryResult
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates requests to the Datastore endpoint.
  * Designed to be inherited by {@link Datastore} & {@link DatastoreTransaction}
  */
@JSImport("@google-cloud/datastore/request", "DatastoreRequest")
@js.native
abstract class DatastoreRequest () extends js.Object {
  def allocateIds(incompleteKey: DatastoreKey, n: Double): js.Promise[AllocateIdsResult] = js.native
  def allocateIds(incompleteKey: DatastoreKey, n: Double, callback: AllocateIdsCallback): Unit = js.native
  def createReadStream(keys: js.Array[DatastoreKey], options: QueryOptions): ReadableStream = js.native
  def createReadStream(keys: DatastoreKey, options: QueryOptions): ReadableStream = js.native
  def delete(keyOrKeys: js.Array[DatastoreKey]): js.Promise[CommitResult] | Unit = js.native
  def delete(keyOrKeys: js.Array[DatastoreKey], callback: CommitCallback): Unit = js.native
  def delete(keyOrKeys: DatastoreKey): js.Promise[CommitResult] | Unit = js.native
  def delete(keyOrKeys: DatastoreKey, callback: CommitCallback): Unit = js.native
  def get(keys: js.Array[DatastoreKey]): js.Promise[js.Array[js.Array[js.Object]]] = js.native
  def get(keys: js.Array[DatastoreKey], callback: GetCallback[js.Array[js.Object]]): Unit = js.native
  def get(keys: js.Array[DatastoreKey], options: QueryOptions): js.Promise[js.Array[js.Array[js.Object]]] = js.native
  def get(keys: js.Array[DatastoreKey], options: QueryOptions, callback: GetCallback[js.Array[js.Object]]): Unit = js.native
  def get(key: DatastoreKey): js.Promise[js.Array[js.UndefOr[js.Object]]] = js.native
  def get(key: DatastoreKey, callback: GetCallback[js.Object]): Unit = js.native
  def get(key: DatastoreKey, options: QueryOptions): js.Promise[js.Array[js.UndefOr[js.Object]]] = js.native
  def get(key: DatastoreKey, options: QueryOptions, callback: GetCallback[js.Object]): Unit = js.native
  def insert(entities: OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
  def insert(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
  def runQuery(query: Query): js.Promise[QueryResult] = js.native
  def runQuery(query: Query, callback: QueryCallback): Unit = js.native
  def runQuery(query: Query, options: QueryOptions): js.Promise[QueryResult] = js.native
  def runQuery(query: Query, options: QueryOptions, callback: QueryCallback): Unit = js.native
  def runQueryStream(query: Query): ReadableStream = js.native
  def runQueryStream(query: Query, options: QueryOptions): ReadableStream = js.native
  def save(entities: OneOrMany[js.Object]): js.Promise[CommitResult] | Unit = js.native
  def save(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
  def update(entities: OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
  def update(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
  def upsert(entities: OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
  def upsert(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
}

