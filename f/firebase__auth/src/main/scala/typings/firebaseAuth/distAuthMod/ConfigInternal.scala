package typings.firebaseAuth.distAuthMod

import typings.firebaseAuth.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait ConfigInternal
  extends StObject
     with Config {
  
  /**
    * @readonly
    */
  var clientPlatform: ClientPlatform
  
  /**
    * @readonly
    */
  var emulator: js.UndefOr[Url] = js.undefined
}
object ConfigInternal {
  
  inline def apply(
    apiHost: String,
    apiKey: String,
    apiScheme: String,
    clientPlatform: ClientPlatform,
    sdkClientVersion: String,
    tokenApiHost: String
  ): ConfigInternal = {
    val __obj = js.Dynamic.literal(apiHost = apiHost.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], apiScheme = apiScheme.asInstanceOf[js.Any], clientPlatform = clientPlatform.asInstanceOf[js.Any], sdkClientVersion = sdkClientVersion.asInstanceOf[js.Any], tokenApiHost = tokenApiHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInternal]
  }
  
  extension [Self <: ConfigInternal](x: Self) {
    
    inline def setClientPlatform(value: ClientPlatform): Self = StObject.set(x, "clientPlatform", value.asInstanceOf[js.Any])
    
    inline def setEmulator(value: Url): Self = StObject.set(x, "emulator", value.asInstanceOf[js.Any])
    
    inline def setEmulatorUndefined: Self = StObject.set(x, "emulator", js.undefined)
  }
}
