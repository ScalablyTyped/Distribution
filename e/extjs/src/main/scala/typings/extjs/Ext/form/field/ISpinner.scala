package typings.extjs.Ext.form.field

import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpinner extends ITrigger {
  
  /** [Config Option] (Boolean) */
  var keyNavEnabled: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var mouseWheelEnabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method is called when the spinner down button is clicked or when the down arrow key is pressed if keyNavEnabled  */
  var onSpinDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] This method is called when the spinner up button is clicked or when the up arrow key is pressed if keyNavEnabled is */
  var onSpinUp: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets whether the spinner down button is enabled
    * @param enabled Boolean true to enable the button, false to disable it.
    */
  var setSpinDownEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets whether the spinner up button is enabled
    * @param enabled Boolean true to enable the button, false to disable it.
    */
  var setSpinUpEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Triggers the spinner to step down fires the spin and spindown events and calls the onSpinDown method  */
  var spinDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.Element) */
  var spinDownEl: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (Boolean) */
  var spinDownEnabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] Triggers the spinner to step up fires the spin and spinup events and calls the onSpinUp method  */
  var spinUp: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.Element) */
  var spinUpEl: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (Boolean) */
  var spinUpEnabled: js.UndefOr[Boolean] = js.native
}
object ISpinner {
  
  @scala.inline
  def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  
  @scala.inline
  implicit class ISpinnerOps[Self <: ISpinner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyNavEnabled(value: Boolean): Self = this.set("keyNavEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyNavEnabled: Self = this.set("keyNavEnabled", js.undefined)
    
    @scala.inline
    def setMouseWheelEnabled(value: Boolean): Self = this.set("mouseWheelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelEnabled: Self = this.set("mouseWheelEnabled", js.undefined)
    
    @scala.inline
    def setOnSpinDown(value: () => Unit): Self = this.set("onSpinDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSpinDown: Self = this.set("onSpinDown", js.undefined)
    
    @scala.inline
    def setOnSpinUp(value: () => Unit): Self = this.set("onSpinUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSpinUp: Self = this.set("onSpinUp", js.undefined)
    
    @scala.inline
    def setSetSpinDownEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setSpinDownEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSpinDownEnabled: Self = this.set("setSpinDownEnabled", js.undefined)
    
    @scala.inline
    def setSetSpinUpEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setSpinUpEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSpinUpEnabled: Self = this.set("setSpinUpEnabled", js.undefined)
    
    @scala.inline
    def setSpinDown(value: () => Unit): Self = this.set("spinDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSpinDown: Self = this.set("spinDown", js.undefined)
    
    @scala.inline
    def setSpinDownEl(value: IElement): Self = this.set("spinDownEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinDownEl: Self = this.set("spinDownEl", js.undefined)
    
    @scala.inline
    def setSpinDownEnabled(value: Boolean): Self = this.set("spinDownEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinDownEnabled: Self = this.set("spinDownEnabled", js.undefined)
    
    @scala.inline
    def setSpinUp(value: () => Unit): Self = this.set("spinUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSpinUp: Self = this.set("spinUp", js.undefined)
    
    @scala.inline
    def setSpinUpEl(value: IElement): Self = this.set("spinUpEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinUpEl: Self = this.set("spinUpEl", js.undefined)
    
    @scala.inline
    def setSpinUpEnabled(value: Boolean): Self = this.set("spinUpEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinUpEnabled: Self = this.set("spinUpEnabled", js.undefined)
  }
}
