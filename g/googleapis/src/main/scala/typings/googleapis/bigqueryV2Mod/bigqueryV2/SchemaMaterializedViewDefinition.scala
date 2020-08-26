package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMaterializedViewDefinition extends js.Object {
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

object SchemaMaterializedViewDefinition {
  @scala.inline
  def apply(): SchemaMaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterializedViewDefinition]
  }
  @scala.inline
  implicit class SchemaMaterializedViewDefinitionOps[Self <: SchemaMaterializedViewDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastRefreshTime(value: String): Self = this.set("lastRefreshTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRefreshTime: Self = this.set("lastRefreshTime", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

