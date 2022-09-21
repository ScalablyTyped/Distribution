package typings.freshy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("freshy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def freshy(module: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("freshy")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def freshy(module: String, cb: js.Function1[/* module */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("freshy")(module.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def reload(module: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def unload(module: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(module.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
