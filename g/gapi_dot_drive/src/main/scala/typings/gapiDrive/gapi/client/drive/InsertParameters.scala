package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertParameters extends StObject {
  
  var convert: js.UndefOr[Boolean] = js.native
  
  var ocr: js.UndefOr[Boolean] = js.native
  
  var ocrLanguage: js.UndefOr[String] = js.native
  
  var pinned: js.UndefOr[Boolean] = js.native
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  var timedTextLanguage: js.UndefOr[String] = js.native
  
  var timedTextTrackName: js.UndefOr[String] = js.native
  
  var uploadType: String = js.native
  
  var usecontentAsIndexableText: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[String] = js.native
}
object InsertParameters {
  
  @scala.inline
  def apply(uploadType: String): InsertParameters = {
    val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertParameters]
  }
  
  @scala.inline
  implicit class InsertParametersMutableBuilder[Self <: InsertParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setOcr(value: Boolean): Self = StObject.set(x, "ocr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    @scala.inline
    def setOcrUndefined: Self = StObject.set(x, "ocr", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTimedTextLanguage(value: String): Self = StObject.set(x, "timedTextLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedTextLanguageUndefined: Self = StObject.set(x, "timedTextLanguage", js.undefined)
    
    @scala.inline
    def setTimedTextTrackName(value: String): Self = StObject.set(x, "timedTextTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedTextTrackNameUndefined: Self = StObject.set(x, "timedTextTrackName", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsecontentAsIndexableText(value: Boolean): Self = StObject.set(x, "usecontentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsecontentAsIndexableTextUndefined: Self = StObject.set(x, "usecontentAsIndexableText", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
