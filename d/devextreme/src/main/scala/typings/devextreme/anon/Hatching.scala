package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hatching extends StObject {
  
  /**
    * Configures a funnel item&apos;s border appearance when a user selects this item.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Applies hatching to a selected funnel item.
    */
  var hatching: js.UndefOr[Direction] = js.undefined
}
object Hatching {
  
  inline def apply(): Hatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hatching]
  }
  
  extension [Self <: Hatching](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHatching(value: Direction): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
