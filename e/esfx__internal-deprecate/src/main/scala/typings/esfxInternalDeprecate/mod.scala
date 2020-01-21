package typings.esfxInternalDeprecate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/internal-deprecate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def deprecate[T /* <: js.Function */](fn: T, message: String): T = js.native
  def deprecateProperty[T, K /* <: String */](target: T, key: K, message: String): T = js.native
}

