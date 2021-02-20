package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISplitButton
  extends typings.extjs.Ext.button.IButton {
  
  /** [Config Option] (Function) */
  var arrowHandler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var arrowTooltip: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets this button s arrow click handler
    * @param handler Function The function to call when the arrow is clicked.
    * @param scope Object Scope for the function passed above.
    */
  var setArrowHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object ISplitButton {
  
  @scala.inline
  def apply(): ISplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitButton]
  }
  
  @scala.inline
  implicit class ISplitButtonMutableBuilder[Self <: ISplitButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowHandler(value: js.Any): Self = StObject.set(x, "arrowHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowHandlerUndefined: Self = StObject.set(x, "arrowHandler", js.undefined)
    
    @scala.inline
    def setArrowTooltip(value: java.lang.String): Self = StObject.set(x, "arrowTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowTooltipUndefined: Self = StObject.set(x, "arrowTooltip", js.undefined)
    
    @scala.inline
    def setSetArrowHandler(value: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setArrowHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetArrowHandlerUndefined: Self = StObject.set(x, "setArrowHandler", js.undefined)
  }
}
