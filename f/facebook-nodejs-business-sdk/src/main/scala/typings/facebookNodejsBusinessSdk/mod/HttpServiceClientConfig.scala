package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HttpServiceClientConfig {
  
  @JSImport("facebook-nodejs-business-sdk", "HttpServiceClientConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("facebook-nodejs-business-sdk", "HttpServiceClientConfig._client")
  @js.native
  val client: default = js.native
  
  inline def getClient(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getClient")().asInstanceOf[default]
  
  inline def setClient(client: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
