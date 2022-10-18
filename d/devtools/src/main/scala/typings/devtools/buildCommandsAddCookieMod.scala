package typings.devtools

import typings.devtools.anon.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsAddCookieMod {
  
  @JSImport("devtools/build/commands/addCookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasCookie: Cookie): js.Promise[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasCookie.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null]]
}
