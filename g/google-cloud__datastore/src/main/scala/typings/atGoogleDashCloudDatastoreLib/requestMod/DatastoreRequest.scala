package typings
package atGoogleDashCloudDatastoreLib.requestMod

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
  def allocateIds(incompleteKey: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey, n: scala.Double): js.Promise[AllocateIdsResult] = js.native
  def allocateIds(
    incompleteKey: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey,
    n: scala.Double,
    callback: AllocateIdsCallback
  ): scala.Unit = js.native
  def createReadStream(
    keys: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey,
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def createReadStream(
    keys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey],
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def delete(keyOrKeys: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey): js.Promise[CommitResult] | scala.Unit = js.native
  def delete(keyOrKeys: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey, callback: CommitCallback): scala.Unit = js.native
  def delete(keyOrKeys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey]): js.Promise[CommitResult] | scala.Unit = js.native
  def delete(
    keyOrKeys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey],
    callback: CommitCallback
  ): scala.Unit = js.native
  def get(key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey): js.Promise[js.Array[js.UndefOr[js.Object]]] = js.native
  def get(key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey, callback: GetCallback[js.Object]): scala.Unit = js.native
  def get(
    key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey,
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions
  ): js.Promise[js.Array[js.UndefOr[js.Object]]] = js.native
  def get(
    key: atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey,
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions,
    callback: GetCallback[js.Object]
  ): scala.Unit = js.native
  def get(keys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey]): js.Promise[js.Array[js.Array[js.Object]]] = js.native
  def get(
    keys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey],
    callback: GetCallback[js.Array[js.Object]]
  ): scala.Unit = js.native
  def get(
    keys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey],
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions
  ): js.Promise[js.Array[js.Array[js.Object]]] = js.native
  def get(
    keys: js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey],
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions,
    callback: GetCallback[js.Array[js.Object]]
  ): scala.Unit = js.native
  def insert(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
  def insert(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object], callback: CommitCallback): scala.Unit = js.native
  def runQuery(query: atGoogleDashCloudDatastoreLib.queryMod.Query): js.Promise[atGoogleDashCloudDatastoreLib.queryMod.QueryResult] = js.native
  def runQuery(
    query: atGoogleDashCloudDatastoreLib.queryMod.Query,
    callback: atGoogleDashCloudDatastoreLib.queryMod.QueryCallback
  ): scala.Unit = js.native
  def runQuery(
    query: atGoogleDashCloudDatastoreLib.queryMod.Query,
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions
  ): js.Promise[atGoogleDashCloudDatastoreLib.queryMod.QueryResult] = js.native
  def runQuery(
    query: atGoogleDashCloudDatastoreLib.queryMod.Query,
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions,
    callback: atGoogleDashCloudDatastoreLib.queryMod.QueryCallback
  ): scala.Unit = js.native
  def runQueryStream(query: atGoogleDashCloudDatastoreLib.queryMod.Query): nodeLib.NodeJSNs.ReadableStream = js.native
  def runQueryStream(
    query: atGoogleDashCloudDatastoreLib.queryMod.Query,
    options: atGoogleDashCloudDatastoreLib.queryMod.QueryOptions
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def save(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object]): js.Promise[CommitResult] | scala.Unit = js.native
  def save(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object], callback: CommitCallback): scala.Unit = js.native
  def update(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
  def update(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object], callback: CommitCallback): scala.Unit = js.native
  def upsert(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
  def upsert(entities: atGoogleDashCloudDatastoreLib.entityMod.OneOrMany[js.Object], callback: CommitCallback): scala.Unit = js.native
}

