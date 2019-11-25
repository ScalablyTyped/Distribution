package typings.atEntriaRelayDashExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cursor extends js.Object {
  var cursor: String | Null
  var hasMore: Boolean
}

object Anon_Cursor {
  @scala.inline
  def apply(hasMore: Boolean, cursor: String = null): Anon_Cursor = {
    val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cursor]
  }
}

