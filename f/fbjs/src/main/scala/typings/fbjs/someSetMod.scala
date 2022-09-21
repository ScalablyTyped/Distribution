package typings.fbjs

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object someSetMod {
  
  inline def apply[T](set: Set[T], callback: js.Function3[/* value */ T, /* key */ T, /* set */ Set[T], Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(set.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[T](
    set: Set[T],
    callback: js.Function3[/* value */ T, /* key */ T, /* set */ Set[T], Boolean],
    context: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(set.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fbjs/lib/someSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
