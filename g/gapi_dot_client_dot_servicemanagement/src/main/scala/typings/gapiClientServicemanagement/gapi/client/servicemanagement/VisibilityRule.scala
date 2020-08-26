package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityRule extends js.Object {
  /**
    * A comma-separated list of visibility labels that apply to the `selector`.
    * Any of the listed labels can be used to grant the visibility.
    *
    * If a rule has multiple labels, removing one of the labels but not all of
    * them can break clients.
    *
    * Example:
    *
    * visibility:
    * rules:
    * - selector: google.calendar.Calendar.EnhancedSearch
    * restriction: GOOGLE_INTERNAL, TRUSTED_TESTER
    *
    * Removing GOOGLE_INTERNAL from this restriction will break clients that
    * rely on this method and only had access to it through GOOGLE_INTERNAL.
    */
  var restriction: js.UndefOr[String] = js.native
  /**
    * Selects methods, messages, fields, enums, etc. to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object VisibilityRule {
  @scala.inline
  def apply(): VisibilityRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibilityRule]
  }
  @scala.inline
  implicit class VisibilityRuleOps[Self <: VisibilityRule] (val x: Self) extends AnyVal {
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
    def setRestriction(value: String): Self = this.set("restriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestriction: Self = this.set("restriction", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

