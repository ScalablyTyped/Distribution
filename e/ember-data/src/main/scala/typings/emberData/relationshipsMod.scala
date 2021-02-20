package typings.emberData

import typings.ember.mod.Ember.Array
import typings.ember.mod.default.ComputedProperty
import typings.emberData.mod.DS.Async
import typings.emberData.mod.DS.PromiseManyArray
import typings.emberData.mod.DS.PromiseObject
import typings.emberData.mod.DS.RelationshipOptions
import typings.emberData.mod.DS.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationshipsMod {
  
  @JSImport("ember-data/relationships", "belongsTo")
  @js.native
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  @JSImport("ember-data/relationships", "belongsTo")
  @js.native
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    modelName: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Async with Sync
  ): ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  
  @JSImport("ember-data/relationships", "hasMany")
  @js.native
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](`type`: K): ComputedProperty[
    PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  @JSImport("ember-data/relationships", "hasMany")
  @js.native
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Async with Sync
  ): ComputedProperty[
    PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
}
