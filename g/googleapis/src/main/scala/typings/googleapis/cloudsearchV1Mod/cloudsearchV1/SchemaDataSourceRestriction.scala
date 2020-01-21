package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Restriction on Datasource.
  */
@js.native
trait SchemaDataSourceRestriction extends js.Object {
  /**
    * Filter options restricting the results. If multiple filters are present,
    * they are grouped by object type before joining. Filters with the same
    * object type are joined conjunctively, then the resulting expressions are
    * joined disjunctively.  The maximum number of elements is 20.
    */
  var filterOptions: js.UndefOr[js.Array[SchemaFilterOptions]] = js.native
  /**
    * The source of restriction.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaDataSourceRestriction {
  @scala.inline
  def apply(filterOptions: js.Array[SchemaFilterOptions] = null, source: SchemaSource = null): SchemaDataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataSourceRestriction]
  }
}

