package typings.frctlFractal.mod.fractal.api.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocMarkdownConfig extends js.Object {
  
  var breaks: js.UndefOr[Boolean] = js.native
  
  var gfm: js.UndefOr[Boolean] = js.native
  
  var pedantic: js.UndefOr[Boolean] = js.native
  
  var sanitize: js.UndefOr[Boolean] = js.native
  
  var smartLists: js.UndefOr[Boolean] = js.native
  
  var smartypants: js.UndefOr[Boolean] = js.native
  
  var tables: js.UndefOr[Boolean] = js.native
}
object DocMarkdownConfig {
  
  @scala.inline
  def apply(): DocMarkdownConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocMarkdownConfig]
  }
  
  @scala.inline
  implicit class DocMarkdownConfigOps[Self <: DocMarkdownConfig] (val x: Self) extends AnyVal {
    
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
    def setBreaks(value: Boolean): Self = this.set("breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    
    @scala.inline
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    
    @scala.inline
    def setSmartLists(value: Boolean): Self = this.set("smartLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartLists: Self = this.set("smartLists", js.undefined)
    
    @scala.inline
    def setSmartypants(value: Boolean): Self = this.set("smartypants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartypants: Self = this.set("smartypants", js.undefined)
    
    @scala.inline
    def setTables(value: Boolean): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
}
