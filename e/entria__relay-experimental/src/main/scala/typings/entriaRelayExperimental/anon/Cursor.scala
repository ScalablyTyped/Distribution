package typings.entriaRelayExperimental.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  var cursor: String | Null
  var hasMore: Boolean
}

object Cursor {
  @scala.inline
  def apply(hasMore: Boolean, cursor: String = null): Cursor = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
}

