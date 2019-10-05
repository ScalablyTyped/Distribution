package typings.ember.emberMod.Ember

import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.getProperties")
@js.native
object getProperties extends js.Object {
  def apply[T, K /* <: String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def apply[T, K /* <: String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

