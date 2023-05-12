package typings.fhir.r5Mod

import typings.fhir.fhirStrings.ellipse
import typings.fhir.fhirStrings.ellipsoid
import typings.fhir.fhirStrings.multipoint
import typings.fhir.fhirStrings.point
import typings.fhir.fhirStrings.polygon
import typings.fhir.fhirStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelectionInstanceImageRegion3D
  extends StObject
     with BackboneElement {
  
  var _regionType: js.UndefOr[Element] = js.undefined
  
  /**
    * For a description of how 3D coordinates are encoded, see [DICOM PS3.3 C.18.9](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.18.9.html).
    */
  var coordinate: js.Array[Double]
  
  /**
    * See [DICOM PS3.3 C.18.9.1.2](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.18.9.html#sect_C.18.9.1.2).
    */
  var regionType: point | multipoint | polyline | polygon | ellipse | ellipsoid
}
object ImagingSelectionInstanceImageRegion3D {
  
  inline def apply(
    coordinate: js.Array[Double],
    regionType: point | multipoint | polyline | polygon | ellipse | ellipsoid
  ): ImagingSelectionInstanceImageRegion3D = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], regionType = regionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingSelectionInstanceImageRegion3D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingSelectionInstanceImageRegion3D] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: js.Array[Double]): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateVarargs(value: Double*): Self = StObject.set(x, "coordinate", js.Array(value*))
    
    inline def setRegionType(value: point | multipoint | polyline | polygon | ellipse | ellipsoid): Self = StObject.set(x, "regionType", value.asInstanceOf[js.Any])
    
    inline def set_regionType(value: Element): Self = StObject.set(x, "_regionType", value.asInstanceOf[js.Any])
    
    inline def set_regionTypeUndefined: Self = StObject.set(x, "_regionType", js.undefined)
  }
}
