package typings.easeljs.global.createjs

import typings.easeljs.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MouseEvent")
@js.native
class MouseEvent protected ()
  extends typings.easeljs.createjs.MouseEvent {
  def this(
    `type`: String,
    bubbles: Boolean,
    cancelable: Boolean,
    stageX: Double,
    stageY: Double,
    nativeEvent: NativeMouseEvent,
    pointerID: Double,
    primary: Boolean,
    rawX: Double,
    rawY: Double
  ) = this()
}

