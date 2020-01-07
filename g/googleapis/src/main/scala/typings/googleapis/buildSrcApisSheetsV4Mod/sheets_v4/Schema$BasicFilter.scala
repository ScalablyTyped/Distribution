package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default filter associated with a sheet.
  */
@js.native
trait Schema$BasicFilter extends js.Object {
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[Schema$FilterCriteria]] = js.native
  /**
    * The range the filter covers.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[Schema$SortSpec]] = js.native
}

object Schema$BasicFilter {
  @scala.inline
  def apply(
    criteria: StringDictionary[Schema$FilterCriteria] = null,
    range: Schema$GridRange = null,
    sortSpecs: js.Array[Schema$SortSpec] = null
  ): Schema$BasicFilter = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BasicFilter]
  }
}

