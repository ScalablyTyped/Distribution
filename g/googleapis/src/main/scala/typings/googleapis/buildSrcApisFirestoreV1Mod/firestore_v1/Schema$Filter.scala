package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter.
  */
@js.native
trait Schema$Filter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[Schema$CompositeFilter] = js.native
  /**
    * A filter on a document field.
    */
  var fieldFilter: js.UndefOr[Schema$FieldFilter] = js.native
  /**
    * A filter that takes exactly one argument.
    */
  var unaryFilter: js.UndefOr[Schema$UnaryFilter] = js.native
}

object Schema$Filter {
  @scala.inline
  def apply(
    compositeFilter: Schema$CompositeFilter = null,
    fieldFilter: Schema$FieldFilter = null,
    unaryFilter: Schema$UnaryFilter = null
  ): Schema$Filter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (fieldFilter != null) __obj.updateDynamic("fieldFilter")(fieldFilter.asInstanceOf[js.Any])
    if (unaryFilter != null) __obj.updateDynamic("unaryFilter")(unaryFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Filter]
  }
}

