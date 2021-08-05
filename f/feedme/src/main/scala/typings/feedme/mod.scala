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
  
  trait Attrs extends StObject {
    
    var local: String
    
    var name: String
    
    var prefix: String
    
    var uri: String
    
    var value: js.Any
  }
  object Attrs {
    
    inline def apply(local: String, name: String, prefix: String, uri: String, value: js.Any): Attrs = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document
    extends StObject
       with Meta {
    
    var items: js.Array[Item]
  }
  object Document {
    
    inline def apply(
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
    
    extension [Self <: Document](x: Self) {
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
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
  
  trait Guid extends StObject {
    
    var ispermalink: String
    
    var text: String
  }
  object Guid {
    
    inline def apply(ispermalink: String, text: String): Guid = {
      val __obj = js.Dynamic.literal(ispermalink = ispermalink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guid]
    }
    
    extension [Self <: Guid](x: Self) {
      
      inline def setIspermalink(value: String): Self = StObject.set(x, "ispermalink", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var height: String
    
    var link: String
    
    var title: String
    
    var url: String
    
    var width: String
  }
  object Image {
    
    inline def apply(height: String, link: String, title: String, url: String, width: String): Image = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var author: String
    
    var categories: js.Array[String]
    
    var comments: String
    
    var date: String
    
    var description: String
    
    var enclosures: js.Array[String]
    
    var guid: String | Guid
    
    var image: Image
    
    var link: String
    
    var origlink: String
    
    var pubdate: String
    
    var summary: String
    
    var title: String
  }
  object Item {
    
    inline def apply(
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
    
    extension [Self <: Item](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnclosures(value: js.Array[String]): Self = StObject.set(x, "enclosures", value.asInstanceOf[js.Any])
      
      inline def setEnclosuresVarargs(value: String*): Self = StObject.set(x, "enclosures", js.Array(value :_*))
      
      inline def setGuid(value: String | Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setOriglink(value: String): Self = StObject.set(x, "origlink", value.asInstanceOf[js.Any])
      
      inline def setPubdate(value: String): Self = StObject.set(x, "pubdate", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var author: String
    
    var categories: js.Array[String]
    
    var copyright: String
    
    var date: String
    
    var description: String
    
    var favicon: String
    
    var generator: String
    
    var image: Image
    
    var language: String
    
    var lastbuilddate: String
    
    var link: String
    
    var pubdate: String
    
    // "#version": string;
    var title: String
    
    // "#ns": NS[];
    var `type`: Type
    
    var xmlurl: String
  }
  object Meta {
    
    inline def apply(
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
    
    extension [Self <: Meta](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLastbuilddate(value: String): Self = StObject.set(x, "lastbuilddate", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setPubdate(value: String): Self = StObject.set(x, "pubdate", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setXmlurl(value: String): Self = StObject.set(x, "xmlurl", value.asInstanceOf[js.Any])
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
    
    inline def atom: typings.feedme.feedmeStrings.atom = "atom".asInstanceOf[typings.feedme.feedmeStrings.atom]
    
    inline def json: typings.feedme.feedmeStrings.json = "json".asInstanceOf[typings.feedme.feedmeStrings.json]
    
    inline def `rss 0Dot90`: typings.feedme.feedmeStrings.`rss 0Dot90` = ("rss 0.90").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot90`]
    
    inline def `rss 0Dot91`: typings.feedme.feedmeStrings.`rss 0Dot91` = ("rss 0.91").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot91`]
    
    inline def `rss 0Dot92`: typings.feedme.feedmeStrings.`rss 0Dot92` = ("rss 0.92").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot92`]
    
    inline def `rss 0Dot93`: typings.feedme.feedmeStrings.`rss 0Dot93` = ("rss 0.93").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot93`]
    
    inline def `rss 0Dot94`: typings.feedme.feedmeStrings.`rss 0Dot94` = ("rss 0.94").asInstanceOf[typings.feedme.feedmeStrings.`rss 0Dot94`]
    
    inline def `rss 1Dot0`: typings.feedme.feedmeStrings.`rss 1Dot0` = ("rss 1.0").asInstanceOf[typings.feedme.feedmeStrings.`rss 1Dot0`]
    
    inline def `rss 2Dot0`: typings.feedme.feedmeStrings.`rss 2Dot0` = ("rss 2.0").asInstanceOf[typings.feedme.feedmeStrings.`rss 2Dot0`]
  }
}
