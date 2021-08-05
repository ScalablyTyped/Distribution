package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The selected instance
  */
trait ImagingManifestStudySeriesInstance
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * SOP class UID of instance
    */
  var sopClass: oid
  
  /**
    * Selected instance UID
    */
  var uid: oid
}
object ImagingManifestStudySeriesInstance {
  
  inline def apply(sopClass: oid, uid: oid): ImagingManifestStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeriesInstance]
  }
  
  extension [Self <: ImagingManifestStudySeriesInstance](x: Self) {
    
    inline def setSopClass(value: oid): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    inline def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_sopClass(value: Element): Self = StObject.set(x, "_sopClass", value.asInstanceOf[js.Any])
    
    inline def set_sopClassUndefined: Self = StObject.set(x, "_sopClass", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
