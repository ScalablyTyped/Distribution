package typings.extjs.Ext.menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckItem extends IItem {
  
  /** [Config Option] (Boolean) */
  var checkChangeDisabled: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Function) */
  var checkHandler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.native
  
  /** [Method] Disables just the checkbox functionality of this menu Item  */
  var disableCheckChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Reenables the checkbox functionality of this menu item after having been disabled by disableCheckChange */
  var enableCheckChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var group: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var groupCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the checked state of the item
    * @param checked Boolean True to check, false to uncheck
    * @param suppressEvents Boolean True to prevent firing the checkchange events.
    */
  var setChecked: js.UndefOr[
    js.Function2[/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Config Option] (String) */
  var uncheckedCls: js.UndefOr[String] = js.native
}
object ICheckItem {
  
  @scala.inline
  def apply(): ICheckItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckItem]
  }
  
  @scala.inline
  implicit class ICheckItemOps[Self <: ICheckItem] (val x: Self) extends AnyVal {
    
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
    def setCheckChangeDisabled(value: Boolean): Self = this.set("checkChangeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckChangeDisabled: Self = this.set("checkChangeDisabled", js.undefined)
    
    @scala.inline
    def setCheckHandler(value: js.Any): Self = this.set("checkHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckHandler: Self = this.set("checkHandler", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCheckedCls(value: String): Self = this.set("checkedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedCls: Self = this.set("checkedCls", js.undefined)
    
    @scala.inline
    def setDisableCheckChange(value: () => Unit): Self = this.set("disableCheckChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisableCheckChange: Self = this.set("disableCheckChange", js.undefined)
    
    @scala.inline
    def setEnableCheckChange(value: () => Unit): Self = this.set("enableCheckChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnableCheckChange: Self = this.set("enableCheckChange", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupCls(value: String): Self = this.set("groupCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupCls: Self = this.set("groupCls", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSetChecked(value: (/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit): Self = this.set("setChecked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetChecked: Self = this.set("setChecked", js.undefined)
    
    @scala.inline
    def setUncheckedCls(value: String): Self = this.set("uncheckedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedCls: Self = this.set("uncheckedCls", js.undefined)
  }
}
