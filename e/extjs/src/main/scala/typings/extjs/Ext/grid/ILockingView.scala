package typings.extjs.Ext.grid

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockingView
  extends StObject
     with IObservable {
  
  /** [Property] (Boolean) */
  var isLockingView: js.UndefOr[Boolean] = js.undefined
}
object ILockingView {
  
  inline def apply(): ILockingView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockingView]
  }
  
  extension [Self <: ILockingView](x: Self) {
    
    inline def setIsLockingView(value: Boolean): Self = StObject.set(x, "isLockingView", value.asInstanceOf[js.Any])
    
    inline def setIsLockingViewUndefined: Self = StObject.set(x, "isLockingView", js.undefined)
  }
}
