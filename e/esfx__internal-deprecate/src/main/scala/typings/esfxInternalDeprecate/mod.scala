package typings.esfxInternalDeprecate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-deprecate", "deprecate")
  @js.native
  def deprecate[T /* <: js.Function */](fn: T, message: String): T = js.native
  
  @JSImport("@esfx/internal-deprecate", "deprecateProperty")
  @js.native
  def deprecateProperty[T, K /* <: /* keyof T */ String */](target: T, key: K, message: String): T = js.native
}
