package typings.extjs.Ext.form

import typings.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpinner
  extends StObject
     with typings.extjs.Ext.form.field.ITrigger {
  
  /** [Config Option] (Boolean) */
  var keyNavEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] This method is called when the spinner down button is clicked or when the down arrow key is pressed if keyNavEnabled  */
  var onSpinDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] This method is called when the spinner up button is clicked or when the up arrow key is pressed if keyNavEnabled is */
  var onSpinUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets whether the spinner down button is enabled
    * @param enabled Boolean true to enable the button, false to disable it.
    */
  var setSpinDownEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets whether the spinner up button is enabled
    * @param enabled Boolean true to enable the button, false to disable it.
    */
  var setSpinUpEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Triggers the spinner to step down fires the spin and spindown events and calls the onSpinDown method  */
  var spinDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Ext.Element) */
  var spinDownEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (Boolean) */
  var spinDownEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Triggers the spinner to step up fires the spin and spinup events and calls the onSpinUp method  */
  var spinUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Ext.Element) */
  var spinUpEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (Boolean) */
  var spinUpEnabled: js.UndefOr[Boolean] = js.undefined
}
object ISpinner {
  
  inline def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISpinner] (val x: Self) extends AnyVal {
    
    inline def setKeyNavEnabled(value: Boolean): Self = StObject.set(x, "keyNavEnabled", value.asInstanceOf[js.Any])
    
    inline def setKeyNavEnabledUndefined: Self = StObject.set(x, "keyNavEnabled", js.undefined)
    
    inline def setMouseWheelEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelEnabled", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelEnabledUndefined: Self = StObject.set(x, "mouseWheelEnabled", js.undefined)
    
    inline def setOnSpinDown(value: () => Unit): Self = StObject.set(x, "onSpinDown", js.Any.fromFunction0(value))
    
    inline def setOnSpinDownUndefined: Self = StObject.set(x, "onSpinDown", js.undefined)
    
    inline def setOnSpinUp(value: () => Unit): Self = StObject.set(x, "onSpinUp", js.Any.fromFunction0(value))
    
    inline def setOnSpinUpUndefined: Self = StObject.set(x, "onSpinUp", js.undefined)
    
    inline def setSetSpinDownEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSpinDownEnabled", js.Any.fromFunction1(value))
    
    inline def setSetSpinDownEnabledUndefined: Self = StObject.set(x, "setSpinDownEnabled", js.undefined)
    
    inline def setSetSpinUpEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSpinUpEnabled", js.Any.fromFunction1(value))
    
    inline def setSetSpinUpEnabledUndefined: Self = StObject.set(x, "setSpinUpEnabled", js.undefined)
    
    inline def setSpinDown(value: () => Unit): Self = StObject.set(x, "spinDown", js.Any.fromFunction0(value))
    
    inline def setSpinDownEl(value: IElement): Self = StObject.set(x, "spinDownEl", value.asInstanceOf[js.Any])
    
    inline def setSpinDownElUndefined: Self = StObject.set(x, "spinDownEl", js.undefined)
    
    inline def setSpinDownEnabled(value: Boolean): Self = StObject.set(x, "spinDownEnabled", value.asInstanceOf[js.Any])
    
    inline def setSpinDownEnabledUndefined: Self = StObject.set(x, "spinDownEnabled", js.undefined)
    
    inline def setSpinDownUndefined: Self = StObject.set(x, "spinDown", js.undefined)
    
    inline def setSpinUp(value: () => Unit): Self = StObject.set(x, "spinUp", js.Any.fromFunction0(value))
    
    inline def setSpinUpEl(value: IElement): Self = StObject.set(x, "spinUpEl", value.asInstanceOf[js.Any])
    
    inline def setSpinUpElUndefined: Self = StObject.set(x, "spinUpEl", js.undefined)
    
    inline def setSpinUpEnabled(value: Boolean): Self = StObject.set(x, "spinUpEnabled", value.asInstanceOf[js.Any])
    
    inline def setSpinUpEnabledUndefined: Self = StObject.set(x, "spinUpEnabled", js.undefined)
    
    inline def setSpinUpUndefined: Self = StObject.set(x, "spinUp", js.undefined)
  }
}
