package typings.devtools

import typings.devtools.anon.HandleString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchToWindowMod {
  
  @JSImport("devtools/build/commands/switchToWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasHandle: HandleString): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHandle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
