package typings.gapiDotClientDotSqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectQuery extends js.Object {
  /** The select query used to extract the data. */
  var selectQuery: js.UndefOr[String] = js.undefined
}

object Anon_SelectQuery {
  @scala.inline
  def apply(selectQuery: String = null): Anon_SelectQuery = {
    val __obj = js.Dynamic.literal()
    if (selectQuery != null) __obj.updateDynamic("selectQuery")(selectQuery)
    __obj.asInstanceOf[Anon_SelectQuery]
  }
}

