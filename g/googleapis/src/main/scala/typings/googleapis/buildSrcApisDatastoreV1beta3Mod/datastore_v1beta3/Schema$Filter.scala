package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A holder for any type of filter.
  */
@js.native
trait Schema$Filter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[Schema$CompositeFilter] = js.native
  /**
    * A filter on a property.
    */
  var propertyFilter: js.UndefOr[Schema$PropertyFilter] = js.native
}

object Schema$Filter {
  @scala.inline
  def apply(compositeFilter: Schema$CompositeFilter = null, propertyFilter: Schema$PropertyFilter = null): Schema$Filter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (propertyFilter != null) __obj.updateDynamic("propertyFilter")(propertyFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Filter]
  }
}

