package typings.feedparser

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Duplex
import typings.sax.mod.SAXStream
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("feedparser", JSImport.Namespace)
  @js.native
  class ^ protected () extends FeedParser {
    def this(options: Options) = this()
  }
  
  trait Attrs extends StObject {
    
    var local: String
    
    var name: String
    
    var prefix: String
    
    var uri: String
    
    var value: js.Any
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
  
  trait Enclosure extends StObject {
    
    var length: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object Enclosure {
    
    @scala.inline
    def apply(url: String): Enclosure = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enclosure]
    }
    
    @scala.inline
    implicit class EnclosureMutableBuilder[Self <: Enclosure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeedParser extends Duplex {
    
    var _emitted_meta: Boolean = js.native
    
    /* private */ def _flush(done: js.Function0[js.Any]): Unit = js.native
    
    /* private */ def _transform(data: js.Any, encoding: String, done: js.Function0[js.Any]): Unit = js.native
    
    def addListener(ev: js.Any, fn: js.Any): js.Any = js.native
    
    var errors: js.Array[Error] = js.native
    
    def handleAttributes(attrs: Attrs, el: String): js.Any = js.native
    
    def handleCloseTag(el: String): Unit = js.native
    
    def handleEnd(): js.Any = js.native
    
    def handleError(e: Error): Unit = js.native
    
    def handleItem(node: Node, `type`: Type, options: Options): Item = js.native
    
    def handleMeta(node: Node, `type`: Type, options: Options): Meta = js.native
    
    def handleOpenTag(node: Node): Unit = js.native
    
    def handleProcessingInstruction(node: Node): Unit = js.native
    
    def handleSaxError(e: Error): Unit = js.native
    
    def handleText(text: String): Unit = js.native
    
    var in_xhtml: Boolean = js.native
    
    def init(): Unit = js.native
    
    def listenerCount(`type`: Type): js.Any = js.native
    
    def listeners(`type`: Type): js.Any = js.native
    
    var meta: StringDictionary[js.Any] = js.native
    
    def on(ev: js.Any, fn: js.Any): js.Any = js.native
    
    var options: Options = js.native
    
    def pipe(dest: js.Any, pipeOpts: js.Any): js.Any = js.native
    
    def push(chunk: js.Any, encoding: js.Any): js.Any = js.native
    
    def removeAllListeners(`type`: Type, args: js.Any*): js.Any = js.native
    
    def resumeSaxError(): Unit = js.native
    
    def setDefaultEncoding(encoding: js.Any): js.Any = js.native
    
    def setEncoding(enc: js.Any): js.Any = js.native
    
    def setMaxListeners(n: js.Any): js.Any = js.native
    
    var stack: js.Array[js.Any] = js.native
    
    var stream: SAXStream = js.native
    
    def unpipe(dest: js.Any): js.Any = js.native
    
    def wrap(stream: SAXStream, args: js.Any*): js.Any = js.native
    
    var xhtml: StringDictionary[js.Any] = js.native
    
    var xmlbase: js.Array[js.Any] = js.native
  }
  
  trait Image extends StObject {
    
    var title: String
    
    var url: String
  }
  object Image {
    
    @scala.inline
    def apply(title: String, url: String): Image = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item extends StObject {
    
    var author: String
    
    var categories: js.Array[String]
    
    var comments: String
    
    var date: Date | Null
    
    var description: String
    
    var enclosures: js.Array[Enclosure]
    
    var guid: String
    
    var image: Image
    
    var link: String
    
    var meta: Meta
    
    var origlink: String
    
    var pubdate: Date | Null
    
    var summary: String
    
    var title: String
  }
  object Item {
    
    @scala.inline
    def apply(
      author: String,
      categories: js.Array[String],
      comments: String,
      description: String,
      enclosures: js.Array[Enclosure],
      guid: String,
      image: Image,
      link: String,
      meta: Meta,
      origlink: String,
      summary: String,
      title: String
    ): Item = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], origlink = origlink.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], date = null, pubdate = null)
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
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateNull: Self = StObject.set(x, "date", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosures(value: js.Array[Enclosure]): Self = StObject.set(x, "enclosures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosuresVarargs(value: Enclosure*): Self = StObject.set(x, "enclosures", js.Array(value :_*))
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriglink(value: String): Self = StObject.set(x, "origlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubdate(value: Date): Self = StObject.set(x, "pubdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubdateNull: Self = StObject.set(x, "pubdate", null)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta extends StObject {
    
    var author: String
    
    var categories: js.Array[String]
    
    var copyright: String
    
    var date: Date | Null
    
    var description: String
    
    var favicon: String
    
    var generator: String
    
    var image: Image
    
    var language: String
    
    var link: String
    
    var ns: js.Array[NS]
    
    var pubdate: Date | Null
    
    var title: String
    
    var `type`: Type
    
    var version: String
    
    var xmlurl: String
  }
  object Meta {
    
    @scala.inline
    def apply(
      author: String,
      categories: js.Array[String],
      copyright: String,
      description: String,
      favicon: String,
      generator: String,
      image: Image,
      language: String,
      link: String,
      ns: js.Array[NS],
      title: String,
      `type`: Type,
      version: String,
      xmlurl: String
    ): Meta = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any], date = null, pubdate = null)
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
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateNull: Self = StObject.set(x, "date", null)
      
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
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNs(value: js.Array[NS]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsVarargs(value: NS*): Self = StObject.set(x, "ns", js.Array(value :_*))
      
      @scala.inline
      def setPubdate(value: Date): Self = StObject.set(x, "pubdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubdateNull: Self = StObject.set(x, "pubdate", null)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlurl(value: String): Self = StObject.set(x, "xmlurl", value.asInstanceOf[js.Any])
    }
  }
  
  type NS = StringDictionary[String]
  
  type Node = StringDictionary[js.Any]
  
  trait Options extends StObject {
    
    var MAX_BUFFER_LENGTH: js.UndefOr[Double] = js.undefined
    
    var addmeta: js.UndefOr[Boolean] = js.undefined
    
    var feedurl: js.UndefOr[String] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var resume_saxerror: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddmeta(value: Boolean): Self = StObject.set(x, "addmeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddmetaUndefined: Self = StObject.set(x, "addmeta", js.undefined)
      
      @scala.inline
      def setFeedurl(value: String): Self = StObject.set(x, "feedurl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedurlUndefined: Self = StObject.set(x, "feedurl", js.undefined)
      
      @scala.inline
      def setMAX_BUFFER_LENGTH(value: Double): Self = StObject.set(x, "MAX_BUFFER_LENGTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_BUFFER_LENGTHUndefined: Self = StObject.set(x, "MAX_BUFFER_LENGTH", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setResume_saxerror(value: Boolean): Self = StObject.set(x, "resume_saxerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResume_saxerrorUndefined: Self = StObject.set(x, "resume_saxerror", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.feedparser.feedparserStrings.atom
    - typings.feedparser.feedparserStrings.rss
    - typings.feedparser.feedparserStrings.rdf
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def atom: typings.feedparser.feedparserStrings.atom = "atom".asInstanceOf[typings.feedparser.feedparserStrings.atom]
    
    @scala.inline
    def rdf: typings.feedparser.feedparserStrings.rdf = "rdf".asInstanceOf[typings.feedparser.feedparserStrings.rdf]
    
    @scala.inline
    def rss: typings.feedparser.feedparserStrings.rss = "rss".asInstanceOf[typings.feedparser.feedparserStrings.rss]
  }
}
