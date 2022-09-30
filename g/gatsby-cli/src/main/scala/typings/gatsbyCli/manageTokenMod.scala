package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manageTokenMod {
  
  @JSImport("gatsby-cli/lib/util/manage-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getToken(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")().asInstanceOf[js.Promise[String]]
  
  inline def setToken(token: String, expiration: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToken")(token.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setToken(token: Null, expiration: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToken")(token.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
