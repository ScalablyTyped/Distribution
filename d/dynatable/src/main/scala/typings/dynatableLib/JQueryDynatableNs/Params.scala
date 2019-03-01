package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /**
    * @default 'dynatable'
    */
  var dynatable: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'offset'
    */
  var offset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'page'
    */
  var page: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'perPage'
    */
  var perPage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'queries'
    */
  var queries: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'queryRecordCount'
    */
  var queryRecordCount: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default null
    */
  var record: js.UndefOr[js.Object] = js.undefined
  /**
    * @default 'records'
    */
  var records: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'sorts'
    */
  var sorts: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 'totalRecordCount'
    */
  var totalRecordCount: js.UndefOr[java.lang.String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    dynatable: java.lang.String = null,
    offset: java.lang.String = null,
    page: java.lang.String = null,
    perPage: java.lang.String = null,
    queries: java.lang.String = null,
    queryRecordCount: java.lang.String = null,
    record: js.Object = null,
    records: java.lang.String = null,
    sorts: java.lang.String = null,
    totalRecordCount: java.lang.String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (dynatable != null) __obj.updateDynamic("dynatable")(dynatable)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (page != null) __obj.updateDynamic("page")(page)
    if (perPage != null) __obj.updateDynamic("perPage")(perPage)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (queryRecordCount != null) __obj.updateDynamic("queryRecordCount")(queryRecordCount)
    if (record != null) __obj.updateDynamic("record")(record)
    if (records != null) __obj.updateDynamic("records")(records)
    if (sorts != null) __obj.updateDynamic("sorts")(sorts)
    if (totalRecordCount != null) __obj.updateDynamic("totalRecordCount")(totalRecordCount)
    __obj.asInstanceOf[Params]
  }
}

