package typings.ember.emberMod.default

import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "getProperties")
@js.native
object getProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def apply[T, K /* <: java.lang.String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

