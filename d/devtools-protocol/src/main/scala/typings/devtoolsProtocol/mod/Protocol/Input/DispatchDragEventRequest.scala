package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.dragCancel
import typings.devtoolsProtocol.devtoolsProtocolStrings.dragEnter
import typings.devtoolsProtocol.devtoolsProtocolStrings.dragOver
import typings.devtoolsProtocol.devtoolsProtocolStrings.drop
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchDragEventRequest extends StObject {
  
  var data: DragData
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.undefined
  
  /**
    * Type of the drag event. (DispatchDragEventRequestType enum)
    */
  var `type`: dragEnter | dragOver | drop | dragCancel
  
  /**
    * X coordinate of the event relative to the main frame's viewport in CSS pixels.
    */
  var x: Double
  
  /**
    * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
    * the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
    */
  var y: Double
}
object DispatchDragEventRequest {
  
  inline def apply(data: DragData, `type`: dragEnter | dragOver | drop | dragCancel, x: Double, y: Double): DispatchDragEventRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchDragEventRequest]
  }
  
  extension [Self <: DispatchDragEventRequest](x: Self) {
    
    inline def setData(value: DragData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: integer): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setType(value: dragEnter | dragOver | drop | dragCancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
