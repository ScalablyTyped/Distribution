package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** A composite filter. */
  var compositeFilter: js.UndefOr[CompositeFilter] = js.undefined
  /** A filter on a document field. */
  var fieldFilter: js.UndefOr[FieldFilter] = js.undefined
  /** A filter that takes exactly one argument. */
  var unaryFilter: js.UndefOr[UnaryFilter] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    compositeFilter: CompositeFilter = null,
    fieldFilter: FieldFilter = null,
    unaryFilter: UnaryFilter = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter)
    if (fieldFilter != null) __obj.updateDynamic("fieldFilter")(fieldFilter)
    if (unaryFilter != null) __obj.updateDynamic("unaryFilter")(unaryFilter)
    __obj.asInstanceOf[Filter]
  }
}

