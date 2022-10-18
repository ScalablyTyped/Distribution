package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingObjectSelectionStudy
  extends StObject
     with BackboneElement {
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Used to retrieve the ImagingStudy that contain the images referenced in the Imaging ObjectSelection.study.
    */
  var imagingStudy: js.UndefOr[Reference] = js.undefined
  
  /**
    * DICOM SOP instances are identified through the UIDs of the study - series - instance hierarchy. In addition, the locator at the series level provide a means of retrieving the entire series.
    */
  var series: js.Array[ImagingObjectSelectionStudySeries]
  
  /**
    * Study instance UID is required to fully identify the DICOM SOP instances in the selection.
    */
  var uid: String
  
  /**
    * WADO-RS URL enables retrieval of the entire study using DICOM WADO-RS API.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ImagingObjectSelectionStudy {
  
  inline def apply(series: js.Array[ImagingObjectSelectionStudySeries], uid: String): ImagingObjectSelectionStudy = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingObjectSelectionStudy]
  }
  
  extension [Self <: ImagingObjectSelectionStudy](x: Self) {
    
    inline def setImagingStudy(value: Reference): Self = StObject.set(x, "imagingStudy", value.asInstanceOf[js.Any])
    
    inline def setImagingStudyUndefined: Self = StObject.set(x, "imagingStudy", js.undefined)
    
    inline def setSeries(value: js.Array[ImagingObjectSelectionStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesVarargs(value: ImagingObjectSelectionStudySeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
