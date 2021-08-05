package typings.firebaseApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppName extends StObject {
    
    var appName: String
  }
  object AppName {
    
    inline def apply(appName: String): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    extension [Self <: AppName](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    }
  }
}
