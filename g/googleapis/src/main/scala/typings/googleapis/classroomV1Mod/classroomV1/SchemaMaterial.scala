package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Link material. On creation, this is upgraded to a more appropriate type if possible, and this is reflected in the response.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * YouTube video material.
    */
  var youtubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.undefined
}
object SchemaMaterial {
  
  inline def apply(): SchemaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterial]
  }
  
  extension [Self <: SchemaMaterial](x: Self) {
    
    inline def setDriveFile(value: SchemaSharedDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setForm(value: SchemaForm): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setYoutubeVideo(value: SchemaYouTubeVideo): Self = StObject.set(x, "youtubeVideo", value.asInstanceOf[js.Any])
    
    inline def setYoutubeVideoUndefined: Self = StObject.set(x, "youtubeVideo", js.undefined)
  }
}
