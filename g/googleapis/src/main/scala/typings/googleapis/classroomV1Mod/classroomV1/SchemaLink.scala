package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * URL item.
  */
trait SchemaLink extends StObject {
  
  /**
    * URL of a thumbnail image of the target URL.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the target of the URL.  Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * URL to link to. This must be a valid UTF-8 string containing between 1
    * and 2024 characters.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaLink {
  
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  @scala.inline
  implicit class SchemaLinkMutableBuilder[Self <: SchemaLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
