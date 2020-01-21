package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WARNING: This interface is likely to change in order to accomodate https://github.com/emberjs/rfcs/pull/4
  * ## Using BuildURLMixin
  * To use url building, include the mixin when extending an adapter, and call `buildURL` where needed.
  * The default behaviour is designed for RESTAdapter.
  * ### Example
  * ```javascript
  * export default DS.Adapter.extend(BuildURLMixin, {
  * findRecord: function(store, type, id, snapshot) {
  * var url = this.buildURL(type.modelName, id, snapshot, 'findRecord');
  * return this.ajax(url, 'GET');
  * }
  * });
  * ```
  * ### Attributes
  * The `host` and `namespace` attributes will be used if defined, and are optional.
  */
@JSImport("ember-data", "DS.BuildURLMixin")
@js.native
class BuildURLMixin () extends js.Object {
  /**
    * Builds a URL for a given type and optional ID.
    */
  def buildURL[K /* <: String */](): String = js.native
  def buildURL[K /* <: String */](modelName: K): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: js.Array[_]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: js.Array[_], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: js.Array[_], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: Null, requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: Null, requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: Snapshot[K]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: Snapshot[K], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: String, snapshot: Snapshot[K], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: js.Array[_]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: js.Array[_], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: js.Array[_], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: Null, requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: Null, requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: Snapshot[K]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: Snapshot[K], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Array[_], snapshot: Snapshot[K], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: js.Array[_]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: js.Array[_], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: js.Array[_], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: Null, requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: Null, requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: Snapshot[K]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: Snapshot[K], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: js.Object, snapshot: Snapshot[K], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: js.Array[_]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: js.Array[_], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: js.Array[_], requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: Null, requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: Null, requestType: String, query: js.Object): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: Snapshot[K]): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: Snapshot[K], requestType: String): String = js.native
  def buildURL[K /* <: String */](modelName: K, id: Null, snapshot: Snapshot[K], requestType: String, query: js.Object): String = js.native
  /**
    * Determines the pathname for a given type.
    */
  def pathForType[K /* <: String */](modelName: K): String = js.native
  /**
    * Builds a URL for a `record.save()` call when the record was created
    * locally using `store.createRecord()`.
    */
  def urlForCreateRecord[K /* <: String */](modelName: K, snapshot: Snapshot[K]): String = js.native
  /**
    * Builds a URL for a `record.save()` call when the record has been deleted locally.
    */
  def urlForDeleteRecord[K /* <: String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  /**
    * Builds a URL for a `store.findAll(type)` call.
    */
  def urlForFindAll[K /* <: String */](modelName: K, snapshot: SnapshotRecordArray[K]): String = js.native
  /**
    * Builds a URL for fetching a async belongsTo relationship when a url
    * is not provided by the server.
    */
  def urlForFindBelongsTo[K /* <: String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  /**
    * Builds a URL for fetching a async hasMany relationship when a url
    * is not provided by the server.
    */
  def urlForFindHasMany[K /* <: String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  /**
    * Builds a URL for coalesceing multiple `store.findRecord(type, id)`
    * records into 1 request when the adapter's `coalesceFindRequests`
    * property is true.
    */
  def urlForFindMany[K /* <: String */](ids: js.Array[_], modelName: K, snapshots: js.Array[_]): String = js.native
  /**
    * Builds a URL for a `store.findRecord(type, id)` call.
    */
  def urlForFindRecord[K /* <: String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  /**
    * Builds a URL for a `store.query(type, query)` call.
    */
  def urlForQuery[K /* <: String */](query: js.Object, modelName: K): String = js.native
  /**
    * Builds a URL for a `store.queryRecord(type, query)` call.
    */
  def urlForQueryRecord[K /* <: String */](query: js.Object, modelName: K): String = js.native
  /**
    * Builds a URL for a `record.save()` call when the record has been update locally.
    */
  def urlForUpdateRecord[K /* <: String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
}

