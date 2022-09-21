package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomLeft extends StObject {
  
  /**
    * Specifies the bottom margin of the title.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the left margin of the title.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the right margin of the title.
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the top margin of the title.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object BottomLeft {
  
  inline def apply(): BottomLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomLeft]
  }
  
  extension [Self <: BottomLeft](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
