package typings.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesetMetadataList extends js.Object {
  /**
    * The next page token if available. This is needed to retrieve the next batch.
    */
  val nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * A batch of ruleset metadata.
    */
  val rulesets: js.Array[typings.firebaseAdmin.securityRulesMod.admin.securityRules.RulesetMetadata]
}

object RulesetMetadataList {
  @scala.inline
  def apply(
    rulesets: js.Array[typings.firebaseAdmin.securityRulesMod.admin.securityRules.RulesetMetadata],
    nextPageToken: String = null
  ): RulesetMetadataList = {
    val __obj = js.Dynamic.literal(rulesets = rulesets.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesetMetadataList]
  }
}

