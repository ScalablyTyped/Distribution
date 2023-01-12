package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelectionInstance
  extends StObject
     with BackboneElement {
  
  var _frameList: js.UndefOr[Element] = js.undefined
  
  var _observationUid: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _roiList: js.UndefOr[Element] = js.undefined
  
  var _segmentList: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * See [DICOM PS3.3 10.3](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_10.3.html).
    */
  var frameList: js.UndefOr[String] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.12.1](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.12.html).
    */
  var observationUid: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.8.8.5](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.8.8.5.html).
    */
  var roiList: js.UndefOr[String] = js.undefined
  
  /**
    * See [DICOM PS3.3 10.3](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_10.3.html).
    */
  var segmentList: js.UndefOr[String] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.12.1](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.12.html).
    */
  var sopClass: js.UndefOr[Coding] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.12.1](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.12.html).
    */
  var uid: String
}
object ImagingSelectionInstance {
  
  inline def apply(uid: String): ImagingSelectionInstance = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingSelectionInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingSelectionInstance] (val x: Self) extends AnyVal {
    
    inline def setFrameList(value: String): Self = StObject.set(x, "frameList", value.asInstanceOf[js.Any])
    
    inline def setFrameListUndefined: Self = StObject.set(x, "frameList", js.undefined)
    
    inline def setObservationUid(value: js.Array[String]): Self = StObject.set(x, "observationUid", value.asInstanceOf[js.Any])
    
    inline def setObservationUidUndefined: Self = StObject.set(x, "observationUid", js.undefined)
    
    inline def setObservationUidVarargs(value: String*): Self = StObject.set(x, "observationUid", js.Array(value*))
    
    inline def setRoiList(value: String): Self = StObject.set(x, "roiList", value.asInstanceOf[js.Any])
    
    inline def setRoiListUndefined: Self = StObject.set(x, "roiList", js.undefined)
    
    inline def setSegmentList(value: String): Self = StObject.set(x, "segmentList", value.asInstanceOf[js.Any])
    
    inline def setSegmentListUndefined: Self = StObject.set(x, "segmentList", js.undefined)
    
    inline def setSopClass(value: Coding): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    inline def setSopClassUndefined: Self = StObject.set(x, "sopClass", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_frameList(value: Element): Self = StObject.set(x, "_frameList", value.asInstanceOf[js.Any])
    
    inline def set_frameListUndefined: Self = StObject.set(x, "_frameList", js.undefined)
    
    inline def set_observationUid(value: js.Array[Element]): Self = StObject.set(x, "_observationUid", value.asInstanceOf[js.Any])
    
    inline def set_observationUidUndefined: Self = StObject.set(x, "_observationUid", js.undefined)
    
    inline def set_observationUidVarargs(value: Element*): Self = StObject.set(x, "_observationUid", js.Array(value*))
    
    inline def set_roiList(value: Element): Self = StObject.set(x, "_roiList", value.asInstanceOf[js.Any])
    
    inline def set_roiListUndefined: Self = StObject.set(x, "_roiList", js.undefined)
    
    inline def set_segmentList(value: Element): Self = StObject.set(x, "_segmentList", value.asInstanceOf[js.Any])
    
    inline def set_segmentListUndefined: Self = StObject.set(x, "_segmentList", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
