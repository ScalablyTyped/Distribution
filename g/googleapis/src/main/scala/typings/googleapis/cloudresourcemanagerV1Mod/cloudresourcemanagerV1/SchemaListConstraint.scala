package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Constraint` that allows or disallows a list of string values, which are
  * configured by an Organization&#39;s policy administrator with a `Policy`.
  */
@js.native
trait SchemaListConstraint extends js.Object {
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Constraint`.
    */
  var suggestedValue: js.UndefOr[String] = js.native
  /**
    * Indicates whether subtrees of Cloud Resource Manager resource hierarchy
    * can be used in `Policy.allowed_values` and `Policy.denied_values`. For
    * example, `&quot;under:folders/123&quot;` would match any resource under
    * the &#39;folders/123&#39; folder.
    */
  var supportsUnder: js.UndefOr[Boolean] = js.native
}

object SchemaListConstraint {
  @scala.inline
  def apply(suggestedValue: String = null, supportsUnder: js.UndefOr[Boolean] = js.undefined): SchemaListConstraint = {
    val __obj = js.Dynamic.literal()
    if (suggestedValue != null) __obj.updateDynamic("suggestedValue")(suggestedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsUnder)) __obj.updateDynamic("supportsUnder")(supportsUnder.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListConstraint]
  }
}

