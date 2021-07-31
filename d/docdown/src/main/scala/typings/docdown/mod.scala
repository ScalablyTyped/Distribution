package typings.docdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("docdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      *  The language indicator for code blocks.
      * @default 'js'
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * the input file pat
      */
    var path: String
    
    /**
      * Specify whether entries are sorted.
      * @default true
      */
    var sort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The hash style for links ('default' or 'github').
      * @default 'default'
      */
    var style: js.UndefOr[String] = js.undefined
    
    /**
      * The documentation title.
      * @default '<%= basename(options.path) %> API documentation'
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The table of contents organization style ('categories' or 'properties').
      * @default 'properties'
      */
    var toc: js.UndefOr[String] = js.undefined
    
    /**
      * The source URL.
      */
    var url: String
  }
  object Options {
    
    @scala.inline
    def apply(path: String, url: String): Options = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToc(value: String): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTocUndefined: Self = StObject.set(x, "toc", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
