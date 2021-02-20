package typings.emberData.mod.DS

import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Instead of declaring `namespace`, `host`, and `headers` as a property we now declare it in an
// interface. This works around the issue noted here with TypeScript 4:
// https://github.com/microsoft/TypeScript/issues/40220
/**
  * The REST adapter allows your store to communicate with an HTTP server by
  * transmitting JSON via XHR. Most Ember.js apps that consume a JSON API
  * should use the REST adapter.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.emberData.mod.DS.BuildURLMixin because Inheritance from two classes. Inlined buildURL, urlForFindRecord, urlForFindAll, urlForQuery, urlForQueryRecord, urlForFindMany, urlForFindHasMany, urlForFindBelongsTo, urlForCreateRecord, urlForUpdateRecord, urlForDeleteRecord, pathForType */ @JSImport("ember-data", "DS.RESTAdapter")
@js.native
class RESTAdapter () extends Adapter {
  
  /**
    * Takes a URL, an HTTP method and a hash of data, and makes an HTTP request.
    */
  def ajax(url: String, `type`: String): Promise[_] = js.native
  def ajax(url: String, `type`: String, options: js.Object): Promise[_] = js.native
  
  /**
    * Generate ajax options
    */
  def ajaxOptions(url: String, `type`: String): js.Object = js.native
  def ajaxOptions(url: String, `type`: String, options: js.Object): js.Object = js.native
  
  /**
    * Builds a URL for a given type and optional ID.
    */
  def buildURL[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    modelName: js.UndefOr[K],
    id: js.UndefOr[js.Array[_] | Null | js.Object | String],
    snapshot: js.UndefOr[js.Array[_] | Null | Snapshot[K]],
    requestType: js.UndefOr[String],
    query: js.UndefOr[js.Object]
  ): String = js.native
  
  /**
    * Get the data (body or query params) for a request.
    */
  def dataForRequest(params: js.Object): js.Object = js.native
  
  /**
    * Called by the store in order to fetch the JSON for the unloaded record in a
    * belongs-to relationship that was originally specified as a URL (inside of
    * `links`).
    */
  def findBelongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](store: Store, snapshot: Snapshot[K], url: String): Promise[_] = js.native
  
  /**
    * Called by the store in order to fetch a JSON array for
    * the unloaded records in a has-many relationship that were originally
    * specified as a URL (inside of `links`).
    */
  def findHasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](store: Store, snapshot: Snapshot[K], url: String, relationship: js.Object): Promise[_] = js.native
  
  /**
    * Takes an ajax response, and returns the json payload or an error.
    */
  def handleResponse(status: Double, headers: js.Object, payload: js.Object, requestData: js.Object): js.Object = js.native
  
  /**
    * Get the headers for a request.
    */
  def headersForRequest(params: js.Object): js.Object = js.native
  
  /**
    * An adapter can target other hosts by setting the `host` property.
    */
  var host: String = js.native
  
  /**
    * Default `handleResponse` implementation uses this hook to decide if the
    * response is an invalid error.
    */
  def isInvalid(status: Double, headers: js.Object, payload: js.Object): Boolean = js.native
  
  /**
    * Default `handleResponse` implementation uses this hook to decide if the
    * response is a success.
    */
  def isSuccess(status: Double, headers: js.Object, payload: js.Object): Boolean = js.native
  
  /**
    * Get the HTTP method for a request.
    */
  def methodForRequest(params: js.Object): String = js.native
  
  /**
    * Endpoint paths can be prefixed with a `namespace` by setting the namespace
    * property on the adapter:
    */
  var namespace: String = js.native
  
  /**
    * Determines the pathname for a given type.
    */
  def pathForType[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): String = js.native
  
  /**
    * Called by the store in order to fetch a JSON array for
    * the records that match a particular query.
    */
  def query[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    store: Store,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
    query: js.Object
  ): Promise[_] = js.native
  
  /**
    * By default, the RESTAdapter will send the query params sorted alphabetically to the
    * server.
    */
  def sortQueryParams(obj: js.Object): js.Object = js.native
  
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
    * Get the URL for a request.
    */
  def urlForRequest(params: js.Object): String = js.native
  
  /**
    * Builds a URL for a `record.save()` call when the record has been update locally.
    */
  def urlForUpdateRecord[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
}
