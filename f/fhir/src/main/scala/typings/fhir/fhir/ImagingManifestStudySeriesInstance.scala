package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The selected instance
  */
@js.native
trait ImagingManifestStudySeriesInstance extends BackboneElement {
  
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  
  /**
    * SOP class UID of instance
    */
  var sopClass: oid = js.native
  
  /**
    * Selected instance UID
    */
  var uid: oid = js.native
}
object ImagingManifestStudySeriesInstance {
  
  @scala.inline
  def apply(sopClass: oid, uid: oid): ImagingManifestStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeriesInstance]
  }
  
  @scala.inline
  implicit class ImagingManifestStudySeriesInstanceMutableBuilder[Self <: ImagingManifestStudySeriesInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSopClass(value: oid): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sopClass(value: Element): Self = StObject.set(x, "_sopClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sopClassUndefined: Self = StObject.set(x, "_sopClass", js.undefined)
    
    @scala.inline
    def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
