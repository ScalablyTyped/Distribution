package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingManifestStudySeries
  extends StObject
     with BackboneElement {
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * SOP Instance component identify the instance selected, along with the study and series identities to form the DICOM identity hierarchy.
    */
  var instance: js.Array[ImagingManifestStudySeriesInstance]
  
  /**
    * Series instance UID of the SOP instances in the selection.
    */
  var uid: String
}
object ImagingManifestStudySeries {
  
  inline def apply(instance: js.Array[ImagingManifestStudySeriesInstance], uid: String): ImagingManifestStudySeries = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeries]
  }
  
  extension [Self <: ImagingManifestStudySeries](x: Self) {
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setInstance(value: js.Array[ImagingManifestStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceVarargs(value: ImagingManifestStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
