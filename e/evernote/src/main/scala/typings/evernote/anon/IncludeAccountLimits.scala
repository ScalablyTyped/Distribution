package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeAccountLimits extends StObject {
  
  var includeAccountLimits: js.UndefOr[Boolean] = js.undefined
  
  var includeContent: js.UndefOr[Boolean] = js.undefined
  
  var includeNoteAppDataValues: js.UndefOr[Boolean] = js.undefined
  
  var includeResourceAppDataValues: js.UndefOr[Boolean] = js.undefined
  
  var includeResourcesAlternateData: js.UndefOr[Boolean] = js.undefined
  
  var includeResourcesData: js.UndefOr[Boolean] = js.undefined
  
  var includeResourcesRecognition: js.UndefOr[Boolean] = js.undefined
  
  var includeSharedNotes: js.UndefOr[Boolean] = js.undefined
}
object IncludeAccountLimits {
  
  inline def apply(): IncludeAccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAccountLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeAccountLimits] (val x: Self) extends AnyVal {
    
    inline def setIncludeAccountLimits(value: Boolean): Self = StObject.set(x, "includeAccountLimits", value.asInstanceOf[js.Any])
    
    inline def setIncludeAccountLimitsUndefined: Self = StObject.set(x, "includeAccountLimits", js.undefined)
    
    inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
    
    inline def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
    
    inline def setIncludeNoteAppDataValues(value: Boolean): Self = StObject.set(x, "includeNoteAppDataValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeNoteAppDataValuesUndefined: Self = StObject.set(x, "includeNoteAppDataValues", js.undefined)
    
    inline def setIncludeResourceAppDataValues(value: Boolean): Self = StObject.set(x, "includeResourceAppDataValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourceAppDataValuesUndefined: Self = StObject.set(x, "includeResourceAppDataValues", js.undefined)
    
    inline def setIncludeResourcesAlternateData(value: Boolean): Self = StObject.set(x, "includeResourcesAlternateData", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourcesAlternateDataUndefined: Self = StObject.set(x, "includeResourcesAlternateData", js.undefined)
    
    inline def setIncludeResourcesData(value: Boolean): Self = StObject.set(x, "includeResourcesData", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourcesDataUndefined: Self = StObject.set(x, "includeResourcesData", js.undefined)
    
    inline def setIncludeResourcesRecognition(value: Boolean): Self = StObject.set(x, "includeResourcesRecognition", value.asInstanceOf[js.Any])
    
    inline def setIncludeResourcesRecognitionUndefined: Self = StObject.set(x, "includeResourcesRecognition", js.undefined)
    
    inline def setIncludeSharedNotes(value: Boolean): Self = StObject.set(x, "includeSharedNotes", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedNotesUndefined: Self = StObject.set(x, "includeSharedNotes", js.undefined)
  }
}
