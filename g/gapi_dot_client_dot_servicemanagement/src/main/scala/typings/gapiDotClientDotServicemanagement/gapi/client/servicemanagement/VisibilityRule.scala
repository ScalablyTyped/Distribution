package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var restriction: js.UndefOr[String] = js.undefined
  /**
    * Selects methods, messages, fields, enums, etc. to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}

object VisibilityRule {
  @scala.inline
  def apply(restriction: String = null, selector: String = null): VisibilityRule = {
    val __obj = js.Dynamic.literal()
    if (restriction != null) __obj.updateDynamic("restriction")(restriction)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[VisibilityRule]
  }
}

