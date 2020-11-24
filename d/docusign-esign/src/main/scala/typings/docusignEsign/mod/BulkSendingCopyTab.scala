package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingCopyTab extends js.Object {
  
  /**
    * The initial value that you want to assign to the tab.
    */
  var initialValue: js.UndefOr[String] = js.native
  
  /**
    * The label associated with the recipient tab. In a bulk send request, the `tabLabel` for this tab and the `tabLabel`
    * for the corresponding tab on the envelope or template must be the same.
    *
    * Maximum Length: 500 characters.
    */
  var tabLabel: js.UndefOr[String] = js.native
}
object BulkSendingCopyTab {
  
  @scala.inline
  def apply(): BulkSendingCopyTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingCopyTab]
  }
  
  @scala.inline
  implicit class BulkSendingCopyTabOps[Self <: BulkSendingCopyTab] (val x: Self) extends AnyVal {
    
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
    def setInitialValue(value: String): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setTabLabel(value: String): Self = this.set("tabLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLabel: Self = this.set("tabLabel", js.undefined)
  }
}
