package typings.docxTemplates.mod

import typings.docxTemplates.AnonModifiedSandbox
import typings.docxTemplates.docxTemplatesStrings.JS
import typings.docxTemplates.docxTemplatesStrings.XML
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions[T] extends js.Object {
  var _probe: js.UndefOr[JS | XML] = js.undefined
  var additionalJsContext: js.UndefOr[js.Any] = js.undefined
  var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  var data: js.UndefOr[ReportData | QueryResolver] = js.undefined
  var literalXmlDelimiter: js.UndefOr[String] = js.undefined
  var noSandbox: js.UndefOr[Boolean] = js.undefined
  var output: js.UndefOr[T] = js.undefined
  var processLineBreaks: js.UndefOr[Boolean] = js.undefined
  var queryVars: js.UndefOr[js.Any] = js.undefined
  var runJs: js.UndefOr[js.Function1[/* runJSOptions */ runJSOptions, AnonModifiedSandbox]] = js.undefined
  var template: String | ArrayBuffer | Buffer
}

object UserOptions {
  @scala.inline
  def apply[T](
    template: String | ArrayBuffer | Buffer,
    _probe: JS | XML = null,
    additionalJsContext: js.Any = null,
    cmdDelimiter: String | (js.Tuple2[String, String]) = null,
    data: ReportData | QueryResolver = null,
    literalXmlDelimiter: String = null,
    noSandbox: js.UndefOr[Boolean] = js.undefined,
    output: T = null,
    processLineBreaks: js.UndefOr[Boolean] = js.undefined,
    queryVars: js.Any = null,
    runJs: /* runJSOptions */ runJSOptions => AnonModifiedSandbox = null
  ): UserOptions[T] = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (_probe != null) __obj.updateDynamic("_probe")(_probe.asInstanceOf[js.Any])
    if (additionalJsContext != null) __obj.updateDynamic("additionalJsContext")(additionalJsContext.asInstanceOf[js.Any])
    if (cmdDelimiter != null) __obj.updateDynamic("cmdDelimiter")(cmdDelimiter.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (literalXmlDelimiter != null) __obj.updateDynamic("literalXmlDelimiter")(literalXmlDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(noSandbox)) __obj.updateDynamic("noSandbox")(noSandbox.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(processLineBreaks)) __obj.updateDynamic("processLineBreaks")(processLineBreaks.asInstanceOf[js.Any])
    if (queryVars != null) __obj.updateDynamic("queryVars")(queryVars.asInstanceOf[js.Any])
    if (runJs != null) __obj.updateDynamic("runJs")(js.Any.fromFunction1(runJs))
    __obj.asInstanceOf[UserOptions[T]]
  }
}

