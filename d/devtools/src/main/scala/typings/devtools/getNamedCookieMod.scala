package typings.devtools

import typings.devtools.anon.Name
import typings.devtoolsProtocol.mod.Protocol.Network.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNamedCookieMod {
  
  @JSImport("devtools/build/commands/getNamedCookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasName: Name): js.Promise[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cookie]]
}
