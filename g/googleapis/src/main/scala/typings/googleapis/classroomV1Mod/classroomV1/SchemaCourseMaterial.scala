package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A material attached to a course as part of a material set.
  */
@js.native
trait SchemaCourseMaterial extends StObject {
  
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[SchemaForm] = js.native
  
  /**
    * Link atatchment.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.native
}
object SchemaCourseMaterial {
  
  @scala.inline
  def apply(): SchemaCourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterial]
  }
  
  @scala.inline
  implicit class SchemaCourseMaterialMutableBuilder[Self <: SchemaCourseMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: SchemaDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    @scala.inline
    def setForm(value: SchemaForm): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setYouTubeVideo(value: SchemaYouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
  }
}
