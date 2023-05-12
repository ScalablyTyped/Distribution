package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.SingleMultipleOrNone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionBase extends StObject {
  
  /**
    * Allows users to simultaneously select all or current page rows (depending on the selectAllMode).
    */
  var allowSelectAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the selection mode.
    */
  var mode: js.UndefOr[SingleMultipleOrNone] = js.undefined
}
object SelectionBase {
  
  inline def apply(): SelectionBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionBase] (val x: Self) extends AnyVal {
    
    inline def setAllowSelectAll(value: Boolean): Self = StObject.set(x, "allowSelectAll", value.asInstanceOf[js.Any])
    
    inline def setAllowSelectAllUndefined: Self = StObject.set(x, "allowSelectAll", js.undefined)
    
    inline def setMode(value: SingleMultipleOrNone): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
