package typings.extjs.Ext.layout.component

import typings.extjs.Ext.IElement
import typings.extjs.Ext.layout.ILayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponent extends ILayout {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    * @param firstCycle Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IComponent: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Object
    */
  @JSName("finishedLayout")
  var finishedLayout_IComponent: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the element into which rendering must take place
    * @returns Ext.Element
    */
  var getRenderTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns the owner component s resize element
    * @returns Ext.Element
    */
  var getTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
    * @param ownerContext Object
    */
  @JSName("notifyOwner")
  var notifyOwner_IComponent: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
}
object IComponent {
  
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  
  @scala.inline
  implicit class IComponentMutableBuilder[Self <: IComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginLayoutCycle(value: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setFinishedLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "finishedLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    
    @scala.inline
    def setGetRenderTarget(value: () => IElement): Self = StObject.set(x, "getRenderTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRenderTargetUndefined: Self = StObject.set(x, "getRenderTarget", js.undefined)
    
    @scala.inline
    def setGetTarget(value: () => IElement): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    @scala.inline
    def setNotifyOwner(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "notifyOwner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyOwnerUndefined: Self = StObject.set(x, "notifyOwner", js.undefined)
  }
}
