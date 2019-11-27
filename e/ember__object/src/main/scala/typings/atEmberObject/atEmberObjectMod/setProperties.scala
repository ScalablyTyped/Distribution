package typings.atEmberObject.atEmberObjectMod

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: String */](
    obj: T,
    hash: Pick[
      (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UnwrapComputedPropertySetters<T> */ _) | T, 
      K
    ]
  ): Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UnwrapComputedPropertyGetters<T> */ _, 
    K
  ] = js.native
}

