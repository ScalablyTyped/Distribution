package typings.docxTemplates

import typings.docxTemplates.typesMod.CreateReportOptions
import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/processTemplate", JSImport.Namespace)
@js.native
object processTemplateMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.docxTemplates.anon.Htmls
    - typings.docxTemplates.anon.Errors
  */
  trait ReportOutput extends js.Object
  
  def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = js.native
  def produceJsReport(data: js.Any, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
}

