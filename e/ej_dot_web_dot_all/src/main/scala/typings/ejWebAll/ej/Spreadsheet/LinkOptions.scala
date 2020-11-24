package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkOptions extends js.Object {
  
  /** Pass the cell address in the cell
    */
  var cellAddress: js.UndefOr[String] = js.native
  
  /** Pass the text address in the cell
    */
  var text: js.UndefOr[String] = js.native
  
  /** Pass the web address in the cell
    */
  var webAddress: js.UndefOr[String] = js.native
}
object LinkOptions {
  
  @scala.inline
  def apply(): LinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOptions]
  }
  
  @scala.inline
  implicit class LinkOptionsOps[Self <: LinkOptions] (val x: Self) extends AnyVal {
    
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
    def setCellAddress(value: String): Self = this.set("cellAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAddress: Self = this.set("cellAddress", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWebAddress(value: String): Self = this.set("webAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAddress: Self = this.set("webAddress", js.undefined)
  }
}
