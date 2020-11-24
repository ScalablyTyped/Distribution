package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxAutocompleteOptions extends dxDropDownListOptions[dxAutocomplete] {
  
  /**
    * [descr:dxAutocomplete.Options.maxItemCount]
    */
  var maxItemCount: js.UndefOr[Double] = js.native
}
object dxAutocompleteOptions {
  
  @scala.inline
  def apply(): dxAutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAutocompleteOptions]
  }
  
  @scala.inline
  implicit class dxAutocompleteOptionsOps[Self <: dxAutocompleteOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxItemCount(value: Double): Self = this.set("maxItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemCount: Self = this.set("maxItemCount", js.undefined)
  }
}
