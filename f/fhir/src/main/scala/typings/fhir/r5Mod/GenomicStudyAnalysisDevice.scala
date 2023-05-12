package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenomicStudyAnalysisDevice
  extends StObject
     with BackboneElement {
  
  /**
    * Device used for the analysis.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * Specific function for the device used for the analysis.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object GenomicStudyAnalysisDevice {
  
  inline def apply(): GenomicStudyAnalysisDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenomicStudyAnalysisDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenomicStudyAnalysisDevice] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
