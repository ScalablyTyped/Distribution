package typings
package googleDotFeedsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaGroup extends js.Object {
  var content: js.Array[MediaContent]
}

object MediaGroup {
  @scala.inline
  def apply(content: js.Array[MediaContent]): MediaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[MediaGroup]
  }
}

