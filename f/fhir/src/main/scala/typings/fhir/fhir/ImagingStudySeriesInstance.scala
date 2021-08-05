package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single SOP instance from the series
  */
trait ImagingStudySeriesInstance
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * The number of this instance in the series
    */
  var number: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * DICOM class type
    */
  var sopClass: oid
  
  /**
    * Description of instance
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Formal DICOM identifier for this instance
    */
  var uid: oid
}
object ImagingStudySeriesInstance {
  
  inline def apply(sopClass: oid, uid: oid): ImagingStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeriesInstance]
  }
  
  extension [Self <: ImagingStudySeriesInstance](x: Self) {
    
    inline def setNumber(value: unsignedInt): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setSopClass(value: oid): Self = StObject.set(x, "sopClass", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    inline def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    inline def set_sopClass(value: Element): Self = StObject.set(x, "_sopClass", value.asInstanceOf[js.Any])
    
    inline def set_sopClassUndefined: Self = StObject.set(x, "_sopClass", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    inline def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
