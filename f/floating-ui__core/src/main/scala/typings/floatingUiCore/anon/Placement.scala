package typings.floatingUiCore.anon

import typings.floatingUiCore.floatingUiCoreBooleans.`true`
import typings.floatingUiCore.srcTypesMod.ElementRects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var placement: js.UndefOr[typings.floatingUiCore.srcTypesMod.Placement] = js.undefined
  
  var rects: js.UndefOr[`true` | ElementRects] = js.undefined
}
object Placement {
  
  inline def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    inline def setPlacement(value: typings.floatingUiCore.srcTypesMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRects(value: `true` | ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
  }
}
