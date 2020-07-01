package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Whether to fail on the first error encountered in the template. Defaults to true. Can be used to collect all errors in a template (e.g. misspelled commands) before failing.
    */
  var failFast: js.UndefOr[Boolean] = js.undefined
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
  def apply(
    template: Buffer,
    additionalJsContext: js.Object = null,
    cmdDelimiter: String | (js.Tuple2[String, String]) = null,
    data: ReportData | QueryResolver = null,
    failFast: js.UndefOr[Boolean] = js.undefined,
    literalXmlDelimiter: String = null,
    noSandbox: js.UndefOr[Boolean] = js.undefined,
    processLineBreaks: js.UndefOr[Boolean] = js.undefined,
    queryVars: js.Any = null,
    rejectNullish: js.UndefOr[Boolean] = js.undefined,
    runJs: /* o */ Ctx => ModifiedSandbox = null
  ): UserOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (additionalJsContext != null) __obj.updateDynamic("additionalJsContext")(additionalJsContext.asInstanceOf[js.Any])
    if (cmdDelimiter != null) __obj.updateDynamic("cmdDelimiter")(cmdDelimiter.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(failFast)) __obj.updateDynamic("failFast")(failFast.get.asInstanceOf[js.Any])
    if (literalXmlDelimiter != null) __obj.updateDynamic("literalXmlDelimiter")(literalXmlDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(noSandbox)) __obj.updateDynamic("noSandbox")(noSandbox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processLineBreaks)) __obj.updateDynamic("processLineBreaks")(processLineBreaks.get.asInstanceOf[js.Any])
    if (queryVars != null) __obj.updateDynamic("queryVars")(queryVars.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectNullish)) __obj.updateDynamic("rejectNullish")(rejectNullish.get.asInstanceOf[js.Any])
    if (runJs != null) __obj.updateDynamic("runJs")(js.Any.fromFunction1(runJs))
    __obj.asInstanceOf[UserOptions]
  }
}

