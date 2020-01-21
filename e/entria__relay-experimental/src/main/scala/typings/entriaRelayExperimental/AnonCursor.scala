package typings.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursor extends js.Object {
  var cursor: String | Null
  var hasMore: Boolean
}

object AnonCursor {
  @scala.inline
  def apply(hasMore: Boolean, cursor: String = null): AnonCursor = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCursor]
  }
}

