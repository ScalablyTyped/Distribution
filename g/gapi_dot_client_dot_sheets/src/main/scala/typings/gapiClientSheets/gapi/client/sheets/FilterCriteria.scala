package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown.
    * (This does not override hidden_values -- if a value is listed there,
    * it will still be hidden.)
    */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  /** Values that should be hidden. */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The background fill color to filter by; only cells with this fill color are
    * shown. Mutually exclusive with all other filter criteria. Requests to set
    * this field will fail with a 400 error if any other filter criteria field is
    * set.
    */
  var visibleBackgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The text color to filter by; only cells with this text color are shown.
    * Mutually exclusive with all other filter criteria. Requests to set this
    * field will fail with a 400 error if any other filter criteria field is set.
    */
  var visibleForegroundColor: js.UndefOr[Color] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    condition: BooleanCondition = null,
    hiddenValues: js.Array[String] = null,
    visibleBackgroundColor: Color = null,
    visibleForegroundColor: Color = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (hiddenValues != null) __obj.updateDynamic("hiddenValues")(hiddenValues.asInstanceOf[js.Any])
    if (visibleBackgroundColor != null) __obj.updateDynamic("visibleBackgroundColor")(visibleBackgroundColor.asInstanceOf[js.Any])
    if (visibleForegroundColor != null) __obj.updateDynamic("visibleForegroundColor")(visibleForegroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

