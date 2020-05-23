package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[Type]
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: CornerPosition
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: OffsetMs
}

object Items {
  @scala.inline
  def apply(items: js.Array[Type], position: CornerPosition, timing: OffsetMs): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

