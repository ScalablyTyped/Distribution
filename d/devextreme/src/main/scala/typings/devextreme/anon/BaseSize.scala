package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSize extends StObject {
  
  /**
    * The row&apos;s base height. Calculated automatically when the singleColumnScreen property arranges all elements in a single column.
    */
  var baseSize: js.UndefOr[Double | typings.devextreme.mod.DevExpress.common.Mode] = js.undefined
  
  /**
    * The row height ratio.
    */
  var ratio: js.UndefOr[Double] = js.undefined
  
  /**
    * Decides on which screens the current row is rendered.
    */
  var screen: js.UndefOr[String] = js.undefined
  
  /**
    * A factor that defines how much a row height shrinks relative to the rest of the rows in the container.
    */
  var shrink: js.UndefOr[Double] = js.undefined
}
object BaseSize {
  
  inline def apply(): BaseSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseSize] (val x: Self) extends AnyVal {
    
    inline def setBaseSize(value: Double | typings.devextreme.mod.DevExpress.common.Mode): Self = StObject.set(x, "baseSize", value.asInstanceOf[js.Any])
    
    inline def setBaseSizeUndefined: Self = StObject.set(x, "baseSize", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    inline def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
