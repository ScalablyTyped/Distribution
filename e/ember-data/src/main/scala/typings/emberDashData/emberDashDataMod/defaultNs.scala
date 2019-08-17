package typings.emberDashData.emberDashDataMod

import typings.ember.emberMod.EmberNs.Array
import typings.ember.emberMod.EmberNs.NativeArray
import typings.ember.emberMod.defaultNs.ComputedProperty
import typings.ember.emberMod.defaultNs.Map
import typings.emberDashData.ModelKeys
import typings.emberDashData.TypeofClassModel
import typings.emberDashData.emberDashDataMod.DSNs.Async
import typings.emberDashData.emberDashDataMod.DSNs.AttrOptions
import typings.emberDashData.emberDashDataMod.DSNs.RelationshipOptions
import typings.emberDashData.emberDashDataMod.DSNs.Sync
import typings.emberDashData.emberDashDataStrings.boolean
import typings.emberDashData.emberDashDataStrings.date
import typings.emberDashData.emberDashDataStrings.number
import typings.emberDashData.emberDashDataStrings.string
import typings.std.Date
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * A `DS.AbortError` is used by an adapter to signal that a request to
    * the external API was aborted. For example, this can occur if the user
    * navigates away from the current page after a request to the external API
    * has been initiated but before a response has been received.
    */
  @js.native
  class AbortError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.AbortError
  
  /**
    * An adapter is an object that receives requests from a store and
    * translates them into the appropriate action to take against your
    * persistence layer. The persistence layer is usually an HTTP API, but
    * may be anything, such as the browser's local storage. Typically the
    * adapter is not invoked directly instead its functionality is accessed
    * through the `store`.
    */
  @js.native
  class Adapter ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Adapter
  
  /**
    * A `DS.AdapterError` is used by an adapter to signal that an error occurred
    * during a request to an external API. It indicates a generic error, and
    * subclasses are used to indicate specific error states. The following
    * subclasses are provided:
    */
  @js.native
  class AdapterError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.AdapterError
  
  /**
    * Represents an ordered list of records whose order and membership is
    * determined by the adapter. For example, a query sent to the adapter
    * may trigger a search on the server, whose results would be loaded
    * into an instance of the `AdapterPopulatedRecordArray`.
    */
  @js.native
  class AdapterPopulatedRecordArray[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.AdapterPopulatedRecordArray[T]
  
  /**
    * A BelongsToReference is a low level API that allows users and
    * addon author to perform meta-operations on a belongs-to
    * relationship.
    */
  @js.native
  class BelongsToReference ()
    extends typings.emberDashData.emberDashDataMod.DSNs.BelongsToReference
  
  /**
    * The `DS.BooleanTransform` class is used to serialize and deserialize
    * boolean attributes on Ember Data record objects. This transform is
    * used when `boolean` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class BooleanTransform ()
    extends typings.emberDashData.emberDashDataMod.DSNs.BooleanTransform
  
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
  class BuildURLMixin ()
    extends typings.emberDashData.emberDashDataMod.DSNs.BuildURLMixin
  
  /**
    * A `DS.ConflictError` equates to a HTTP `409 Conflict` response status.
    * It is used by an adapter to indicate that the request could not be processed
    * because of a conflict in the request. An example scenario would be when
    * creating a record with a client generated id but that id is already known
    * to the external API.
    */
  @js.native
  class ConflictError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.ConflictError
  
  /**
    * The `DS.DateTransform` class is used to serialize and deserialize
    * date attributes on Ember Data record objects. This transform is used
    * when `date` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function. It uses the [`ISO 8601`](https://en.wikipedia.org/wiki/ISO_8601)
    * standard.
    */
  @js.native
  class DateTransform ()
    extends typings.emberDashData.emberDashDataMod.DSNs.DateTransform
  
  /**
    * ## Using Embedded Records
    */
  @js.native
  class EmbeddedRecordsMixin ()
    extends typings.emberDashData.emberDashDataMod.DSNs.EmbeddedRecordsMixin
  
  @js.native
  class Errors ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Errors
  
  /**
    * Represents a list of records whose membership is determined by the
    * store. As records are created, loaded, or modified, the store
    * evaluates them to determine if they should be part of the record
    * array.
    */
  @js.native
  class FilteredRecordArray[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.FilteredRecordArray[T]
  
  /**
    * A `DS.ForbiddenError` equates to a HTTP `403 Forbidden` response status.
    * It is used by an adapter to signal that a request to the external API was
    * valid but the server is refusing to respond to it. If authorization was
    * provided and is valid, then the authenticated user does not have the
    * necessary permissions for the request.
    */
  @js.native
  class ForbiddenError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.ForbiddenError
  
  /**
    * A HasManyReference is a low level API that allows users and addon
    * author to perform meta-operations on a has-many relationship.
    */
  @js.native
  class HasManyReference[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.HasManyReference[T]
  
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
  class InvalidError protected ()
    extends typings.emberDashData.emberDashDataMod.DSNs.InvalidError {
    def this(errors: js.Array[_]) = this()
  }
  
  /**
    * The `JSONAPIAdapter` is the default adapter used by Ember Data. It
    * is responsible for transforming the store's requests into HTTP
    * requests that follow the [JSON API](http://jsonapi.org/format/)
    * format.
    */
  @js.native
  class JSONAPIAdapter ()
    extends typings.emberDashData.emberDashDataMod.DSNs.JSONAPIAdapter
  
  /**
    * Ember Data 2.0 Serializer:
    */
  @js.native
  class JSONAPISerializer ()
    extends typings.emberDashData.emberDashDataMod.DSNs.JSONAPISerializer
  
  /**
    * Ember Data 2.0 Serializer:
    */
  @js.native
  class JSONSerializer ()
    extends typings.emberDashData.emberDashDataMod.DSNs.JSONSerializer
  
  @js.native
  class ManyArray[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.ManyArray[T]
  
  /**
    * The model class that all Ember Data records descend from.
    * This is the public API of Ember Data models. If you are using Ember Data
    * in your application, this is the class you should use.
    * If you are working on Ember Data internals, you most likely want to be dealing
    * with `InternalModel`
    */
  @js.native
  class Model ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Model
  
  /**
    * A `DS.NotFoundError` equates to a HTTP `404 Not Found` response status.
    * It is used by an adapter to signal that a request to the external API
    * was rejected because the resource could not be found on the API.
    */
  @js.native
  class NotFoundError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.NotFoundError
  
  /**
    * The `DS.NumberTransform` class is used to serialize and deserialize
    * numeric attributes on Ember Data record objects. This transform is
    * used when `number` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class NumberTransform ()
    extends typings.emberDashData.emberDashDataMod.DSNs.NumberTransform
  
  @js.native
  class PromiseArray[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.PromiseArray[T]
  
  /**
    * A PromiseManyArray is a PromiseArray that also proxies certain method calls
    * to the underlying manyArray.
    * Right now we proxy:
    */
  @js.native
  class PromiseManyArray[T /* <: typings.emberDashData.emberDashDataMod.DSNs.Model */] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.PromiseManyArray[T]
  
  @js.native
  class PromiseObject[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.PromiseObject[T]
  
  /**
    * The REST adapter allows your store to communicate with an HTTP server by
    * transmitting JSON via XHR. Most Ember.js apps that consume a JSON API
    * should use the REST adapter.
    */
  @js.native
  class RESTAdapter ()
    extends typings.emberDashData.emberDashDataMod.DSNs.RESTAdapter
  
  /**
    * Normally, applications will use the `RESTSerializer` by implementing
    * the `normalize` method.
    */
  @js.native
  class RESTSerializer ()
    extends typings.emberDashData.emberDashDataMod.DSNs.RESTSerializer
  
  @js.native
  class RecordArray[T] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.RecordArray[T]
  
  /**
    * An RecordReference is a low level API that allows users and
    * addon author to perform meta-operations on a record.
    */
  @js.native
  class RecordReference[T /* <: typings.emberDashData.emberDashDataMod.DSNs.Model */] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.RecordReference[T]
  
  /**
    * ### State
    */
  @js.native
  class RootState ()
    extends typings.emberDashData.emberDashDataMod.DSNs.RootState
  
  /**
    * `DS.Serializer` is an abstract base class that you should override in your
    * application to customize it for your backend. The minimum set of methods
    * that you should implement is:
    */
  @js.native
  class Serializer ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Serializer
  
  /**
    * A `DS.ServerError` equates to a HTTP `500 Internal Server Error` response
    * status. It is used by the adapter to indicate that a request has failed
    * because of an error in the external API.
    */
  @js.native
  class ServerError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.ServerError
  
  @js.native
  class Snapshot[K /* <: String */] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Snapshot[K]
  
  @js.native
  class SnapshotRecordArray[K /* <: String */] ()
    extends typings.emberDashData.emberDashDataMod.DSNs.SnapshotRecordArray[K]
  
  /**
    * The store contains all of the data for records loaded from the server.
    * It is also responsible for creating instances of `DS.Model` that wrap
    * the individual data for a record, so that they can be bound to in your
    * Handlebars templates.
    */
  @js.native
  class Store ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Store
  
  /**
    * The `DS.StringTransform` class is used to serialize and deserialize
    * string attributes on Ember Data record objects. This transform is
    * used when `string` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @js.native
  class StringTransform ()
    extends typings.emberDashData.emberDashDataMod.DSNs.StringTransform
  
  /**
    * A `DS.TimeoutError` is used by an adapter to signal that a request
    * to the external API has timed out. I.e. no response was received from
    * the external API within an allowed time period.
    */
  @js.native
  class TimeoutError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.TimeoutError
  
  /**
    * The `DS.Transform` class is used to serialize and deserialize model
    * attributes when they are saved or loaded from an
    * adapter. Subclassing `DS.Transform` is useful for creating custom
    * attributes. All subclasses of `DS.Transform` must implement a
    * `serialize` and a `deserialize` method.
    */
  @js.native
  class Transform ()
    extends typings.emberDashData.emberDashDataMod.DSNs.Transform
  
  /**
    * A `DS.UnauthorizedError` equates to a HTTP `401 Unauthorized` response
    * status. It is used by an adapter to signal that a request to the external
    * API was rejected because authorization is required and has failed or has not
    * yet been provided.
    */
  @js.native
  class UnauthorizedError ()
    extends typings.emberDashData.emberDashDataMod.DSNs.UnauthorizedError
  
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
    (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typings.emberDashData.emberDashDataMod.DSNs.PromiseObject[
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
    typings.emberDashData.emberDashDataMod.DSNs.PromiseManyArray[
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
    typings.emberDashData.emberDashDataMod.DSNs.ManyArray[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.emberDashData.emberDashDataMod.DSNs.ManyArray[
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
    var relatedTypes: ComputedProperty[NativeArray[String], NativeArray[String]] = js.native
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
    def eachRelationship[M /* <: typings.emberDashData.emberDashDataMod.DSNs.Model */](callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit]): Unit = js.native
    def eachRelationship[M /* <: typings.emberDashData.emberDashDataMod.DSNs.Model */](
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
    def inverseFor[K /* <: String */](name: K, store: typings.emberDashData.emberDashDataMod.DSNs.Store): js.Object = js.native
    /**
      * For a given relationship name, returns the model type of the relationship.
      */
    def typeForRelationship[K /* <: String */](name: K, store: typings.emberDashData.emberDashDataMod.DSNs.Store): /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  }
  
}

