package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdaptorOptions extends js.Object {
  var aggregates: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[java.lang.String] = js.undefined
  var skip: js.UndefOr[java.lang.String] = js.undefined
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  var take: js.UndefOr[java.lang.String] = js.undefined
  var where: js.UndefOr[java.lang.String] = js.undefined
}

object AdaptorOptions {
  @scala.inline
  def apply(
    aggregates: java.lang.String = null,
    count: java.lang.String = null,
    from: java.lang.String = null,
    group: java.lang.String = null,
    requestType: java.lang.String = null,
    search: java.lang.String = null,
    select: java.lang.String = null,
    skip: java.lang.String = null,
    sortBy: java.lang.String = null,
    take: java.lang.String = null,
    where: java.lang.String = null
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

