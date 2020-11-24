package typings.extjs.Ext.menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeparator extends IItem {
  
  /** [Config Option] (String) */
  var separatorCls: js.UndefOr[String] = js.native
}
object ISeparator {
  
  @scala.inline
  def apply(): ISeparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeparator]
  }
  
  @scala.inline
  implicit class ISeparatorOps[Self <: ISeparator] (val x: Self) extends AnyVal {
    
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
    def setSeparatorCls(value: String): Self = this.set("separatorCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparatorCls: Self = this.set("separatorCls", js.undefined)
  }
}
