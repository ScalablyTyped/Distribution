package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListViolatingSites.
  */
@js.native
trait SchemaViolatingSitesResponse extends js.Object {
  /**
    * A list of summaries of violating sites.
    */
  var violatingSites: js.UndefOr[js.Array[SchemaSiteSummaryResponse]] = js.native
}

object SchemaViolatingSitesResponse {
  @scala.inline
  def apply(): SchemaViolatingSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViolatingSitesResponse]
  }
  @scala.inline
  implicit class SchemaViolatingSitesResponseOps[Self <: SchemaViolatingSitesResponse] (val x: Self) extends AnyVal {
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
    def setViolatingSitesVarargs(value: SchemaSiteSummaryResponse*): Self = this.set("violatingSites", js.Array(value :_*))
    @scala.inline
    def setViolatingSites(value: js.Array[SchemaSiteSummaryResponse]): Self = this.set("violatingSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolatingSites: Self = this.set("violatingSites", js.undefined)
  }
  
}

