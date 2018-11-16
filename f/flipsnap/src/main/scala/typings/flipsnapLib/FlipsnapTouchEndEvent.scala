package typings
package flipsnapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipsnapTouchEndEvent
  extends stdLib.Event {
  var cancelled: scala.Boolean = js.native
  var moved: scala.Boolean = js.native
  var newPoint: scala.Double = js.native
  var originalPoint: scala.Double = js.native
}

