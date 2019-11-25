package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  /**
    * @default 'dynatable'
    */
  var dynatable: js.UndefOr[String] = js.undefined
  /**
    * @default 'offset'
    */
  var offset: js.UndefOr[String] = js.undefined
  /**
    * @default 'page'
    */
  var page: js.UndefOr[String] = js.undefined
  /**
    * @default 'perPage'
    */
  var perPage: js.UndefOr[String] = js.undefined
  /**
    * @default 'queries'
    */
  var queries: js.UndefOr[String] = js.undefined
  /**
    * @default 'queryRecordCount'
    */
  var queryRecordCount: js.UndefOr[String] = js.undefined
  /**
    * @default null
    */
  var record: js.UndefOr[js.Object] = js.undefined
  /**
    * @default 'records'
    */
  var records: js.UndefOr[String] = js.undefined
  /**
    * @default 'sorts'
    */
  var sorts: js.UndefOr[String] = js.undefined
  /**
    * @default 'totalRecordCount'
    */
  var totalRecordCount: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    dynatable: String = null,
    offset: String = null,
    page: String = null,
    perPage: String = null,
    queries: String = null,
    queryRecordCount: String = null,
    record: js.Object = null,
    records: String = null,
    sorts: String = null,
    totalRecordCount: String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (dynatable != null) __obj.updateDynamic("dynatable")(dynatable.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (perPage != null) __obj.updateDynamic("perPage")(perPage.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (queryRecordCount != null) __obj.updateDynamic("queryRecordCount")(queryRecordCount.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (sorts != null) __obj.updateDynamic("sorts")(sorts.asInstanceOf[js.Any])
    if (totalRecordCount != null) __obj.updateDynamic("totalRecordCount")(totalRecordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

