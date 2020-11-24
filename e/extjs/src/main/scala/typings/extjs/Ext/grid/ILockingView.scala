package typings.extjs.Ext.grid

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockingView extends IObservable {
  
  /** [Property] (Boolean) */
  var isLockingView: js.UndefOr[Boolean] = js.native
}
object ILockingView {
  
  @scala.inline
  def apply(): ILockingView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockingView]
  }
  
  @scala.inline
  implicit class ILockingViewOps[Self <: ILockingView] (val x: Self) extends AnyVal {
    
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
    def setIsLockingView(value: Boolean): Self = this.set("isLockingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLockingView: Self = this.set("isLockingView", js.undefined)
  }
}
