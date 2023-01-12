package typings.domutils

import typings.domhandler.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFeedsMod {
  
  @JSImport("domutils/lib/feeds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFeed(doc: js.Array[AnyNode]): Feed | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeed")(doc.asInstanceOf[js.Any]).asInstanceOf[Feed | Null]
  
  trait Feed extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var items: js.Array[FeedItem]
    
    var link: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var updated: js.UndefOr[js.Date] = js.undefined
  }
  object Feed {
    
    inline def apply(items: js.Array[FeedItem], `type`: String): Feed = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: js.Array[FeedItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: FeedItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: js.Date): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  trait FeedItem extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var media: js.Array[FeedItemMedia]
    
    var pubDate: js.UndefOr[js.Date] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FeedItem {
    
    inline def apply(media: js.Array[FeedItemMedia]): FeedItem = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedItem] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMedia(value: js.Array[FeedItemMedia]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaVarargs(value: FeedItemMedia*): Self = StObject.set(x, "media", js.Array(value*))
      
      inline def setPubDate(value: js.Date): Self = StObject.set(x, "pubDate", value.asInstanceOf[js.Any])
      
      inline def setPubDateUndefined: Self = StObject.set(x, "pubDate", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait FeedItemMedia extends StObject {
    
    var bitrate: js.UndefOr[Double] = js.undefined
    
    var channels: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var expression: js.UndefOr[FeedItemMediaExpression] = js.undefined
    
    var fileSize: js.UndefOr[Double] = js.undefined
    
    var framerate: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var isDefault: Boolean
    
    var lang: js.UndefOr[String] = js.undefined
    
    var medium: js.UndefOr[FeedItemMediaMedium] = js.undefined
    
    var samplingrate: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object FeedItemMedia {
    
    inline def apply(isDefault: Boolean): FeedItemMedia = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItemMedia]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedItemMedia] (val x: Self) extends AnyVal {
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setExpression(value: FeedItemMediaExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMedium(value: FeedItemMediaMedium): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setSamplingrate(value: Double): Self = StObject.set(x, "samplingrate", value.asInstanceOf[js.Any])
      
      inline def setSamplingrateUndefined: Self = StObject.set(x, "samplingrate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.domutils.domutilsStrings.sample
    - typings.domutils.domutilsStrings.full
    - typings.domutils.domutilsStrings.nonstop
  */
  trait FeedItemMediaExpression extends StObject
  object FeedItemMediaExpression {
    
    inline def full: typings.domutils.domutilsStrings.full = "full".asInstanceOf[typings.domutils.domutilsStrings.full]
    
    inline def nonstop: typings.domutils.domutilsStrings.nonstop = "nonstop".asInstanceOf[typings.domutils.domutilsStrings.nonstop]
    
    inline def sample: typings.domutils.domutilsStrings.sample = "sample".asInstanceOf[typings.domutils.domutilsStrings.sample]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.domutils.domutilsStrings.image
    - typings.domutils.domutilsStrings.audio
    - typings.domutils.domutilsStrings.video
    - typings.domutils.domutilsStrings.document
    - typings.domutils.domutilsStrings.executable
  */
  trait FeedItemMediaMedium extends StObject
  object FeedItemMediaMedium {
    
    inline def audio: typings.domutils.domutilsStrings.audio = "audio".asInstanceOf[typings.domutils.domutilsStrings.audio]
    
    inline def document: typings.domutils.domutilsStrings.document = "document".asInstanceOf[typings.domutils.domutilsStrings.document]
    
    inline def executable: typings.domutils.domutilsStrings.executable = "executable".asInstanceOf[typings.domutils.domutilsStrings.executable]
    
    inline def image: typings.domutils.domutilsStrings.image = "image".asInstanceOf[typings.domutils.domutilsStrings.image]
    
    inline def video: typings.domutils.domutilsStrings.video = "video".asInstanceOf[typings.domutils.domutilsStrings.video]
  }
}
