package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValueRegion extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object PivotValueRegion {
  @scala.inline
  def apply(values: js.Array[String] = null): PivotValueRegion = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotValueRegion]
  }
}

