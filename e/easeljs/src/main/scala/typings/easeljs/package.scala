package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object easeljs {
  import typings.std.MouseEvent

  // rename the native MouseEvent, to avoid conflict with createjs's MouseEvent
  type NativeMouseEvent = MouseEvent
}
