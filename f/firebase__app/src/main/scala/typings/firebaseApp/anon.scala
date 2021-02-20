package typings.firebaseApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AppName extends StObject {
    
    var appName: String = js.native
  }
  object AppName {
    
    @scala.inline
    def apply(appName: String): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    @scala.inline
    implicit class AppNameMutableBuilder[Self <: AppName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    }
  }
}
