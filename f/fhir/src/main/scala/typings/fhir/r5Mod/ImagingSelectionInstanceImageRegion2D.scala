package typings.fhir.r5Mod

import typings.fhir.fhirStrings.circle
import typings.fhir.fhirStrings.ellipse
import typings.fhir.fhirStrings.interpolated
import typings.fhir.fhirStrings.point
import typings.fhir.fhirStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelectionInstanceImageRegion2D
  extends StObject
     with BackboneElement {
  
  var _regionType: js.UndefOr[Element] = js.undefined
  
  /**
    * For a description of how 2D coordinates are encoded, see [DICOM PS3.3 C.18.6](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.18.6.html).
    */
  var coordinate: js.Array[Double]
  
  /**
    * See [DICOM PS3.3 C.10.5.1.2](https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.10.5.html#sect_C.10.5.1.2).
    */
  var regionType: point | polyline | interpolated | circle | ellipse
}
object ImagingSelectionInstanceImageRegion2D {
  
  inline def apply(coordinate: js.Array[Double], regionType: point | polyline | interpolated | circle | ellipse): ImagingSelectionInstanceImageRegion2D = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], regionType = regionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingSelectionInstanceImageRegion2D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingSelectionInstanceImageRegion2D] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: js.Array[Double]): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateVarargs(value: Double*): Self = StObject.set(x, "coordinate", js.Array(value*))
    
    inline def setRegionType(value: point | polyline | interpolated | circle | ellipse): Self = StObject.set(x, "regionType", value.asInstanceOf[js.Any])
    
    inline def set_regionType(value: Element): Self = StObject.set(x, "_regionType", value.asInstanceOf[js.Any])
    
    inline def set_regionTypeUndefined: Self = StObject.set(x, "_regionType", js.undefined)
  }
}
