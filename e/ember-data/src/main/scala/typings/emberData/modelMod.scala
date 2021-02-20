package typings.emberData

import org.scalablytyped.runtime.Instantiable0
import typings.ember.mod.Ember.NativeArray
import typings.ember.mod.default.ComputedProperty
import typings.ember.mod.default.Map
import typings.emberData.anon.TypeofModel
import typings.emberData.emberDataStrings.boolean
import typings.emberData.emberDataStrings.date
import typings.emberData.emberDataStrings.number
import typings.emberData.emberDataStrings.string
import typings.emberData.mod.AttributeMeta
import typings.emberData.mod.DS.Store
import typings.emberData.mod.ModelKeys
import typings.emberData.mod.RelationshipMeta
import typings.emberData.mod.default.Model
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  /**
    * The model class that all Ember Data records descend from.
    * This is the public API of Ember Data models. If you are using Ember Data
    * in your application, this is the class you should use.
    * If you are working on Ember Data internals, you most likely want to be dealing
    * with `InternalModel`
    */
  @JSImport("ember-data/model", JSImport.Default)
  @js.native
  class default () extends Model
  object default {
    
    @JSImport("ember-data/model", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are the meta object for the
      * property.
      */
    /* static member */
    @JSImport("ember-data/model", "default.attributes")
    @js.native
    def attributes: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def attributes_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
    
    /**
      * Iterates through the attributes of the model, calling the passed function on each
      * attribute.
      */
    /* static member */
    @JSImport("ember-data/model", "default.eachAttribute")
    @js.native
    def eachAttribute[Class /* <: TypeofModel with Instantiable0[typings.emberData.mod.DS.Model] */, M /* <: InstanceType[Class] */](callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
    @JSImport("ember-data/model", "default.eachAttribute")
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
    @JSImport("ember-data/model", "default.eachRelatedType")
    @js.native
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit]): Unit = js.native
    @JSImport("ember-data/model", "default.eachRelatedType")
    @js.native
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit], binding: js.Any): Unit = js.native
    
    /**
      * Given a callback, iterates over each of the relationships in the model,
      * invoking the callback with the name of each relationship and its relationship
      * descriptor.
      */
    /* static member */
    @JSImport("ember-data/model", "default.eachRelationship")
    @js.native
    def eachRelationship[M /* <: typings.emberData.mod.DS.Model */](callback: js.Function2[/* name */ String, /* details */ RelationshipMeta[M], Unit]): Unit = js.native
    @JSImport("ember-data/model", "default.eachRelationship")
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
    @JSImport("ember-data/model", "default.eachTransformedAttribute")
    @js.native
    def eachTransformedAttribute[Class /* <: TypeofModel with Instantiable0[typings.emberData.mod.DS.Model] */](
      callback: js.Function2[
          /* name */ ModelKeys[InstanceType[Class]], 
          /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ /* type */ string | boolean | number | date, 
          Unit
        ]
    ): Unit = js.native
    @JSImport("ember-data/model", "default.eachTransformedAttribute")
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
    @JSImport("ember-data/model", "default.fields")
    @js.native
    def fields: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def fields_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    /**
      * Find the relationship which is the inverse of the one asked for.
      */
    /* static member */
    @JSImport("ember-data/model", "default.inverseFor")
    @js.native
    def inverseFor[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](name: K, store: Store): js.Object = js.native
    
    /**
      * Represents the model's class name as a string. This can be used to look up the model's class name through
      * `DS.Store`'s modelFor method.
      */
    /* static member */
    @JSImport("ember-data/model", "default.modelName")
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
    @JSImport("ember-data/model", "default.relatedTypes")
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
    @JSImport("ember-data/model", "default.relationshipNames")
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
    @JSImport("ember-data/model", "default.relationships")
    @js.native
    def relationships: ComputedProperty[Map, Map] = js.native
    
    /**
      * A map whose keys are the relationships of a model and whose values are
      * relationship descriptors.
      */
    /* static member */
    @JSImport("ember-data/model", "default.relationshipsByName")
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
    @JSImport("ember-data/model", "default.transformedAttributes")
    @js.native
    def transformedAttributes: ComputedProperty[Map, Map] = js.native
    @scala.inline
    def transformedAttributes_=(x: ComputedProperty[Map, Map]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformedAttributes")(x.asInstanceOf[js.Any])
    
    /**
      * For a given relationship name, returns the model type of the relationship.
      */
    /* static member */
    @JSImport("ember-data/model", "default.typeForRelationship")
    @js.native
    def typeForRelationship[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](name: K, store: Store): /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  }
}
