package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetDataSourceIndexStatsResponse extends js.Object {
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaDataSourceIndexStats]] = js.native
}

object SchemaGetDataSourceIndexStatsResponse {
  @scala.inline
  def apply(): SchemaGetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDataSourceIndexStatsResponse]
  }
  @scala.inline
  implicit class SchemaGetDataSourceIndexStatsResponseOps[Self <: SchemaGetDataSourceIndexStatsResponse] (val x: Self) extends AnyVal {
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
    def setStatsVarargs(value: SchemaDataSourceIndexStats*): Self = this.set("stats", js.Array(value :_*))
    @scala.inline
    def setStats(value: js.Array[SchemaDataSourceIndexStats]): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
  
}

