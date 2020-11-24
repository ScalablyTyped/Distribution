package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFloating extends IBase {
  
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  var center: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Method] Moves this floating Component into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
    */
  var doConstrain: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  var setActive: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.native
  
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.native
  
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  var toBack: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  var toFront: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.native
}
object IFloating {
  
  @scala.inline
  def apply(): IFloating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFloating]
  }
  
  @scala.inline
  implicit class IFloatingOps[Self <: IFloating] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: () => IComponent): Self = this.set("center", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setConstrain(value: Boolean): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrain: Self = this.set("constrain", js.undefined)
    
    @scala.inline
    def setDoConstrain(value: /* constrainTo */ js.UndefOr[js.Any] => Unit): Self = this.set("doConstrain", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoConstrain: Self = this.set("doConstrain", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setFocusOnToFront(value: Boolean): Self = this.set("focusOnToFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnToFront: Self = this.set("focusOnToFront", js.undefined)
    
    @scala.inline
    def setSetActive(value: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit): Self = this.set("setActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetActive: Self = this.set("setActive", js.undefined)
    
    @scala.inline
    def setShadow(value: js.Any): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Double): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    
    @scala.inline
    def setToBack(value: () => IComponent): Self = this.set("toBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToBack: Self = this.set("toBack", js.undefined)
    
    @scala.inline
    def setToFront(value: /* preventFocus */ js.UndefOr[Boolean] => IComponent): Self = this.set("toFront", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToFront: Self = this.set("toFront", js.undefined)
  }
}
