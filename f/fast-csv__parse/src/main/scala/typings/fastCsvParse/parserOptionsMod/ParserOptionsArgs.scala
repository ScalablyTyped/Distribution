package typings.fastCsvParse.parserOptionsMod

import typings.fastCsvParse.typesMod.HeaderArray
import typings.fastCsvParse.typesMod.HeaderTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptionsArgs extends js.Object {
  
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
  implicit class ParserOptionsArgsOps[Self <: ParserOptionsArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDiscardUnmappedColumns(value: Boolean): Self = this.set("discardUnmappedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscardUnmappedColumns: Self = this.set("discardUnmappedColumns", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: (js.UndefOr[String | Null])*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = this.set("headers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIgnoreEmpty(value: Boolean): Self = this.set("ignoreEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmpty: Self = this.set("ignoreEmpty", js.undefined)
    
    @scala.inline
    def setLtrim(value: Boolean): Self = this.set("ltrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtrim: Self = this.set("ltrim", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoteNull: Self = this.set("quote", null)
    
    @scala.inline
    def setRenameHeaders(value: Boolean): Self = this.set("renameHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenameHeaders: Self = this.set("renameHeaders", js.undefined)
    
    @scala.inline
    def setRtrim(value: Boolean): Self = this.set("rtrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtrim: Self = this.set("rtrim", js.undefined)
    
    @scala.inline
    def setSkipLines(value: Double): Self = this.set("skipLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLines: Self = this.set("skipLines", js.undefined)
    
    @scala.inline
    def setSkipRows(value: Double): Self = this.set("skipRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipRows: Self = this.set("skipRows", js.undefined)
    
    @scala.inline
    def setStrictColumnHandling(value: Boolean): Self = this.set("strictColumnHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictColumnHandling: Self = this.set("strictColumnHandling", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
