package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object easeljsLib {
  // rename the native MouseEvent, to avoid conflict with createjs's MouseEvent
  type NativeMouseEvent = stdLib.MouseEvent
}
