package typings.evernote.anon

import typings.evernote.mod.Types.Data
import typings.evernote.mod.Types.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternateData extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var alternateData: js.UndefOr[Data] = js.undefined
  
  var attributes: js.UndefOr[ResourceAttributes] = js.undefined
  
  var data: js.UndefOr[Data] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var mime: js.UndefOr[String] = js.undefined
  
  var noteguid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var recognition: js.UndefOr[Data] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AlternateData {
  
  inline def apply(): AlternateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateData]
  }
  
  extension [Self <: AlternateData](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAlternateData(value: Data): Self = StObject.set(x, "alternateData", value.asInstanceOf[js.Any])
    
    inline def setAlternateDataUndefined: Self = StObject.set(x, "alternateData", js.undefined)
    
    inline def setAttributes(value: ResourceAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setNoteguid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "noteguid", value.asInstanceOf[js.Any])
    
    inline def setNoteguidUndefined: Self = StObject.set(x, "noteguid", js.undefined)
    
    inline def setRecognition(value: Data): Self = StObject.set(x, "recognition", value.asInstanceOf[js.Any])
    
    inline def setRecognitionUndefined: Self = StObject.set(x, "recognition", js.undefined)
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
