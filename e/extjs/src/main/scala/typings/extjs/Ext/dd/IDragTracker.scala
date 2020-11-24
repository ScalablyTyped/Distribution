package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.extjs.Ext.IElement
import typings.extjs.Ext.IEventObject
import typings.extjs.Ext.util.IObservable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragTracker extends IObservable {
  
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var autoStart: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var delegate: js.UndefOr[String] = js.native
  
  /** [Property] (HTMLElement) */
  var dragTarget: js.UndefOr[HTMLElement] = js.native
  
  /** [Method] Returns the drag target
    * @returns Ext.Element The element currently being tracked.
    */
  var getDragTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns the X Y offset of the current mouse position from the mousedown point
    * @param constrainMode String If omitted the true mouse position is returned. May be passed as point or dragTarget. See above.
    * @returns Number[] The X, Y offset from the mousedown point, optionally constrained.
    */
  var getOffset: js.UndefOr[js.Function1[/* constrainMode */ js.UndefOr[String], Array]] = js.native
  
  /** [Method] Initializes the DragTracker on a given element
    * @param el Ext.Element/HTMLElement The element
    */
  var initEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onBeforeStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onEnd: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Config Option] (String) */
  var overCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var tolerance: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
}
object IDragTracker {
  
  @scala.inline
  def apply(): IDragTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragTracker]
  }
  
  @scala.inline
  implicit class IDragTrackerOps[Self <: IDragTracker] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAutoStart(value: js.Any): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setConstrainTo(value: js.Any): Self = this.set("constrainTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainTo: Self = this.set("constrainTo", js.undefined)
    
    @scala.inline
    def setDelegate(value: String): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    
    @scala.inline
    def setDragTarget(value: HTMLElement): Self = this.set("dragTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragTarget: Self = this.set("dragTarget", js.undefined)
    
    @scala.inline
    def setGetDragTarget(value: () => IElement): Self = this.set("getDragTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDragTarget: Self = this.set("getDragTarget", js.undefined)
    
    @scala.inline
    def setGetOffset(value: /* constrainMode */ js.UndefOr[String] => Array): Self = this.set("getOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOffset: Self = this.set("getOffset", js.undefined)
    
    @scala.inline
    def setInitEl(value: /* el */ js.UndefOr[js.Any] => Unit): Self = this.set("initEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitEl: Self = this.set("initEl", js.undefined)
    
    @scala.inline
    def setOnBeforeStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("onBeforeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeStart: Self = this.set("onBeforeStart", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOverCls(value: String): Self = this.set("overCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverCls: Self = this.set("overCls", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setStopEvent(value: Boolean): Self = this.set("stopEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopEvent: Self = this.set("stopEvent", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    
    @scala.inline
    def setTrackOver(value: Boolean): Self = this.set("trackOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackOver: Self = this.set("trackOver", js.undefined)
  }
}
