package typings.extjs.Ext.layout

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.dom.IElement
import typings.extjs.Ext.util.IQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContext extends IBase {
  
  /** [Method] Flushes any pending writes to the DOM by calling each ContextItem in the flushQueue  */
  var flush: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the ContextItem for a component
    * @param cmp Ext.Component
    */
  var getCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], Unit]] = js.native
  
  /** [Method] Returns the ContextItem for an element
    * @param parent Ext.layout.ContextItem
    * @param el Ext.dom.Element
    */
  var getEl: js.UndefOr[
    js.Function2[/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement], Unit]
  ] = js.native
  
  /** [Method] Invalidates one or more components layouts component and container
    * @param components Ext.Component/Array An array of Components or a single Component.
    * @param full Boolean True if all properties should be invalidated, otherwise only those calculated by the component should be invalidated.
    */
  var invalidate: js.UndefOr[
    js.Function2[/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Property] (Ext.util.Queue) */
  var layoutQueue: js.UndefOr[IQueue] = js.native
  
  /** [Method] Removes the ContextItem for an element from the cache and from the parent s children array
    * @param parent Ext.layout.ContextItem
    * @param el Ext.dom.Element
    */
  var removeEl: js.UndefOr[
    js.Function2[/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement], Unit]
  ] = js.native
  
  /** [Method] Resets the given layout object
    * @param layout Object
    * @param ownerContext Object
    * @param firstTime Object
    */
  var resetLayout: js.UndefOr[
    js.Function3[
      /* layout */ js.UndefOr[js.Any], 
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstTime */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Runs the layout calculations
    * @returns Boolean True if all layouts were completed, false if not.
    */
  var run: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Performs one layout cycle by calling each layout in the layout queue
    * @returns Boolean True if some progress was made, false if not.
    */
  var runCycle: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Set the size of a component element or composite or an array of components or elements
    * @param items Ext.Component/Ext.Component[]/Ext.dom.Element/Ext.dom.Element[]/Ext.dom.CompositeElement The item(s) to size.
    * @param width Number The new width to set (ignored if undefined or NaN).
    * @param height Number The new height to set (ignored if undefined or NaN).
    */
  var setItemSize: js.UndefOr[
    js.Function3[
      /* items */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** [Property] (Number) */
  var state: js.UndefOr[Double] = js.native
}
object IContext {
  
  @scala.inline
  def apply(): IContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContext]
  }
  
  @scala.inline
  implicit class IContextOps[Self <: IContext] (val x: Self) extends AnyVal {
    
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
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setGetCmp(value: /* cmp */ js.UndefOr[IComponent] => Unit): Self = this.set("getCmp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetCmp: Self = this.set("getCmp", js.undefined)
    
    @scala.inline
    def setGetEl(value: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Unit): Self = this.set("getEl", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    
    @scala.inline
    def setInvalidate(value: (/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean]) => Unit): Self = this.set("invalidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    
    @scala.inline
    def setLayoutQueue(value: IQueue): Self = this.set("layoutQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutQueue: Self = this.set("layoutQueue", js.undefined)
    
    @scala.inline
    def setRemoveEl(value: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Unit): Self = this.set("removeEl", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveEl: Self = this.set("removeEl", js.undefined)
    
    @scala.inline
    def setResetLayout(
      value: (/* layout */ js.UndefOr[js.Any], /* ownerContext */ js.UndefOr[js.Any], /* firstTime */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("resetLayout", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteResetLayout: Self = this.set("resetLayout", js.undefined)
    
    @scala.inline
    def setRun(value: () => Boolean): Self = this.set("run", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setRunCycle(value: () => Boolean): Self = this.set("runCycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRunCycle: Self = this.set("runCycle", js.undefined)
    
    @scala.inline
    def setSetItemSize(
      value: (/* items */ js.UndefOr[js.Any], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = this.set("setItemSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetItemSize: Self = this.set("setItemSize", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
