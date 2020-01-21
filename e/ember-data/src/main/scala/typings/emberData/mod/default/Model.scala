package typings.emberData.mod.default

import typings.ember.mod.Ember.NativeArray
import typings.ember.mod.default.ComputedProperty
import typings.ember.mod.default.Map
import typings.emberData.TypeofClassModel
import typings.emberData.mod.AttributeMeta
import typings.emberData.mod.ModelKeys
import typings.emberData.mod.RelationshipMeta
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
@JSImport("ember-data", "Model")
@js.native
class Model ()
  extends typings.emberData.mod.DS.Model

/* static members */
@JSImport("ember-data", "Model")
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
  def eachAttribute[Class /* <: TypeofClassModel */, M /* <: InstanceType[Class] */](callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
  def eachAttribute[Class /* <: TypeofClassModel */, M /* <: InstanceType[Class] */](
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
  def eachRelationship[M /* <: typings.emberData.mod.DS.Model */](callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit]): Unit = js.native
  def eachRelationship[M /* <: typings.emberData.mod.DS.Model */](
    callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit],
    binding: js.Any
  ): Unit = js.native
  /**
    * Iterates through the transformedAttributes of the model, calling
    * the passed function on each attribute. Note the callback will not be
    * called for any attributes that do not have an transformation type.
    */
  def eachTransformedAttribute[Class /* <: TypeofClassModel */](callback: js.Function2[/* name */ ModelKeys[InstanceType[Class]], /* type */ String, Unit]): Unit = js.native
  def eachTransformedAttribute[Class /* <: TypeofClassModel */](
    callback: js.Function2[/* name */ ModelKeys[InstanceType[Class]], /* type */ String, Unit],
    binding: js.Any
  ): Unit = js.native
  /**
    * Find the relationship which is the inverse of the one asked for.
    */
  def inverseFor[K /* <: String */](name: K, store: typings.emberData.mod.DS.Store): js.Object = js.native
  /**
    * For a given relationship name, returns the model type of the relationship.
    */
  def typeForRelationship[K /* <: String */](name: K, store: typings.emberData.mod.DS.Store): /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
}

