package typings.devtools

import typings.devtools.anon.Capabilities
import typings.devtools.anon.SessionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newSessionMod {
  
  @JSImport("devtools/build/commands/newSession", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasCapabilities: Capabilities): js.Promise[SessionId] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasCapabilities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SessionId]]
}
