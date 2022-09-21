package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollContainerOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var heightAdjustment: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Boolean] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
}
object ScrollContainerOptions {
  
  inline def apply(): ScrollContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollContainerOptions]
  }
  
  extension [Self <: ScrollContainerOptions](x: Self) {
    
    inline def setHeightAdjustment(value: Double): Self = StObject.set(x, "heightAdjustment", value.asInstanceOf[js.Any])
    
    inline def setHeightAdjustmentUndefined: Self = StObject.set(x, "heightAdjustment", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
  }
}
