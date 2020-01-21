package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[AnonType]
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: AnonCornerPosition
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: AnonOffsetMs
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[AnonType], position: AnonCornerPosition, timing: AnonOffsetMs): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItems]
  }
}

