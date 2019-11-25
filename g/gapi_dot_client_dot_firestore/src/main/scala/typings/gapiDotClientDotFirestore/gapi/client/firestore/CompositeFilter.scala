package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeFilter extends js.Object {
  /**
    * The list of filters to combine.
    * Must contain at least one filter.
    */
  var filters: js.UndefOr[js.Array[Filter]] = js.undefined
  /** The operator for combining multiple filters. */
  var op: js.UndefOr[String] = js.undefined
}

object CompositeFilter {
  @scala.inline
  def apply(filters: js.Array[Filter] = null, op: String = null): CompositeFilter = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeFilter]
  }
}

