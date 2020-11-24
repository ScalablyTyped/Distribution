package typings.esfxInternalDeprecate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/internal-deprecate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def deprecate[T /* <: js.Function */](fn: T, message: String): T = js.native
  
  def deprecateProperty[T, K /* <: /* keyof T */ String */](target: T, key: K, message: String): T = js.native
}
