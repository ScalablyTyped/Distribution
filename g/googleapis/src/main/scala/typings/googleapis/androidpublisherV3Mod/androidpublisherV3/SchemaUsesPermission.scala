package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsesPermission extends StObject {
  
  /**
    * Optionally, the maximum SDK version for which the permission is required.
    */
  var maxSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the permission requested.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaUsesPermission {
  
  inline def apply(): SchemaUsesPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsesPermission]
  }
  
  extension [Self <: SchemaUsesPermission](x: Self) {
    
    inline def setMaxSdkVersion(value: Double): Self = StObject.set(x, "maxSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxSdkVersionNull: Self = StObject.set(x, "maxSdkVersion", null)
    
    inline def setMaxSdkVersionUndefined: Self = StObject.set(x, "maxSdkVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
