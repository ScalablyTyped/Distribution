package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigChange extends js.Object {
  /**
    * Collection of advice provided for this change, useful for determining the
    * possible impact of this change.
    */
  var advices: js.UndefOr[js.Array[Advice]] = js.undefined
  /** The type for this change, either ADDED, REMOVED, or MODIFIED. */
  var changeType: js.UndefOr[String] = js.undefined
  /**
    * Object hierarchy path to the change, with levels separated by a '.'
    * character. For repeated fields, an applicable unique identifier field is
    * used for the index (usually selector, name, or id). For maps, the term
    * 'key' is used. If the field has no unique identifier, the numeric index
    * is used.
    * Examples:
    * - visibility.rules[selector=="google.LibraryService.CreateBook"].restriction
    * - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value
    * - logging.producer_destinations[0]
    */
  var element: js.UndefOr[String] = js.undefined
  /**
    * Value of the changed object in the new Service configuration,
    * in JSON format. This field will not be populated if ChangeType == REMOVED.
    */
  var newValue: js.UndefOr[String] = js.undefined
  /**
    * Value of the changed object in the old Service configuration,
    * in JSON format. This field will not be populated if ChangeType == ADDED.
    */
  var oldValue: js.UndefOr[String] = js.undefined
}

object ConfigChange {
  @scala.inline
  def apply(
    advices: js.Array[Advice] = null,
    changeType: String = null,
    element: String = null,
    newValue: String = null,
    oldValue: String = null
  ): ConfigChange = {
    val __obj = js.Dynamic.literal()
    if (advices != null) __obj.updateDynamic("advices")(advices.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigChange]
  }
}

