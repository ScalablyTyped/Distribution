package typings.devextreme.anon

import typings.devextreme.devextremeStrings.pan
import typings.devextreme.devextremeStrings.zoom
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.viz.VizRange
import typings.devextreme.mod.DevExpress.viz.chartAxisObject
import typings.devextreme.mod.DevExpress.viz.dxChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionType extends StObject {
  
  var actionType: js.UndefOr[zoom | pan] = js.native
  
  var axis: js.UndefOr[chartAxisObject] = js.native
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[dxChart] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var previousRange: js.UndefOr[VizRange] = js.native
  
  var range: js.UndefOr[VizRange] = js.native
  
  var rangeEnd: js.UndefOr[typings.std.Date | Double] = js.native
  
  var rangeStart: js.UndefOr[typings.std.Date | Double] = js.native
  
  var shift: js.UndefOr[Double] = js.native
  
  var zoomFactor: js.UndefOr[Double] = js.native
}
object ActionType {
  
  @scala.inline
  def apply(): ActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionType]
  }
  
  @scala.inline
  implicit class ActionTypeMutableBuilder[Self <: ActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: zoom | pan): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxChart): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPreviousRange(value: VizRange): Self = StObject.set(x, "previousRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRangeUndefined: Self = StObject.set(x, "previousRange", js.undefined)
    
    @scala.inline
    def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEnd(value: typings.std.Date | Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: typings.std.Date | Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
