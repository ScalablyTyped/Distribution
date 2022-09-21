package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.RelatedContentAccess
import typings.evernote.mod.Types.RelatedContentImage
import typings.evernote.mod.Types.RelatedContentType
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessType extends StObject {
  
  var accessType: js.UndefOr[RelatedContentAccess] = js.undefined
  
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  
  var clipUrl: js.UndefOr[String] = js.undefined
  
  var contact: js.UndefOr[Contact] = js.undefined
  
  var contentId: js.UndefOr[String] = js.undefined
  
  var contentType: js.UndefOr[RelatedContentType] = js.undefined
  
  var date: js.UndefOr[Timestamp] = js.undefined
  
  var sourceFaviconUrl: js.UndefOr[String] = js.undefined
  
  var sourceId: js.UndefOr[String] = js.undefined
  
  var sourceName: js.UndefOr[String] = js.undefined
  
  var sourceUrl: js.UndefOr[String] = js.undefined
  
  var teaser: js.UndefOr[String] = js.undefined
  
  var thumbnails: js.UndefOr[js.Array[RelatedContentImage]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var visibleUrl: js.UndefOr[String] = js.undefined
}
object AccessType {
  
  inline def apply(): AccessType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessType]
  }
  
  extension [Self <: AccessType](x: Self) {
    
    inline def setAccessType(value: RelatedContentAccess): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setClipUrl(value: String): Self = StObject.set(x, "clipUrl", value.asInstanceOf[js.Any])
    
    inline def setClipUrlUndefined: Self = StObject.set(x, "clipUrl", js.undefined)
    
    inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setContentType(value: RelatedContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDate(value: Timestamp): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setSourceFaviconUrl(value: String): Self = StObject.set(x, "sourceFaviconUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceFaviconUrlUndefined: Self = StObject.set(x, "sourceFaviconUrl", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
    
    inline def setTeaser(value: String): Self = StObject.set(x, "teaser", value.asInstanceOf[js.Any])
    
    inline def setTeaserUndefined: Self = StObject.set(x, "teaser", js.undefined)
    
    inline def setThumbnails(value: js.Array[RelatedContentImage]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setThumbnailsVarargs(value: RelatedContentImage*): Self = StObject.set(x, "thumbnails", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVisibleUrl(value: String): Self = StObject.set(x, "visibleUrl", value.asInstanceOf[js.Any])
    
    inline def setVisibleUrlUndefined: Self = StObject.set(x, "visibleUrl", js.undefined)
  }
}
