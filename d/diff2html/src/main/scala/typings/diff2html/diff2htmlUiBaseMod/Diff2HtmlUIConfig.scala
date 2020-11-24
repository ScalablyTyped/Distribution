package typings.diff2html.diff2htmlUiBaseMod

import typings.diff2html.mod.Diff2HtmlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diff2HtmlUIConfig extends Diff2HtmlConfig {
  
  var fileListStartVisible: js.UndefOr[Boolean] = js.native
  
  var fileListToggle: js.UndefOr[Boolean] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  var smartSelection: js.UndefOr[Boolean] = js.native
  
  var synchronisedScroll: js.UndefOr[Boolean] = js.native
}
object Diff2HtmlUIConfig {
  
  @scala.inline
  def apply(): Diff2HtmlUIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff2HtmlUIConfig]
  }
  
  @scala.inline
  implicit class Diff2HtmlUIConfigOps[Self <: Diff2HtmlUIConfig] (val x: Self) extends AnyVal {
    
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
    def setFileListStartVisible(value: Boolean): Self = this.set("fileListStartVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileListStartVisible: Self = this.set("fileListStartVisible", js.undefined)
    
    @scala.inline
    def setFileListToggle(value: Boolean): Self = this.set("fileListToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileListToggle: Self = this.set("fileListToggle", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setSmartSelection(value: Boolean): Self = this.set("smartSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartSelection: Self = this.set("smartSelection", js.undefined)
    
    @scala.inline
    def setSynchronisedScroll(value: Boolean): Self = this.set("synchronisedScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronisedScroll: Self = this.set("synchronisedScroll", js.undefined)
  }
}
