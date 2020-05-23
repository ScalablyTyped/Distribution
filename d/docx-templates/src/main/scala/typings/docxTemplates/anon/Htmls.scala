package typings.docxTemplates.anon

import typings.docxTemplates.docxTemplatesStrings.success
import typings.docxTemplates.processTemplateMod.ReportOutput
import typings.docxTemplates.typesMod.Images
import typings.docxTemplates.typesMod.Links
import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Htmls extends ReportOutput {
  var htmls: typings.docxTemplates.typesMod.Htmls
  var images: Images
  var links: Links
  var report: Node
  var status: success
}

object Htmls {
  @scala.inline
  def apply(
    htmls: typings.docxTemplates.typesMod.Htmls,
    images: Images,
    links: Links,
    report: Node,
    status: success
  ): Htmls = {
    val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Htmls]
  }
}

