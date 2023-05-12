package typings.esbuildRegister

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderMod {
  
  @JSImport("esbuild-register/dist/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(url: Any, context: Any, defaultLoad: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultLoad.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
