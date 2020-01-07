package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Restriction on Datasource.
  */
@js.native
trait Schema$DataSourceRestriction extends js.Object {
  /**
    * Filter options restricting the results. If multiple filters are present,
    * they are grouped by object type before joining. Filters with the same
    * object type are joined conjunctively, then the resulting expressions are
    * joined disjunctively.  The maximum number of elements is 20.
    */
  var filterOptions: js.UndefOr[js.Array[Schema$FilterOptions]] = js.native
  /**
    * The source of restriction.
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$DataSourceRestriction {
  @scala.inline
  def apply(filterOptions: js.Array[Schema$FilterOptions] = null, source: Schema$Source = null): Schema$DataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataSourceRestriction]
  }
}

