package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideHttpServiceClientConfigMod {
  
  object default {
    
    @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/http-service-client-config", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/http-service-client-config", "default._client")
    @js.native
    val client: typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default = js.native
    
    inline def getClient(): typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getClient")().asInstanceOf[typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default]
    
    inline def setClient(client: typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
