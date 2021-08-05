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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionType extends StObject {
  
  var actionType: js.UndefOr[zoom | pan] = js.undefined
  
  var axis: js.UndefOr[chartAxisObject] = js.undefined
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[dxChart] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var previousRange: js.UndefOr[VizRange] = js.undefined
  
  var range: js.UndefOr[VizRange] = js.undefined
  
  var rangeEnd: js.UndefOr[typings.std.Date | Double] = js.undefined
  
  var rangeStart: js.UndefOr[typings.std.Date | Double] = js.undefined
  
  var shift: js.UndefOr[Double] = js.undefined
  
  var zoomFactor: js.UndefOr[Double] = js.undefined
}
object ActionType {
  
  inline def apply(): ActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionType]
  }
  
  extension [Self <: ActionType](x: Self) {
    
    inline def setActionType(value: zoom | pan): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setAxis(value: chartAxisObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: dxChart): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setPreviousRange(value: VizRange): Self = StObject.set(x, "previousRange", value.asInstanceOf[js.Any])
    
    inline def setPreviousRangeUndefined: Self = StObject.set(x, "previousRange", js.undefined)
    
    inline def setRange(value: VizRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeEnd(value: typings.std.Date | Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: typings.std.Date | Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
