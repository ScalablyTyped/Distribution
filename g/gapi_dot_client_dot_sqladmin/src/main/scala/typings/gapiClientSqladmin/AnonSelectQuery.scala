package typings.gapiClientSqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectQuery extends js.Object {
  /** The select query used to extract the data. */
  var selectQuery: js.UndefOr[String] = js.undefined
}

object AnonSelectQuery {
  @scala.inline
  def apply(selectQuery: String = null): AnonSelectQuery = {
    val __obj = js.Dynamic.literal()
    if (selectQuery != null) __obj.updateDynamic("selectQuery")(selectQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectQuery]
  }
}

