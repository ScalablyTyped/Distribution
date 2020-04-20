package typings.docxTemplates.processTemplateMod

import typings.docxTemplates.typesMod.Htmls
import typings.docxTemplates.typesMod.Images
import typings.docxTemplates.typesMod.Links
import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOutput extends js.Object {
  var htmls: Htmls
  var images: Images
  var links: Links
  var report: Node
}

object ReportOutput {
  @scala.inline
  def apply(htmls: Htmls, images: Images, links: Links, report: Node): ReportOutput = {
    val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOutput]
  }
}

