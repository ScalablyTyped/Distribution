package typings.feedme

import org.scalablytyped.runtime.StringDictionary
import typings.feedme.feedmeStrings.`type`
import typings.feedme.feedmeStrings.close
import typings.feedme.feedmeStrings.drain
import typings.feedme.feedmeStrings.error
import typings.feedme.feedmeStrings.finish
import typings.feedme.feedmeStrings.item
import typings.feedme.feedmeStrings.pipe
import typings.feedme.feedmeStrings.unpipe
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("feedme", JSImport.Namespace)
  @js.native
  /**
    * Creates a new instance of the FeedMe parser.
    *
    * @param buffer Can be true if you want the parser to buffer the entire feed document as a JSON object, letting you use the FeedMe#done() method.
    */
  class ^ () extends FeedMe {
    def this(buffer: Boolean) = this()
  }
  
  @js.native
  trait Attrs extends StObject {
    
    var local: String = js.native
    
    var name: String = js.native
    
    var prefix: String = js.native
    
    var uri: String = js.native
    
    var value: js.Any = js.native
  }
  object Attrs {
    
    @scala.inline
    def apply(local: String, name: String, prefix: String, uri: String, value: js.Any): Attrs = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Document extends Meta {
    
    var items: js.Array[Item] = js.native
  }
  object Document {
    
    @scala.inline
    def apply(
      author: String,
      categories: js.Array[String],
      copyright: String,
      date: String,
      description: String,
      favicon: String,
      generator: String,
      image: Image,
      items: js.Array[Item],
      language: String,
      lastbuilddate: String,
      link: String,
      pubdate: String,
      title: String,
      `type`: Type,
      xmlurl: String
    ): Document = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastbuilddate = lastbuilddate.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FeedMe extends Writable {
    
    /**
      * Can only be used if buffer is true. It returns the feed as a Javascript object, should be called after end is emitted from the parser.
      * Subelements are put as children objects with their names as keys. When one object has more than one child of the same name, they are
      * put into an array. Items are always put into an array.
      */
    def done(): Document = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_item(event: item, listener: js.Function1[/* item */ Item, Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_type(event: `type`, listener: js.Function1[/* type */ Type, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  }
  
  @js.native
  trait Guid extends StObject {
    
    var ispermalink: String = js.native
    
    var text: String = js.native
  }
  object Guid {
    
    @scala.inline
    def apply(ispermalink: String, text: String): Guid = {
      val __obj = js.Dynamic.literal(ispermalink = ispermalink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guid]
    }
    
    @scala.inline
    implicit class GuidMutableBuilder[Self <: Guid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIspermalink(value: String): Self = StObject.set(x, "ispermalink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Image extends StObject {
    
    var height: String = js.native
    
    var link: String = js.native
    
    var title: String = js.native
    
    var url: String = js.native
    
    var width: String = js.native
  }
  object Image {
    
    @scala.inline
    def apply(height: String, link: String, title: String, url: String, width: String): Image = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Item
    extends /* key */ StringDictionary[js.Any] {
    
    var author: String = js.native
    
    var categories: js.Array[String] = js.native
    
    var comments: String = js.native
    
    var date: String = js.native
    
    var description: String = js.native
    
    var enclosures: js.Array[String] = js.native
    
    var guid: String | Guid = js.native
    
    var image: Image = js.native
    
    var link: String = js.native
    
    var origlink: String = js.native
    
    var pubdate: String = js.native
    
    var summary: String = js.native
    
    var title: String = js.native
  }
  object Item {
    
    @scala.inline
    def apply(
      author: String,
      categories: js.Array[String],
      comments: String,
      date: String,
      description: String,
      enclosures: js.Array[String],
      guid: String | Guid,
      image: Image,
      link: String,
      origlink: String,
      pubdate: String,
      summary: String,
      title: String
    ): Item = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], origlink = origlink.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosures(value: js.Array[String]): Self = StObject.set(x, "enclosures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosuresVarargs(value: String*): Self = StObject.set(x, "enclosures", js.Array(value :_*))
      
      @scala.inline
      def setGuid(value: String | Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriglink(value: String): Self = StObject.set(x, "origlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubdate(value: String): Self = StObject.set(x, "pubdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Meta
    extends /* key */ StringDictionary[js.Any] {
    
    var author: String = js.native
    
    var categories: js.Array[String] = js.native
    
    var copyright: String = js.native
    
    var date: String = js.native
    
    var description: String = js.native
    
    var favicon: String = js.native
    
    var generator: String = js.native
    
    var image: Image = js.native
    
    var language: String = js.native
    
    var lastbuilddate: String = js.native
    
    var link: String = js.native
    
    var pubdate: String = js.native
    
    // "#version": string;
    var title: String = js.native
    
    // "#ns": NS[];
    var `type`: Type = js.native
    
    var xmlurl: String = js.native
  }
  object Meta {
    
    @scala.inline
    def apply(
      author: String,
      categories: js.Array[String],
      copyright: String,
      date: String,
      description: String,
      favicon: String,
      generator: String,
      image: Image,
      language: String,
      lastbuilddate: String,
      link: String,
      pubdate: String,
      title: String,
      `type`: Type,
      xmlurl: String
    ): Meta = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastbuilddate = lastbuilddate.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastbuilddate(value: String): Self = StObject.set(x, "lastbuilddate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubdate(value: String): Self = StObject.set(x, "pubdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlurl(value: String): Self = StObject.set(x, "xmlurl", value.asInstanceOf[js.Any])
    }
  }
  
  type NS = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.feedme.feedmeStrings.atom
    - typings.feedme.feedmeStrings.`rss 0Dot90`
    - typings.feedme.feedmeStrings.`rss 0Dot91`
    - typings.feedme.feedmeStrings.`rss 0Dot92`
    - typings.feedme.feedmeStrings.`rss 0Dot93`
    - typings.feedme.feedmeStrings.`rss 0Dot94`
    - typings.feedme.feedmeStrings.`rss 1Dot0`
    - typings.feedme.feedmeStrings.`rss 2Dot0`
    - typings.feedme.feedmeStrings.json
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def atom: typings.feedme.feedmeStrings.atom = "atom".asInstanceOf[typings.feedme.feedmeStrings.atom]
    
    @scala.inline
    def json: typings.feedme.feedmeStrings.json = "json".asInstanceOf[typings.feedme.feedmeStrings.json]
    
    @scala.inline
    def `rss 0Dot90`: typings.feedme.feedmeStrings.`rss 0Dot90` = ("rss 0.90").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot90`]
    
    @scala.inline
    def `rss 0Dot91`: typings.feedme.feedmeStrings.`rss 0Dot91` = ("rss 0.91").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot91`]
    
    @scala.inline
    def `rss 0Dot92`: typings.feedme.feedmeStrings.`rss 0Dot92` = ("rss 0.92").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot92`]
    
    @scala.inline
    def `rss 0Dot93`: typings.feedme.feedmeStrings.`rss 0Dot93` = ("rss 0.93").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot93`]
    
    @scala.inline
    def `rss 0Dot94`: typings.feedme.feedmeStrings.`rss 0Dot94` = ("rss 0.94").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot94`]
    
    @scala.inline
    def `rss 1Dot0`: typings.feedme.feedmeStrings.`rss 1Dot0` = ("rss 1.0").asInstanceOf[typings.feedme.feedmeStrings.`rss 1Dot0`]
    
    @scala.inline
    def `rss 2Dot0`: typings.feedme.feedmeStrings.`rss 2Dot0` = ("rss 2.0").asInstanceOf[typings.feedme.feedmeStrings.`rss 2Dot0`]
  }
}
