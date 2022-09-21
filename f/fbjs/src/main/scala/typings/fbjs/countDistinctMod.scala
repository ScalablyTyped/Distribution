package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countDistinctMod {
  
  inline def apply[T1](iter: js.Iterable[T1], selector: js.Function1[/* item */ T1, Any]): Double = (^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("fbjs/lib/countDistinct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
