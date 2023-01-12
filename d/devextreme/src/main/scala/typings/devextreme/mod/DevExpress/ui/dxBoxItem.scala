package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBoxItem[TKey]
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the base size of an item element along the main direction.
    */
  var baseSize: js.UndefOr[Double | Mode] = js.undefined
  
  /**
    * Holds a Box configuration object for the item.
    */
  var box: js.UndefOr[dxBoxOptions[Any, TKey]] = js.undefined
  
  /**
    * Specifies the ratio value used to count the item element size along the main direction.
    */
  var ratio: js.UndefOr[Double] = js.undefined
  
  /**
    * A factor that defines how much an item shrinks relative to the rest of the items in the container.
    */
  var shrink: js.UndefOr[Double] = js.undefined
}
object dxBoxItem {
  
  inline def apply[TKey](): dxBoxItem[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBoxItem[TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxBoxItem[?], TKey] (val x: Self & dxBoxItem[TKey]) extends AnyVal {
    
    inline def setBaseSize(value: Double | Mode): Self = StObject.set(x, "baseSize", value.asInstanceOf[js.Any])
    
    inline def setBaseSizeUndefined: Self = StObject.set(x, "baseSize", js.undefined)
    
    inline def setBox(value: dxBoxOptions[Any, TKey]): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
