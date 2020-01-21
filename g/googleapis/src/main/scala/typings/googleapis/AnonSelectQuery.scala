package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectQuery extends js.Object {
  var selectQuery: js.UndefOr[String] = js.native
}

object AnonSelectQuery {
  @scala.inline
  def apply(selectQuery: String = null): AnonSelectQuery = {
    val __obj = js.Dynamic.literal()
    if (selectQuery != null) __obj.updateDynamic("selectQuery")(selectQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectQuery]
  }
}

