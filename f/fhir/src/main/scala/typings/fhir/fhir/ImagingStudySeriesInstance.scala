package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single SOP instance from the series
  */
@js.native
trait ImagingStudySeriesInstance extends BackboneElement {
  
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  
  /**
    * The number of this instance in the series
    */
  var number: js.UndefOr[unsignedInt] = js.native
  
  /**
    * DICOM class type
    */
  var sopClass: oid = js.native
  
  /**
    * Description of instance
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Formal DICOM identifier for this instance
    */
  var uid: oid = js.native
}
object ImagingStudySeriesInstance {
  
  @scala.inline
  def apply(sopClass: oid, uid: oid): ImagingStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeriesInstance]
  }
  
  @scala.inline
  implicit class ImagingStudySeriesInstanceMutableBuilder[Self <: ImagingStudySeriesInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: unsignedInt): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setSopClass(value: oid): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    @scala.inline
    def set_sopClass(value: Element): Self = StObject.set(x, "_sopClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sopClassUndefined: Self = StObject.set(x, "_sopClass", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    @scala.inline
    def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
