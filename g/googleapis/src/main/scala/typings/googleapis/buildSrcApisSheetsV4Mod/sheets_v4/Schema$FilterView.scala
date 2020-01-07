package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter view.
  */
@js.native
trait Schema$FilterView extends js.Object {
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[Schema$FilterCriteria]] = js.native
  /**
    * The ID of the filter view.
    */
  var filterViewId: js.UndefOr[Double] = js.native
  /**
    * The named range this filter view is backed by, if any.  When writing,
    * only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The range this filter view covers.  When writing, only one of range or
    * named_range_id may be set.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[Schema$SortSpec]] = js.native
  /**
    * The name of the filter view.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$FilterView {
  @scala.inline
  def apply(
    criteria: StringDictionary[Schema$FilterCriteria] = null,
    filterViewId: Int | Double = null,
    namedRangeId: String = null,
    range: Schema$GridRange = null,
    sortSpecs: js.Array[Schema$SortSpec] = null,
    title: String = null
  ): Schema$FilterView = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (filterViewId != null) __obj.updateDynamic("filterViewId")(filterViewId.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FilterView]
  }
}

