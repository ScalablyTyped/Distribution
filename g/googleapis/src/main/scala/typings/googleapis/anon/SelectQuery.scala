package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectQuery extends js.Object {
  var selectQuery: js.UndefOr[String] = js.native
}

object SelectQuery {
  @scala.inline
  def apply(selectQuery: String = null): SelectQuery = {
    val __obj = js.Dynamic.literal()
    if (selectQuery != null) __obj.updateDynamic("selectQuery")(selectQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectQuery]
  }
}

