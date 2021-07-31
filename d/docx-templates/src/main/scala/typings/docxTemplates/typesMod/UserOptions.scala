package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserOptions extends StObject {
  
  /**
    * Add functions or other static data to this option to have access to it in your commands.
    *
    * ```js
    * additionalJsContext: {
    *   qrCode: url => {
    *     const dataUrl = createQrImage(url, { size: 500 });
    *     const data = dataUrl.slice('data:image/gif;base64,'.length);
    *     return { width: 6, height: 6, data, extension: '.gif' };
    *   },
    * }
    * ```
    */
  var additionalJsContext: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Defines a custom command delimiter. This can be a String e.g. '+++' or an Array of Strings with length 2: ['{', '}'] in which the first element serves as the start delimiter and the second as the end delimiter.
    */
  var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  
  /**
    * Object of data to be injected or a (async) function that resolves to the data. The function gets as an argument the contents of the QUERY command as a string.
    */
  var data: js.UndefOr[ReportData | QueryResolver] = js.undefined
  
  /**
    * Custom error handler to catch any errors that may occur evaluating commands in the template. The value returned from this handler will be inserted into the template instead.
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  
  /**
    * Whether to fail on the first error encountered in the template. Defaults to true. Can be used to collect all errors in a template (e.g. misspelled commands) before failing.
    */
  var failFast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * MS Word usually autocorrects JS string literal quotes with unicode 'smart' quotes ('curly' quotes). E.g. 'aubergine' -> ‘aubergine’.
    * This causes an error when evaluating commands containing these smart quotes, as they are not valid JavaScript.
    * If you set fixSmartQuotes to 'true', these smart quotes will automatically get replaced with straight quotes (') before command evaluation.
    * Defaults to false.
    */
  var fixSmartQuotes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be used to change the delimiter in generated XML.
    */
  var literalXmlDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * INSECURE: Set this option to true to disable running all commands in a new JS-VM. USE ONLY WITH TRUSTED TEMPLATES. Beware of arbitrary code injection risks. Can slightly improve performance on complex templates.
    */
  var noSandbox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Handle linebreaks in result of commands as actual linebreaks (Default: true)
    */
  var processLineBreaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets injected into data function as second argument.
    */
  var queryVars: js.UndefOr[js.Any] = js.undefined
  
  /**
    * When set to `true`, this setting ensures `createReport` throws a `NullishCommandResultError` when the result of an INS, HTML, IMAGE, or LINK command is `null` or `undefined`. This is useful as nullish return values usually indicate a mistake in the template or the invoking code. Defaults to `false`.
    */
  var rejectNullish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom sandbox. See documentation for details.
    */
  var runJs: js.UndefOr[RunJSFunc] = js.undefined
  
  /**
    * Docx file template as a NodeJS Buffer or Buffer-like object in Browsers.
    */
  var template: Buffer
}
object UserOptions {
  
  @scala.inline
  def apply(template: Buffer): UserOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
  
  @scala.inline
  implicit class UserOptionsMutableBuilder[Self <: UserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalJsContext(value: js.Object): Self = StObject.set(x, "additionalJsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalJsContextUndefined: Self = StObject.set(x, "additionalJsContext", js.undefined)
    
    @scala.inline
    def setCmdDelimiter(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "cmdDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdDelimiterUndefined: Self = StObject.set(x, "cmdDelimiter", js.undefined)
    
    @scala.inline
    def setData(value: ReportData | QueryResolver): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFunction2(
      value: (/* query */ js.UndefOr[Query], /* queryVars */ js.Any) => ReportData | js.Promise[ReportData]
    ): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: (/* e */ Error, /* raw_code */ js.UndefOr[String]) => js.Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    @scala.inline
    def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
    
    @scala.inline
    def setFixSmartQuotes(value: Boolean): Self = StObject.set(x, "fixSmartQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixSmartQuotesUndefined: Self = StObject.set(x, "fixSmartQuotes", js.undefined)
    
    @scala.inline
    def setLiteralXmlDelimiter(value: String): Self = StObject.set(x, "literalXmlDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralXmlDelimiterUndefined: Self = StObject.set(x, "literalXmlDelimiter", js.undefined)
    
    @scala.inline
    def setNoSandbox(value: Boolean): Self = StObject.set(x, "noSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSandboxUndefined: Self = StObject.set(x, "noSandbox", js.undefined)
    
    @scala.inline
    def setProcessLineBreaks(value: Boolean): Self = StObject.set(x, "processLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessLineBreaksUndefined: Self = StObject.set(x, "processLineBreaks", js.undefined)
    
    @scala.inline
    def setQueryVars(value: js.Any): Self = StObject.set(x, "queryVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVarsUndefined: Self = StObject.set(x, "queryVars", js.undefined)
    
    @scala.inline
    def setRejectNullish(value: Boolean): Self = StObject.set(x, "rejectNullish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectNullishUndefined: Self = StObject.set(x, "rejectNullish", js.undefined)
    
    @scala.inline
    def setRunJs(value: /* o */ Ctx => ModifiedSandbox): Self = StObject.set(x, "runJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunJsUndefined: Self = StObject.set(x, "runJs", js.undefined)
    
    @scala.inline
    def setTemplate(value: Buffer): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
