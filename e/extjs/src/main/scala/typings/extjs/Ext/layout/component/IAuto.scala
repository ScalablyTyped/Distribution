package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuto extends IComponent {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var setHeightInDom: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var setWidthInDom: js.UndefOr[Boolean] = js.native
}
object IAuto {
  
  @scala.inline
  def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  
  @scala.inline
  implicit class IAutoMutableBuilder[Self <: IAuto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setSetHeightInDom(value: Boolean): Self = StObject.set(x, "setHeightInDom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHeightInDomUndefined: Self = StObject.set(x, "setHeightInDom", js.undefined)
    
    @scala.inline
    def setSetWidthInDom(value: Boolean): Self = StObject.set(x, "setWidthInDom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWidthInDomUndefined: Self = StObject.set(x, "setWidthInDom", js.undefined)
  }
}
