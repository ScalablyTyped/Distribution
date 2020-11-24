package typings.extendedListbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxSearchBarButtonOptions extends js.Object {
  
  /** css class for the i-tag of the button */
  var icon: js.UndefOr[String] = js.native
  
  /** callback for button click */
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** determines if the button is visible */
  var visible: js.UndefOr[Boolean] = js.native
}
object ListBoxSearchBarButtonOptions {
  
  @scala.inline
  def apply(): ListBoxSearchBarButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxSearchBarButtonOptions]
  }
  
  @scala.inline
  implicit class ListBoxSearchBarButtonOptionsOps[Self <: ListBoxSearchBarButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
