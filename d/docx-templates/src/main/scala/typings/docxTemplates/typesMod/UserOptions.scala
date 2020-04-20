package typings.docxTemplates.typesMod

import typings.docxTemplates.AnonCtx
import typings.docxTemplates.AnonModifiedSandbox
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions extends js.Object {
  var additionalJsContext: js.UndefOr[js.Object] = js.undefined
  var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  var data: js.UndefOr[ReportData | QueryResolver] = js.undefined
  var literalXmlDelimiter: js.UndefOr[String] = js.undefined
  var noSandbox: js.UndefOr[Boolean] = js.undefined
  var processLineBreaks: js.UndefOr[Boolean] = js.undefined
  var queryVars: js.UndefOr[js.Any] = js.undefined
  var runJs: js.UndefOr[RunJSFunc] = js.undefined
  var template: Buffer
}

object UserOptions {
  @scala.inline
  def apply(
    template: Buffer,
    additionalJsContext: js.Object = null,
    cmdDelimiter: String | (js.Tuple2[String, String]) = null,
    data: ReportData | QueryResolver = null,
    literalXmlDelimiter: String = null,
    noSandbox: js.UndefOr[Boolean] = js.undefined,
    processLineBreaks: js.UndefOr[Boolean] = js.undefined,
    queryVars: js.Any = null,
    runJs: /* o */ AnonCtx => AnonModifiedSandbox = null
  ): UserOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (additionalJsContext != null) __obj.updateDynamic("additionalJsContext")(additionalJsContext.asInstanceOf[js.Any])
    if (cmdDelimiter != null) __obj.updateDynamic("cmdDelimiter")(cmdDelimiter.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (literalXmlDelimiter != null) __obj.updateDynamic("literalXmlDelimiter")(literalXmlDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(noSandbox)) __obj.updateDynamic("noSandbox")(noSandbox.asInstanceOf[js.Any])
    if (!js.isUndefined(processLineBreaks)) __obj.updateDynamic("processLineBreaks")(processLineBreaks.asInstanceOf[js.Any])
    if (queryVars != null) __obj.updateDynamic("queryVars")(queryVars.asInstanceOf[js.Any])
    if (runJs != null) __obj.updateDynamic("runJs")(js.Any.fromFunction1(runJs))
    __obj.asInstanceOf[UserOptions]
  }
}

