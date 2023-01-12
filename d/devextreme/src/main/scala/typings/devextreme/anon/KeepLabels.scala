package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepLabels extends StObject {
  
  /**
    * Specifies the minimum container height at which the layout begins to adapt.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether node labels should be kept when the UI component adapts the layout.
    */
  var keepLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the minimum container width at which the layout begins to adapt.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object KeepLabels {
  
  inline def apply(): KeepLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeepLabels] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeepLabels(value: Boolean): Self = StObject.set(x, "keepLabels", value.asInstanceOf[js.Any])
    
    inline def setKeepLabelsUndefined: Self = StObject.set(x, "keepLabels", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
