package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter that merges multiple other filters using the given operator.
  */
@js.native
trait Schema$CompositeFilter extends js.Object {
  /**
    * The list of filters to combine. Must contain at least one filter.
    */
  var filters: js.UndefOr[js.Array[Schema$Filter]] = js.native
  /**
    * The operator for combining multiple filters.
    */
  var op: js.UndefOr[String] = js.native
}

object Schema$CompositeFilter {
  @scala.inline
  def apply(filters: js.Array[Schema$Filter] = null, op: String = null): Schema$CompositeFilter = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompositeFilter]
  }
}

