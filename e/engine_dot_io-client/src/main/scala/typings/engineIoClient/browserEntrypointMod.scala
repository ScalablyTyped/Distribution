package typings.engineIoClient

import typings.engineIoClient.socketMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserEntrypointMod {
  
  @JSImport("engine.io-client/build/esm/browser-entrypoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(uri: Any, opts: Any): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Socket]
}
