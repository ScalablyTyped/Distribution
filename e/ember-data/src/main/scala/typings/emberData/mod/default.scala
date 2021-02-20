package typings.emberData.mod

import org.scalablytyped.runtime.Instantiable0
import typings.ember.mod.Ember.Array
import typings.ember.mod.Ember.NativeArray
import typings.ember.mod.default.ComputedProperty
import typings.ember.mod.default.Map
import typings.emberData.anon.TypeofModel
import typings.emberData.emberDataStrings.boolean
import typings.emberData.emberDataStrings.date
import typings.emberData.emberDataStrings.number
import typings.emberData.emberDataStrings.string
import typings.emberData.mod.DS.Async
import typings.emberData.mod.DS.AttrOptions
import typings.emberData.mod.DS.RelationshipOptions
import typings.emberData.mod.DS.Sync
import typings.std.Date
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  /**
    * A `DS.AbortError` is used by an adapter to signal that a request to
    * the external API was aborted. For example, this can occur if the user
    * navigates away from the current page after a request to the external API
    * has been initiated but before a response has been received.
    */
  @JSImport("ember-data", "default.AbortError")
  @js.native
  class AbortError ()
    extends typings.emberData.mod.DS.AbortError
  
  /**
    * An adapter is an object that receives requests from a store and
    * translates them into the appropriate action to take against your
    * persistence layer. The persistence layer is usually an HTTP API, but
    * may be anything, such as the browser's local storage. Typically the
    * adapter is not invoked directly instead its functionality is accessed
    * through the `store`.
    */
  @JSImport("ember-data", "default.Adapter")
  @js.native
  class Adapter ()
    extends typings.emberData.mod.DS.Adapter
  
  /**
    * A `DS.AdapterError` is used by an adapter to signal that an error occurred
    * during a request to an external API. It indicates a generic error, and
    * subclasses are used to indicate specific error states. The following
    * subclasses are provided:
    */
  @JSImport("ember-data", "default.AdapterError")
  @js.native
  class AdapterError ()
    extends typings.emberData.mod.DS.AdapterError
  
  /**
    * Represents an ordered list of records whose order and membership is
    * determined by the adapter. For example, a query sent to the adapter
    * may trigger a search on the server, whose results would be loaded
    * into an instance of the `AdapterPopulatedRecordArray`.
    */
  @JSImport("ember-data", "default.AdapterPopulatedRecordArray")
  @js.native
  class AdapterPopulatedRecordArray[T] ()
    extends typings.emberData.mod.DS.AdapterPopulatedRecordArray[T]
  
  /**
    * A BelongsToReference is a low level API that allows users and
    * addon author to perform meta-operations on a belongs-to
    * relationship.
    */
  @JSImport("ember-data", "default.BelongsToReference")
  @js.native
  class BelongsToReference ()
    extends typings.emberData.mod.DS.BelongsToReference
  
  /**
    * The `DS.BooleanTransform` class is used to serialize and deserialize
    * boolean attributes on Ember Data record objects. This transform is
    * used when `boolean` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @JSImport("ember-data", "default.BooleanTransform")
  @js.native
  class BooleanTransform ()
    extends typings.emberData.mod.DS.BooleanTransform
  
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
  @JSImport("ember-data", "default.BuildURLMixin")
  @js.native
  class BuildURLMixin ()
    extends typings.emberData.mod.DS.BuildURLMixin
  
  /**
    * A `DS.ConflictError` equates to a HTTP `409 Conflict` response status.
    * It is used by an adapter to indicate that the request could not be processed
    * because of a conflict in the request. An example scenario would be when
    * creating a record with a client generated id but that id is already known
    * to the external API.
    */
  @JSImport("ember-data", "default.ConflictError")
  @js.native
  class ConflictError ()
    extends typings.emberData.mod.DS.ConflictError
  
  /**
    * The `DS.DateTransform` class is used to serialize and deserialize
    * date attributes on Ember Data record objects. This transform is used
    * when `date` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function. It uses the [`ISO 8601`](https://en.wikipedia.org/wiki/ISO_8601)
    * standard.
    */
  @JSImport("ember-data", "default.DateTransform")
  @js.native
  class DateTransform ()
    extends typings.emberData.mod.DS.DateTransform
  
  /**
    * ## Using Embedded Records
    */
  @JSImport("ember-data", "default.EmbeddedRecordsMixin")
  @js.native
  class EmbeddedRecordsMixin ()
    extends typings.emberData.mod.DS.EmbeddedRecordsMixin
  
  @JSImport("ember-data", "default.Errors")
  @js.native
  class Errors ()
    extends typings.emberData.mod.DS.Errors
  
  /**
    * Represents a list of records whose membership is determined by the
    * store. As records are created, loaded, or modified, the store
    * evaluates them to determine if they should be part of the record
    * array.
    */
  @JSImport("ember-data", "default.FilteredRecordArray")
  @js.native
  class FilteredRecordArray[T] ()
    extends typings.emberData.mod.DS.FilteredRecordArray[T]
  
  /**
    * A `DS.ForbiddenError` equates to a HTTP `403 Forbidden` response status.
    * It is used by an adapter to signal that a request to the external API was
    * valid but the server is refusing to respond to it. If authorization was
    * provided and is valid, then the authenticated user does not have the
    * necessary permissions for the request.
    */
  @JSImport("ember-data", "default.ForbiddenError")
  @js.native
  class ForbiddenError ()
    extends typings.emberData.mod.DS.ForbiddenError
  
  /**
    * A HasManyReference is a low level API that allows users and addon
    * author to perform meta-operations on a has-many relationship.
    */
  @JSImport("ember-data", "default.HasManyReference")
  @js.native
  class HasManyReference[T] ()
    extends typings.emberData.mod.DS.HasManyReference[T]
  
  /**
    * A `DS.InvalidError` is used by an adapter to signal the external API
    * was unable to process a request because the content was not
    * semantically correct or meaningful per the API. Usually this means a
    * record failed some form of server side validation. When a promise
    * from an adapter is rejected with a `DS.InvalidError` the record will
    * transition to the `invalid` state and the errors will be set to the
    * `errors` property on the record.
    */
  @JSImport("ember-data", "default.InvalidError")
  @js.native
  class InvalidError protected ()
    extends typings.emberData.mod.DS.InvalidError {
    def this(errors: js.Array[_]) = this()
  }
  
  /**
    * The `JSONAPIAdapter` is the default adapter used by Ember Data. It
    * is responsible for transforming the store's requests into HTTP
    * requests that follow the [JSON API](http://jsonapi.org/format/)
    * format.
    */
  @JSImport("ember-data", "default.JSONAPIAdapter")
  @js.native
  class JSONAPIAdapter ()
    extends typings.emberData.mod.DS.JSONAPIAdapter
  
  /**
    * Ember Data 2.0 Serializer:
    */
  @JSImport("ember-data", "default.JSONAPISerializer")
  @js.native
  class JSONAPISerializer ()
    extends typings.emberData.mod.DS.JSONAPISerializer
  
  /**
    * Ember Data 2.0 Serializer:
    */
  @JSImport("ember-data", "default.JSONSerializer")
  @js.native
  class JSONSerializer ()
    extends typings.emberData.mod.DS.JSONSerializer
  
  @JSImport("ember-data", "default.ManyArray")
  @js.native
  class ManyArray[T] ()
    extends typings.emberData.mod.DS.ManyArray[T]
  
  /**
    * The model class that all Ember Data records descend from.
    * This is the public API of Ember Data models. If you are using Ember Data
    * in your application, this is the class you should use.
    * If you are working on Ember Data internals, you most likely want to be dealing
    * with `InternalModel`
    */
  @JSImport("ember-data", "default.Model")
  @js.native
  class Model ()
    extends typings.emberData.mod.DS.Model
  object Model {
    
    @JSImport("ember-data", "default.Model")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are the meta object for the
      * property.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.attributes")
    @js.native
    def attributes: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def attributes_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
    
    /**
      * Iterates through the attributes of the model, calling the passed function on each
      * attribute.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.eachAttribute")
    @js.native
    def eachAttribute[Class /* <: TypeofModel with Instantiable0[typings.emberData.mod.DS.Model] */, M /* <: InstanceType[Class] */](callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
    @JSImport("ember-data", "default.Model.eachAttribute")
    @js.native
    def eachAttribute[Class /* <: TypeofModel with Instantiable0[typings.emberData.mod.DS.Model] */, M /* <: InstanceType[Class] */](
      callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit],
      binding: js.Any
    ): Unit = js.native
    
    /**
      * Given a callback, iterates over each of the types related to a model,
      * invoking the callback with the related type's class. Each type will be
      * returned just once, regardless of how many different relationships it has
      * with a model.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.eachRelatedType")
    @js.native
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit]): Unit = js.native
    @JSImport("ember-data", "default.Model.eachRelatedType")
    @js.native
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit], binding: js.Any): Unit = js.native
    
    /**
      * Given a callback, iterates over each of the relationships in the model,
      * invoking the callback with the name of each relationship and its relationship
      * descriptor.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.eachRelationship")
    @js.native
    def eachRelationship[M /* <: typings.emberData.mod.DS.Model */](callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit]): Unit = js.native
    @JSImport("ember-data", "default.Model.eachRelationship")
    @js.native
    def eachRelationship[M /* <: typings.emberData.mod.DS.Model */](
      callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit],
      binding: js.Any
    ): Unit = js.native
    
    /**
      * Iterates through the transformedAttributes of the model, calling
      * the passed function on each attribute. Note the callback will not be
      * called for any attributes that do not have an transformation type.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.eachTransformedAttribute")
    @js.native
    def eachTransformedAttribute[Class /* <: TypeofModel with Instantiable0[typings.emberData.mod.DS.Model] */](
      callback: js.Function2[
          /* name */ ModelKeys[InstanceType[Class]], 
          /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ /* type */ string | boolean | number | date, 
          Unit
        ]
    ): Unit = js.native
    @JSImport("ember-data", "default.Model.eachTransformedAttribute")
    @js.native
    def eachTransformedAttribute[Class /* <: TypeofModel with Instantiable0[typings.emberData.mod.DS.Model] */](
      callback: js.Function2[
          /* name */ ModelKeys[InstanceType[Class]], 
          /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ /* type */ string | boolean | number | date, 
          Unit
        ],
      binding: js.Any
    ): Unit = js.native
    
    /**
      * A map whose keys are the fields of the model and whose values are strings
      * describing the kind of the field. A model's fields are the union of all of its
      * attributes and relationships.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.fields")
    @js.native
    def fields: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def fields_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    /**
      * Find the relationship which is the inverse of the one asked for.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.inverseFor")
    @js.native
    def inverseFor[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](name: K, store: typings.emberData.mod.DS.Store): js.Object = js.native
    
    /**
      * Represents the model's class name as a string. This can be used to look up the model's class name through
      * `DS.Store`'s modelFor method.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.modelName")
    @js.native
    def modelName: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String = js.native
    @scala.inline
    def modelName_=(x: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelName")(x.asInstanceOf[js.Any])
    
    /**
      * An array of types directly related to a model. Each type will be
      * included once, regardless of the number of relationships it has with
      * the model.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.relatedTypes")
    @js.native
    def relatedTypes: ComputedProperty[NativeArray[String], NativeArray[String]] = js.native
    @scala.inline
    def relatedTypes_=(x: ComputedProperty[NativeArray[String], NativeArray[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relatedTypes")(x.asInstanceOf[js.Any])
    
    /**
      * A hash containing lists of the model's relationships, grouped
      * by the relationship kind. For example, given a model with this
      * definition:
      */
    /* static member */
    @JSImport("ember-data", "default.Model.relationshipNames")
    @js.native
    def relationshipNames: ComputedProperty[js.Object, js.Object] = js.native
    @scala.inline
    def relationshipNames_=(x: ComputedProperty[js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relationshipNames")(x.asInstanceOf[js.Any])
    
    /**
      * The model's relationships as a map, keyed on the type of the
      * relationship. The value of each entry is an array containing a descriptor
      * for each relationship with that type, describing the name of the relationship
      * as well as the type.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.relationships")
    @js.native
    def relationships: ComputedProperty[Map, Map] = js.native
    
    /**
      * A map whose keys are the relationships of a model and whose values are
      * relationship descriptors.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.relationshipsByName")
    @js.native
    def relationshipsByName: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def relationshipsByName_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relationshipsByName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def relationships_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relationships")(x.asInstanceOf[js.Any])
    
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are type of transformation
      * applied to each attribute. This map does not include any
      * attributes that do not have an transformation type.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.transformedAttributes")
    @js.native
    def transformedAttributes: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def transformedAttributes_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformedAttributes")(x.asInstanceOf[js.Any])
    
    /**
      * For a given relationship name, returns the model type of the relationship.
      */
    /* static member */
    @JSImport("ember-data", "default.Model.typeForRelationship")
    @js.native
    def typeForRelationship[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](name: K, store: typings.emberData.mod.DS.Store): /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  }
  
  /**
    * A `DS.NotFoundError` equates to a HTTP `404 Not Found` response status.
    * It is used by an adapter to signal that a request to the external API
    * was rejected because the resource could not be found on the API.
    */
  @JSImport("ember-data", "default.NotFoundError")
  @js.native
  class NotFoundError ()
    extends typings.emberData.mod.DS.NotFoundError
  
  /**
    * The `DS.NumberTransform` class is used to serialize and deserialize
    * numeric attributes on Ember Data record objects. This transform is
    * used when `number` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @JSImport("ember-data", "default.NumberTransform")
  @js.native
  class NumberTransform ()
    extends typings.emberData.mod.DS.NumberTransform
  
  @JSImport("ember-data", "default.PromiseArray")
  @js.native
  class PromiseArray[T] ()
    extends typings.emberData.mod.DS.PromiseArray[T]
  
  /**
    * A PromiseManyArray is a PromiseArray that also proxies certain method calls
    * to the underlying manyArray.
    * Right now we proxy:
    */
  @JSImport("ember-data", "default.PromiseManyArray")
  @js.native
  class PromiseManyArray[T /* <: typings.emberData.mod.DS.Model */] ()
    extends typings.emberData.mod.DS.PromiseManyArray[T]
  
  @JSImport("ember-data", "default.PromiseObject")
  @js.native
  class PromiseObject[T] ()
    extends typings.emberData.mod.DS.PromiseObject[T]
  
  /**
    * The REST adapter allows your store to communicate with an HTTP server by
    * transmitting JSON via XHR. Most Ember.js apps that consume a JSON API
    * should use the REST adapter.
    */
  @JSImport("ember-data", "default.RESTAdapter")
  @js.native
  class RESTAdapter ()
    extends typings.emberData.mod.DS.RESTAdapter
  
  /**
    * Normally, applications will use the `RESTSerializer` by implementing
    * the `normalize` method.
    */
  @JSImport("ember-data", "default.RESTSerializer")
  @js.native
  class RESTSerializer ()
    extends typings.emberData.mod.DS.RESTSerializer
  
  @JSImport("ember-data", "default.RecordArray")
  @js.native
  class RecordArray[T] ()
    extends typings.emberData.mod.DS.RecordArray[T]
  
  /**
    * An RecordReference is a low level API that allows users and
    * addon author to perform meta-operations on a record.
    */
  @JSImport("ember-data", "default.RecordReference")
  @js.native
  class RecordReference[T /* <: typings.emberData.mod.DS.Model */] ()
    extends typings.emberData.mod.DS.RecordReference[T]
  
  /**
    * ### State
    */
  @JSImport("ember-data", "default.RootState")
  @js.native
  class RootState ()
    extends typings.emberData.mod.DS.RootState
  
  /**
    * `DS.Serializer` is an abstract base class that you should override in your
    * application to customize it for your backend. The minimum set of methods
    * that you should implement is:
    */
  @JSImport("ember-data", "default.Serializer")
  @js.native
  class Serializer ()
    extends typings.emberData.mod.DS.Serializer
  
  /**
    * A `DS.ServerError` equates to a HTTP `500 Internal Server Error` response
    * status. It is used by the adapter to indicate that a request has failed
    * because of an error in the external API.
    */
  @JSImport("ember-data", "default.ServerError")
  @js.native
  class ServerError ()
    extends typings.emberData.mod.DS.ServerError
  
  @JSImport("ember-data", "default.Snapshot")
  @js.native
  class Snapshot[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */] ()
    extends typings.emberData.mod.DS.Snapshot[K]
  
  @JSImport("ember-data", "default.SnapshotRecordArray")
  @js.native
  class SnapshotRecordArray[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */] ()
    extends typings.emberData.mod.DS.SnapshotRecordArray[K]
  
  /**
    * The store contains all of the data for records loaded from the server.
    * It is also responsible for creating instances of `DS.Model` that wrap
    * the individual data for a record, so that they can be bound to in your
    * Handlebars templates.
    */
  @JSImport("ember-data", "default.Store")
  @js.native
  class Store ()
    extends typings.emberData.mod.DS.Store
  
  /**
    * The `DS.StringTransform` class is used to serialize and deserialize
    * string attributes on Ember Data record objects. This transform is
    * used when `string` is passed as the type parameter to the
    * [DS.attr](../../data#method_attr) function.
    */
  @JSImport("ember-data", "default.StringTransform")
  @js.native
  class StringTransform ()
    extends typings.emberData.mod.DS.StringTransform
  
  /**
    * A `DS.TimeoutError` is used by an adapter to signal that a request
    * to the external API has timed out. I.e. no response was received from
    * the external API within an allowed time period.
    */
  @JSImport("ember-data", "default.TimeoutError")
  @js.native
  class TimeoutError ()
    extends typings.emberData.mod.DS.TimeoutError
  
  /**
    * The `DS.Transform` class is used to serialize and deserialize model
    * attributes when they are saved or loaded from an
    * adapter. Subclassing `DS.Transform` is useful for creating custom
    * attributes. All subclasses of `DS.Transform` must implement a
    * `serialize` and a `deserialize` method.
    */
  @JSImport("ember-data", "default.Transform")
  @js.native
  class Transform ()
    extends typings.emberData.mod.DS.Transform
  
  /**
    * A `DS.UnauthorizedError` equates to a HTTP `401 Unauthorized` response
    * status. It is used by an adapter to signal that a request to the external
    * API was rejected because authorization is required and has failed or has not
    * yet been provided.
    */
  @JSImport("ember-data", "default.UnauthorizedError")
  @js.native
  class UnauthorizedError ()
    extends typings.emberData.mod.DS.UnauthorizedError
  
  @JSImport("ember-data", "default.VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr(): ComputedProperty[_, _] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr(options: AttrOptions[_]): ComputedProperty[_, _] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr(target: js.Any, propertyKey: String): Unit = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_boolean(`type`: boolean): ComputedProperty[Boolean, Boolean] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_boolean(`type`: boolean, options: AttrOptions[Boolean]): ComputedProperty[Boolean, Boolean] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_date(`type`: date): ComputedProperty[Date, Date] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_date(`type`: date, options: AttrOptions[Date]): ComputedProperty[Date, Date] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_number(`type`: number): ComputedProperty[Double, Double] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_number(`type`: number, options: AttrOptions[Double]): ComputedProperty[Double, Double] = js.native
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_string(`type`: string): ComputedProperty[String, String] = js.native
  @JSImport("ember-data", "default.attr")
  @js.native
  def attr_string(`type`: string, options: AttrOptions[String]): ComputedProperty[String, String] = js.native
  
  @JSImport("ember-data", "default.belongsTo")
  @js.native
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typings.emberData.mod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  @JSImport("ember-data", "default.belongsTo")
  @js.native
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    modelName: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Sync with Async
  ): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  
  /**
    * Convert an array of errors in JSON-API format into an object.
    */
  @JSImport("ember-data", "default.errorsArrayToHash")
  @js.native
  def errorsArrayToHash(errors: js.Array[_]): js.Object = js.native
  
  /**
    * Convert an hash of errors into an array with errors in JSON-API format.
    */
  @JSImport("ember-data", "default.errorsHashToArray")
  @js.native
  def errorsHashToArray(errors: js.Object): js.Array[_] = js.native
  
  @JSImport("ember-data", "default.hasMany")
  @js.native
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](`type`: K): ComputedProperty[
    typings.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  /**
    * `DS.hasMany` is used to define One-To-Many and Many-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  @JSImport("ember-data", "default.hasMany")
  @js.native
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Sync with Async
  ): ComputedProperty[
    typings.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  
  /**
    * This method normalizes a modelName into the format Ember Data uses
    * internally.
    */
  @JSImport("ember-data", "default.normalizeModelName")
  @js.native
  def normalizeModelName[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): String = js.native
}
