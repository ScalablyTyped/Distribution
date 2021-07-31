package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * YouTube video item.
  */
trait SchemaYouTubeVideo extends StObject {
  
  /**
    * URL that can be used to view the YouTube video.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /**
    * YouTube API resource ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * URL of a thumbnail image of the YouTube video.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the YouTube video.  Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaYouTubeVideo {
  
  @scala.inline
  def apply(): SchemaYouTubeVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYouTubeVideo]
  }
  
  @scala.inline
  implicit class SchemaYouTubeVideoMutableBuilder[Self <: SchemaYouTubeVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
