package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown.
    * (This does not override hiddenValues -- if a value is listed there,
    * it will still be hidden.)
    */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  /** Values that should be hidden. */
  var hiddenValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(condition: BooleanCondition = null, hiddenValues: js.Array[java.lang.String] = null): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (hiddenValues != null) __obj.updateDynamic("hiddenValues")(hiddenValues)
    __obj.asInstanceOf[FilterCriteria]
  }
}

