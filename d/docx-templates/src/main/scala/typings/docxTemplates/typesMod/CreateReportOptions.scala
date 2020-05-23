package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.ModifiedSandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReportOptions extends js.Object {
  var additionalJsContext: js.Object
  var cmdDelimiter: js.Tuple2[String, String]
  var failFast: Boolean
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
    failFast: Boolean,
    literalXmlDelimiter: String,
    noSandbox: Boolean,
    processLineBreaks: Boolean,
    runJs: /* o */ Ctx => ModifiedSandbox = null
  ): CreateReportOptions = {
    val __obj = js.Dynamic.literal(additionalJsContext = additionalJsContext.asInstanceOf[js.Any], cmdDelimiter = cmdDelimiter.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any], noSandbox = noSandbox.asInstanceOf[js.Any], processLineBreaks = processLineBreaks.asInstanceOf[js.Any])
    if (runJs != null) __obj.updateDynamic("runJs")(js.Any.fromFunction1(runJs))
    __obj.asInstanceOf[CreateReportOptions]
  }
}

