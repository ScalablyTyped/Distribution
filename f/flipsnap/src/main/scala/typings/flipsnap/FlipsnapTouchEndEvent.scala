package typings.flipsnap

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipsnapTouchEndEvent extends Event_ {
  var cancelled: Boolean = js.native
  var moved: Boolean = js.native
  var newPoint: Double = js.native
  var originalPoint: Double = js.native
}

