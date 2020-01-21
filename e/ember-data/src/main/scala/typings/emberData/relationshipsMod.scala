package typings.emberData

import typings.ember.mod.Ember.Array
import typings.ember.mod.default.ComputedProperty
import typings.emberData.mod.DS.Async
import typings.emberData.mod.DS.PromiseManyArray
import typings.emberData.mod.DS.PromiseObject
import typings.emberData.mod.DS.RelationshipOptions
import typings.emberData.mod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/relationships", JSImport.Namespace)
@js.native
object relationshipsMod extends js.Object {
  @js.native
  object belongsTo extends js.Object {
    def apply[K /* <: String */](modelName: K): ComputedProperty[
        (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]), 
        /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    def apply[K /* <: String */](
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
  }
  
  @js.native
  object hasMany extends js.Object {
    def apply[K /* <: String */](`type`: K): ComputedProperty[
        PromiseManyArray[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ], 
        Array[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]
      ] = js.native
    def apply[K /* <: String */](
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
  
}

