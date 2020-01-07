package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a division search query.
  */
@js.native
trait Schema$DivisionSearchResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#divisionSearchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var results: js.UndefOr[js.Array[Schema$DivisionSearchResult]] = js.native
}

object Schema$DivisionSearchResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[Schema$DivisionSearchResult] = null): Schema$DivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DivisionSearchResponse]
  }
}

