package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IElement
import typings.extjs.Ext.IEventObject
import typings.extjs.Ext.util.IObservable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDragTracker
  extends StObject
     with IObservable {
  
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var autoStart: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var delegate: js.UndefOr[String] = js.undefined
  
  /** [Property] (HTMLElement) */
  var dragTarget: js.UndefOr[HTMLElement] = js.undefined
  
  /** [Method] Returns the drag target
    * @returns Ext.Element The element currently being tracked.
    */
  var getDragTarget: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Returns the X Y offset of the current mouse position from the mousedown point
    * @param constrainMode String If omitted the true mouse position is returned. May be passed as point or dragTarget. See above.
    * @returns Number[] The X, Y offset from the mousedown point, optionally constrained.
    */
  var getOffset: js.UndefOr[js.Function1[/* constrainMode */ js.UndefOr[String], Array]] = js.undefined
  
  /** [Method] Initializes the DragTracker on a given element
    * @param el Ext.Element/HTMLElement The element
    */
  var initEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onBeforeStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onEnd: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var overCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var tolerance: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.undefined
}
object IDragTracker {
  
  inline def apply(): IDragTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragTracker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDragTracker] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAutoStart(value: Any): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setConstrainTo(value: Any): Self = StObject.set(x, "constrainTo", value.asInstanceOf[js.Any])
    
    inline def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    inline def setDelegate(value: String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDragTarget(value: HTMLElement): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
    
    inline def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
    
    inline def setGetDragTarget(value: () => IElement): Self = StObject.set(x, "getDragTarget", js.Any.fromFunction0(value))
    
    inline def setGetDragTargetUndefined: Self = StObject.set(x, "getDragTarget", js.undefined)
    
    inline def setGetOffset(value: /* constrainMode */ js.UndefOr[String] => Array): Self = StObject.set(x, "getOffset", js.Any.fromFunction1(value))
    
    inline def setGetOffsetUndefined: Self = StObject.set(x, "getOffset", js.undefined)
    
    inline def setInitEl(value: /* el */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "initEl", js.Any.fromFunction1(value))
    
    inline def setInitElUndefined: Self = StObject.set(x, "initEl", js.undefined)
    
    inline def setOnBeforeStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onBeforeStart", js.Any.fromFunction1(value))
    
    inline def setOnBeforeStartUndefined: Self = StObject.set(x, "onBeforeStart", js.undefined)
    
    inline def setOnDrag(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnEnd(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOverCls(value: String): Self = StObject.set(x, "overCls", value.asInstanceOf[js.Any])
    
    inline def setOverClsUndefined: Self = StObject.set(x, "overCls", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
    
    inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    inline def setTrackOver(value: Boolean): Self = StObject.set(x, "trackOver", value.asInstanceOf[js.Any])
    
    inline def setTrackOverUndefined: Self = StObject.set(x, "trackOver", js.undefined)
  }
}
