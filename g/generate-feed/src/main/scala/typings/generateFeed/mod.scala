package typings.generateFeed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: Config, logMap: js.Array[LogMap], dest: String): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logMap.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(config: Config, logMap: js.Array[LogMap], dest: String, cb: CallbackFn): Unit = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], logMap.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("generate-feed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Attachment extends StObject {
    
    var duration_in_seconds: js.UndefOr[Double] = js.undefined
    
    var mime_type: js.UndefOr[String] = js.undefined
    
    var size_in_bytes: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Attachment {
    
    inline def apply(): Attachment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attachment]
    }
    
    extension [Self <: Attachment](x: Self) {
      
      inline def setDuration_in_seconds(value: Double): Self = StObject.set(x, "duration_in_seconds", value.asInstanceOf[js.Any])
      
      inline def setDuration_in_secondsUndefined: Self = StObject.set(x, "duration_in_seconds", js.undefined)
      
      inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
      
      inline def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
      
      inline def setSize_in_bytes(value: Double): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
      
      inline def setSize_in_bytesUndefined: Self = StObject.set(x, "size_in_bytes", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type CallbackFn = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  
  trait Config extends StObject {
    
    var author: String
    
    var avatar: js.UndefOr[String] = js.undefined
    
    var description: String
    
    var expired: js.UndefOr[Boolean] = js.undefined
    
    var favicon: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var url: String
    
    var user_comment: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(author: String, description: String, title: String, url: String): Config = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_comment(value: String): Self = StObject.set(x, "user_comment", value.asInstanceOf[js.Any])
      
      inline def setUser_commentUndefined: Self = StObject.set(x, "user_comment", js.undefined)
    }
  }
  
  trait LogMap extends StObject {
    
    var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
    
    var author: js.UndefOr[String] = js.undefined
    
    var banner_image: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var modified: js.UndefOr[String] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object LogMap {
    
    inline def apply(): LogMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogMap]
    }
    
    extension [Self <: LogMap](x: Self) {
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBanner_image(value: String): Self = StObject.set(x, "banner_image", value.asInstanceOf[js.Any])
      
      inline def setBanner_imageUndefined: Self = StObject.set(x, "banner_image", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
