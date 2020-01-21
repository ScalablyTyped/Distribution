package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredQuery extends js.Object {
  var endAt: js.UndefOr[Cursor] = js.undefined
  var from: js.UndefOr[js.Array[CollectionSelector]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[js.Array[Order]] = js.undefined
  var select: js.UndefOr[Projection] = js.undefined
  var startAt: js.UndefOr[Cursor] = js.undefined
  var where: js.UndefOr[Filter] = js.undefined
}

object StructuredQuery {
  @scala.inline
  def apply(
    endAt: Cursor = null,
    from: js.Array[CollectionSelector] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    orderBy: js.Array[Order] = null,
    select: Projection = null,
    startAt: Cursor = null,
    where: Filter = null
  ): StructuredQuery = {
    val __obj = js.Dynamic.literal()
    if (endAt != null) __obj.updateDynamic("endAt")(endAt.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredQuery]
  }
}

