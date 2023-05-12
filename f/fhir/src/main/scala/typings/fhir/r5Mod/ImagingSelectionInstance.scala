package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelectionInstance
  extends StObject
     with BackboneElement {
  
  var _subset: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * Each imaging selection instance or frame list might includes an image region, specified by a region type and a set of 2D coordinates.
    *        If the parent imagingSelection.instance contains a subset element of type frame, the image region applies to all frames in the subset list.
    */
  var imageRegion2D: js.UndefOr[js.Array[ImagingSelectionInstanceImageRegion2D]] = js.undefined
  
  /**
    * Each imaging selection might includes a 3D image region, specified by a region type and a set of 3D coordinates.
    */
  var imageRegion3D: js.UndefOr[js.Array[ImagingSelectionInstanceImageRegion3D]] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.7.6.1](https://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.7.6.html#sect_C.7.6.1).
    *        Note: A multiframe instance has a single instance number with each frame identified by a frame number.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * See [DICOM PS3.3 C.12.1](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.12.html).
    */
  var sopClass: js.UndefOr[Coding] = js.undefined
  
  /**
    * Selected subset of the SOP Instance. The content and format of the subset item is determined by the SOP Class of the selected instance.
    *        May be one of:
    *        - A list of frame numbers selected from a multiframe SOP Instance.
    *        - A list of Content Item Observation UID values selected from a DICOM SR or other structured document SOP Instance.
    *        - A list of segment numbers selected from a segmentation SOP Instance.
    *        - A list of Region of Interest (ROI) numbers selected from a radiotherapy structure set SOP Instance.
    */
  var subset: js.UndefOr[js.Array[String]] = js.undefined
  
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
    
    inline def setImageRegion2D(value: js.Array[ImagingSelectionInstanceImageRegion2D]): Self = StObject.set(x, "imageRegion2D", value.asInstanceOf[js.Any])
    
    inline def setImageRegion2DUndefined: Self = StObject.set(x, "imageRegion2D", js.undefined)
    
    inline def setImageRegion2DVarargs(value: ImagingSelectionInstanceImageRegion2D*): Self = StObject.set(x, "imageRegion2D", js.Array(value*))
    
    inline def setImageRegion3D(value: js.Array[ImagingSelectionInstanceImageRegion3D]): Self = StObject.set(x, "imageRegion3D", value.asInstanceOf[js.Any])
    
    inline def setImageRegion3DUndefined: Self = StObject.set(x, "imageRegion3D", js.undefined)
    
    inline def setImageRegion3DVarargs(value: ImagingSelectionInstanceImageRegion3D*): Self = StObject.set(x, "imageRegion3D", js.Array(value*))
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setSopClass(value: Coding): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    inline def setSopClassUndefined: Self = StObject.set(x, "sopClass", js.undefined)
    
    inline def setSubset(value: js.Array[String]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
    
    inline def setSubsetVarargs(value: String*): Self = StObject.set(x, "subset", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_subset(value: js.Array[Element]): Self = StObject.set(x, "_subset", value.asInstanceOf[js.Any])
    
    inline def set_subsetUndefined: Self = StObject.set(x, "_subset", js.undefined)
    
    inline def set_subsetVarargs(value: Element*): Self = StObject.set(x, "_subset", js.Array(value*))
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
