package typings.emberDashData.emberDashDataMod.default

import typings.ember.emberMod.default.ComputedProperty
import typings.emberDashData.emberDashDataMod.DS.Async
import typings.emberDashData.emberDashDataMod.DS.RelationshipOptions
import typings.emberDashData.emberDashDataMod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "belongsTo")
@js.native
object belongsTo extends js.Object {
  def apply[K /* <: String */](modelName: K): ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any) with (typings.emberDashData.emberDashDataMod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any
  ] = js.native
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def apply[K /* <: String */](
    modelName: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any
    ]) with (Async | Sync)
  ): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModelRegistry * / any[K] */ js.Any
  ] = js.native
}

