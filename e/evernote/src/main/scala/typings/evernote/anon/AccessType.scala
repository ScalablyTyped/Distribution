package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.RelatedContentAccess
import typings.evernote.mod.Types.RelatedContentImage
import typings.evernote.mod.Types.RelatedContentType
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessType extends js.Object {
  
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
  implicit class AccessTypeOps[Self <: AccessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessType(value: RelatedContentAccess): Self = this.set("accessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessType: Self = this.set("accessType", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: String*): Self = this.set("authors", js.Array(value :_*))
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    
    @scala.inline
    def setClipUrl(value: String): Self = this.set("clipUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipUrl: Self = this.set("clipUrl", js.undefined)
    
    @scala.inline
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    
    @scala.inline
    def setContentType(value: RelatedContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDate(value: Timestamp): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setSourceFaviconUrl(value: String): Self = this.set("sourceFaviconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFaviconUrl: Self = this.set("sourceFaviconUrl", js.undefined)
    
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
    
    @scala.inline
    def setSourceUrl(value: String): Self = this.set("sourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUrl: Self = this.set("sourceUrl", js.undefined)
    
    @scala.inline
    def setTeaser(value: String): Self = this.set("teaser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeaser: Self = this.set("teaser", js.undefined)
    
    @scala.inline
    def setThumbnailsVarargs(value: RelatedContentImage*): Self = this.set("thumbnails", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: js.Array[RelatedContentImage]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVisibleUrl(value: String): Self = this.set("visibleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleUrl: Self = this.set("visibleUrl", js.undefined)
  }
}
