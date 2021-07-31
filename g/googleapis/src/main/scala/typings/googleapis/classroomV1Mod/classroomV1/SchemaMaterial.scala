package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Material attached to course work.  When creating attachments, setting the
  * `form` field is not supported.
  */
trait SchemaMaterial extends StObject {
  
  /**
    * Google Drive file material.
    */
  var driveFile: js.UndefOr[SchemaSharedDriveFile] = js.undefined
  
  /**
    * Google Forms material.
    */
  var form: js.UndefOr[SchemaForm] = js.undefined
  
  /**
    * Link material. On creation, will be upgraded to a more appropriate type
    * if possible, and this will be reflected in the response.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * YouTube video material.
    */
  var youtubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.undefined
}
object SchemaMaterial {
  
  @scala.inline
  def apply(): SchemaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterial]
  }
  
  @scala.inline
  implicit class SchemaMaterialMutableBuilder[Self <: SchemaMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: SchemaSharedDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
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
    def setYoutubeVideo(value: SchemaYouTubeVideo): Self = StObject.set(x, "youtubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeVideoUndefined: Self = StObject.set(x, "youtubeVideo", js.undefined)
  }
}
