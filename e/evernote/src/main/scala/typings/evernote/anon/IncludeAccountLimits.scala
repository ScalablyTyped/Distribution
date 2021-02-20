package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeAccountLimits extends StObject {
  
  var includeAccountLimits: js.UndefOr[Boolean] = js.native
  
  var includeContent: js.UndefOr[Boolean] = js.native
  
  var includeNoteAppDataValues: js.UndefOr[Boolean] = js.native
  
  var includeResourceAppDataValues: js.UndefOr[Boolean] = js.native
  
  var includeResourcesAlternateData: js.UndefOr[Boolean] = js.native
  
  var includeResourcesData: js.UndefOr[Boolean] = js.native
  
  var includeResourcesRecognition: js.UndefOr[Boolean] = js.native
  
  var includeSharedNotes: js.UndefOr[Boolean] = js.native
}
object IncludeAccountLimits {
  
  @scala.inline
  def apply(): IncludeAccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAccountLimits]
  }
  
  @scala.inline
  implicit class IncludeAccountLimitsMutableBuilder[Self <: IncludeAccountLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAccountLimits(value: Boolean): Self = StObject.set(x, "includeAccountLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAccountLimitsUndefined: Self = StObject.set(x, "includeAccountLimits", js.undefined)
    
    @scala.inline
    def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
    
    @scala.inline
    def setIncludeNoteAppDataValues(value: Boolean): Self = StObject.set(x, "includeNoteAppDataValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNoteAppDataValuesUndefined: Self = StObject.set(x, "includeNoteAppDataValues", js.undefined)
    
    @scala.inline
    def setIncludeResourceAppDataValues(value: Boolean): Self = StObject.set(x, "includeResourceAppDataValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourceAppDataValuesUndefined: Self = StObject.set(x, "includeResourceAppDataValues", js.undefined)
    
    @scala.inline
    def setIncludeResourcesAlternateData(value: Boolean): Self = StObject.set(x, "includeResourcesAlternateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourcesAlternateDataUndefined: Self = StObject.set(x, "includeResourcesAlternateData", js.undefined)
    
    @scala.inline
    def setIncludeResourcesData(value: Boolean): Self = StObject.set(x, "includeResourcesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourcesDataUndefined: Self = StObject.set(x, "includeResourcesData", js.undefined)
    
    @scala.inline
    def setIncludeResourcesRecognition(value: Boolean): Self = StObject.set(x, "includeResourcesRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeResourcesRecognitionUndefined: Self = StObject.set(x, "includeResourcesRecognition", js.undefined)
    
    @scala.inline
    def setIncludeSharedNotes(value: Boolean): Self = StObject.set(x, "includeSharedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSharedNotesUndefined: Self = StObject.set(x, "includeSharedNotes", js.undefined)
  }
}
