package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.RelatedContentAccess
import typings.evernote.mod.Types.RelatedContentImage
import typings.evernote.mod.Types.RelatedContentType
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessType extends StObject {
  
  var accessType: js.UndefOr[RelatedContentAccess] = js.native
  
  var authors: js.UndefOr[js.Array[String]] = js.native
  
  var clipUrl: js.UndefOr[String] = js.native
  
  var contact: js.UndefOr[Contact] = js.native
  
  var contentId: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[RelatedContentType] = js.native
  
  var date: js.UndefOr[Timestamp] = js.native
  
  var sourceFaviconUrl: js.UndefOr[String] = js.native
  
  var sourceId: js.UndefOr[String] = js.native
  
  var sourceName: js.UndefOr[String] = js.native
  
  var sourceUrl: js.UndefOr[String] = js.native
  
  var teaser: js.UndefOr[String] = js.native
  
  var thumbnails: js.UndefOr[js.Array[RelatedContentImage]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var visibleUrl: js.UndefOr[String] = js.native
}
object AccessType {
  
  @scala.inline
  def apply(): AccessType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessType]
  }
  
  @scala.inline
  implicit class AccessTypeMutableBuilder[Self <: AccessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessType(value: RelatedContentAccess): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    @scala.inline
    def setClipUrl(value: String): Self = StObject.set(x, "clipUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUrlUndefined: Self = StObject.set(x, "clipUrl", js.undefined)
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    @scala.inline
    def setContentType(value: RelatedContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setDate(value: Timestamp): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setSourceFaviconUrl(value: String): Self = StObject.set(x, "sourceFaviconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFaviconUrlUndefined: Self = StObject.set(x, "sourceFaviconUrl", js.undefined)
    
    @scala.inline
    def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
    
    @scala.inline
    def setTeaser(value: String): Self = StObject.set(x, "teaser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeaserUndefined: Self = StObject.set(x, "teaser", js.undefined)
    
    @scala.inline
    def setThumbnails(value: js.Array[RelatedContentImage]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setThumbnailsVarargs(value: RelatedContentImage*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVisibleUrl(value: String): Self = StObject.set(x, "visibleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUrlUndefined: Self = StObject.set(x, "visibleUrl", js.undefined)
  }
}
