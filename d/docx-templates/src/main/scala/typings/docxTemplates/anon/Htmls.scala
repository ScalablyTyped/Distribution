package typings.docxTemplates.anon

import typings.docxTemplates.docxTemplatesStrings.success
import typings.docxTemplates.processTemplateMod.ReportOutput
import typings.docxTemplates.typesMod.Images
import typings.docxTemplates.typesMod.Links
import typings.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Htmls extends ReportOutput {
  
  var htmls: typings.docxTemplates.typesMod.Htmls = js.native
  
  var images: Images = js.native
  
  var links: Links = js.native
  
  var report: Node = js.native
  
  var status: success = js.native
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
  
  @scala.inline
  implicit class HtmlsOps[Self <: Htmls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHtmls(value: typings.docxTemplates.typesMod.Htmls): Self = this.set("htmls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: Images): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: Links): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: Node): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: success): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
