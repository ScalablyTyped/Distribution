package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertParameters extends StObject {
  
  var convert: js.UndefOr[Boolean] = js.undefined
  
  var ocr: js.UndefOr[Boolean] = js.undefined
  
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  
  var uploadType: String
  
  var usecontentAsIndexableText: js.UndefOr[Boolean] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
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
