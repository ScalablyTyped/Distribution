package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabOptions extends js.Object {
  
  /** Pass the align type
    */
  var alignType: js.UndefOr[HTMLElement] = js.native
  
  /** Pass the content object to be displayed in ribbon tab
    */
  var contents: js.UndefOr[js.Any] = js.native
  
  /** Pass the defaults object to be displayed in ribbon tab
    */
  var defaults: js.UndefOr[js.Any] = js.native
  
  /** Pass the text to displayed in ribbon tab
    */
  var text: js.UndefOr[String] = js.native
}
object TabOptions {
  
  @scala.inline
  def apply(): TabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOptions]
  }
  
  @scala.inline
  implicit class TabOptionsOps[Self <: TabOptions] (val x: Self) extends AnyVal {
    
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
    def setAlignType(value: HTMLElement): Self = this.set("alignType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignType: Self = this.set("alignType", js.undefined)
    
    @scala.inline
    def setContents(value: js.Any): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
