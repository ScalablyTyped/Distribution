package typings.extjs.Ext.grid.locking

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockable extends IBase {
  
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.native
  
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.native
}
object ILockable {
  
  @scala.inline
  def apply(): ILockable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockable]
  }
  
  @scala.inline
  implicit class ILockableOps[Self <: ILockable] (val x: Self) extends AnyVal {
    
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
    def setLockedGridConfig(value: js.Any): Self = this.set("lockedGridConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedGridConfig: Self = this.set("lockedGridConfig", js.undefined)
    
    @scala.inline
    def setLockedViewConfig(value: js.Any): Self = this.set("lockedViewConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedViewConfig: Self = this.set("lockedViewConfig", js.undefined)
    
    @scala.inline
    def setNormalGridConfig(value: js.Any): Self = this.set("normalGridConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalGridConfig: Self = this.set("normalGridConfig", js.undefined)
    
    @scala.inline
    def setNormalViewConfig(value: js.Any): Self = this.set("normalViewConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalViewConfig: Self = this.set("normalViewConfig", js.undefined)
    
    @scala.inline
    def setScrollDelta(value: Double): Self = this.set("scrollDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDelta: Self = this.set("scrollDelta", js.undefined)
    
    @scala.inline
    def setSubGridXType(value: String): Self = this.set("subGridXType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubGridXType: Self = this.set("subGridXType", js.undefined)
    
    @scala.inline
    def setSyncRowHeight(value: Boolean): Self = this.set("syncRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncRowHeight: Self = this.set("syncRowHeight", js.undefined)
    
    @scala.inline
    def setSyncRowHeights(value: () => Unit): Self = this.set("syncRowHeights", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSyncRowHeights: Self = this.set("syncRowHeights", js.undefined)
  }
}
