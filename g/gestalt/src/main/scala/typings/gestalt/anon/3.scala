package typings.gestalt.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var event: typings.react.mod.SyntheticEvent[
    KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
    typings.std.Event
  ]
}

object `3` {
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[
      KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
      typings.std.Event
    ]
  ): `3` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

