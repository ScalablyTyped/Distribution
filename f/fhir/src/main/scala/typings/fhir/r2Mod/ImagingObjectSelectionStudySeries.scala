package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingObjectSelectionStudySeries
  extends StObject
     with BackboneElement {
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * DICOM SOP instances are identified through the UIDs of the study - series - instance hierarchy. This is the instance level identity of the instance in the selection.
    */
  var instance: js.Array[ImagingObjectSelectionStudySeriesInstance]
  
  /**
    * Series instance UID is required to fully identify the DICOM SOP instances in the selection.
    */
  var uid: js.UndefOr[String] = js.undefined
  
  /**
    * WADO-RS URL enables retrieval of the entire series using DICOM WADO-RS API.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ImagingObjectSelectionStudySeries {
  
  inline def apply(instance: js.Array[ImagingObjectSelectionStudySeriesInstance]): ImagingObjectSelectionStudySeries = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingObjectSelectionStudySeries]
  }
  
  extension [Self <: ImagingObjectSelectionStudySeries](x: Self) {
    
    inline def setInstance(value: js.Array[ImagingObjectSelectionStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceVarargs(value: ImagingObjectSelectionStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
