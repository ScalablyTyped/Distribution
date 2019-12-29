package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var compositeFilter: js.UndefOr[CompositeFilter] = js.undefined
  var fieldFilter: js.UndefOr[FieldFilter] = js.undefined
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
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (fieldFilter != null) __obj.updateDynamic("fieldFilter")(fieldFilter.asInstanceOf[js.Any])
    if (unaryFilter != null) __obj.updateDynamic("unaryFilter")(unaryFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

