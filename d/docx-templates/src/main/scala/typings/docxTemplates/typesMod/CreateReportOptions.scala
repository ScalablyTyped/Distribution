package typings.docxTemplates.typesMod

import typings.docxTemplates.AnonCtx
import typings.docxTemplates.AnonModifiedSandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReportOptions extends js.Object {
  var additionalJsContext: js.Object
  var cmdDelimiter: js.Tuple2[String, String]
  var literalXmlDelimiter: String
  var noSandbox: Boolean
  var processLineBreaks: Boolean
  var runJs: js.UndefOr[RunJSFunc] = js.undefined
}

object CreateReportOptions {
  @scala.inline
  def apply(
    additionalJsContext: js.Object,
    cmdDelimiter: js.Tuple2[String, String],
    literalXmlDelimiter: String,
    noSandbox: Boolean,
    processLineBreaks: Boolean,
    runJs: /* o */ AnonCtx => AnonModifiedSandbox = null
  ): CreateReportOptions = {
    val __obj = js.Dynamic.literal(additionalJsContext = additionalJsContext.asInstanceOf[js.Any], cmdDelimiter = cmdDelimiter.asInstanceOf[js.Any], literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any], noSandbox = noSandbox.asInstanceOf[js.Any], processLineBreaks = processLineBreaks.asInstanceOf[js.Any])
    if (runJs != null) __obj.updateDynamic("runJs")(js.Any.fromFunction1(runJs))
    __obj.asInstanceOf[CreateReportOptions]
  }
}

