package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentDraggingAddEvent
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentDraggingEndEvent
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentDraggingMoveEvent
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentDraggingRemoveEvent
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentDraggingStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScroll extends StObject {
  
  /**
    * Enables automatic scrolling while dragging an appointment beyond the viewport.
    */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A container for custom data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Allows you to group several UI components so that users can drag and drop appointments between them.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is called when a new appointment is added.
    */
  var onAdd: js.UndefOr[js.Function1[/* e */ AppointmentDraggingAddEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when the dragged appointment&apos;s position is changed.
    */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ AppointmentDraggingEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is called every time a draggable appointment is moved.
    */
  var onDragMove: js.UndefOr[js.Function1[/* e */ AppointmentDraggingMoveEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when the drag gesture is initialized.
    */
  var onDragStart: js.UndefOr[js.Function1[/* e */ AppointmentDraggingStartEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when a draggable appointment is removed.
    */
  var onRemove: js.UndefOr[js.Function1[/* e */ AppointmentDraggingRemoveEvent, Unit]] = js.undefined
  
  /**
    * Specifies the distance in pixels from the edge of viewport at which scrolling should start. Applies only if autoScroll is true.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the scrolling speed when dragging an appointment beyond the viewport. Applies only if autoScroll is true.
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}
object AutoScroll {
  
  inline def apply(): AutoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScroll]
  }
  
  extension [Self <: AutoScroll](x: Self) {
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setOnAdd(value: /* e */ AppointmentDraggingAddEvent => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnDragEnd(value: /* e */ AppointmentDraggingEndEvent => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: /* e */ AppointmentDraggingMoveEvent => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: /* e */ AppointmentDraggingStartEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnRemove(value: /* e */ AppointmentDraggingRemoveEvent => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
  }
}
