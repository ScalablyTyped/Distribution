package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameOriginalMessage extends StObject {
  
  var appName: js.UndefOr[typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName] = js.undefined
  
  var originalMessage: js.UndefOr[String] = js.undefined
}
object AppNameOriginalMessage {
  
  inline def apply(): AppNameOriginalMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppNameOriginalMessage]
  }
  
  extension [Self <: AppNameOriginalMessage](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setOriginalMessage(value: String): Self = StObject.set(x, "originalMessage", value.asInstanceOf[js.Any])
    
    inline def setOriginalMessageUndefined: Self = StObject.set(x, "originalMessage", js.undefined)
  }
}
