package typings.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributesFor[Model /* <: typings.emberData.mod.DS.Model */] = typings.emberData.mod.ModelKeys[Model]
  
  type ChangedAttributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  
  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: typings.emberData.mod.DS.Model */] = typings.std.Exclude[
    /* keyof Model */ java.lang.String, 
    /* keyof ember-data.ember-data.DS.Model */ typings.emberData.emberDataStrings.isEmpty | typings.emberData.emberDataStrings.isLoading | typings.emberData.emberDataStrings.isLoaded | typings.emberData.emberDataStrings.hasDirtyAttributes | typings.emberData.emberDataStrings.isSaving | typings.emberData.emberDataStrings.isDeleted | typings.emberData.emberDataStrings.isNew | typings.emberData.emberDataStrings.isValid | typings.emberData.emberDataStrings.dirtyType | typings.emberData.emberDataStrings.isError | typings.emberData.emberDataStrings.isReloading | typings.emberData.emberDataStrings.id | typings.emberData.emberDataStrings.store | typings.emberData.emberDataStrings.errors | typings.emberData.emberDataStrings.adapterError | typings.emberData.emberDataStrings.serialize | typings.emberData.emberDataStrings.toJSON | typings.emberData.emberDataStrings.ready | typings.emberData.emberDataStrings.didLoad | typings.emberData.emberDataStrings.didUpdate | typings.emberData.emberDataStrings.didCreate | typings.emberData.emberDataStrings.didDelete | typings.emberData.emberDataStrings.becameInvalid | typings.emberData.emberDataStrings.becameError | typings.emberData.emberDataStrings.rolledBack | typings.emberData.emberDataStrings.deleteRecord | typings.emberData.emberDataStrings.destroyRecord | typings.emberData.emberDataStrings.unloadRecord | typings.emberData.emberDataStrings.changedAttributes | typings.emberData.emberDataStrings.rollbackAttributes | typings.emberData.emberDataStrings.save | typings.emberData.emberDataStrings.reload | typings.emberData.emberDataStrings.belongsTo | typings.emberData.emberDataStrings.hasMany | typings.emberData.emberDataStrings.eachRelationship | typings.emberData.emberDataStrings.modelName | typings.emberData.emberDataStrings.typeForRelationship | typings.emberData.emberDataStrings.inverseFor | typings.emberData.emberDataStrings.relationships | typings.emberData.emberDataStrings.relationshipNames | typings.emberData.emberDataStrings.relatedTypes | typings.emberData.emberDataStrings.relationshipsByName | typings.emberData.emberDataStrings.fields | typings.emberData.emberDataStrings.eachRelatedType | typings.emberData.emberDataStrings.attributes | typings.emberData.emberDataStrings.transformedAttributes | typings.emberData.emberDataStrings.eachAttribute | typings.emberData.emberDataStrings.eachTransformedAttribute
  ]
  
  type RelationshipsFor[Model /* <: typings.emberData.mod.DS.Model */] = typings.emberData.mod.ModelKeys[Model]
}
