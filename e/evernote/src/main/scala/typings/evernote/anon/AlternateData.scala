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
  
  @scala.inline
  def apply(): AlternateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateData]
  }
  
  @scala.inline
  implicit class AlternateDataMutableBuilder[Self <: AlternateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAlternateData(value: Data): Self = StObject.set(x, "alternateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateDataUndefined: Self = StObject.set(x, "alternateData", js.undefined)
    
    @scala.inline
    def setAttributes(value: ResourceAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setNoteguid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "noteguid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteguidUndefined: Self = StObject.set(x, "noteguid", js.undefined)
    
    @scala.inline
    def setRecognition(value: Data): Self = StObject.set(x, "recognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognitionUndefined: Self = StObject.set(x, "recognition", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
