package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsQueryResponse extends js.Object {
  /** A list of available elections */
  var elections: js.UndefOr[js.Array[Election]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#electionsQueryResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object ElectionsQueryResponse {
  @scala.inline
  def apply(elections: js.Array[Election] = null, kind: String = null): ElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (elections != null) __obj.updateDynamic("elections")(elections.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectionsQueryResponse]
  }
}

