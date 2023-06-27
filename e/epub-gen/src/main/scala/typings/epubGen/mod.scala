package typings.epubGen

import typings.epubGen.epubGenInts.`2`
import typings.epubGen.epubGenInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("epub-gen", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Epub {
    def this(options: Options) = this()
    def this(options: Options, output: String) = this()
    
    /* CompleteClass */
    var promise: js.Promise[Unit] = js.native
  }
  
  trait Chapter extends StObject {
    
    /** Author of the chapter */
    var author: js.UndefOr[String] = js.undefined
    
    /** Show the chapter before table of contents. For example, copyright pages. */
    var beforeToc: js.UndefOr[Boolean] = js.undefined
    
    /** HTML String of the chapter content. */
    var data: String
    
    /** Exclude the chapter from the table of contents */
    var excludeFromToc: js.UndefOr[Boolean] = js.undefined
    
    /** Specify filename for the chapter */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Chapter title */
    var title: js.UndefOr[String] = js.undefined
  }
  object Chapter {
    
    inline def apply(data: String): Chapter = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chapter] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBeforeToc(value: Boolean): Self = StObject.set(x, "beforeToc", value.asInstanceOf[js.Any])
      
      inline def setBeforeTocUndefined: Self = StObject.set(x, "beforeToc", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExcludeFromToc(value: Boolean): Self = StObject.set(x, "excludeFromToc", value.asInstanceOf[js.Any])
      
      inline def setExcludeFromTocUndefined: Self = StObject.set(x, "excludeFromToc", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Epub extends StObject {
    
    var promise: js.Promise[Unit]
  }
  object Epub {
    
    inline def apply(promise: js.Promise[Unit]): Epub = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Epub]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Epub] (val x: Self) extends AnyVal {
      
      inline def setPromise(value: js.Promise[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Automatically append the chapter title at the beginning of each contents. */
    var appendChapterTitles: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the Author/Authors of the book */
    var author: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Book Chapters content. */
    var content: js.Array[Chapter]
    
    /** Book cover image. File path (absolute) or web url */
    var cover: js.UndefOr[String] = js.undefined
    
    /** A CSS string to replace default style */
    var css: js.UndefOr[String] = js.undefined
    
    /** For advanced customizations: absolute path to a HTML toc template. */
    var customHtmlTocTemplatePath: js.UndefOr[String] = js.undefined
    
    /** For advanced customizations: absolute path to a NCX toc template. */
    var customNcxTemplatePath: js.UndefOr[String] = js.undefined
    
    /** For advanced customizations: absolute path to an OPF template. */
    var customOpfTemplatePath: js.UndefOr[String] = js.undefined
    
    /** Absolute paths to font files, so that they can be used in custom CSS */
    var fonts: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Language of the book in two letter code. If not specified, will fall back to `en` */
    var lang: js.UndefOr[String] = js.undefined
    
    /** Output path */
    var output: js.UndefOr[String] = js.undefined
    
    /** Publisher name */
    var publisher: js.UndefOr[String] = js.undefined
    
    /** Title of the book */
    var title: String
    
    /** Title of the table of contents. If not specified, will fallback to "Table Of Contents". */
    var tocTitle: js.UndefOr[String] = js.undefined
    
    /**  Whether or not to log progress messages */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /** Epub version. If not specified, will fall back to 3. */
    var version: js.UndefOr[`2` | `3`] = js.undefined
  }
  object Options {
    
    inline def apply(content: js.Array[Chapter], title: String): Options = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAppendChapterTitles(value: Boolean): Self = StObject.set(x, "appendChapterTitles", value.asInstanceOf[js.Any])
      
      inline def setAppendChapterTitlesUndefined: Self = StObject.set(x, "appendChapterTitles", js.undefined)
      
      inline def setAuthor(value: String | js.Array[String]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setAuthorVarargs(value: String*): Self = StObject.set(x, "author", js.Array(value*))
      
      inline def setContent(value: js.Array[Chapter]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: Chapter*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCustomHtmlTocTemplatePath(value: String): Self = StObject.set(x, "customHtmlTocTemplatePath", value.asInstanceOf[js.Any])
      
      inline def setCustomHtmlTocTemplatePathUndefined: Self = StObject.set(x, "customHtmlTocTemplatePath", js.undefined)
      
      inline def setCustomNcxTemplatePath(value: String): Self = StObject.set(x, "customNcxTemplatePath", value.asInstanceOf[js.Any])
      
      inline def setCustomNcxTemplatePathUndefined: Self = StObject.set(x, "customNcxTemplatePath", js.undefined)
      
      inline def setCustomOpfTemplatePath(value: String): Self = StObject.set(x, "customOpfTemplatePath", value.asInstanceOf[js.Any])
      
      inline def setCustomOpfTemplatePathUndefined: Self = StObject.set(x, "customOpfTemplatePath", js.undefined)
      
      inline def setFonts(value: js.Array[String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setFontsVarargs(value: String*): Self = StObject.set(x, "fonts", js.Array(value*))
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTocTitle(value: String): Self = StObject.set(x, "tocTitle", value.asInstanceOf[js.Any])
      
      inline def setTocTitleUndefined: Self = StObject.set(x, "tocTitle", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setVersion(value: `2` | `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
