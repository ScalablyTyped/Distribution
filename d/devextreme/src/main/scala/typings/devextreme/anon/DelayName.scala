package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.SubmenuShowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelayName extends StObject {
  
  /**
    * Specifies the delay of submenu show and hiding.
    */
  var delay: js.UndefOr[Show | Double] = js.undefined
  
  /**
    * Specifies the mode name.
    */
  var name: js.UndefOr[SubmenuShowMode] = js.undefined
}
object DelayName {
  
  inline def apply(): DelayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayName]
  }
  
  extension [Self <: DelayName](x: Self) {
    
    inline def setDelay(value: Show | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setName(value: SubmenuShowMode): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
