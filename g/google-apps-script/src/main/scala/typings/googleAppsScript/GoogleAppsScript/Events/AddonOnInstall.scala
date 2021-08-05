package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonOnInstall extends StObject {
  
  var authMode: AuthMode
}
object AddonOnInstall {
  
  inline def apply(authMode: AuthMode): AddonOnInstall = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonOnInstall]
  }
  
  extension [Self <: AddonOnInstall](x: Self) {
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
  }
}
