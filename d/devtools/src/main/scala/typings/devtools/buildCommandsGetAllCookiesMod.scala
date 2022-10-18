package typings.devtools

import typings.devtoolsProtocol.mod.Protocol.Network.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGetAllCookiesMod {
  
  @JSImport("devtools/build/commands/getAllCookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[js.Array[Cookie]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[js.Array[Cookie]]]
}
