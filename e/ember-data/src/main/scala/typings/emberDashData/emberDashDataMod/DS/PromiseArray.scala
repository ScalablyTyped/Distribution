package typings.emberDashData.emberDashDataMod.DS

import typings.ember.emberMod.default.ArrayProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `PromiseArray` is an object that acts like both an `Ember.Array`
  * and a promise. When the promise is resolved the resulting value
  * will be set to the `PromiseArray`'s `content` property. This makes
  * it easy to create data bindings with the `PromiseArray` that will be
  * updated when the promise resolves.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PromiseProxyMixin<Ember.ArrayProxy<T>> * / any */ @JSImport("ember-data", "DS.PromiseArray")
@js.native
class PromiseArray[T] () extends ArrayProxy[T]

