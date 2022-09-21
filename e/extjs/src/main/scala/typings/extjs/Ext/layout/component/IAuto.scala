package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuto
  extends StObject
     with IComponent {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var setHeightInDom: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var setWidthInDom: js.UndefOr[Boolean] = js.undefined
}
object IAuto {
  
  inline def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  
  extension [Self <: IAuto](x: Self) {
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setSetHeightInDom(value: Boolean): Self = StObject.set(x, "setHeightInDom", value.asInstanceOf[js.Any])
    
    inline def setSetHeightInDomUndefined: Self = StObject.set(x, "setHeightInDom", js.undefined)
    
    inline def setSetWidthInDom(value: Boolean): Self = StObject.set(x, "setWidthInDom", value.asInstanceOf[js.Any])
    
    inline def setSetWidthInDomUndefined: Self = StObject.set(x, "setWidthInDom", js.undefined)
  }
}
