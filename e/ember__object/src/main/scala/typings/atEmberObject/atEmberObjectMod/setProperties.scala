package typings.atEmberObject.atEmberObjectMod

import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertySetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

