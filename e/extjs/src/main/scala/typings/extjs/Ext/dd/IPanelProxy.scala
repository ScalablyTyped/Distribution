package typings.extjs.Ext.dd

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import typings.extjs.Ext.panel.IPanel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelProxy extends IBase {
  
  /** [Method] Gets the proxy s element
    * @returns Ext.Element The proxy's element
    */
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Gets the proxy s ghost Panel
    * @returns Ext.panel.Panel The proxy's ghost Panel
    */
  var getGhost: js.UndefOr[js.Function0[IPanel]] = js.native
  
  /** [Method] Gets the proxy element
    * @returns Ext.Element The proxy's element
    */
  var getProxy: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[Boolean] = js.native
  
  /** [Method] Moves the proxy to a different position in the DOM
    * @param parentNode HTMLElement The proxy's parent DOM node
    * @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
    */
  var moveProxy: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
  
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[IPanel] = js.native
  
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}
object IPanelProxy {
  
  @scala.inline
  def apply(): IPanelProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelProxy]
  }
  
  @scala.inline
  implicit class IPanelProxyMutableBuilder[Self <: IPanelProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEl(value: () => IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    @scala.inline
    def setGetGhost(value: () => IPanel): Self = StObject.set(x, "getGhost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGhostUndefined: Self = StObject.set(x, "getGhost", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => IElement): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setInsertProxy(value: Boolean): Self = StObject.set(x, "insertProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertProxyUndefined: Self = StObject.set(x, "insertProxy", js.undefined)
    
    @scala.inline
    def setMoveOnDrag(value: Boolean): Self = StObject.set(x, "moveOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveOnDragUndefined: Self = StObject.set(x, "moveOnDrag", js.undefined)
    
    @scala.inline
    def setMoveProxy(value: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "moveProxy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveProxyUndefined: Self = StObject.set(x, "moveProxy", js.undefined)
    
    @scala.inline
    def setPanel(value: IPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
