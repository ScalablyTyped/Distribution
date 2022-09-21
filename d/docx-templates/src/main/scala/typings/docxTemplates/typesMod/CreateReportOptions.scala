package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReportOptions extends StObject {
  
  var additionalJsContext: js.Object
  
  var cmdDelimiter: js.Tuple2[String, String]
  
  var errorHandler: ErrorHandler | Null
  
  var failFast: Boolean
  
  var fixSmartQuotes: Boolean
  
  var literalXmlDelimiter: String
  
  var noSandbox: Boolean
  
  var processLineBreaks: Boolean
  
  var rejectNullish: Boolean
  
  var runJs: js.UndefOr[RunJSFunc] = js.undefined
}
object CreateReportOptions {
  
  inline def apply(
    additionalJsContext: js.Object,
    cmdDelimiter: js.Tuple2[String, String],
    failFast: Boolean,
    fixSmartQuotes: Boolean,
    literalXmlDelimiter: String,
    noSandbox: Boolean,
    processLineBreaks: Boolean,
    rejectNullish: Boolean
  ): CreateReportOptions = {
    val __obj = js.Dynamic.literal(additionalJsContext = additionalJsContext.asInstanceOf[js.Any], cmdDelimiter = cmdDelimiter.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], fixSmartQuotes = fixSmartQuotes.asInstanceOf[js.Any], literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any], noSandbox = noSandbox.asInstanceOf[js.Any], processLineBreaks = processLineBreaks.asInstanceOf[js.Any], rejectNullish = rejectNullish.asInstanceOf[js.Any], errorHandler = null)
    __obj.asInstanceOf[CreateReportOptions]
  }
  
  extension [Self <: CreateReportOptions](x: Self) {
    
    inline def setAdditionalJsContext(value: js.Object): Self = StObject.set(x, "additionalJsContext", value.asInstanceOf[js.Any])
    
    inline def setCmdDelimiter(value: js.Tuple2[String, String]): Self = StObject.set(x, "cmdDelimiter", value.asInstanceOf[js.Any])
    
    inline def setErrorHandler(value: (/* e */ js.Error, /* raw_code */ js.UndefOr[String]) => Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
    
    inline def setErrorHandlerNull: Self = StObject.set(x, "errorHandler", null)
    
    inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
    
    inline def setFixSmartQuotes(value: Boolean): Self = StObject.set(x, "fixSmartQuotes", value.asInstanceOf[js.Any])
    
    inline def setLiteralXmlDelimiter(value: String): Self = StObject.set(x, "literalXmlDelimiter", value.asInstanceOf[js.Any])
    
    inline def setNoSandbox(value: Boolean): Self = StObject.set(x, "noSandbox", value.asInstanceOf[js.Any])
    
    inline def setProcessLineBreaks(value: Boolean): Self = StObject.set(x, "processLineBreaks", value.asInstanceOf[js.Any])
    
    inline def setRejectNullish(value: Boolean): Self = StObject.set(x, "rejectNullish", value.asInstanceOf[js.Any])
    
    inline def setRunJs(value: /* o */ Ctx => ModifiedSandbox): Self = StObject.set(x, "runJs", js.Any.fromFunction1(value))
    
    inline def setRunJsUndefined: Self = StObject.set(x, "runJs", js.undefined)
  }
}
