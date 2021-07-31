package typings.esfxInternalDeprecate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-deprecate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deprecate[T /* <: js.Function */](fn: T, message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(fn.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def deprecateProperty[T, K /* <: /* keyof T */ String */](target: T, key: K, message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecateProperty")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
}
