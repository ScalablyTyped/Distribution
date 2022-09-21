package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseColor extends StObject {
  
  var collapseColor: js.UndefOr[Boolean] = js.undefined
  
  var collapseExtendedProps: js.UndefOr[Boolean] = js.undefined
}
object CollapseColor {
  
  inline def apply(): CollapseColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseColor]
  }
  
  extension [Self <: CollapseColor](x: Self) {
    
    inline def setCollapseColor(value: Boolean): Self = StObject.set(x, "collapseColor", value.asInstanceOf[js.Any])
    
    inline def setCollapseColorUndefined: Self = StObject.set(x, "collapseColor", js.undefined)
    
    inline def setCollapseExtendedProps(value: Boolean): Self = StObject.set(x, "collapseExtendedProps", value.asInstanceOf[js.Any])
    
    inline def setCollapseExtendedPropsUndefined: Self = StObject.set(x, "collapseExtendedProps", js.undefined)
  }
}
