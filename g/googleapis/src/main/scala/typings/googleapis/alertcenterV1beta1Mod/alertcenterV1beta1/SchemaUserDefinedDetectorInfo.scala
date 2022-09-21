package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserDefinedDetectorInfo extends StObject {
  
  /**
    * Display name of the detector.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name that uniquely identifies the detector.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserDefinedDetectorInfo {
  
  inline def apply(): SchemaUserDefinedDetectorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefinedDetectorInfo]
  }
  
  extension [Self <: SchemaUserDefinedDetectorInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
