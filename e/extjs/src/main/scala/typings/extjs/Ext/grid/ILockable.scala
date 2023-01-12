package typings.extjs.Ext.grid

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockable
  extends StObject
     with IBase {
  
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ILockable {
  
  inline def apply(): ILockable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILockable] (val x: Self) extends AnyVal {
    
    inline def setLockedGridConfig(value: Any): Self = StObject.set(x, "lockedGridConfig", value.asInstanceOf[js.Any])
    
    inline def setLockedGridConfigUndefined: Self = StObject.set(x, "lockedGridConfig", js.undefined)
    
    inline def setLockedViewConfig(value: Any): Self = StObject.set(x, "lockedViewConfig", value.asInstanceOf[js.Any])
    
    inline def setLockedViewConfigUndefined: Self = StObject.set(x, "lockedViewConfig", js.undefined)
    
    inline def setNormalGridConfig(value: Any): Self = StObject.set(x, "normalGridConfig", value.asInstanceOf[js.Any])
    
    inline def setNormalGridConfigUndefined: Self = StObject.set(x, "normalGridConfig", js.undefined)
    
    inline def setNormalViewConfig(value: Any): Self = StObject.set(x, "normalViewConfig", value.asInstanceOf[js.Any])
    
    inline def setNormalViewConfigUndefined: Self = StObject.set(x, "normalViewConfig", js.undefined)
    
    inline def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
    
    inline def setScrollDeltaUndefined: Self = StObject.set(x, "scrollDelta", js.undefined)
    
    inline def setSubGridXType(value: String): Self = StObject.set(x, "subGridXType", value.asInstanceOf[js.Any])
    
    inline def setSubGridXTypeUndefined: Self = StObject.set(x, "subGridXType", js.undefined)
    
    inline def setSyncRowHeight(value: Boolean): Self = StObject.set(x, "syncRowHeight", value.asInstanceOf[js.Any])
    
    inline def setSyncRowHeightUndefined: Self = StObject.set(x, "syncRowHeight", js.undefined)
    
    inline def setSyncRowHeights(value: () => Unit): Self = StObject.set(x, "syncRowHeights", js.Any.fromFunction0(value))
    
    inline def setSyncRowHeightsUndefined: Self = StObject.set(x, "syncRowHeights", js.undefined)
  }
}
