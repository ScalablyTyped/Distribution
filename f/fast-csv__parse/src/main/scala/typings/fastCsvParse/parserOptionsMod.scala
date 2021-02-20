package typings.fastCsvParse

import typings.fastCsvParse.typesMod.HeaderArray
import typings.fastCsvParse.typesMod.HeaderTransformFunction
import typings.node.BufferEncoding
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserOptionsMod {
  
  @JSImport("@fast-csv/parse/build/src/ParserOptions", "ParserOptions")
  @js.native
  class ParserOptions () extends StObject {
    def this(opts: ParserOptionsArgs) = this()
    
    val NEXT_TOKEN_REGEXP: RegExp = js.native
    
    val carriageReturn: String = js.native
    
    val comment: String | Null = js.native
    
    val delimiter: String = js.native
    
    val discardUnmappedColumns: Boolean = js.native
    
    val encoding: BufferEncoding = js.native
    
    val escape: String | Null = js.native
    
    val escapeChar: String | Null = js.native
    
    val escapedDelimiter: String = js.native
    
    val headers: Boolean | HeaderTransformFunction | HeaderArray | Null = js.native
    
    val ignoreEmpty: Boolean = js.native
    
    val limitRows: Boolean = js.native
    
    val ltrim: Boolean = js.native
    
    val maxRows: Double = js.native
    
    val objectMode: Boolean = js.native
    
    val quote: String | Null = js.native
    
    val renameHeaders: Boolean = js.native
    
    val rtrim: Boolean = js.native
    
    val skipLines: Double = js.native
    
    val skipRows: Double = js.native
    
    val strictColumnHandling: Boolean = js.native
    
    val supportsComments: Boolean = js.native
    
    val trim: Boolean = js.native
  }
  
  @js.native
  trait ParserOptionsArgs extends StObject {
    
    var comment: js.UndefOr[String] = js.native
    
    var delimiter: js.UndefOr[String] = js.native
    
    var discardUnmappedColumns: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var escape: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[Boolean | HeaderTransformFunction | HeaderArray] = js.native
    
    var ignoreEmpty: js.UndefOr[Boolean] = js.native
    
    var ltrim: js.UndefOr[Boolean] = js.native
    
    var maxRows: js.UndefOr[Double] = js.native
    
    var objectMode: js.UndefOr[Boolean] = js.native
    
    var quote: js.UndefOr[String | Null] = js.native
    
    var renameHeaders: js.UndefOr[Boolean] = js.native
    
    var rtrim: js.UndefOr[Boolean] = js.native
    
    var skipLines: js.UndefOr[Double] = js.native
    
    var skipRows: js.UndefOr[Double] = js.native
    
    var strictColumnHandling: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
  }
  object ParserOptionsArgs {
    
    @scala.inline
    def apply(): ParserOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptionsArgs]
    }
    
    @scala.inline
    implicit class ParserOptionsArgsMutableBuilder[Self <: ParserOptionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDiscardUnmappedColumns(value: Boolean): Self = StObject.set(x, "discardUnmappedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscardUnmappedColumnsUndefined: Self = StObject.set(x, "discardUnmappedColumns", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEmptyUndefined: Self = StObject.set(x, "ignoreEmpty", js.undefined)
      
      @scala.inline
      def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRenameHeaders(value: Boolean): Self = StObject.set(x, "renameHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameHeadersUndefined: Self = StObject.set(x, "renameHeaders", js.undefined)
      
      @scala.inline
      def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setSkipLines(value: Double): Self = StObject.set(x, "skipLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLinesUndefined: Self = StObject.set(x, "skipLines", js.undefined)
      
      @scala.inline
      def setSkipRows(value: Double): Self = StObject.set(x, "skipRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipRowsUndefined: Self = StObject.set(x, "skipRows", js.undefined)
      
      @scala.inline
      def setStrictColumnHandling(value: Boolean): Self = StObject.set(x, "strictColumnHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictColumnHandlingUndefined: Self = StObject.set(x, "strictColumnHandling", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
