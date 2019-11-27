package typings.ember.emberMod.default

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "getProperties")
@js.native
object getProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, list: K*): Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UnwrapComputedPropertyGetters<T> */ _, 
    K
  ] = js.native
  def apply[T, K /* <: java.lang.String */](obj: T, list: js.Array[K]): Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UnwrapComputedPropertyGetters<T> */ _, 
    K
  ] = js.native
}

