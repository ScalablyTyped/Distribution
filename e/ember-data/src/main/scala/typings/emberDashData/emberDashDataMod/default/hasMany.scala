package typings.emberDashData.emberDashDataMod.default

import typings.ember.emberMod.Ember.Array
import typings.ember.emberMod.default.ComputedProperty
import typings.emberDashData.emberDashDataMod.DS.Async
import typings.emberDashData.emberDashDataMod.DS.RelationshipOptions
import typings.emberDashData.emberDashDataMod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "hasMany")
@js.native
object hasMany extends js.Object {
  def apply[K /* <: String */](`type`: K): ComputedProperty[
    typings.emberDashData.emberDashDataMod.DS.PromiseManyArray[
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
  def apply[K /* <: String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with (Async | Sync)
  ): ComputedProperty[
    typings.emberDashData.emberDashDataMod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typings.emberDashData.emberDashDataMod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
}

