package typings.draggabilly.mod

import typings.std.Event
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggabilly extends js.Object {
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def off(
    eventName: DraggabillyClickEventName,
    listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
  ): Draggabilly = js.native
  def off(
    eventName: DraggabillyMoveEventName,
    listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
  ): Draggabilly = js.native
  
  def on(
    eventName: DraggabillyClickEventName,
    listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
  ): Draggabilly = js.native
  def on(
    eventName: DraggabillyMoveEventName,
    listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
  ): Draggabilly = js.native
  
  def once(
    eventName: DraggabillyClickEventName,
    listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
  ): Draggabilly = js.native
  def once(
    eventName: DraggabillyMoveEventName,
    listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
  ): Draggabilly = js.native
  
  var position: Position = js.native
}
