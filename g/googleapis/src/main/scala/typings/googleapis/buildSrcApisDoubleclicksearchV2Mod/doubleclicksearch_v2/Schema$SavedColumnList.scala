package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of saved columns. Advertisers create saved columns to report on
  * Floodlight activities, Google Analytics goals, or custom KPIs. To request
  * reports with saved columns, you&#39;ll need the saved column names that are
  * available from this list.
  */
@js.native
trait Schema$SavedColumnList extends js.Object {
  /**
    * The saved columns being requested.
    */
  var items: js.UndefOr[js.Array[Schema$SavedColumn]] = js.native
  /**
    * Identifies this as a SavedColumnList resource. Value: the fixed string
    * doubleclicksearch#savedColumnList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$SavedColumnList {
  @scala.inline
  def apply(items: js.Array[Schema$SavedColumn] = null, kind: String = null): Schema$SavedColumnList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SavedColumnList]
  }
}

