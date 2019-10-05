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
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates)
    if (count != null) __obj.updateDynamic("count")(count)
    if (from != null) __obj.updateDynamic("from")(from)
    if (group != null) __obj.updateDynamic("group")(group)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (search != null) __obj.updateDynamic("search")(search)
    if (select != null) __obj.updateDynamic("select")(select)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (take != null) __obj.updateDynamic("take")(take)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[AdaptorOptions]
  }
}

