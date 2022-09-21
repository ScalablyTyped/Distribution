package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsIterableMod {
  
  inline def apply[T](one: js.Iterable[T], two: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].apply(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[T](
    one: js.Iterable[T],
    two: js.Iterable[T],
    areEqual: js.Function2[/* one */ T, /* two */ T, Boolean | Null]
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any], areEqual.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fbjs/lib/equalsIterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
