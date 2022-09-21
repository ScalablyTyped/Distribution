package typings.feathersjsPrimus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/primus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Any): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(options: Any, callback: js.Function1[/* primus */ Any, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
