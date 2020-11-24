package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuralElement extends js.Object {
  
  var endIndex: js.UndefOr[Double] = js.native
  
  var paragraph: js.UndefOr[Paragraph] = js.native
  
  var sectionBreak: js.UndefOr[SectionBreak] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var table: js.UndefOr[Table] = js.native
  
  var tableOfContents: js.UndefOr[TableOfContents] = js.native
}
object StructuralElement {
  
  @scala.inline
  def apply(): StructuralElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuralElement]
  }
  
  @scala.inline
  implicit class StructuralElementOps[Self <: StructuralElement] (val x: Self) extends AnyVal {
    
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setParagraph(value: Paragraph): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setSectionBreak(value: SectionBreak): Self = this.set("sectionBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionBreak: Self = this.set("sectionBreak", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTableOfContents(value: TableOfContents): Self = this.set("tableOfContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOfContents: Self = this.set("tableOfContents", js.undefined)
  }
}
