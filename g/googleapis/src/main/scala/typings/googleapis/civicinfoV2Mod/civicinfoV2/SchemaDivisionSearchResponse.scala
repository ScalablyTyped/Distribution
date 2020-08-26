package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a division search query.
  */
@js.native
trait SchemaDivisionSearchResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#divisionSearchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var results: js.UndefOr[js.Array[SchemaDivisionSearchResult]] = js.native
}

object SchemaDivisionSearchResponse {
  @scala.inline
  def apply(): SchemaDivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchResponse]
  }
  @scala.inline
  implicit class SchemaDivisionSearchResponseOps[Self <: SchemaDivisionSearchResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setResultsVarargs(value: SchemaDivisionSearchResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SchemaDivisionSearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

