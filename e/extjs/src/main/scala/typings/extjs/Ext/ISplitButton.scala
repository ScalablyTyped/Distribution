package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISplitButton
  extends StObject
     with typings.extjs.Ext.button.IButton {
  
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets this button s arrow click handler
    * @param handler Function The function to call when the arrow is clicked.
    * @param scope Object Scope for the function passed above.
    */
  var setArrowHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}
object ISplitButton {
  
  inline def apply(): ISplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitButton]
  }
  
  extension [Self <: ISplitButton](x: Self) {
    
    inline def setArrowHandler(value: js.Any): Self = StObject.set(x, "arrowHandler", value.asInstanceOf[js.Any])
    
    inline def setArrowHandlerUndefined: Self = StObject.set(x, "arrowHandler", js.undefined)
    
    inline def setArrowTooltip(value: java.lang.String): Self = StObject.set(x, "arrowTooltip", value.asInstanceOf[js.Any])
    
    inline def setArrowTooltipUndefined: Self = StObject.set(x, "arrowTooltip", js.undefined)
    
    inline def setSetArrowHandler(value: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setArrowHandler", js.Any.fromFunction2(value))
    
    inline def setSetArrowHandlerUndefined: Self = StObject.set(x, "setArrowHandler", js.undefined)
  }
}
