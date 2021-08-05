package typings.freshy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("freshy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def freshy(module: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("freshy")(module.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def freshy(module: String, cb: js.Function1[/* module */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("freshy")(module.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def reload(module: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(module.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def unload(module: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(module.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
