package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sort order associated with a specific column or row.
  */
@js.native
trait Schema$SortSpec extends js.Object {
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double] = js.native
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object Schema$SortSpec {
  @scala.inline
  def apply(dimensionIndex: Int | Double = null, sortOrder: String = null): Schema$SortSpec = {
    val __obj = js.Dynamic.literal()
    if (dimensionIndex != null) __obj.updateDynamic("dimensionIndex")(dimensionIndex.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SortSpec]
  }
}

