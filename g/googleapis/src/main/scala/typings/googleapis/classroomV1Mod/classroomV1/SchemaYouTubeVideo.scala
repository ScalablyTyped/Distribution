package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYouTubeVideo extends StObject {
  
  /**
    * URL that can be used to view the YouTube video. Read-only.
    */
  var alternateLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * YouTube API resource ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of a thumbnail image of the YouTube video. Read-only.
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the YouTube video. Read-only.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaYouTubeVideo {
  
  inline def apply(): SchemaYouTubeVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYouTubeVideo]
  }
  
  extension [Self <: SchemaYouTubeVideo](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkNull: Self = StObject.set(x, "alternateLink", null)
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
