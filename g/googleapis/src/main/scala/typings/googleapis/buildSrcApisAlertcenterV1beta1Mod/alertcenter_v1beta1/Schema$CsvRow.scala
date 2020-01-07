package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a single data row in a CSV file.
  */
@js.native
trait Schema$CsvRow extends js.Object {
  /**
    * The data entries in a CSV file row, as a string array rather than a
    * single comma-separated string.
    */
  var entries: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CsvRow {
  @scala.inline
  def apply(entries: js.Array[String] = null): Schema$CsvRow = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CsvRow]
  }
}

