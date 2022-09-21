package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMatchInfo extends StObject {
  
  /**
    * For matched detector predefined by Google.
    */
  var predefinedDetector: js.UndefOr[SchemaPredefinedDetectorInfo] = js.undefined
  
  /**
    * For matched detector defined by administrators.
    */
  var userDefinedDetector: js.UndefOr[SchemaUserDefinedDetectorInfo] = js.undefined
}
object SchemaMatchInfo {
  
  inline def apply(): SchemaMatchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchInfo]
  }
  
  extension [Self <: SchemaMatchInfo](x: Self) {
    
    inline def setPredefinedDetector(value: SchemaPredefinedDetectorInfo): Self = StObject.set(x, "predefinedDetector", value.asInstanceOf[js.Any])
    
    inline def setPredefinedDetectorUndefined: Self = StObject.set(x, "predefinedDetector", js.undefined)
    
    inline def setUserDefinedDetector(value: SchemaUserDefinedDetectorInfo): Self = StObject.set(x, "userDefinedDetector", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedDetectorUndefined: Self = StObject.set(x, "userDefinedDetector", js.undefined)
  }
}
