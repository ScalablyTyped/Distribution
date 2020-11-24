package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReportOptions extends js.Object {
  
  var additionalJsContext: js.Object = js.native
  
  var cmdDelimiter: js.Tuple2[String, String] = js.native
  
  var errorHandler: ErrorHandler | Null = js.native
  
  var failFast: Boolean = js.native
  
  var fixSmartQuotes: Boolean = js.native
  
  var literalXmlDelimiter: String = js.native
  
  var noSandbox: Boolean = js.native
  
  var processLineBreaks: Boolean = js.native
  
  var rejectNullish: Boolean = js.native
  
  var runJs: js.UndefOr[RunJSFunc] = js.native
}
object CreateReportOptions {
  
  @scala.inline
  def apply(
    additionalJsContext: js.Object,
    cmdDelimiter: js.Tuple2[String, String],
    failFast: Boolean,
    fixSmartQuotes: Boolean,
    literalXmlDelimiter: String,
    noSandbox: Boolean,
    processLineBreaks: Boolean,
    rejectNullish: Boolean
  ): CreateReportOptions = {
    val __obj = js.Dynamic.literal(additionalJsContext = additionalJsContext.asInstanceOf[js.Any], cmdDelimiter = cmdDelimiter.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], fixSmartQuotes = fixSmartQuotes.asInstanceOf[js.Any], literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any], noSandbox = noSandbox.asInstanceOf[js.Any], processLineBreaks = processLineBreaks.asInstanceOf[js.Any], rejectNullish = rejectNullish.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportOptions]
  }
  
  @scala.inline
  implicit class CreateReportOptionsOps[Self <: CreateReportOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalJsContext(value: js.Object): Self = this.set("additionalJsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdDelimiter(value: js.Tuple2[String, String]): Self = this.set("cmdDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailFast(value: Boolean): Self = this.set("failFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixSmartQuotes(value: Boolean): Self = this.set("fixSmartQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralXmlDelimiter(value: String): Self = this.set("literalXmlDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSandbox(value: Boolean): Self = this.set("noSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessLineBreaks(value: Boolean): Self = this.set("processLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectNullish(value: Boolean): Self = this.set("rejectNullish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandler(value: (/* e */ Error, /* raw_code */ js.UndefOr[String]) => js.Any): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHandlerNull: Self = this.set("errorHandler", null)
    
    @scala.inline
    def setRunJs(value: /* o */ Ctx => ModifiedSandbox): Self = this.set("runJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRunJs: Self = this.set("runJs", js.undefined)
  }
}
