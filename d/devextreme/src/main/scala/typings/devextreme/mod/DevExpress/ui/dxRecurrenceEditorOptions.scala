package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRecurrenceEditorOptions extends EditorOptions[dxRecurrenceEditor] {
  
  /**
    * [descr:dxRecurrenceEditor.Options.value]
    */
  @JSName("value")
  var value_dxRecurrenceEditorOptions: js.UndefOr[String] = js.native
}
object dxRecurrenceEditorOptions {
  
  @scala.inline
  def apply(): dxRecurrenceEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRecurrenceEditorOptions]
  }
  
  @scala.inline
  implicit class dxRecurrenceEditorOptionsOps[Self <: dxRecurrenceEditorOptions] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
