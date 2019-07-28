package typings.gapiDotClientDotFirebaserules.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRulesetsResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value is
    * empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** List of `Ruleset` instances. */
  var rulesets: js.UndefOr[js.Array[Ruleset]] = js.undefined
}

object ListRulesetsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, rulesets: js.Array[Ruleset] = null): ListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (rulesets != null) __obj.updateDynamic("rulesets")(rulesets)
    __obj.asInstanceOf[ListRulesetsResponse]
  }
}

