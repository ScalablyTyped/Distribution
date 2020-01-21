package typings.firebaseFirestore.specsSpecTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecQuery extends js.Object {
  var collectionGroup: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Array[SpecQueryFilter]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var limitType: js.UndefOr[SpecLimitType] = js.undefined
  var orderBys: js.UndefOr[js.Array[SpecQueryOrderBy]] = js.undefined
  var path: String
}

object SpecQuery {
  @scala.inline
  def apply(
    path: String,
    collectionGroup: String = null,
    filters: js.Array[SpecQueryFilter] = null,
    limit: Int | Double = null,
    limitType: SpecLimitType = null,
    orderBys: js.Array[SpecQueryOrderBy] = null
  ): SpecQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (collectionGroup != null) __obj.updateDynamic("collectionGroup")(collectionGroup.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (limitType != null) __obj.updateDynamic("limitType")(limitType.asInstanceOf[js.Any])
    if (orderBys != null) __obj.updateDynamic("orderBys")(orderBys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecQuery]
  }
}

