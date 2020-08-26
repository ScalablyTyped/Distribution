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
  def apply(): SchemaListConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConstraint]
  }
  @scala.inline
  implicit class SchemaListConstraintOps[Self <: SchemaListConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuggestedValue(value: String): Self = this.set("suggestedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedValue: Self = this.set("suggestedValue", js.undefined)
    @scala.inline
    def setSupportsUnder(value: Boolean): Self = this.set("supportsUnder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsUnder: Self = this.set("supportsUnder", js.undefined)
  }
  
}

