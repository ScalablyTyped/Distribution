package typings.emberDashData.emberDashDataMod.DS

import typings.ember.emberMod.default.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "DS.belongsTo")
@js.native
object belongsTo extends js.Object {
  def apply[K /* <: String */](modelName: K): ComputedProperty[
    (/* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def apply[K /* <: String */](
    modelName: K,
    options: (RelationshipOptions[
      /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with (Async | Sync)
  ): ComputedProperty[
    /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
}

