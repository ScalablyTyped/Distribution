package typings.docxTemplates.processTemplateMod

import typings.docxTemplates.typesMod.CreateReportOptions
import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/processTemplate", "extractQuery")
@js.native
object extractQuery extends js.Object {
  def apply(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = js.native
}

