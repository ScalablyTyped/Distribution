package typings.emberDashData

import typings.ember.emberMod.Ember.Array
import typings.ember.emberMod.default.ComputedProperty
import typings.emberDashData.emberDashDataMod.DS.Async
import typings.emberDashData.emberDashDataMod.DS.PromiseManyArray
import typings.emberDashData.emberDashDataMod.DS.PromiseObject
import typings.emberDashData.emberDashDataMod.DS.RelationshipOptions
import typings.emberDashData.emberDashDataMod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/relationships", JSImport.Namespace)
@js.native
object relationshipsMod extends js.Object {
  @js.native
  object belongsTo extends js.Object {
    def apply[K /* <: String */](modelName: K): ComputedProperty[
        (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]), 
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    def apply[K /* <: String */](
      modelName: K,
      options: (RelationshipOptions[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]) with (Async | Sync)
    ): ComputedProperty[
        (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]), 
        /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
  }
  
  @js.native
  object hasMany extends js.Object {
    def apply[K /* <: String */](`type`: K): ComputedProperty[
        PromiseManyArray[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ], 
        Array[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]
      ] = js.native
    def apply[K /* <: String */](
      `type`: K,
      options: (RelationshipOptions[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]) with (Async | Sync)
    ): ComputedProperty[
        PromiseManyArray[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ], 
        Array[
          /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]
      ] = js.native
  }
  
}

