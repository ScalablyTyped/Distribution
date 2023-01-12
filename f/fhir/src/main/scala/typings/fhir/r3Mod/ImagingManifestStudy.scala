package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingManifestStudy
  extends StObject
     with BackboneElement {
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reference to the Imaging Study in FHIR form.
    */
  var imagingStudy: js.UndefOr[Reference] = js.undefined
  
  /**
    * Series component represents the series level identity and locator information of the DICOM SOP instances in the selection.
    */
  var series: js.Array[ImagingManifestStudySeries]
  
  /**
    * Study instance UID of the SOP instances in the selection.
    */
  var uid: String
}
object ImagingManifestStudy {
  
  inline def apply(series: js.Array[ImagingManifestStudySeries], uid: String): ImagingManifestStudy = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingManifestStudy] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setImagingStudy(value: Reference): Self = StObject.set(x, "imagingStudy", value.asInstanceOf[js.Any])
    
    inline def setImagingStudyUndefined: Self = StObject.set(x, "imagingStudy", js.undefined)
    
    inline def setSeries(value: js.Array[ImagingManifestStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesVarargs(value: ImagingManifestStudySeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
