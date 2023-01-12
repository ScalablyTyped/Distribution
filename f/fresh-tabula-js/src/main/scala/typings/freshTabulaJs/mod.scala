package typings.freshTabulaJs

import typings.freshTabulaJs.anon.Error
import typings.highland.Highland.Stream
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Convert tables inside PDFs to CSV via tabula-java using JavaScript.
    */
  @JSImport("fresh-tabula-js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Tabula {
    /**
      * @param path Path (relative or absolute) to a valid PDF.
      */
    def this(path: String) = this()
    def this(path: String, options: Options) = this()
    
    /* CompleteClass */
    override def getData(): js.Promise[Error] = js.native
    
    /* CompleteClass */
    override def stream(): Stream[Buffer] = js.native
    
    /* CompleteClass */
    override def streamSections(callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Null, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Entire page	Co-ordinates of the portion(s) of the page to analyze, formatted in strings in the following format `top,left,bottom,right`.
      *
      * @default Entire page
      * @example
      * { area: "269.875,12.75,790.5,561" }
      * { area: ["269.875,12.75,790.5,561", "132.45,23.2,256.3,534"] }
      */
    var area: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * X coordinates of column boundaries.
      *
      * @example
      * { columns: "10.1,20.2,30.3" }
      */
    var columns: js.UndefOr[String] = js.undefined
    
    /**
      * Print detected table areas instead of processing them.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Guess the portion(s) of the page to analyze and process.
      *
      * @default true
      */
    var guess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force PDF not to be extracted using spreadsheet-style extraction (if there are ruling lines separating each cell, as in a PDF of an Excel spreadsheet).
      *
      * @default false
      */
    var noSpreadsheet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Comma separated list of ranges, or all.
      *
      * @default "1"
      * @example
      * { pages: "1-3,5-7" }
      * { pages: "3" }
      * { pages: "all" }
      */
    var pages: js.UndefOr[String] = js.undefined
    
    /**
      * Password used to decrypt/access the document.
      *
      * @default ""
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Suppresses all `stderr` output from the tabula-java JAR only. JavaScript errors will still be logged.
      *
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force PDF to be extracted using spreadsheet-style extraction (if there are ruling lines separating each cell, as in a PDF of an Excel spreadsheet).
      *
      * @default false
      */
    var spreadsheet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use embedded line returns in cells (only in spreadsheet mode).
      *
      * @default false
      */
    var useLineReturns: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArea(value: String | js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value*))
      
      inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGuess(value: Boolean): Self = StObject.set(x, "guess", value.asInstanceOf[js.Any])
      
      inline def setGuessUndefined: Self = StObject.set(x, "guess", js.undefined)
      
      inline def setNoSpreadsheet(value: Boolean): Self = StObject.set(x, "noSpreadsheet", value.asInstanceOf[js.Any])
      
      inline def setNoSpreadsheetUndefined: Self = StObject.set(x, "noSpreadsheet", js.undefined)
      
      inline def setPages(value: String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSpreadsheet(value: Boolean): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
      
      inline def setSpreadsheetUndefined: Self = StObject.set(x, "spreadsheet", js.undefined)
      
      inline def setUseLineReturns(value: Boolean): Self = StObject.set(x, "useLineReturns", value.asInstanceOf[js.Any])
      
      inline def setUseLineReturnsUndefined: Self = StObject.set(x, "useLineReturns", js.undefined)
    }
  }
  
  /**
    * Convert tables inside PDFs to CSV via tabula-java using JavaScript.
    */
  trait Tabula extends StObject {
    
    def getData(): js.Promise[Error]
    
    def stream(): Stream[Buffer]
    
    def streamSections(callback: js.Function2[/* err */ js.Error | Null, /* data */ String | Null, Unit]): Unit
  }
  object Tabula {
    
    inline def apply(
      getData: () => js.Promise[Error],
      stream: () => Stream[Buffer],
      streamSections: js.Function2[/* err */ js.Error | Null, /* data */ String | Null, Unit] => Unit
    ): Tabula = {
      val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), stream = js.Any.fromFunction0(stream), streamSections = js.Any.fromFunction1(streamSections))
      __obj.asInstanceOf[Tabula]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tabula] (val x: Self) extends AnyVal {
      
      inline def setGetData(value: () => js.Promise[Error]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setStream(value: () => Stream[Buffer]): Self = StObject.set(x, "stream", js.Any.fromFunction0(value))
      
      inline def setStreamSections(value: js.Function2[/* err */ js.Error | Null, /* data */ String | Null, Unit] => Unit): Self = StObject.set(x, "streamSections", js.Any.fromFunction1(value))
    }
  }
}
