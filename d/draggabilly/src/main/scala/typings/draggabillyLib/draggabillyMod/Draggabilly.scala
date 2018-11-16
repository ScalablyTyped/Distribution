package typings
package draggabillyLib.draggabillyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draggabilly extends js.Object {
  var position: Position = js.native
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def off(
    eventName: DraggabillyClickEventName,
    listener: js.Function2[/* event */ stdLib.Event, /* pointer */ stdLib.MouseEvent | stdLib.Touch, scala.Unit]
  ): Draggabilly = js.native
  def off(
    eventName: DraggabillyMoveEventName,
    listener: js.Function3[
      /* event */ stdLib.Event, 
      /* pointer */ stdLib.MouseEvent | stdLib.Touch, 
      /* moveVector */ Position, 
      scala.Unit
    ]
  ): Draggabilly = js.native
  def on(
    eventName: DraggabillyClickEventName,
    listener: js.Function2[/* event */ stdLib.Event, /* pointer */ stdLib.MouseEvent | stdLib.Touch, scala.Unit]
  ): Draggabilly = js.native
  def on(
    eventName: DraggabillyMoveEventName,
    listener: js.Function3[
      /* event */ stdLib.Event, 
      /* pointer */ stdLib.MouseEvent | stdLib.Touch, 
      /* moveVector */ Position, 
      scala.Unit
    ]
  ): Draggabilly = js.native
  def once(
    eventName: DraggabillyClickEventName,
    listener: js.Function2[/* event */ stdLib.Event, /* pointer */ stdLib.MouseEvent | stdLib.Touch, scala.Unit]
  ): Draggabilly = js.native
  def once(
    eventName: DraggabillyMoveEventName,
    listener: js.Function3[
      /* event */ stdLib.Event, 
      /* pointer */ stdLib.MouseEvent | stdLib.Touch, 
      /* moveVector */ Position, 
      scala.Unit
    ]
  ): Draggabilly = js.native
}

