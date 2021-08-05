package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attachment added to student assignment work.  When creating attachments,
  * setting the `form` field is not supported.
  */
trait SchemaAttachment extends StObject {
  
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.undefined
  
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[SchemaForm] = js.undefined
  
  /**
    * Link attachment.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.undefined
}
object SchemaAttachment {
  
  inline def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  extension [Self <: SchemaAttachment](x: Self) {
    
    inline def setDriveFile(value: SchemaDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setForm(value: SchemaForm): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setYouTubeVideo(value: SchemaYouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
    
    inline def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
  }
}
