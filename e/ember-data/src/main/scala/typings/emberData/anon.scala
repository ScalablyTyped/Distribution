package typings.emberData

import typings.ember.mod.Ember.NativeArray
import typings.ember.mod.default.ComputedProperty
import typings.ember.mod.default.Map
import typings.emberData.emberDataBooleans.`false`
import typings.emberData.emberDataBooleans.`true`
import typings.emberData.emberDataStrings.boolean
import typings.emberData.emberDataStrings.date
import typings.emberData.emberDataStrings.number
import typings.emberData.emberDataStrings.string
import typings.emberData.mod.AttributeMeta
import typings.emberData.mod.DS.Model
import typings.emberData.mod.DS.Store
import typings.emberData.mod.ModelKeys
import typings.emberData.mod.RelationshipMeta
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var ids: `true` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(ids: `true`): `0` = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: `true`): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AdapterOptions extends StObject {
    
    var adapterOptions: js.UndefOr[js.Object] = js.native
  }
  object AdapterOptions {
    
    @scala.inline
    def apply(): AdapterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdapterOptions]
    }
    
    @scala.inline
    implicit class AdapterOptionsMutableBuilder[Self <: AdapterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapterOptions(value: js.Object): Self = StObject.set(x, "adapterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterOptionsUndefined: Self = StObject.set(x, "adapterOptions", js.undefined)
    }
  }
  
  @js.native
  trait BackgroundReload extends StObject {
    
    var adapterOptions: js.UndefOr[js.Any] = js.native
    
    var backgroundReload: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[String] = js.native
    
    var reload: js.UndefOr[Boolean] = js.native
  }
  object BackgroundReload {
    
    @scala.inline
    def apply(): BackgroundReload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundReload]
    }
    
    @scala.inline
    implicit class BackgroundReloadMutableBuilder[Self <: BackgroundReload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapterOptions(value: js.Any): Self = StObject.set(x, "adapterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterOptionsUndefined: Self = StObject.set(x, "adapterOptions", js.undefined)
      
      @scala.inline
      def setBackgroundReload(value: Boolean): Self = StObject.set(x, "backgroundReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundReloadUndefined: Self = StObject.set(x, "backgroundReload", js.undefined)
      
      @scala.inline
      def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: `true` = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: `true`): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: `true`): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ids extends StObject {
    
    var ids: `false` = js.native
  }
  object Ids {
    
    @scala.inline
    def apply(ids: `false`): Ids = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids]
    }
    
    @scala.inline
    implicit class IdsMutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: `false`): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IncludeId extends StObject {
    
    var includeId: js.UndefOr[Boolean] = js.native
  }
  object IncludeId {
    
    @scala.inline
    def apply(): IncludeId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeId]
    }
    
    @scala.inline
    implicit class IncludeIdMutableBuilder[Self <: IncludeId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeId(value: Boolean): Self = StObject.set(x, "includeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeIdUndefined: Self = StObject.set(x, "includeId", js.undefined)
    }
  }
  
  @js.native
  trait TypeofModel extends StObject {
    
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are the meta object for the
      * property.
      */
    /* static member */
    var attributes: ComputedProperty[Map, Map] = js.native
    
    /**
      * Iterates through the attributes of the model, calling the passed function on each
      * attribute.
      */
    /* static member */
    def eachAttribute[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any */, M /* <: InstanceType[Class] */](callback: js.Function2[/* name */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
    def eachAttribute[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any */, M /* <: InstanceType[Class] */](
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
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit]): Unit = js.native
    def eachRelatedType(callback: js.Function1[/* name */ String, Unit], binding: js.Any): Unit = js.native
    
    /**
      * Given a callback, iterates over each of the relationships in the model,
      * invoking the callback with the name of each relationship and its relationship
      * descriptor.
      */
    /* static member */
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
    /* static member */
    def eachTransformedAttribute[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any */](
      callback: js.Function2[
          /* name */ ModelKeys[InstanceType[Class]], 
          /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ /* type */ string | boolean | number | date, 
          Unit
        ]
    ): Unit = js.native
    def eachTransformedAttribute[Class /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any */](
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
    var fields: ComputedProperty[Map, Map] = js.native
    
    /**
      * Find the relationship which is the inverse of the one asked for.
      */
    /* static member */
    def inverseFor[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](name: K, store: Store): js.Object = js.native
    
    /**
      * Represents the model's class name as a string. This can be used to look up the model's class name through
      * `DS.Store`'s modelFor method.
      */
    /* static member */
    var modelName: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String = js.native
    
    /**
      * An array of types directly related to a model. Each type will be
      * included once, regardless of the number of relationships it has with
      * the model.
      */
    /* static member */
    var relatedTypes: ComputedProperty[NativeArray[String], NativeArray[String]] = js.native
    
    /**
      * A hash containing lists of the model's relationships, grouped
      * by the relationship kind. For example, given a model with this
      * definition:
      */
    /* static member */
    var relationshipNames: ComputedProperty[js.Object, js.Object] = js.native
    
    /**
      * The model's relationships as a map, keyed on the type of the
      * relationship. The value of each entry is an array containing a descriptor
      * for each relationship with that type, describing the name of the relationship
      * as well as the type.
      */
    /* static member */
    var relationships: ComputedProperty[Map, Map] = js.native
    
    /**
      * A map whose keys are the relationships of a model and whose values are
      * relationship descriptors.
      */
    /* static member */
    var relationshipsByName: ComputedProperty[Map, Map] = js.native
    
    /**
      * A map whose keys are the attributes of the model (properties
      * described by DS.attr) and whose values are type of transformation
      * applied to each attribute. This map does not include any
      * attributes that do not have an transformation type.
      */
    /* static member */
    var transformedAttributes: ComputedProperty[Map, Map] = js.native
    
    /**
      * For a given relationship name, returns the model type of the relationship.
      */
    /* static member */
    def typeForRelationship[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](name: K, store: Store): /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  }
}
