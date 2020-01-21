package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterializedViewDefinition extends js.Object {
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
}

object MaterializedViewDefinition {
  @scala.inline
  def apply(lastRefreshTime: String = null, query: String = null): MaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    if (lastRefreshTime != null) __obj.updateDynamic("lastRefreshTime")(lastRefreshTime.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedViewDefinition]
  }
}

