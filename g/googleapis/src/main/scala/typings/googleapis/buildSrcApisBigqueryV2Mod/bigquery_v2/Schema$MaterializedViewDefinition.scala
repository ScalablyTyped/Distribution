package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MaterializedViewDefinition extends js.Object {
  /**
    * [Output-only] [TrustedTester] The time when this materialized view was
    * last modified, in milliseconds since the epoch.
    */
  var lastRefreshTime: js.UndefOr[String] = js.native
  /**
    * [Required] A query whose result is persisted.
    */
  var query: js.UndefOr[String] = js.native
}

object Schema$MaterializedViewDefinition {
  @scala.inline
  def apply(lastRefreshTime: String = null, query: String = null): Schema$MaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    if (lastRefreshTime != null) __obj.updateDynamic("lastRefreshTime")(lastRefreshTime.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MaterializedViewDefinition]
  }
}

