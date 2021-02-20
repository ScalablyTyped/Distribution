package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchParameters extends StObject {
  
  var convert: js.UndefOr[Boolean] = js.native
  
  var fileId: String = js.native
  
  var modifiedDateBehavior: js.UndefOr[String] = js.native
  
  var newRevision: js.UndefOr[Boolean] = js.native
  
  var ocr: js.UndefOr[Boolean] = js.native
  
  var ocrLanguage: js.UndefOr[String] = js.native
  
  var pinned: js.UndefOr[Boolean] = js.native
  
  var removeParents: js.UndefOr[String] = js.native
  
  var resource: js.UndefOr[FileResource] = js.native
  
  var setModifiedDate: js.UndefOr[Boolean] = js.native
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  var timedTextLanguage: js.UndefOr[String] = js.native
  
  var timedTextTrackName: js.UndefOr[String] = js.native
  
  var updateViewedData: js.UndefOr[Boolean] = js.native
  
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
}
object PatchParameters {
  
  @scala.inline
  def apply(fileId: String): PatchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParameters]
  }
  
  @scala.inline
  implicit class PatchParametersMutableBuilder[Self <: PatchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateBehavior(value: String): Self = StObject.set(x, "modifiedDateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateBehaviorUndefined: Self = StObject.set(x, "modifiedDateBehavior", js.undefined)
    
    @scala.inline
    def setNewRevision(value: Boolean): Self = StObject.set(x, "newRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRevisionUndefined: Self = StObject.set(x, "newRevision", js.undefined)
    
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
    def setRemoveParents(value: String): Self = StObject.set(x, "removeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveParentsUndefined: Self = StObject.set(x, "removeParents", js.undefined)
    
    @scala.inline
    def setResource(value: FileResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSetModifiedDate(value: Boolean): Self = StObject.set(x, "setModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetModifiedDateUndefined: Self = StObject.set(x, "setModifiedDate", js.undefined)
    
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
    def setUpdateViewedData(value: Boolean): Self = StObject.set(x, "updateViewedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViewedDataUndefined: Self = StObject.set(x, "updateViewedData", js.undefined)
    
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
  }
}
