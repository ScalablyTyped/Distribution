package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPredefinedDetectorInfo extends StObject {
  
  /**
    * Name that uniquely identifies the detector.
    */
  var detectorName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPredefinedDetectorInfo {
  
  inline def apply(): SchemaPredefinedDetectorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPredefinedDetectorInfo]
  }
  
  extension [Self <: SchemaPredefinedDetectorInfo](x: Self) {
    
    inline def setDetectorName(value: String): Self = StObject.set(x, "detectorName", value.asInstanceOf[js.Any])
    
    inline def setDetectorNameNull: Self = StObject.set(x, "detectorName", null)
    
    inline def setDetectorNameUndefined: Self = StObject.set(x, "detectorName", js.undefined)
  }
}
