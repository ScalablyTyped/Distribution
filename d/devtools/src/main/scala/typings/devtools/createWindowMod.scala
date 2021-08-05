package typings.devtools

import typings.devtools.anon.Handle
import typings.devtools.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createWindowMod {
  
  @JSImport("devtools/build/commands/createWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasType: Type): js.Promise[Handle] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Handle]]
}
