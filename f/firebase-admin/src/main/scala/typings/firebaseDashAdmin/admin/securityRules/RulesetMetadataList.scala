package typings.firebaseDashAdmin.admin.securityRules

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
  val rulesets: js.Array[RulesetMetadata]
}

object RulesetMetadataList {
  @scala.inline
  def apply(rulesets: js.Array[RulesetMetadata], nextPageToken: String = null): RulesetMetadataList = {
    val __obj = js.Dynamic.literal(rulesets = rulesets)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[RulesetMetadataList]
  }
}

