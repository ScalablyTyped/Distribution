package typings.ember.emberMod.default

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](
    obj: T,
    hash: Pick[
      (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UnwrapComputedPropertySetters<T> */ _) | T, 
      K
    ]
  ): Pick[T, K] = js.native
}

