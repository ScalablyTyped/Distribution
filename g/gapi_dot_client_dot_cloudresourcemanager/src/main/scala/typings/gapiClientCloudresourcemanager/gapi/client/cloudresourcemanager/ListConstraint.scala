package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConstraint extends js.Object {
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Constraint`.
    */
  var suggestedValue: js.UndefOr[String] = js.native
}

object ListConstraint {
  @scala.inline
  def apply(): ListConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConstraint]
  }
  @scala.inline
  implicit class ListConstraintOps[Self <: ListConstraint] (val x: Self) extends AnyVal {
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
  }
  
}

