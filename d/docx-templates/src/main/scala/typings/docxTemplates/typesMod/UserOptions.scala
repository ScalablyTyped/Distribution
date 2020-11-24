package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserOptions extends js.Object {
  
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
  var additionalJsContext: js.UndefOr[js.Object] = js.native
  
  /**
    * Defines a custom command delimiter. This can be a String e.g. '+++' or an Array of Strings with length 2: ['{', '}'] in which the first element serves as the start delimiter and the second as the end delimiter.
    */
  var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  
  /**
    * Object of data to be injected or a (async) function that resolves to the data. The function gets as an argument the contents of the QUERY command as a string.
    */
  var data: js.UndefOr[ReportData | QueryResolver] = js.native
  
  /**
    * Custom error handler to catch any errors that may occur evaluating commands in the template. The value returned from this handler will be inserted into the template instead.
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.native
  
  /**
    * Whether to fail on the first error encountered in the template. Defaults to true. Can be used to collect all errors in a template (e.g. misspelled commands) before failing.
    */
  var failFast: js.UndefOr[Boolean] = js.native
  
  /**
    * MS Word usually autocorrects JS string literal quotes with unicode 'smart' quotes ('curly' quotes). E.g. 'aubergine' -> ‘aubergine’.
    * This causes an error when evaluating commands containing these smart quotes, as they are not valid JavaScript.
    * If you set fixSmartQuotes to 'true', these smart quotes will automatically get replaced with straight quotes (') before command evaluation.
    * Defaults to false.
    */
  var fixSmartQuotes: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be used to change the delimiter in generated XML.
    */
  var literalXmlDelimiter: js.UndefOr[String] = js.native
  
  /**
    * INSECURE: Set this option to true to disable running all commands in a new JS-VM. USE ONLY WITH TRUSTED TEMPLATES. Beware of arbitrary code injection risks. Can slightly improve performance on complex templates.
    */
  var noSandbox: js.UndefOr[Boolean] = js.native
  
  /**
    * Handle linebreaks in result of commands as actual linebreaks (Default: true)
    */
  var processLineBreaks: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets injected into data function as second argument.
    */
  var queryVars: js.UndefOr[js.Any] = js.native
  
  /**
    * When set to `true`, this setting ensures `createReport` throws a `NullishCommandResultError` when the result of an INS, HTML, IMAGE, or LINK command is `null` or `undefined`. This is useful as nullish return values usually indicate a mistake in the template or the invoking code. Defaults to `false`.
    */
  var rejectNullish: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom sandbox. See documentation for details.
    */
  var runJs: js.UndefOr[RunJSFunc] = js.native
  
  /**
    * Docx file template as a NodeJS Buffer or Buffer-like object in Browsers.
    */
  var template: Buffer = js.native
}
object UserOptions {
  
  @scala.inline
  def apply(template: Buffer): UserOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
  
  @scala.inline
  implicit class UserOptionsOps[Self <: UserOptions] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: Buffer): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalJsContext(value: js.Object): Self = this.set("additionalJsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalJsContext: Self = this.set("additionalJsContext", js.undefined)
    
    @scala.inline
    def setCmdDelimiter(value: String | (js.Tuple2[String, String])): Self = this.set("cmdDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmdDelimiter: Self = this.set("cmdDelimiter", js.undefined)
    
    @scala.inline
    def setDataFunction2(
      value: (/* query */ js.UndefOr[Query], /* queryVars */ js.Any) => ReportData | js.Promise[ReportData]
    ): Self = this.set("data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setData(value: ReportData | QueryResolver): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: (/* e */ Error, /* raw_code */ js.UndefOr[String]) => js.Any): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setFailFast(value: Boolean): Self = this.set("failFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailFast: Self = this.set("failFast", js.undefined)
    
    @scala.inline
    def setFixSmartQuotes(value: Boolean): Self = this.set("fixSmartQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixSmartQuotes: Self = this.set("fixSmartQuotes", js.undefined)
    
    @scala.inline
    def setLiteralXmlDelimiter(value: String): Self = this.set("literalXmlDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteralXmlDelimiter: Self = this.set("literalXmlDelimiter", js.undefined)
    
    @scala.inline
    def setNoSandbox(value: Boolean): Self = this.set("noSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSandbox: Self = this.set("noSandbox", js.undefined)
    
    @scala.inline
    def setProcessLineBreaks(value: Boolean): Self = this.set("processLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessLineBreaks: Self = this.set("processLineBreaks", js.undefined)
    
    @scala.inline
    def setQueryVars(value: js.Any): Self = this.set("queryVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryVars: Self = this.set("queryVars", js.undefined)
    
    @scala.inline
    def setRejectNullish(value: Boolean): Self = this.set("rejectNullish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectNullish: Self = this.set("rejectNullish", js.undefined)
    
    @scala.inline
    def setRunJs(value: /* o */ Ctx => ModifiedSandbox): Self = this.set("runJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRunJs: Self = this.set("runJs", js.undefined)
  }
}
