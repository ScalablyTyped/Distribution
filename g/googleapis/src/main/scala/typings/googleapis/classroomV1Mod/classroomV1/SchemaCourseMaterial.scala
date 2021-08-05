package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A material attached to a course as part of a material set.
  */
trait SchemaCourseMaterial extends StObject {
  
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.undefined
  
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[SchemaForm] = js.undefined
  
  /**
    * Link atatchment.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.undefined
}
object SchemaCourseMaterial {
  
  inline def apply(): SchemaCourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterial]
  }
  
  extension [Self <: SchemaCourseMaterial](x: Self) {
    
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
