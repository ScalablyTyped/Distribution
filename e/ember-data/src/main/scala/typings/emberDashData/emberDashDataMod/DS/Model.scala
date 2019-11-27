package typings.emberDashData.emberDashDataMod.DS

import typings.ember.emberMod.Ember.NativeArray
import typings.ember.emberMod.default.ComputedProperty
import typings.ember.emberMod.default.Map
import typings.emberDashData.Anon_AdapterOptions
import typings.emberDashData.Anon_IncludeId
import typings.emberDashData.ModelKeys
import typings.emberDashData.TypeofClassModel
import typings.emberDashData.emberDashDataMod.AttributeMeta
import typings.emberDashData.emberDashDataMod.ChangedAttributes
import typings.emberDashData.emberDashDataMod.RelationshipMeta
import typings.emberDashData.emberDashDataMod.RelationshipsFor
import typings.rsvp.rsvpMod.default.Promise
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The model class that all Ember Data records descend from.
  * This is the public API of Ember Data models. If you are using Ember Data
  * in your application, this is the class you should use.
  * If you are working on Ember Data internals, you most likely want to be dealing
  * with `InternalModel`
  */
@JSImport("ember-data", "DS.Model")
@js.native
class Model ()
  extends typings.atEmberObject.atEmberObjectMod.default {
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

/* static members */
@JSImport("ember-data", "DS.Model")
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
  def typeForRelationship[K /* <: String */](name: K, store: Store): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any = js.native
}

