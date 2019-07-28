package typings

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object easeljs {
  // rename the native MouseEvent, to avoid conflict with createjs's MouseEvent
  type NativeMouseEvent = MouseEvent
}
