package typings.extjs.Ext.grid

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
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
  implicit class ILockingViewMutableBuilder[Self <: ILockingView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLockingView(value: Boolean): Self = StObject.set(x, "isLockingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLockingViewUndefined: Self = StObject.set(x, "isLockingView", js.undefined)
  }
}
