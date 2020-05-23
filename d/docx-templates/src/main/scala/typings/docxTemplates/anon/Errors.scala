package typings.docxTemplates.anon

import typings.docxTemplates.docxTemplatesStrings.errors
import typings.docxTemplates.processTemplateMod.ReportOutput
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends ReportOutput {
  var errors: js.Array[Error]
  var status: errors
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Error], status: errors): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

