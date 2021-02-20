package typings.extjs.Ext.layout

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.dom.IElement
import typings.extjs.Ext.util.IQueue
import org.scalablytyped.runtime.StObject
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
  implicit class IContextMutableBuilder[Self <: IContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setGetCmp(value: /* cmp */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "getCmp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCmpUndefined: Self = StObject.set(x, "getCmp", js.undefined)
    
    @scala.inline
    def setGetEl(value: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Unit): Self = StObject.set(x, "getEl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    @scala.inline
    def setInvalidate(value: (/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    @scala.inline
    def setLayoutQueue(value: IQueue): Self = StObject.set(x, "layoutQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutQueueUndefined: Self = StObject.set(x, "layoutQueue", js.undefined)
    
    @scala.inline
    def setRemoveEl(value: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Unit): Self = StObject.set(x, "removeEl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveElUndefined: Self = StObject.set(x, "removeEl", js.undefined)
    
    @scala.inline
    def setResetLayout(
      value: (/* layout */ js.UndefOr[js.Any], /* ownerContext */ js.UndefOr[js.Any], /* firstTime */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "resetLayout", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResetLayoutUndefined: Self = StObject.set(x, "resetLayout", js.undefined)
    
    @scala.inline
    def setRun(value: () => Boolean): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunCycle(value: () => Boolean): Self = StObject.set(x, "runCycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunCycleUndefined: Self = StObject.set(x, "runCycle", js.undefined)
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    @scala.inline
    def setSetItemSize(
      value: (/* items */ js.UndefOr[js.Any], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "setItemSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetItemSizeUndefined: Self = StObject.set(x, "setItemSize", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
