package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLaunchAppAction extends StObject {
  
  /**
    * Package name of app to be launched
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLaunchAppAction {
  
  inline def apply(): SchemaLaunchAppAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchAppAction]
  }
  
  extension [Self <: SchemaLaunchAppAction](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
