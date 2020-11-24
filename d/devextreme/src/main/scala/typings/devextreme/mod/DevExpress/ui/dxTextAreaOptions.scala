package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTextAreaOptions extends dxTextBoxOptions[dxTextArea] {
  
  /**
    * [descr:dxTextArea.Options.autoResizeEnabled]
    */
  var autoResizeEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTextArea.Options.maxHeight]
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * [descr:dxTextArea.Options.minHeight]
    */
  var minHeight: js.UndefOr[Double | String] = js.native
}
object dxTextAreaOptions {
  
  @scala.inline
  def apply(): dxTextAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextAreaOptions]
  }
  
  @scala.inline
  implicit class dxTextAreaOptionsOps[Self <: dxTextAreaOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoResizeEnabled(value: Boolean): Self = this.set("autoResizeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResizeEnabled: Self = this.set("autoResizeEnabled", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
  }
}
