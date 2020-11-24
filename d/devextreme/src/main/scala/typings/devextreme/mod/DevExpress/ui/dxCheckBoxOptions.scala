package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxCheckBoxOptions extends EditorOptions[dxCheckBox] {
  
  /**
    * [descr:dxCheckBox.Options.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxCheckBox.Options.text]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxCheckBox.Options.value]
    */
  @JSName("value")
  var value_dxCheckBoxOptions: js.UndefOr[Boolean] = js.native
}
object dxCheckBoxOptions {
  
  @scala.inline
  def apply(): dxCheckBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCheckBoxOptions]
  }
  
  @scala.inline
  implicit class dxCheckBoxOptionsOps[Self <: dxCheckBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
