package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSlackAttachment extends StObject {
  
  var author_icon: js.UndefOr[String] = js.undefined
  
  var author_link: js.UndefOr[String] = js.undefined
  
  var author_name: String
  
  var color: js.UndefOr[String] = js.undefined
  
  var fallback: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[js.Array[WatcherSlackAttachmentField]] = js.undefined
  
  var footer: js.UndefOr[String] = js.undefined
  
  var footer_icon: js.UndefOr[String] = js.undefined
  
  var image_url: js.UndefOr[String] = js.undefined
  
  var pretext: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var title_link: js.UndefOr[String] = js.undefined
  
  var ts: js.UndefOr[EpochTime[UnitSeconds]] = js.undefined
}
object WatcherSlackAttachment {
  
  inline def apply(author_name: String, title: String): WatcherSlackAttachment = {
    val __obj = js.Dynamic.literal(author_name = author_name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSlackAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherSlackAttachment] (val x: Self) extends AnyVal {
    
    inline def setAuthor_icon(value: String): Self = StObject.set(x, "author_icon", value.asInstanceOf[js.Any])
    
    inline def setAuthor_iconUndefined: Self = StObject.set(x, "author_icon", js.undefined)
    
    inline def setAuthor_link(value: String): Self = StObject.set(x, "author_link", value.asInstanceOf[js.Any])
    
    inline def setAuthor_linkUndefined: Self = StObject.set(x, "author_link", js.undefined)
    
    inline def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFields(value: js.Array[WatcherSlackAttachmentField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: WatcherSlackAttachmentField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooter_icon(value: String): Self = StObject.set(x, "footer_icon", value.asInstanceOf[js.Any])
    
    inline def setFooter_iconUndefined: Self = StObject.set(x, "footer_icon", js.undefined)
    
    inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
    
    inline def setPretext(value: String): Self = StObject.set(x, "pretext", value.asInstanceOf[js.Any])
    
    inline def setPretextUndefined: Self = StObject.set(x, "pretext", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitle_link(value: String): Self = StObject.set(x, "title_link", value.asInstanceOf[js.Any])
    
    inline def setTitle_linkUndefined: Self = StObject.set(x, "title_link", js.undefined)
    
    inline def setTs(value: EpochTime[UnitSeconds]): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
  }
}
