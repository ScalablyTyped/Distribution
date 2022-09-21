package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTextAreaOptions
  extends StObject
     with dxTextBoxOptions[dxTextArea] {
  
  /**
    * A Boolean value specifying whether or not the auto resizing mode is enabled.
    */
  var autoResizeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum height of the UI component.
    */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specifies the minimum height of the UI component.
    */
  var minHeight: js.UndefOr[Double | String] = js.undefined
}
object dxTextAreaOptions {
  
  inline def apply(): dxTextAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextAreaOptions]
  }
  
  extension [Self <: dxTextAreaOptions](x: Self) {
    
    inline def setAutoResizeEnabled(value: Boolean): Self = StObject.set(x, "autoResizeEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeEnabledUndefined: Self = StObject.set(x, "autoResizeEnabled", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
  }
}
