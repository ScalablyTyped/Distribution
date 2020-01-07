package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Criteria for showing/hiding rows in a pivot table.
  */
@js.native
trait Schema$PivotFilterCriteria extends js.Object {
  /**
    * Values that should be included.  Values not listed here are excluded.
    */
  var visibleValues: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PivotFilterCriteria {
  @scala.inline
  def apply(visibleValues: js.Array[String] = null): Schema$PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (visibleValues != null) __obj.updateDynamic("visibleValues")(visibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PivotFilterCriteria]
  }
}

