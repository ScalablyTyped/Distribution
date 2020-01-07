package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_SelectQuery extends js.Object {
  var selectQuery: js.UndefOr[String] = js.native
}

object Anon_SelectQuery {
  @scala.inline
  def apply(selectQuery: String = null): Anon_SelectQuery = {
    val __obj = js.Dynamic.literal()
    if (selectQuery != null) __obj.updateDynamic("selectQuery")(selectQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SelectQuery]
  }
}

