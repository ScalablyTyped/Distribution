package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFloating
  extends StObject
     with IBase {
  
  /** [Method] Center this Component in its container
    * @returns Ext.Component this
    */
  var center: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Moves this floating Component into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
    */
  var doConstrain: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
    * @param active Boolean True to activate the Component, false to deactivate it.
    * @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
    */
  var setActive: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.undefined
  
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
    * @returns Ext.Component this
    */
  var toBack: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
    * @param preventFocus Boolean Specify true to prevent the Component from being focused.
    * @returns Ext.Component this
    */
  var toFront: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.undefined
}
object IFloating {
  
  inline def apply(): IFloating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFloating]
  }
  
  extension [Self <: IFloating](x: Self) {
    
    inline def setCenter(value: () => IComponent): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    inline def setDoConstrain(value: /* constrainTo */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doConstrain", js.Any.fromFunction1(value))
    
    inline def setDoConstrainUndefined: Self = StObject.set(x, "doConstrain", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFocusOnToFront(value: Boolean): Self = StObject.set(x, "focusOnToFront", value.asInstanceOf[js.Any])
    
    inline def setFocusOnToFrontUndefined: Self = StObject.set(x, "focusOnToFront", js.undefined)
    
    inline def setSetActive(value: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction2(value))
    
    inline def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
    
    inline def setShadow(value: js.Any): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Double): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setToBack(value: () => IComponent): Self = StObject.set(x, "toBack", js.Any.fromFunction0(value))
    
    inline def setToBackUndefined: Self = StObject.set(x, "toBack", js.undefined)
    
    inline def setToFront(value: /* preventFocus */ js.UndefOr[Boolean] => IComponent): Self = StObject.set(x, "toFront", js.Any.fromFunction1(value))
    
    inline def setToFrontUndefined: Self = StObject.set(x, "toFront", js.undefined)
  }
}
