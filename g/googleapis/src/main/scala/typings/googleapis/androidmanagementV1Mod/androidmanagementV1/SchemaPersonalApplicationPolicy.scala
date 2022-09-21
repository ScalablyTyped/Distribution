package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPersonalApplicationPolicy extends StObject {
  
  /**
    * The type of installation to perform.
    */
  var installType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The package name of the application.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPersonalApplicationPolicy {
  
  inline def apply(): SchemaPersonalApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonalApplicationPolicy]
  }
  
  extension [Self <: SchemaPersonalApplicationPolicy](x: Self) {
    
    inline def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
    
    inline def setInstallTypeNull: Self = StObject.set(x, "installType", null)
    
    inline def setInstallTypeUndefined: Self = StObject.set(x, "installType", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
