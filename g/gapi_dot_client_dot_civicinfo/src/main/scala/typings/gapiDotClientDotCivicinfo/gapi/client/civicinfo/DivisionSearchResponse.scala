package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionSearchResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#divisionSearchResponse". */
  var kind: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[js.Array[DivisionSearchResult]] = js.undefined
}

object DivisionSearchResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[DivisionSearchResult] = null): DivisionSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivisionSearchResponse]
  }
}

