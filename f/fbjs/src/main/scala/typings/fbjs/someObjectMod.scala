package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object someObjectMod {
  
  inline def apply(
    obj: js.Object,
    callback: js.Function3[/* value */ Any, /* name */ String, /* obj */ js.Object, Any]
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    obj: js.Object,
    callback: js.Function3[/* value */ Any, /* name */ String, /* obj */ js.Object, Any],
    context: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(obj: Null, callback: js.Function3[/* value */ Any, /* name */ String, /* obj */ js.Object, Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    obj: Null,
    callback: js.Function3[/* value */ Any, /* name */ String, /* obj */ js.Object, Any],
    context: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fbjs/lib/someObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
