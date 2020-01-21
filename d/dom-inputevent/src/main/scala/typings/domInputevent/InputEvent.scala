package typings.domInputevent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface
@js.native
trait InputEvent extends UIEvent {
  val data: String | Null = js.native
  val isComposing: Boolean = js.native
}

@JSGlobal("InputEvent")
@js.native
object InputEvent
  extends Instantiable1[/* type */ String, InputEvent]
     with Instantiable2[/* type */ String, /* eventInitDict */ InputEventInit, InputEvent]

