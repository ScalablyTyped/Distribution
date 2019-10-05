package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /** A creativeAssets[].id. This should refer to one of the parent assets in this creative. This is a required field. */
  var assetId: js.UndefOr[String] = js.undefined
  /** A user-friendly name for this rule. This is a required field. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A targeting template ID. The targeting from the targeting template will be used to determine whether this asset should be served. This is a required
    * field.
    */
  var targetingTemplateId: js.UndefOr[String] = js.undefined
}

object Rule {
  @scala.inline
  def apply(assetId: String = null, name: String = null, targetingTemplateId: String = null): Rule = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId)
    __obj.asInstanceOf[Rule]
  }
}

