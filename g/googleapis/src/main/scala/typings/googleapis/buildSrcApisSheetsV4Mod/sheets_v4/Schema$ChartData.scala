package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data included in a domain or series.
  */
@js.native
trait Schema$ChartData extends js.Object {
  /**
    * The source ranges of the data.
    */
  var sourceRange: js.UndefOr[Schema$ChartSourceRange] = js.native
}

object Schema$ChartData {
  @scala.inline
  def apply(sourceRange: Schema$ChartSourceRange = null): Schema$ChartData = {
    val __obj = js.Dynamic.literal()
    if (sourceRange != null) __obj.updateDynamic("sourceRange")(sourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChartData]
  }
}

