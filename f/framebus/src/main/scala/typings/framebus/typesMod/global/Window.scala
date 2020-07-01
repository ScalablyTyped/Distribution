package typings.framebus.typesMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def Window(): typings.framebus.typesMod.global.Window
}

object Window {
  @scala.inline
  def apply(Window: () => Window): Window = {
    val __obj = js.Dynamic.literal(Window = js.Any.fromFunction0(Window))
    __obj.asInstanceOf[Window]
  }
}

