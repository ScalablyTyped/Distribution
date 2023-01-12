package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallApp extends StObject {
  
  var installApp: js.UndefOr[Boolean] = js.undefined
  
  var minimumVersion: js.UndefOr[String] = js.undefined
  
  var packageName: String
}
object InstallApp {
  
  inline def apply(packageName: String): InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallApp] (val x: Self) extends AnyVal {
    
    inline def setInstallApp(value: Boolean): Self = StObject.set(x, "installApp", value.asInstanceOf[js.Any])
    
    inline def setInstallAppUndefined: Self = StObject.set(x, "installApp", js.undefined)
    
    inline def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
  }
}
