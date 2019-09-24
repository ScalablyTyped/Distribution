package typings.emberDashData.emberDashDataMod

import typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray
import typings.atEmberArray.mutableMod.MutableArray
import typings.atEmberObject.eventedMod.Evented
import typings.atEmberObject.proxyMod.default
import typings.ember.emberMod.EmberNs.Array
import typings.ember.emberMod.EmberNs.Enumerable
import typings.ember.emberMod.defaultNs.ArrayProxy
import typings.ember.emberMod.defaultNs.ComputedProperty
import typings.ember.emberMod.defaultNs.Map
import typings.ember.emberMod.defaultNs.Object
import typings.emberDashData.Anon_AdapterOptions
import typings.emberDashData.Anon_AdapterOptionsBackgroundReload
import typings.emberDashData.Anon_False
import typings.emberDashData.Anon_Id
import typings.emberDashData.Anon_Ids
import typings.emberDashData.Anon_IncludeId
import typings.emberDashData.ModelKeys
import typings.emberDashData.TypeofClassModel
import typings.emberDashData.emberDashDataMod.DSNs.Adapter
import typings.emberDashData.emberDashDataMod.DSNs.AdapterError
import typings.emberDashData.emberDashDataMod.DSNs.AdapterPopulatedRecordArray
import typings.emberDashData.emberDashDataMod.DSNs.Async
import typings.emberDashData.emberDashDataMod.DSNs.AttrOptions
import typings.emberDashData.emberDashDataMod.DSNs.BelongsToReference
import typings.emberDashData.emberDashDataMod.DSNs.Errors
import typings.emberDashData.emberDashDataMod.DSNs.HasManyReference
import typings.emberDashData.emberDashDataMod.DSNs.JSONSerializer
import typings.emberDashData.emberDashDataMod.DSNs.ManyArray
import typings.emberDashData.emberDashDataMod.DSNs.Model
import typings.emberDashData.emberDashDataMod.DSNs.PromiseArray
import typings.emberDashData.emberDashDataMod.DSNs.PromiseManyArray
import typings.emberDashData.emberDashDataMod.DSNs.PromiseObject
import typings.emberDashData.emberDashDataMod.DSNs.RESTAdapter
import typings.emberDashData.emberDashDataMod.DSNs.RecordArray
import typings.emberDashData.emberDashDataMod.DSNs.RecordReference
import typings.emberDashData.emberDashDataMod.DSNs.RelationshipOptions
import typings.emberDashData.emberDashDataMod.DSNs.Serializer
import typings.emberDashData.emberDashDataMod.DSNs.Snapshot
import typings.emberDashData.emberDashDataMod.DSNs.SnapshotRecordArray
import typings.emberDashData.emberDashDataMod.DSNs.Store
import typings.emberDashData.emberDashDataMod.DSNs.Sync
import typings.emberDashData.emberDashDataMod.DSNs.Transform
import typings.emberDashData.emberDashDataNumbers.`false`
import typings.emberDashData.emberDashDataNumbers.`true`
import typings.emberDashData.emberDashDataStrings.boolean
import typings.emberDashData.emberDashDataStrings.date
import typings.emberDashData.emberDashDataStrings.number
import typings.emberDashData.emberDashDataStrings.string
import typings.emberDashData.typesRegistriesModelMod.ModelRegistry
import typings.rsvp.rsvpMod.defaultNs.Promise
import typings.std.Date
import typings.std.InstanceType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "DS")
@js.native
object DSNs extends js.Object {
  /**
    * A `DS.AbortError` is used by an adapter to signal that a request to
    * the external API was aborted. For example, this can occur if the user
    * navigates away from the current page after a request to the external API
    * has been initiated but before a response has been received.
    */
  @js.native
  class AbortError () extends AdapterError
  
  /**
    * An adapter is an object that receives requests from a store and
    * translates them into the appropriate action to take against your
    * persistence layer. The persistence layer is usually an HTTP API, but
    * may be anything, such as the browser's local storage. Typically the
    * adapter is not invoked directly instead its functionality is accessed
    * through the `store`.
    */
  @js.native
  class Adapter () extends Object {
    /**
      * By default the store will try to coalesce all `fetchRecord` calls within the same runloop
      * into as few requests as possible by calling groupRecordsForFindMany and passing it into a findMany call.
      * You can opt out of this behaviour by either not implementing the findMany hook or by setting
      * coalesceFindRequests to false.
      */
    var coalesceFindRequests: Boolean = js.native
    /**
      * If you would like your adapter to use a custom serializer you can
      * set the `defaultSerializer` property to be the name of the custom
      * serializer.
      */
    var defaultSerializer: String = js.native
    /**
      * Implement this method in a subclass to handle the creation of
      * new records.
      */
    def createRecord[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      snapshot: Snapshot[K]
    ): Promise[_] = js.native
    /**
      * Implement this method in a subclass to handle the deletion of
      * a record.
      */
    def deleteRecord[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      snapshot: Snapshot[K]
    ): Promise[_] = js.native
    /**
      * The `findAll()` method is used to retrieve all records for a given type.
      */
    def findAll[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      sinceToken: String,
      snapshotRecordArray: SnapshotRecordArray[K]
    ): Promise[_] = js.native
    /**
      * The store will call `findMany` instead of multiple `findRecord`
      * requests to find multiple records at once if coalesceFindRequests
      * is true.
      */
    def findMany[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      ids: js.Array[_],
      snapshots: js.Array[_]
    ): Promise[_] = js.native
    /**
      * The `findRecord()` method is invoked when the store is asked for a record that
      * has not previously been loaded. In response to `findRecord()` being called, you
      * should query your persistence layer for a record with the given ID. The `findRecord`
      * method should return a promise that will resolve to a JavaScript object that will be
      * normalized by the serializer.
      */
    def findRecord[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      id: String,
      snapshot: Snapshot[K]
    ): Promise[_] = js.native
    /**
      * If the globally unique IDs for your records should be generated on the client,
      * implement the `generateIdForRecord()` method. This method will be invoked
      * each time you create a new record, and the value returned from it will be
      * assigned to the record's `primaryKey`.
      */
    def generateIdForRecord[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      inputProperties: js.Object
    ): String | Double = js.native
    /**
      * Organize records into groups, each of which is to be passed to separate
      * calls to `findMany`.
      */
    def groupRecordsForFindMany(store: Store, snapshots: js.Array[_]): js.Array[_] = js.native
    /**
      * This method is called when you call `query` on the store.
      */
    def query[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      query: js.Object,
      recordArray: AdapterPopulatedRecordArray[_]
    ): Promise[_] = js.native
    /**
      * The `queryRecord()` method is invoked when the store is asked for a single
      * record through a query object.
      */
    def queryRecord[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      query: js.Object
    ): Promise[_] = js.native
    /**
      * Proxies to the serializer's `serialize` method.
      */
    def serialize[K /* <: String */](snapshot: Snapshot[K], options: js.Object): js.Object = js.native
    /**
      * This method is used by the store to determine if the store should
      * reload a record array after the `store.findAll` method resolves
      * with a cached record array.
      */
    def shouldBackgroundReloadAll[K /* <: String */](store: Store, snapshotRecordArray: SnapshotRecordArray[K]): Boolean = js.native
    /**
      * This method is used by the store to determine if the store should
      * reload a record after the `store.findRecord` method resolves a
      * cached record.
      */
    def shouldBackgroundReloadRecord[K /* <: String */](store: Store, snapshot: Snapshot[K]): Boolean = js.native
    /**
      * This method is used by the store to determine if the store should
      * reload all records from the adapter when records are requested by
      * `store.findAll`.
      */
    def shouldReloadAll[K /* <: String */](store: Store, snapshotRecordArray: SnapshotRecordArray[K]): Boolean = js.native
    /**
      * This method is used by the store to determine if the store should
      * reload a record from the adapter when a record is requested by
      * `store.findRecord`.
      */
    def shouldReloadRecord[K /* <: String */](store: Store, snapshot: Snapshot[K]): Boolean = js.native
    /**
      * Implement this method in a subclass to handle the updating of
      * a record.
      */
    def updateRecord[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      snapshot: Snapshot[K]
    ): Promise[_] = js.native
  }
  
  /**
    * A `DS.AdapterError` is used by an adapter to signal that an error occurred
    * during a request to an external API. It indicates a generic error, and
    * subclasses are used to indicate specific error states. The following
    * subclasses are provided:
    */
  @js.native
  class AdapterError () extends Object
  
  /**
    * Represents an ordered list of records whose order and membership is
    * determined by the adapter. For example, a query sent to the adapter
    * may trigger a search on the server, whose results would be loaded
    * into an instance of the `AdapterPopulatedRecordArray`.
    */
  @js.native
  class AdapterPopulatedRecordArray[T] () extends RecordArray[T]
  
  trait Async extends js.Object {
    var async: js.UndefOr[`true`] = js.undefined
  }
  
  trait AttrOptions[T] extends js.Object {
    var allowNull: js.UndefOr[Boolean] = js.undefined
    var defaultValue: js.UndefOr[T | js.Function0[T]] = js.undefined
  }
  
  /**
    * A BelongsToReference is a low level API that allows users and
    * addon author to perform meta-operations on a belongs-to
    * relationship.
    */
  @js.native
  class BelongsToReference () extends js.Object {
    /**
      * The `id` of the record that this reference refers to. Together, the
      * `type()` and `id()` methods form a composite key for the identity
      * map. This can be used to access the id of an async relationship
      * without triggering a fetch that would normally happen if you
      * attempted to use `record.get('relationship.id')`.
      */
    def id(): String = js.native
    /**
      * The link Ember Data will use to fetch or reload this belongs-to
      * relationship.
      */
    def link(): String = js.native
    /**
      * Loads a record in a belongs to relationship if it is not already
      * loaded. If the relationship is already loaded this method does not
      * trigger a new load.
      */
    def load(): Promise[_] = js.native
    /**
      * The meta data for the belongs-to relationship.
      */
    def meta(): js.Object = js.native
    /**
      * `push` can be used to update the data in the relationship and Ember
      * Data will treat the new data as the conanical value of this
      * relationship on the backend.
      */
    def push(objectOrPromise: js.Object): Promise[_] = js.native
    def push(objectOrPromise: Promise[_]): Promise[_] = js.native
    /**
      * Triggers a reload of the value in this relationship. If the
      * remoteType is `"link"` Ember Data will use the relationship link to
      * reload the relationship. Otherwise it will reload the record by its
      * id.
      */
    def reload(): Promise[_] = js.native
    /**
      * This returns a string that represents how the reference will be
      * looked up when it is loaded. If the relationship has a link it will
      * use the "link" otherwise it defaults to "id".
      */
    def remoteType(): String = js.native
    /**
      * `value()` synchronously returns the current value of the belongs-to
      * relationship. Unlike `record.get('relationshipName')`, calling
      * `value()` on a reference does not trigger a fetch if the async
      * relationship is not yet loaded. If the relationship is not loaded
      * it will always return `null`.
      */
    def value(): Model | Null = js.native
  }
  
  /**
    * The `DS.BooleanTransform` class is used to serialize and deserialize
    * boolean attributes on Ember Data record objects. This transform is
    * used when `boolean` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class BooleanTransform () extends Transform
  
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
  
  /**
    * A `DS.ConflictError` equates to a HTTP `409 Conflict` response status.
    * It is used by an adapter to indicate that the request could not be processed
    * because of a conflict in the request. An example scenario would be when
    * creating a record with a client generated id but that id is already known
    * to the external API.
    */
  @js.native
  class ConflictError () extends AdapterError
  
  /**
    * The `DS.DateTransform` class is used to serialize and deserialize
    * date attributes on Ember Data record objects. This transform is used
    * when `date` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function. It uses the [`ISO 8601`](https://en.wikipedia.org/wiki/ISO_8601)
    * standard.
    */
  @js.native
  class DateTransform () extends Transform
  
  /**
    * ## Using Embedded Records
    */
  @js.native
  class EmbeddedRecordsMixin () extends js.Object {
    /**
      * Normalize the record and recursively normalize/extract all the embedded records
      * while pushing them into the store as they are encountered
      */
    def normalize(typeClass: Model, hash: js.Object, prop: String): js.Object = js.native
    /**
      * When serializing an embedded record, modify the property (in the json payload)
      * that refers to the parent record (foreign key for relationship).
      */
    def removeEmbeddedForeignKey[K /* <: String */](snapshot: Snapshot[K], embeddedSnapshot: Snapshot[K], relationship: js.Object, json: js.Object): js.Any = js.native
    /**
      * Serialize `belongsTo` relationship when it is configured as an embedded object.
      */
    def serializeBelongsTo[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
    /**
      * Serializes `hasMany` relationships when it is configured as embedded objects.
      */
    def serializeHasMany[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
  }
  
  /**
    * Holds validation errors for a given record, organized by attribute names.
    */
  @js.native
  class Errors ()
    extends Object
       with Enumerable[js.Any]
       with Evented {
    var isEmpty: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * Total number of errors.
      */
    var length: ComputedProperty[Double, Double] = js.native
    /**
      * An array containing all of the error messages for this
      * record. This is useful for displaying all errors to the user.
      */
    var messages: ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def add(attribute: String, messages: String): js.Any = js.native
    /**
      * DEPRECATED:
      * Adds error messages to a given attribute and sends
      * `becameInvalid` event to the record.
      */
    def add(attribute: String, messages: js.Array[_]): js.Any = js.native
    /**
      * Returns `true` if the passed function returns true for any item in the
      * enumeration.
      */
    /* InferMemberOverrides */
    override def any(callback: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Boolean]): Boolean = js.native
    /* InferMemberOverrides */
    override def any(
      callback: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Boolean],
      target: js.Object
    ): Boolean = js.native
    /**
      * DEPRECATED:
      * Removes all error messages and sends `becameValid` event
      * to the record.
      */
    def clear(): js.Any = js.native
    /**
      * Returns a copy of the array with all `null` and `undefined` elements removed.
      */
    /* InferMemberOverrides */
    override def compact(): NativeArray[js.Any] = js.native
    /**
      * @deprecated Use `Enumerable#includes` instead.
      */
    /* InferMemberOverrides */
    override def contains(obj: js.Any): Boolean = js.native
    /**
      * Returns errors for a given attribute
      */
    def errorsFor(attribute: String): js.Array[_] = js.native
    /**
      * Returns `true` if the passed function returns true for every item in the
      * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def every(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _]): Boolean = js.native
    /**
      * Returns `true` if the passed function returns true for every item in the
      * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def every(
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def filter(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _]): js.Array[js.Any] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def filter(
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _],
      thisArg: js.Any
    ): js.Array[js.Any] = js.native
    /**
      * Returns an array with just the items with the matched property. You
      * can pass an optional second argument with the target value. Otherwise
      * this will match any property that evaluates to `true`.
      */
    /* InferMemberOverrides */
    override def filterBy(key: String): NativeArray[js.Any] = js.native
    /* InferMemberOverrides */
    override def filterBy(key: String, value: js.Any): NativeArray[js.Any] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    /* InferMemberOverrides */
    @JSName("filter")
    override def filter_S_T[S /* <: js.Any */](
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], /* is S */ Boolean]
    ): js.Array[S] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    /* InferMemberOverrides */
    @JSName("filter")
    override def filter_S_T[S /* <: js.Any */](
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], /* is S */ Boolean],
      thisArg: js.Any
    ): js.Array[S] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    /* InferMemberOverrides */
    override def find(predicate: js.Function3[js.Any, /* index */ Double, /* obj */ js.Array[js.Any], _]): js.UndefOr[js.Any] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    /* InferMemberOverrides */
    override def find(
      predicate: js.Function3[js.Any, /* index */ Double, /* obj */ js.Array[js.Any], _],
      thisArg: js.Any
    ): js.UndefOr[js.Any] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    /* InferMemberOverrides */
    override def find[S /* <: js.Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          js.Any, 
          /* index */ Double, 
          /* obj */ js.Array[js.Any], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    /* InferMemberOverrides */
    override def find[S /* <: js.Any */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          js.Any, 
          /* index */ Double, 
          /* obj */ js.Array[js.Any], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
    /**
      * Returns the first item with a property matching the passed value. You
      * can pass an optional second argument with the target value. Otherwise
      * this will match any property that evaluates to `true`.
      */
    /* InferMemberOverrides */
    override def findBy(key: String): js.UndefOr[js.Any] = js.native
    /* InferMemberOverrides */
    override def findBy(key: String, value: js.Any): js.UndefOr[js.Any] = js.native
    /**
      * Iterates through the enumerable, calling the passed function on each
      * item. This method corresponds to the `forEach()` method defined in
      * JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def forEach(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit]): Unit = js.native
    /**
      * Iterates through the enumerable, calling the passed function on each
      * item. This method corresponds to the `forEach()` method defined in
      * JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def forEach(
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit],
      thisArg: js.Any
    ): Unit = js.native
    /**
      * Alias for `mapBy`
      */
    /* InferMemberOverrides */
    override def getEach(key: String): js.Array[_] = js.native
    /**
      * Returns `true` if the passed object can be found in the enumerable.
      */
    /* InferMemberOverrides */
    override def includes(searchElement: js.Any): Boolean = js.native
    /* InferMemberOverrides */
    override def includes(searchElement: js.Any, fromIndex: Double): Boolean = js.native
    /**
      * Invokes the named method on every object in the receiver that
      * implements it. This method corresponds to the implementation in
      * Prototype 1.6.
      */
    /* InferMemberOverrides */
    override def invoke(methodName: String, args: js.Any*): js.Array[_] = js.native
    /**
      * Returns `true` if the passed property resolves to the value of the second
      * argument for any item in the enumerable. This method is often simpler/faster
      * than using a callback.
      */
    /* InferMemberOverrides */
    override def isAny(key: String): Boolean = js.native
    /* InferMemberOverrides */
    override def isAny(key: String, value: js.Any): Boolean = js.native
    /**
      * Returns `true` if the passed property resolves to the value of the second
      * argument for all items in the enumerable. This method is often simpler/faster
      * than using a callback.
      */
    /* InferMemberOverrides */
    override def isEvery(key: String): Boolean = js.native
    /* InferMemberOverrides */
    override def isEvery(key: String, value: js.Any): Boolean = js.native
    /**
      * Maps all of the items in the enumeration to another value, returning
      * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def map[U](callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], U]): js.Array[U] = js.native
    /**
      * Maps all of the items in the enumeration to another value, returning
      * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
      */
    /* InferMemberOverrides */
    override def map[U](
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    /**
      * Similar to map, this specialized function returns the value of the named
      * property on all items in the enumeration.
      */
    /* InferMemberOverrides */
    override def mapBy(key: String): js.Array[_] = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    /* InferMemberOverrides */
    override def reduce(
      callbackfn: js.Function4[js.Any, js.Any, /* currentIndex */ Double, /* array */ js.Array[js.Any], js.Any]
    ): js.Any = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    /* InferMemberOverrides */
    override def reduce(
      callbackfn: js.Function4[js.Any, js.Any, /* currentIndex */ Double, /* array */ js.Array[js.Any], js.Any],
      initialValue: js.Any
    ): js.Any = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    /* InferMemberOverrides */
    @JSName("reduce")
    override def reduce_U_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[js.Any], 
          U
        ],
      initialValue: U
    ): U = js.native
    /**
      * DEPRECATED:
      * Register with target handler
      */
    def registerHandlers(target: js.Object, becameInvalid: js.Function, becameValid: js.Function): js.Any = js.native
    /**
      * Returns an array with all of the items in the enumeration where the passed
      * function returns false. This method is the inverse of filter().
      */
    /* InferMemberOverrides */
    override def reject(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _]): NativeArray[js.Any] = js.native
    /* InferMemberOverrides */
    override def reject(
      callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _],
      thisArg: js.Any
    ): NativeArray[js.Any] = js.native
    /**
      * Returns an array with the items that do not have truthy values for
      * key.  You can pass an optional second argument with the target value.  Otherwise
      * this will match any property that evaluates to false.
      */
    /* InferMemberOverrides */
    override def rejectBy(key: String): NativeArray[js.Any] = js.native
    /* InferMemberOverrides */
    override def rejectBy(key: String, value: js.Any): NativeArray[js.Any] = js.native
    /**
      * DEPRECATED:
      * Removes all error messages from the given attribute and sends
      * `becameValid` event to the record if there no more errors left.
      */
    def remove(attribute: String): js.Any = js.native
    /**
      * Sets the value on the named property for each member. This is more
      * ergonomic than using other methods defined on this helper. If the object
      * implements Ember.Observable, the value will be changed to `set(),` otherwise
      * it will be set directly. `null` objects are skipped.
      */
    /* InferMemberOverrides */
    override def setEach(key: String, value: js.Any): js.Any = js.native
    /**
      * Converts the enumerable into an array and sorts by the keys
      * specified in the argument.
      */
    /* InferMemberOverrides */
    override def sortBy(properties: String*): NativeArray[js.Any] = js.native
    /**
      * Simply converts the enumerable into a genuine array. The order is not
      * guaranteed. Corresponds to the method implemented by Prototype.
      */
    /* InferMemberOverrides */
    override def toArray(): js.Array[js.Any] = js.native
    /**
      * Returns a new enumerable that contains only unique values. The default
      * implementation returns an array regardless of the receiver type.
      */
    /* InferMemberOverrides */
    override def uniq(): NativeArray[js.Any] = js.native
    /**
      * Returns a new enumerable that contains only items containing a unique property value.
      * The default implementation returns an array regardless of the receiver type.
      */
    /* InferMemberOverrides */
    override def uniqBy(property: String): NativeArray[js.Any] = js.native
    /**
      * Returns a new enumerable that excludes the passed value. The default
      * implementation returns an array regardless of the receiver type.
      * If the receiver does not contain the value it returns the original enumerable.
      */
    /* InferMemberOverrides */
    override def without(value: js.Any): NativeArray[js.Any] = js.native
  }
  
  /**
    * Represents a list of records whose membership is determined by the
    * store. As records are created, loaded, or modified, the store
    * evaluates them to determine if they should be part of the record
    * array.
    */
  @js.native
  class FilteredRecordArray[T] () extends RecordArray[T] {
    /**
      * The filterFunction is a function used to test records from the store to
      * determine if they should be part of the record array.
      */
    def filterFunction(record: Model): Boolean = js.native
  }
  
  /**
    * A `DS.ForbiddenError` equates to a HTTP `403 Forbidden` response status.
    * It is used by an adapter to signal that a request to the external API was
    * valid but the server is refusing to respond to it. If authorization was
    * provided and is valid, then the authenticated user does not have the
    * necessary permissions for the request.
    */
  @js.native
  class ForbiddenError () extends AdapterError
  
  /**
    * A HasManyReference is a low level API that allows users and addon
    * author to perform meta-operations on a has-many relationship.
    */
  @js.native
  class HasManyReference[T] () extends js.Object {
    /**
      * `ids()` returns an array of the record ids in this relationship.
      */
    def ids(): js.Array[String] = js.native
    /**
      * The link Ember Data will use to fetch or reload this has-many
      * relationship.
      */
    def link(): String = js.native
    /**
      * Loads the relationship if it is not already loaded.  If the
      * relationship is already loaded this method does not trigger a new
      * load.
      */
    def load(): Promise[_] = js.native
    /**
      * The meta data for the has-many relationship.
      */
    def meta(): js.Object = js.native
    /**
      * `push` can be used to update the data in the relationship and Ember
      * Data will treat the new data as the canonical value of this
      * relationship on the backend.
      */
    def push(objectOrPromise: js.Array[T]): ManyArray[T] = js.native
    def push(objectOrPromise: Promise[js.Array[T]]): ManyArray[T] = js.native
    /**
      * Reloads this has-many relationship.
      */
    def reload(): Promise[_] = js.native
    /**
      * This returns a string that represents how the reference will be
      * looked up when it is loaded. If the relationship has a link it will
      * use the "link" otherwise it defaults to "id".
      */
    def remoteType(): String = js.native
    /**
      * `value()` synchronously returns the current value of the has-many
      * relationship. Unlike `record.get('relationshipName')`, calling
      * `value()` on a reference does not trigger a fetch if the async
      * relationship is not yet loaded. If the relationship is not loaded
      * it will always return `null`.
      */
    def value(): ManyArray[T] | Null = js.native
  }
  
  /**
    * A `DS.InvalidError` is used by an adapter to signal the external API
    * was unable to process a request because the content was not
    * semantically correct or meaningful per the API. Usually this means a
    * record failed some form of server side validation. When a promise
    * from an adapter is rejected with a `DS.InvalidError` the record will
    * transition to the `invalid` state and the errors will be set to the
    * `errors` property on the record.
    */
  @js.native
  class InvalidError protected () extends AdapterError {
    def this(errors: js.Array[_]) = this()
  }
  
  /**
    * The `JSONAPIAdapter` is the default adapter used by Ember Data. It
    * is responsible for transforming the store's requests into HTTP
    * requests that follow the [JSON API](http://jsonapi.org/format/)
    * format.
    */
  @js.native
  class JSONAPIAdapter () extends RESTAdapter
  
  /**
    * Ember Data 2.0 Serializer:
    */
  @js.native
  class JSONAPISerializer () extends JSONSerializer {
    /**
      * Converts the model name to a pluralized version of the model name.
      */
    def payloadKeyFromModelName[K /* <: String */](modelName: K): String = js.native
    /**
      * `payloadTypeFromModelName` can be used to change the mapping for the type in
      * the payload, taken from the model name.
      */
    def payloadTypeFromModelName[K /* <: String */](modelName: K): String = js.native
    def pushPayload(store: Store, payload: js.Object): js.Any = js.native
  }
  
  /**
    * Ember Data 2.0 Serializer:
    */
  @js.native
  class JSONSerializer () extends Serializer {
    /**
      * The `primaryKey` is used when serializing and deserializing
      * data. Ember Data always uses the `id` property to store the id of
      * the record. The external source may not always follow this
      * convention. In these cases it is useful to override the
      * `primaryKey` property to match the `primaryKey` of your external
      * store.
      */
    var primaryKey: String = js.native
    /**
      * Returns the resource's attributes formatted as a JSON-API "attributes object".
      */
    def extractAttributes(modelClass: js.Object, resourceHash: js.Object): js.Object = js.native
    /**
      * `extractErrors` is used to extract model errors when a call
      * to `DS.Model#save` fails with an `InvalidError`. By default
      * Ember Data expects error information to be located on the `errors`
      * property of the payload object.
      */
    def extractErrors(store: Store, typeClass: Model, payload: js.Object, id: String): js.Object = js.native
    def extractErrors(store: Store, typeClass: Model, payload: js.Object, id: Double): js.Object = js.native
    /**
      * Returns the resource's ID.
      */
    def extractId(modelClass: js.Object, resourceHash: js.Object): String = js.native
    /**
      * `extractMeta` is used to deserialize any meta information in the
      * adapter payload. By default Ember Data expects meta information to
      * be located on the `meta` property of the payload object.
      */
    def extractMeta(store: Store, modelClass: Model, payload: js.Object): js.Any = js.native
    /**
      * Returns a polymorphic relationship formatted as a JSON-API "relationship object".
      */
    def extractPolymorphicRelationship(relationshipModelName: js.Object, relationshipHash: js.Object, relationshipOptions: js.Object): js.Object = js.native
    /**
      * Returns a relationship formatted as a JSON-API "relationship object".
      */
    def extractRelationship(relationshipModelName: js.Object, relationshipHash: js.Object): js.Object = js.native
    /**
      * Returns the resource's relationships formatted as a JSON-API "relationships object".
      */
    def extractRelationships(modelClass: js.Object, resourceHash: js.Object): js.Object = js.native
    /**
      * `keyForAttribute` can be used to define rules for how to convert an
      * attribute name in your model to a key in your JSON.
      */
    def keyForAttribute(key: String, method: String): String = js.native
    /**
      * `keyForLink` can be used to define a custom key when deserializing link
      * properties.
      */
    def keyForLink(key: String, kind: String): String = js.native
    /**
      * `keyForRelationship` can be used to define a custom key when
      * serializing and deserializing relationship properties. By default
      * `JSONSerializer` does not provide an implementation of this method.
      */
    def keyForRelationship(key: String, typeClass: String, method: String): String = js.native
    def modelNameFromPayloadKey(key: String): String = js.native
    def modelNameFromPayloadType(`type`: String): String = js.native
    def normalizeArrayResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeArrayResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeCreateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeCreateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeDeleteRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeDeleteRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeFindAllResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeFindAllResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeFindBelongsToResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeFindBelongsToResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeFindHasManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeFindHasManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeFindManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeFindManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeFindRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeFindRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeQueryRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeQueryRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeQueryResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeQueryResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeSaveResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeSaveResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeSingleResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeSingleResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    def normalizeUpdateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeUpdateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    /**
      * `serializeAttribute` can be used to customize how `DS.attr`
      * properties are serialized
      */
    def serializeAttribute[K /* <: String */](snapshot: Snapshot[K], json: js.Object, key: String, attribute: js.Object): js.Any = js.native
    /**
      * `serializeBelongsTo` can be used to customize how `DS.belongsTo`
      * properties are serialized.
      */
    def serializeBelongsTo[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
    /**
      * `serializeHasMany` can be used to customize how `DS.hasMany`
      * properties are serialized.
      */
    def serializeHasMany[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
    /**
      * serializeId can be used to customize how id is serialized
      * For example, your server may expect integer datatype of id
      */
    def serializeId[K /* <: String */](snapshot: Snapshot[K], json: js.Object, primaryKey: String): js.Any = js.native
    /**
      * You can use this method to customize how a serialized record is added to the complete
      * JSON hash to be sent to the server. By default the JSON Serializer does not namespace
      * the payload and just sends the raw serialized JSON object.
      * If your server expects namespaced keys, you should consider using the RESTSerializer.
      * Otherwise you can override this method to customize how the record is added to the hash.
      * The hash property should be modified by reference.
      */
    def serializeIntoHash[K /* <: String */](
      hash: js.Object,
      typeClass: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      snapshot: Snapshot[K]
    ): js.Any = js.native
    def serializeIntoHash[K /* <: String */](
      hash: js.Object,
      typeClass: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
      snapshot: Snapshot[K],
      options: js.Object
    ): js.Any = js.native
    /**
      * You can use this method to customize how polymorphic objects are
      * serialized. Objects are considered to be polymorphic if
      * `{ polymorphic: true }` is pass as the second argument to the
      * `DS.belongsTo` function.
      */
    def serializePolymorphicType[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
    /**
      * Check if the given hasMany relationship should be serialized
      */
    def shouldSerializeHasMany[K /* <: String */](snapshot: Snapshot[K], key: String, relationshipType: String): Boolean = js.native
  }
  
  /**
    * A `ManyArray` is a `MutableArray` that represents the contents of a has-many
    * relationship.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : Ember.Object.extend(Ember.MutableArray as object, Ember.Evented) * / any */ @js.native
  class ManyArray[T] () extends MutableArray[T] {
    /**
      * The loading state of this array
      */
    var isLoaded: Boolean = js.native
    /**
      * Create a child record within the owner
      */
    def createRecord(): T = js.native
    def createRecord(inputProperties: js.Object): T = js.native
    /**
      * Reloads all of the records in the manyArray. If the manyArray
      * holds a relationship that was originally fetched using a links url
      * Ember Data will revisit the original links url to repopulate the
      * relationship.
      */
    def reload(): PromiseArray[T] = js.native
    /**
      * Saves all of the records in the `ManyArray`.
      */
    def save(): PromiseArray[T] = js.native
  }
  
  /**
    * The model class that all Ember Data records descend from.
    * This is the public API of Ember Data models. If you are using Ember Data
    * in your application, this is the class you should use.
    * If you are working on Ember Data internals, you most likely want to be dealing
    * with `InternalModel`
    */
  @js.native
  class Model () extends Object {
    /**
      * This property holds the `DS.AdapterError` object with which
      * last adapter operation was rejected.
      */
    var adapterError: AdapterError = js.native
    /**
      * If the record is in the dirty state this property will report what
      * kind of change has caused it to move into the dirty
      * state. Possible values are:
      */
    var dirtyType: ComputedProperty[String, String] = js.native
    /**
      * When the record is in the `invalid` state this object will contain
      * any errors returned by the adapter. When present the errors hash
      * contains keys corresponding to the invalid property names
      * and values which are arrays of Javascript objects with two keys:
      */
    var errors: ComputedProperty[Errors, Errors] = js.native
    /**
      * If this property is `true` the record is in the `dirty` state. The
      * record has local changes that have not yet been saved by the
      * adapter. This includes records that have been created (but not yet
      * saved) or deleted.
      */
    var hasDirtyAttributes: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * All ember models have an id property. This is an identifier
      * managed by an external source. These are always coerced to be
      * strings before being used internally. Note when declaring the
      * attributes for a model it is an error to declare an id
      * attribute.
      */
    var id: String = js.native
    /**
      * If this property is `true` the record is in the `deleted` state
      * and has been marked for deletion. When `isDeleted` is true and
      * `hasDirtyAttributes` is true, the record is deleted locally but the deletion
      * was not yet persisted. When `isSaving` is true, the change is
      * in-flight. When both `hasDirtyAttributes` and `isSaving` are false, the
      * change has persisted.
      */
    var isDeleted: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * If this property is `true` the record is in the `empty`
      * state. Empty is the first state all records enter after they have
      * been created. Most records created by the store will quickly
      * transition to the `loading` state if data needs to be fetched from
      * the server or the `created` state if the record is created on the
      * client. A record can also enter the empty state if the adapter is
      * unable to locate the record.
      */
    var isEmpty: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * If `true` the adapter reported that it was unable to save local
      * changes to the backend for any reason other than a server-side
      * validation error.
      */
    var isError: Boolean = js.native
    /**
      * If this property is `true` the record is in the `loaded` state. A
      * record enters this state when its data is populated. Most of a
      * record's lifecycle is spent inside substates of the `loaded`
      * state.
      */
    var isLoaded: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * If this property is `true` the record is in the `loading` state. A
      * record enters this state when the store asks the adapter for its
      * data. It remains in this state until the adapter provides the
      * requested data.
      */
    var isLoading: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * If this property is `true` the record is in the `new` state. A
      * record will be in the `new` state when it has been created on the
      * client and the adapter has not yet report that it was successfully
      * saved.
      */
    var isNew: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * If `true` the store is attempting to reload the record from the adapter.
      */
    var isReloading: Boolean = js.native
    /**
      * If this property is `true` the record is in the `saving` state. A
      * record enters the saving state when `save` is called, but the
      * adapter has not yet acknowledged that the changes have been
      * persisted to the backend.
      */
    var isSaving: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * If this property is `true` the record is in the `valid` state.
      */
    var isValid: ComputedProperty[Boolean, Boolean] = js.native
    /**
      * Fired when the record enters the error state.
      */
    def becameError(): Unit = js.native
    /**
      * Fired when the record becomes invalid.
      */
    def becameInvalid(): Unit = js.native
    /**
      * Get the reference for the specified belongsTo relationship.
      */
    def belongsTo(name: RelationshipsFor[this.type]): BelongsToReference = js.native
    /**
      * Returns an object, whose keys are changed properties, and value is
      * an [oldProp, newProp] array.
      */
    def changedAttributes(): ChangedAttributes = js.native
    /**
      * Marks the record as deleted but does not save it. You must call
      * `save` afterwards if you want to persist it. You might use this
      * method if you want to allow the user to still `rollbackAttributes()`
      * after a delete was made.
      */
    def deleteRecord(): Unit = js.native
    /**
      * Same as `deleteRecord`, but saves the record immediately.
      */
    def destroyRecord(): Promise[this.type] = js.native
    def destroyRecord(options: Anon_AdapterOptions): Promise[this.type] = js.native
    /**
      * Fired when a new record is commited to the server.
      */
    def didCreate(): Unit = js.native
    /**
      * Fired when the record is deleted.
      */
    def didDelete(): Unit = js.native
    /**
      * Fired when the record is loaded from the server.
      */
    def didLoad(): Unit = js.native
    /**
      * Fired when the record is updated.
      */
    def didUpdate(): Unit = js.native
    /**
      * Given a callback, iterates over each of the relationships in the model,
      * invoking the callback with the name of each relationship and its relationship
      * descriptor.
      */
    def eachRelationship[T /* <: Model */](`this`: T, callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[T], Unit]): Unit = js.native
    def eachRelationship[T /* <: Model */](
      `this`: T,
      callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[T], Unit],
      binding: js.Any
    ): Unit = js.native
    /**
      * Get the reference for the specified hasMany relationship.
      */
    def hasMany(name: RelationshipsFor[this.type]): HasManyReference[_] = js.native
    /**
      * Fired when the record is ready to be interacted with,
      * that is either loaded from the server or created locally.
      */
    def ready(): Unit = js.native
    /**
      * Reload the record from the adapter.
      */
    def reload(): Promise[this.type] = js.native
    def reload(options: Anon_AdapterOptions): Promise[this.type] = js.native
    /**
      * If the model `hasDirtyAttributes` this function will discard any unsaved
      * changes. If the model `isNew` it will be removed from the store.
      */
    def rollbackAttributes(): Unit = js.native
    /**
      * Fired when the record is rolled back.
      */
    def rolledBack(): Unit = js.native
    /**
      * Save the record and persist any changes to the record to an
      * external source via the adapter.
      */
    def save(): Promise[this.type] = js.native
    def save(options: Anon_AdapterOptions): Promise[this.type] = js.native
    /**
      * Create a JSON representation of the record, using the serialization
      * strategy of the store's adapter.
      */
    def serialize(): js.Object = js.native
    def serialize(options: Anon_IncludeId): js.Object = js.native
    /**
      * Use [DS.JSONSerializer](DS.JSONSerializer.html) to
      * get the JSON representation of a record.
      */
    def toJSON(): js.Object = js.native
    def toJSON(options: Anon_IncludeId): js.Object = js.native
    /**
      * Unloads the record from the store. This will cause the record to be destroyed and freed up for garbage collection.
      */
    def unloadRecord(): Unit = js.native
  }
  
  /**
    * A `DS.NotFoundError` equates to a HTTP `404 Not Found` response status.
    * It is used by an adapter to signal that a request to the external API
    * was rejected because the resource could not be found on the API.
    */
  @js.native
  class NotFoundError () extends AdapterError
  
  /**
    * The `DS.NumberTransform` class is used to serialize and deserialize
    * numeric attributes on Ember Data record objects. This transform is
    * used when `number` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class NumberTransform () extends Transform
  
  /**
    * A `PromiseArray` is an object that acts like both an `Ember.Array`
    * and a promise. When the promise is resolved the resulting value
    * will be set to the `PromiseArray`'s `content` property. This makes
    * it easy to create data bindings with the `PromiseArray` that will be
    * updated when the promise resolves.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin because Inheritance from two classes. Inlined isFulfilled, isPending, isRejected, isSettled, promise, reason */ @js.native
  class PromiseArray[T] () extends ArrayProxy[T] {
    /**
      * Will become `true` if the proxied promise is fulfilled.
      */
    var isFulfilled: Boolean = js.native
    /**
      * Once the proxied promise has settled this will become `false`.
      */
    var isPending: Boolean = js.native
    /**
      * Will become `true` if the proxied promise is rejected.
      */
    var isRejected: Boolean = js.native
    /**
      * Once the proxied promise has settled this will become `true`.
      */
    var isSettled: Boolean = js.native
    /**
      * The promise whose fulfillment value is being proxied by this object.
      */
    var promise: Promise[ArrayProxy[T]] = js.native
    /**
      * If the proxied promise is rejected this will contain the reason
      * provided.
      */
    var reason: js.Any = js.native
  }
  
  /**
    * A PromiseManyArray is a PromiseArray that also proxies certain method calls
    * to the underlying manyArray.
    * Right now we proxy:
    */
  @js.native
  class PromiseManyArray[T /* <: Model */] () extends PromiseArray[T] {
    /**
      * Create a child record within the owner
      */
    def createRecord(): T = js.native
    def createRecord(inputProperties: js.Object): T = js.native
    /**
      * Reloads all of the records in the manyArray. If the manyArray
      * holds a relationship that was originally fetched using a links url
      * Ember Data will revisit the original links url to repopulate the
      * relationship.
      */
    def reload(): PromiseManyArray[T] = js.native
  }
  
  /**
    * A `PromiseObject` is an object that acts like both an `Ember.Object`
    * and a promise. When the promise is resolved, then the resulting value
    * will be set to the `PromiseObject`'s `content` property. This makes
    * it easy to create data bindings with the `PromiseObject` that will
    * be updated when the promise resolves.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin because Inheritance from two classes. Inlined isFulfilled, isPending, isRejected, isSettled, promise, reason */ @js.native
  class PromiseObject[T] () extends default[T] {
    /**
      * Will become `true` if the proxied promise is fulfilled.
      */
    var isFulfilled: Boolean = js.native
    /**
      * Once the proxied promise has settled this will become `false`.
      */
    var isPending: Boolean = js.native
    /**
      * Will become `true` if the proxied promise is rejected.
      */
    var isRejected: Boolean = js.native
    /**
      * Once the proxied promise has settled this will become `true`.
      */
    var isSettled: Boolean = js.native
    /**
      * The promise whose fulfillment value is being proxied by this object.
      */
    var promise: Promise[T with default[js.Object]] = js.native
    /**
      * If the proxied promise is rejected this will contain the reason
      * provided.
      */
    var reason: js.Any = js.native
  }
  
  /**
    * The REST adapter allows your store to communicate with an HTTP server by
    * transmitting JSON via XHR. Most Ember.js apps that consume a JSON API
    * should use the REST adapter.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.emberDashData.emberDashDataMod.DSNs.BuildURLMixin because Inheritance from two classes. Inlined buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, buildURL, urlForFindRecord, urlForFindAll, urlForQuery, urlForQueryRecord, urlForFindMany, urlForFindHasMany, urlForFindBelongsTo, urlForCreateRecord, urlForUpdateRecord, urlForDeleteRecord, pathForType */ @js.native
  class RESTAdapter () extends Adapter {
    /**
      * An adapter can target other hosts by setting the `host` property.
      */
    var host: String = js.native
    /**
      * Endpoint paths can be prefixed with a `namespace` by setting the namespace
      * property on the adapter:
      */
    var namespace: String = js.native
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
      * Get the data (body or query params) for a request.
      */
    def dataForRequest(params: js.Object): js.Object = js.native
    /**
      * Called by the store in order to fetch the JSON for the unloaded record in a
      * belongs-to relationship that was originally specified as a URL (inside of
      * `links`).
      */
    def findBelongsTo[K /* <: String */](store: Store, snapshot: Snapshot[K], url: String): Promise[_] = js.native
    /**
      * Called by the store in order to fetch a JSON array for
      * the unloaded records in a has-many relationship that were originally
      * specified as a URL (inside of `links`).
      */
    def findHasMany[K /* <: String */](store: Store, snapshot: Snapshot[K], url: String, relationship: js.Object): Promise[_] = js.native
    /**
      * Takes an ajax response, and returns the json payload or an error.
      */
    def handleResponse(status: Double, headers: js.Object, payload: js.Object, requestData: js.Object): js.Object = js.native
    /**
      * Get the headers for a request.
      */
    def headersForRequest(params: js.Object): js.Object = js.native
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
      * Determines the pathname for a given type.
      */
    def pathForType[K /* <: String */](modelName: K): String = js.native
    /**
      * Called by the store in order to fetch a JSON array for
      * the records that match a particular query.
      */
    def query[K /* <: String */](
      store: Store,
      `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
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
      * Get the URL for a request.
      */
    def urlForRequest(params: js.Object): String = js.native
    /**
      * Builds a URL for a `record.save()` call when the record has been update locally.
      */
    def urlForUpdateRecord[K /* <: String */](id: String, modelName: K, snapshot: Snapshot[K]): String = js.native
  }
  
  /**
    * Normally, applications will use the `RESTSerializer` by implementing
    * the `normalize` method.
    */
  @js.native
  class RESTSerializer () extends JSONSerializer {
    /**
      * `keyForPolymorphicType` can be used to define a custom key when
      * serializing and deserializing a polymorphic type. By default, the
      * returned key is `${key}Type`.
      */
    def keyForPolymorphicType(key: String, typeClass: String, method: String): String = js.native
    def normalize(modelClass: Model, resourceHash: js.Object, prop: String): js.Object = js.native
    /**
      * You can use `payloadKeyFromModelName` to override the root key for an outgoing
      * request. By default, the RESTSerializer returns a camelized version of the
      * model's name.
      */
    def payloadKeyFromModelName[K /* <: String */](modelName: K): String = js.native
    /**
      * `payloadTypeFromModelName` can be used to change the mapping for the type in
      * the payload, taken from the model name.
      */
    def payloadTypeFromModelName[K /* <: String */](modelName: K): String = js.native
    /**
      * This method allows you to push a payload containing top-level
      * collections of records organized per type.
      */
    def pushPayload(store: Store, payload: js.Object): js.Any = js.native
    /**
      * You can use this method to customize the root keys serialized into the JSON.
      * The hash property should be modified by reference (possibly using something like _.extend)
      * By default the REST Serializer sends the modelName of a model, which is a camelized
      * version of the name.
      */
    def serializeIntoHash[K /* <: String */](hash: js.Object, typeClass: Model, snapshot: Snapshot[K]): js.Any = js.native
    def serializeIntoHash[K /* <: String */](hash: js.Object, typeClass: Model, snapshot: Snapshot[K], options: js.Object): js.Any = js.native
  }
  
  /**
    * A record array is an array that contains records of a certain modelName. The record
    * array materializes records as needed when they are retrieved for the first
    * time. You should not create record arrays yourself. Instead, an instance of
    * `DS.RecordArray` or its subclasses will be returned by your application's store
    * in response to queries.
    */
  @js.native
  class RecordArray[T] ()
    extends ArrayProxy[T]
       with Evented {
    /**
      * The flag to signal a `RecordArray` is finished loading data.
      */
    var isLoaded: Boolean = js.native
    /**
      * The flag to signal a `RecordArray` is currently loading data.
      */
    var isUpdating: Boolean = js.native
    /**
      * The modelClass represented by this record array.
      */
    var `type`: ComputedProperty[Model, Model] = js.native
    /**
      * Saves all of the records in the `RecordArray`.
      */
    def save(): PromiseArray[T] = js.native
    /**
      * Used to get the latest version of all of the records in this array
      * from the adapter.
      */
    def update(): PromiseArray[T] = js.native
  }
  
  /**
    * An RecordReference is a low level API that allows users and
    * addon author to perform meta-operations on a record.
    */
  @js.native
  class RecordReference[T /* <: Model */] () extends js.Object {
    /**
      * The `id` of the record that this reference refers to.
      */
    def id(): String = js.native
    /**
      * Triggers a fetch for the backing entity based on its `remoteType`
      * (see `remoteType` definitions per reference type).
      */
    def load(): PromiseObject[T] with T = js.native
    def push(payload: js.Object): PromiseObject[T] with T = js.native
    /**
      * This API allows you to provide a reference with new data. The
      * simplest usage of this API is similar to `store.push`: you provide a
      * normalized hash of data and the object represented by the reference
      * will update.
      */
    def push(payload: Promise[_]): PromiseObject[T] with T = js.native
    /**
      * Reloads the record if it is already loaded. If the record is not
      * loaded it will load the record via `store.findRecord`
      */
    def reload(): PromiseObject[T] with T = js.native
    /**
      * How the reference will be looked up when it is loaded: Currently
      * this always return `identity` to signifying that a record will be
      * loaded by the `type` and `id`.
      */
    def remoteType(): String = js.native
    /**
      * If the entity referred to by the reference is already loaded, it is
      * present as `reference.value`. Otherwise the value returned by this function
      * is `null`.
      */
    def value(): T | Null = js.native
  }
  
  trait RelationshipOptions[M /* <: Model */] extends js.Object {
    var async: js.UndefOr[Boolean] = js.undefined
    var inverse: js.UndefOr[RelationshipsFor[M] | Null] = js.undefined
    var polymorphic: js.UndefOr[Boolean] = js.undefined
  }
  
  /**
    * ### State
    */
  @js.native
  class RootState () extends js.Object
  
  /**
    * `DS.Serializer` is an abstract base class that you should override in your
    * application to customize it for your backend. The minimum set of methods
    * that you should implement is:
    */
  @js.native
  class Serializer () extends Object {
    /**
      * The `store` property is the application's `store` that contains
      * all records. It can be used to look up serializers for other model
      * types that may be nested inside the payload response.
      */
    var store: Store = js.native
    /**
      * The `normalize` method is used to convert a payload received from your
      * external data source into the normalized form `store.push()` expects. You
      * should override this method, munge the hash and return the normalized
      * payload.
      */
    def normalize(typeClass: Model, hash: js.Object): js.Object = js.native
    /**
      * The `normalizeResponse` method is used to normalize a payload from the
      * server to a JSON-API Document.
      */
    def normalizeResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
    def normalizeResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
    /**
      * The `serialize` method is used when a record is saved in order to convert
      * the record into the form that your external data source expects.
      */
    def serialize[K /* <: String */](snapshot: Snapshot[K], options: js.Object): js.Object = js.native
  }
  
  /**
    * A `DS.ServerError` equates to a HTTP `500 Internal Server Error` response
    * status. It is used by the adapter to indicate that a request has failed
    * because of an error in the external API.
    */
  @js.native
  class ServerError () extends AdapterError
  
  @js.native
  class Snapshot[K /* <: String */] () extends js.Object {
    /**
      * The id of the snapshot's underlying record
      */
    var id: String = js.native
    /**
      * The name of the type of the underlying record for this snapshot, as a string.
      */
    var modelName: K = js.native
    /**
      * The underlying record for this snapshot. Can be used to access methods and
      * properties defined on the record.
      */
    var record: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
    /**
      * The type of the underlying record for this snapshot, as a DS.Model.
      */
    var `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
    /**
      * Returns the value of an attribute.
      */
    def attr[L /* <: AttributesFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K][L] */ js.Any = js.native
    /**
      * Returns all attributes and their corresponding values.
      */
    def attributes(): /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ L in keyof ember-data.ember-data/types/registries/model.ModelRegistry[K] ]: ember-data.ember-data/types/registries/model.ModelRegistry[K][L]}
      */ typings.emberDashData.emberDashDataStrings.Snapshot with ModelRegistry = js.native
    /**
      * Returns the current value of a belongsTo relationship.
      */
    def belongsTo[L /* <: RelationshipsFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L): js.UndefOr[Snapshot[_] | Null] = js.native
    def belongsTo[L /* <: RelationshipsFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L, options: js.Object): js.UndefOr[Snapshot[_] | Null] = js.native
    def belongsTo[L /* <: RelationshipsFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L, options: Anon_Id): js.UndefOr[String | Null] = js.native
    /**
      * Returns all changed attributes and their old and new values.
      */
    def changedAttributes(): Partial[
        /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ L in keyof ember-data.ember-data/types/registries/model.ModelRegistry[K] ]: ember-data.ember-data/types/registries/model.ModelRegistry[K][L]}
      */ typings.emberDashData.emberDashDataStrings.Snapshot with ModelRegistry
      ] = js.native
    /**
      * Iterates through all the attributes of the model, calling the passed
      * function on each attribute.
      */
    def eachAttribute[M /* <: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](callback: js.Function2[/* key */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
    def eachAttribute[M /* <: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](
      callback: js.Function2[/* key */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit],
      binding: js.Object
    ): Unit = js.native
    /**
      * Iterates through all the relationships of the model, calling the passed
      * function on each relationship.
      */
    def eachRelationship[M /* <: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](callback: js.Function2[/* key */ ModelKeys[M], /* meta */ RelationshipMeta[M], Unit]): Unit = js.native
    def eachRelationship[M /* <: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](
      callback: js.Function2[/* key */ ModelKeys[M], /* meta */ RelationshipMeta[M], Unit],
      binding: js.Object
    ): Unit = js.native
    /**
      * Returns the current value of a hasMany relationship.
      */
    def hasMany[L /* <: RelationshipsFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L): js.UndefOr[js.Array[Snapshot[_]]] = js.native
    def hasMany[L /* <: RelationshipsFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L, options: Anon_False): js.UndefOr[js.Array[Snapshot[_]]] = js.native
    def hasMany[L /* <: RelationshipsFor[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] */](keyName: L, options: Anon_Ids): js.UndefOr[js.Array[String]] = js.native
    /**
      * Serializes the snapshot using the serializer for the model.
      */
    def serialize[O /* <: js.Object */](options: O): js.Object = js.native
  }
  
  @js.native
  class SnapshotRecordArray[K /* <: String */] () extends js.Object {
    /**
      * The relationships to include for this request.
      */
    var include: String | js.Array[_] = js.native
    /**
      * Number of records in the array
      */
    var length: Double = js.native
    /**
      * The type of the underlying records for the snapshots in the array, as a DS.Model
      */
    var `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
    /**
      * Get snapshots of the underlying record array
      */
    def snapshots(): js.Array[Snapshot[_]] = js.native
  }
  
  /**
    * The store contains all of the data for records loaded from the server.
    * It is also responsible for creating instances of `DS.Model` that wrap
    * the individual data for a record, so that they can be bound to in your
    * Handlebars templates.
    */
  @js.native
  class Store () extends js.Object {
    /**
      * The default adapter to use to communicate to a backend server or
      * other persistence layer. This will be overridden by an application
      * adapter if present.
      */
    var adapter: String = js.native
    /**
      * Returns an instance of the adapter for a given type. For
      * example, `adapterFor('person')` will return an instance of
      * `App.PersonAdapter`.
      */
    def adapterFor[K /* <: String */](modelName: K): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/adapter.AdapterRegistry[K] */ js.Any = js.native
    /**
      * Create a new record in the current store. The properties passed
      * to this method are set on the newly created record.
      */
    def createRecord[K /* <: String */](modelName: K): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
    def createRecord[K /* <: String */](modelName: K, inputProperties: js.Object): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
    /**
      * For symmetry, a record can be deleted via the store.
      */
    def deleteRecord(record: Model): Unit = js.native
    /**
      * `findAll` asks the adapter's `findAll` method to find the records for the
      * given type, and returns a promise which will resolve with all records of
      * this type present in the store, even if the adapter only returns a subset
      * of them.
      */
    def findAll[K /* <: String */](modelName: K): PromiseArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    def findAll[K /* <: String */](modelName: K, options: Anon_AdapterOptionsBackgroundReload): PromiseArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    /**
      * This method returns a record for a given type and id combination.
      */
    def findRecord[K /* <: String */](modelName: K, id: String): (PromiseObject[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) with (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) = js.native
    def findRecord[K /* <: String */](modelName: K, id: String, options: js.Object): (PromiseObject[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) with (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) = js.native
    def findRecord[K /* <: String */](modelName: K, id: Double): (PromiseObject[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) with (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) = js.native
    def findRecord[K /* <: String */](modelName: K, id: Double, options: js.Object): (PromiseObject[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) with (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) = js.native
    /**
      * Get the reference for the specified record.
      */
    def getReference[K /* <: String */](modelName: K, id: String): RecordReference[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    def getReference[K /* <: String */](modelName: K, id: Double): RecordReference[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    /**
      * This method returns true if a record for a given modelName and id is already
      * loaded in the store. Use this function to know beforehand if a findRecord()
      * will result in a request or that it will be a cache hit.
      */
    def hasRecordForId[K /* <: String */](modelName: K, id: String): Boolean = js.native
    def hasRecordForId[K /* <: String */](modelName: K, id: Double): Boolean = js.native
    /**
      * Returns the model class for the particular `modelName`.
      */
    def modelFor[K /* <: String */](modelName: K): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
    /**
      * `normalize` converts a json payload into the normalized form that
      * [push](#method_push) expects.
      */
    def normalize[K /* <: String */](modelName: K, payload: js.Object): js.Object = js.native
    /**
      * This method returns a filtered array that contains all of the
      * known records for a given type in the store.
      */
    def peekAll[K /* <: String */](modelName: K): RecordArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    /**
      * Get a record by a given type and ID without triggering a fetch.
      */
    def peekRecord[K /* <: String */](modelName: K, id: String): (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) | Null = js.native
    def peekRecord[K /* <: String */](modelName: K, id: Double): (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) | Null = js.native
    /**
      * Push some data for a given type into the store.
      */
    def push(data: js.Object): Model | js.Array[_] = js.native
    def pushPayload(inputPayload: js.Object): js.Any = js.native
    /**
      * Push some raw data into the store.
      */
    def pushPayload[K /* <: String */](modelName: K, inputPayload: js.Object): js.Any = js.native
    /**
      * This method delegates a query to the adapter. This is the one place where
      * adapter-level semantics are exposed to the application.
      */
    def query[K /* <: String */](modelName: K, query: js.Object): (AdapterPopulatedRecordArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) with (PromiseArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) = js.native
    def query[K /* <: String */](modelName: K, query: js.Object, options: Anon_AdapterOptions): (AdapterPopulatedRecordArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) with (PromiseArray[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ]) = js.native
    /**
      * This method makes a request for one record, where the `id` is not known
      * beforehand (if the `id` is known, use [`findRecord`](#method_findRecord)
      * instead).
      */
    def queryRecord[K /* <: String */](modelName: K, query: js.Object): Promise[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    def queryRecord[K /* <: String */](modelName: K, query: js.Object, options: Anon_AdapterOptions): Promise[
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    /**
      * DEPRECATED:
      * This method has been deprecated and is an alias for store.hasRecordForId, which should
      * be used instead.
      */
    def recordIsLoaded[K /* <: String */](modelName: K, id: String): Boolean = js.native
    /**
      * Returns an instance of the serializer for a given type. For
      * example, `serializerFor('person')` will return an instance of
      * `App.PersonSerializer`.
      */
    def serializerFor[K /* <: String */](modelName: K): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/serializer.SerializerRegistry[K] */ js.Any = js.native
    /**
      * This method unloads all records in the store.
      * It schedules unloading to happen during the next run loop.
      */
    def unloadAll[K /* <: String */](): Unit = js.native
    def unloadAll[K /* <: String */](modelName: K): Unit = js.native
    /**
      * For symmetry, a record can be unloaded via the store.
      * This will cause the record to be destroyed and freed up for garbage collection.
      */
    def unloadRecord(record: Model): Unit = js.native
  }
  
  /**
    * The `DS.StringTransform` class is used to serialize and deserialize
    * string attributes on Ember Data record objects. This transform is
    * used when `string` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class StringTransform () extends Transform
  
  trait Sync extends js.Object {
    var async: `false`
  }
  
  /**
    * A `DS.TimeoutError` is used by an adapter to signal that a request
    * to the external API has timed out. I.e. no response was received from
    * the external API within an allowed time period.
    */
  @js.native
  class TimeoutError () extends AdapterError
  
  /**
    * The `DS.Transform` class is used to serialize and deserialize model
    * attributes when they are saved or loaded from an
    * adapter. Subclassing `DS.Transform` is useful for creating custom
    * attributes. All subclasses of `DS.Transform` must implement a
    * `serialize` and a `deserialize` method.
    */
  @js.native
  class Transform () extends Object {
    /**
      * When given a serialize value from a JSON object this method must
      * return the deserialized value for the record attribute.
      */
    def deserialize(serialized: js.Any, options: AttrOptions[_]): js.Any = js.native
    /**
      * When given a deserialized value from a record attribute this
      * method must return the serialized value.
      */
    def serialize(deserialized: js.Any, options: AttrOptions[_]): js.Any = js.native
  }
  
  /**
    * A `DS.UnauthorizedError` equates to a HTTP `401 Unauthorized` response
    * status. It is used by an adapter to signal that a request to the external
    * API was rejected because authorization is required and has failed or has not
    * yet been provided.
    */
  @js.native
  class UnauthorizedError () extends AdapterError
  
  val VERSION: String = js.native
  def attr(): ComputedProperty[_, _] = js.native
  def attr(options: AttrOptions[_]): ComputedProperty[_, _] = js.native
  @JSName("attr")
  def attr_boolean(`type`: boolean): ComputedProperty[Boolean, Boolean] = js.native
  @JSName("attr")
  def attr_boolean(`type`: boolean, options: AttrOptions[Boolean]): ComputedProperty[Boolean, Boolean] = js.native
  @JSName("attr")
  def attr_date(`type`: date): ComputedProperty[Date, Date] = js.native
  @JSName("attr")
  def attr_date(`type`: date, options: AttrOptions[Date]): ComputedProperty[Date, Date] = js.native
  @JSName("attr")
  def attr_number(`type`: number): ComputedProperty[Double, Double] = js.native
  @JSName("attr")
  def attr_number(`type`: number, options: AttrOptions[Double]): ComputedProperty[Double, Double] = js.native
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  @JSName("attr")
  def attr_string(`type`: string): ComputedProperty[String, String] = js.native
  @JSName("attr")
  def attr_string(`type`: string, options: AttrOptions[String]): ComputedProperty[String, String] = js.native
  def belongsTo[K /* <: String */](modelName: K): ComputedProperty[
    (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def belongsTo[K /* <: String */](
    modelName: K,
    options: (RelationshipOptions[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with (Async | Sync)
  ): ComputedProperty[
    /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  /**
    * Convert an array of errors in JSON-API format into an object.
    */
  def errorsArrayToHash(errors: js.Array[_]): js.Object = js.native
  /**
    * Convert an hash of errors into an array with errors in JSON-API format.
    */
  def errorsHashToArray(errors: js.Object): js.Array[_] = js.native
  def hasMany[K /* <: String */](`type`: K): ComputedProperty[
    PromiseManyArray[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    Array[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  /**
    * `DS.hasMany` is used to define One-To-Many and Many-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def hasMany[K /* <: String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with (Async | Sync)
  ): ComputedProperty[
    ManyArray[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    ManyArray[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  /**
    * This method normalizes a modelName into the format Ember Data uses
    * internally.
    */
  def normalizeModelName[K /* <: String */](modelName: K): String = js.native
  /* static members */
  @js.native
  object Model extends js.Object {
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are the meta object for the
      * property.
      */
    var attributes: ComputedProperty[Map, Map] = js.native
    /**
      * A map whose keys are the fields of the model and whose values are strings
      * describing the kind of the field. A model's fields are the union of all of its
      * attributes and relationships.
      */
    var fields: ComputedProperty[Map, Map] = js.native
    /**
      * Represents the model's class name as a string. This can be used to look up the model's class name through
      * `DS.Store`'s modelFor method.
      */
    var modelName: String = js.native
    /**
      * An array of types directly related to a model. Each type will be
      * included once, regardless of the number of relationships it has with
      * the model.
      */
    var relatedTypes: ComputedProperty[
        typings.ember.emberMod.EmberNs.NativeArray[String], 
        typings.ember.emberMod.EmberNs.NativeArray[String]
      ] = js.native
    /**
      * A hash containing lists of the model's relationships, grouped
      * by the relationship kind. For example, given a model with this
      * definition:
      */
    var relationshipNames: ComputedProperty[js.Object, js.Object] = js.native
    /**
      * The model's relationships as a map, keyed on the type of the
      * relationship. The value of each entry is an array containing a descriptor
      * for each relationship with that type, describing the name of the relationship
      * as well as the type.
      */
    var relationships: ComputedProperty[Map, Map] = js.native
    /**
      * A map whose keys are the relationships of a model and whose values are
      * relationship descriptors.
      */
    var relationshipsByName: ComputedProperty[Map, Map] = js.native
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are type of transformation
      * applied to each attribute. This map does not include any
      * attributes that do not have an transformation type.
      */
    var transformedAttributes: ComputedProperty[Map, Map] = js.native
    /**
      * Iterates through the attributes of the model, calling the passed function on each
      * attribute.
      */
    def eachAttribute[Class /* <: TypeofClassModel */, M /* <: InstanceType[Class] */](`this`: Class, callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
    def eachAttribute[Class /* <: TypeofClassModel */, M /* <: InstanceType[Class] */](
      `this`: Class,
      callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit],
      binding: js.Any
    ): Unit = js.native
    /**
      * Given a callback, iterates over each of the types related to a model,
      * invoking the callback with the related type's class. Each type will be
      * returned just once, regardless of how many different relationships it has
      * with a model.
      */
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit]): Unit = js.native
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit], binding: js.Any): Unit = js.native
    /**
      * Given a callback, iterates over each of the relationships in the model,
      * invoking the callback with the name of each relationship and its relationship
      * descriptor.
      */
    def eachRelationship[M /* <: Model */](callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit]): Unit = js.native
    def eachRelationship[M /* <: Model */](
      callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit],
      binding: js.Any
    ): Unit = js.native
    /**
      * Iterates through the transformedAttributes of the model, calling
      * the passed function on each attribute. Note the callback will not be
      * called for any attributes that do not have an transformation type.
      */
    def eachTransformedAttribute[Class /* <: TypeofClassModel */](
      `this`: Class,
      callback: js.Function2[/* name */ ModelKeys[InstanceType[Class]], /* type */ String, Unit]
    ): Unit = js.native
    def eachTransformedAttribute[Class /* <: TypeofClassModel */](
      `this`: Class,
      callback: js.Function2[/* name */ ModelKeys[InstanceType[Class]], /* type */ String, Unit],
      binding: js.Any
    ): Unit = js.native
    /**
      * Find the relationship which is the inverse of the one asked for.
      */
    def inverseFor[K /* <: String */](name: K, store: Store): js.Object = js.native
    /**
      * For a given relationship name, returns the model type of the relationship.
      */
    def typeForRelationship[K /* <: String */](name: K, store: Store): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  }
  
}

