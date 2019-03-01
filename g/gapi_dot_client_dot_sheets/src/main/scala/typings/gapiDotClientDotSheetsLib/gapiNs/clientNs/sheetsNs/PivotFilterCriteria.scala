package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFilterCriteria extends js.Object {
  /** Values that should be included.  Values not listed here are excluded. */
  var visibleValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PivotFilterCriteria {
  @scala.inline
  def apply(visibleValues: js.Array[java.lang.String] = null): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (visibleValues != null) __obj.updateDynamic("visibleValues")(visibleValues)
    __obj.asInstanceOf[PivotFilterCriteria]
  }
}

