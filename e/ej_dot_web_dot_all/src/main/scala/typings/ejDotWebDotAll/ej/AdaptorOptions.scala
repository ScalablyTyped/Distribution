package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdaptorOptions extends js.Object {
  var aggregates: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var requestType: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[String] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var take: js.UndefOr[String] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object AdaptorOptions {
  @scala.inline
  def apply(
    aggregates: String = null,
    count: String = null,
    from: String = null,
    group: String = null,
    requestType: String = null,
    search: String = null,
    select: String = null,
    skip: String = null,
    sortBy: String = null,
    take: String = null,
    where: String = null
  ): AdaptorOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptorOptions]
  }
}

