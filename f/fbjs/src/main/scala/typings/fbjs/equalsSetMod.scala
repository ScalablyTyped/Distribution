package typings.fbjs

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsSetMod {
  
  inline def apply[T](one: Set[T], two: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].apply(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fbjs/lib/equalsSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
