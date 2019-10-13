package typings.emberDashData.emberDashDataMod.DS

import typings.rsvp.rsvpMod.default.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An adapter is an object that receives requests from a store and
  * translates them into the appropriate action to take against your
  * persistence layer. The persistence layer is usually an HTTP API, but
  * may be anything, such as the browser's local storage. Typically the
  * adapter is not invoked directly instead its functionality is accessed
  * through the `store`.
  */
@JSImport("ember-data", "DS.Adapter")
@js.native
class Adapter ()
  extends typings.atEmberObject.atEmberObjectMod.default {
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

