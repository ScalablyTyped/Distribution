package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateMatch extends js.Object {
  
  var documentEndPage: js.UndefOr[String] = js.native
  
  var documentStartPage: js.UndefOr[String] = js.native
  
  var matchPercentage: js.UndefOr[String] = js.native
}
object TemplateMatch {
  
  @scala.inline
  def apply(): TemplateMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateMatch]
  }
  
  @scala.inline
  implicit class TemplateMatchOps[Self <: TemplateMatch] (val x: Self) extends AnyVal {
    
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
    def setDocumentEndPage(value: String): Self = this.set("documentEndPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentEndPage: Self = this.set("documentEndPage", js.undefined)
    
    @scala.inline
    def setDocumentStartPage(value: String): Self = this.set("documentStartPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStartPage: Self = this.set("documentStartPage", js.undefined)
    
    @scala.inline
    def setMatchPercentage(value: String): Self = this.set("matchPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPercentage: Self = this.set("matchPercentage", js.undefined)
  }
}
