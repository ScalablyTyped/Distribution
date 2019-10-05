package typings.emberDashData.emberDashDataMod.DS

import typings.emberDashData.Anon_AdapterOptions
import typings.emberDashData.Anon_AdapterOptionsBackgroundReload
import typings.rsvp.rsvpMod.default.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The store contains all of the data for records loaded from the server.
  * It is also responsible for creating instances of `DS.Model` that wrap
  * the individual data for a record, so that they can be bound to in your
  * Handlebars templates.
  */
@JSImport("ember-data", "DS.Store")
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

