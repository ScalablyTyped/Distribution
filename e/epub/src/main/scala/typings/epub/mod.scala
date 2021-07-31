package typings.epub

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  new EPub(fname[, imageroot][, linkroot])
  *  - fname (String): filename for the ebook
  *  - imageroot (String): URL prefix for images
  *  - linkroot (String): URL prefix for links
  *
  *  Creates an Event Emitter type object for parsing epub files
  *
  *      var epub = new EPub("book.epub");
  *      epub.on("end", function () {
  *           console.log(epub.spine);
  *      });
  *      epub.on("error", function (error) { ... });
  *      epub.parse();
  *
  *  Image and link URL format is:
  *
  *      imageroot + img_id + img_zip_path
  *
  *  So an image "logo.jpg" which resides in "OPT/" in the zip archive
  *  and is listed in the manifest with id "logo_img" will have the
  *  following url (providing that imageroot is "/images/"):
  *
  *      /images/logo_img/OPT/logo.jpg
  **/
object mod {
  
  @JSImport("epub", JSImport.Namespace)
  @js.native
  class ^ protected () extends EPub {
    def this(epubfile: String) = this()
    def this(epubfile: String, imagewebroot: String) = this()
    def this(epubfile: String, imagewebroot: String, chapterwebroot: String) = this()
    def this(epubfile: String, imagewebroot: Unit, chapterwebroot: String) = this()
  }
  
  @js.native
  trait EPub extends EventEmitter {
    
    var flow: js.Array[js.Object] = js.native
    
    def getChapter(chapterId: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
    
    def getChapterRaw(chapterId: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
    
    def getFile(
      id: String,
      callback: js.Function3[/* error */ Error, /* data */ Buffer, /* mimeType */ String, Unit]
    ): Unit = js.native
    
    def getImage(
      id: String,
      callback: js.Function3[/* error */ Error, /* data */ Buffer, /* mimeType */ String, Unit]
    ): Unit = js.native
    
    var manifest: js.Object = js.native
    
    var metadata: js.Object = js.native
    
    def parse(): Unit = js.native
    
    var spine: js.Object = js.native
    
    var toc: js.Array[TocElement] = js.native
  }
  
  trait TocElement extends StObject {
    
    var href: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var level: Double
    
    var order: Double
    
    var title: String
  }
  object TocElement {
    
    @scala.inline
    def apply(id: String, level: Double, order: Double, title: String): TocElement = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TocElement]
    }
    
    @scala.inline
    implicit class TocElementMutableBuilder[Self <: TocElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
