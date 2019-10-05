package typings.ember.emberMod.Ember

import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.getWithDefault")
@js.native
object getWithDefault extends js.Object {
  def apply[T, K /* <: String */](
    obj: T,
    key: K,
    defaultValue: UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
}

