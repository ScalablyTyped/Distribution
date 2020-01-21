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
  def apply(kind: String = null, results: js.Array[SchemaDivisionSearchResult] = null): SchemaDivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDivisionSearchResponse]
  }
}

