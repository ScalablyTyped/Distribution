package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingManifestStudySeriesInstance
  extends StObject
     with BackboneElement {
  
  var _sopClass: js.UndefOr[Element] = js.undefined
  
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * SOP class UID identifies the type of the selected instances, e.g. CT image, Gray scale softcopy presentation state, ECG waveform, etc.
    */
  var sopClass: String
  
  /**
    * SOP instance UID identifies the instance.
    */
  var uid: String
}
object ImagingManifestStudySeriesInstance {
  
  inline def apply(sopClass: String, uid: String): ImagingManifestStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeriesInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingManifestStudySeriesInstance] (val x: Self) extends AnyVal {
    
    inline def setSopClass(value: String): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_sopClass(value: Element): Self = StObject.set(x, "_sopClass", value.asInstanceOf[js.Any])
    
    inline def set_sopClassUndefined: Self = StObject.set(x, "_sopClass", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
