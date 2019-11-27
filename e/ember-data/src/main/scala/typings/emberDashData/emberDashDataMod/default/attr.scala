package typings.emberDashData.emberDashDataMod.default

import typings.ember.emberMod.default.ComputedProperty
import typings.emberDashData.emberDashDataMod.DS.AttrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "attr")
@js.native
object attr extends js.Object {
  def apply(): ComputedProperty[_, _] = js.native
  def apply(options: AttrOptions[_]): ComputedProperty[_, _] = js.native
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  def apply[K /* <: String */](`type`: K): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformRegistry * / any[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformRegistry * / any[K] */ js.Any
  ] = js.native
  def apply[K /* <: String */](
    `type`: K,
    options: AttrOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformRegistry * / any[K] */ js.Any
    ]
  ): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformRegistry * / any[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformRegistry * / any[K] */ js.Any
  ] = js.native
}

