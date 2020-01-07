package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.ListRulesets.
  */
@js.native
trait Schema$ListRulesetsResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of `Ruleset` instances.
    */
  var rulesets: js.UndefOr[js.Array[Schema$Ruleset]] = js.native
}

object Schema$ListRulesetsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, rulesets: js.Array[Schema$Ruleset] = null): Schema$ListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (rulesets != null) __obj.updateDynamic("rulesets")(rulesets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListRulesetsResponse]
  }
}

