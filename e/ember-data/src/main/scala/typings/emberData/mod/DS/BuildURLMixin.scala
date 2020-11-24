package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def buildURL[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    modelName: js.UndefOr[K],
    id: js.UndefOr[String | js.Array[_] | js.Object | Null],
    snapshot: js.UndefOr[Snapshot[K] | js.Array[_] | Null],
    requestType: js.UndefOr[String],
    query: js.UndefOr[js.Object]
  ): String = js.native
  
  /**
    * Determines the pathname for a given type.
    */
  def pathForType[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): String = js.native
  
  /**
    * Builds a URL for a `record.save()` call when the record was created
    * locally using `store.createRecord()`.
    */
  def urlForCreateRecord[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K, snapshot: Snapshot[K]): String = js.native
  
  /**
    * Builds a URL for a `record.save()` call when the record has been deleted locally.
    */
  def urlForDeleteRecord[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  
  /**
    * Builds a URL for a `store.findAll(type)` call.
    */
  def urlForFindAll[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K, snapshot: SnapshotRecordArray[K]): String = js.native
  
  /**
    * Builds a URL for fetching a async belongsTo relationship when a url
    * is not provided by the server.
    */
  def urlForFindBelongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  
  /**
    * Builds a URL for fetching a async hasMany relationship when a url
    * is not provided by the server.
    */
  def urlForFindHasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  
  /**
    * Builds a URL for coalesceing multiple `store.findRecord(type, id)`
    * records into 1 request when the adapter's `coalesceFindRequests`
    * property is true.
    */
  def urlForFindMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](ids: js.Array[_], modelName: K, snapshots: js.Array[_]): String = js.native
  
  /**
    * Builds a URL for a `store.findRecord(type, id)` call.
    */
  def urlForFindRecord[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  
  /**
    * Builds a URL for a `store.query(type, query)` call.
    */
  def urlForQuery[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](query: js.Object, modelName: K): String = js.native
  
  /**
    * Builds a URL for a `store.queryRecord(type, query)` call.
    */
  def urlForQueryRecord[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](query: js.Object, modelName: K): String = js.native
  
  /**
    * Builds a URL for a `record.save()` call when the record has been update locally.
    */
  def urlForUpdateRecord[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
}
