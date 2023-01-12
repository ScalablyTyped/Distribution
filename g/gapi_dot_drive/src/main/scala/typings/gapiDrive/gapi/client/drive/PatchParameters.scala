package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchParameters extends StObject {
  
  var convert: js.UndefOr[Boolean] = js.undefined
  
  var fileId: String
  
  var modifiedDateBehavior: js.UndefOr[String] = js.undefined
  
  var newRevision: js.UndefOr[Boolean] = js.undefined
  
  var ocr: js.UndefOr[Boolean] = js.undefined
  
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  var removeParents: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[FileResource] = js.undefined
  
  var setModifiedDate: js.UndefOr[Boolean] = js.undefined
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  
  var updateViewedData: js.UndefOr[Boolean] = js.undefined
  
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
}
object PatchParameters {
  
  inline def apply(fileId: String): PatchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchParameters] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateBehavior(value: String): Self = StObject.set(x, "modifiedDateBehavior", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateBehaviorUndefined: Self = StObject.set(x, "modifiedDateBehavior", js.undefined)
    
    inline def setNewRevision(value: Boolean): Self = StObject.set(x, "newRevision", value.asInstanceOf[js.Any])
    
    inline def setNewRevisionUndefined: Self = StObject.set(x, "newRevision", js.undefined)
    
    inline def setOcr(value: Boolean): Self = StObject.set(x, "ocr", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    inline def setOcrUndefined: Self = StObject.set(x, "ocr", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setRemoveParents(value: String): Self = StObject.set(x, "removeParents", value.asInstanceOf[js.Any])
    
    inline def setRemoveParentsUndefined: Self = StObject.set(x, "removeParents", js.undefined)
    
    inline def setResource(value: FileResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSetModifiedDate(value: Boolean): Self = StObject.set(x, "setModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setSetModifiedDateUndefined: Self = StObject.set(x, "setModifiedDate", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTimedTextLanguage(value: String): Self = StObject.set(x, "timedTextLanguage", value.asInstanceOf[js.Any])
    
    inline def setTimedTextLanguageUndefined: Self = StObject.set(x, "timedTextLanguage", js.undefined)
    
    inline def setTimedTextTrackName(value: String): Self = StObject.set(x, "timedTextTrackName", value.asInstanceOf[js.Any])
    
    inline def setTimedTextTrackNameUndefined: Self = StObject.set(x, "timedTextTrackName", js.undefined)
    
    inline def setUpdateViewedData(value: Boolean): Self = StObject.set(x, "updateViewedData", value.asInstanceOf[js.Any])
    
    inline def setUpdateViewedDataUndefined: Self = StObject.set(x, "updateViewedData", js.undefined)
    
    inline def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    inline def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
  }
}
