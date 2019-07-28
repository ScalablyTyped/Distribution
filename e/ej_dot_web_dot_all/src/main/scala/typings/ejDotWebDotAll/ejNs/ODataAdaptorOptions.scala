package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODataAdaptorOptions extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var batch: js.UndefOr[String] = js.undefined
  var batchChangeSetContentType: js.UndefOr[String] = js.undefined
  var batchContent: js.UndefOr[String] = js.undefined
  var batchPre: js.UndefOr[String] = js.undefined
  var changeSet: js.UndefOr[String] = js.undefined
  var changeSetContent: js.UndefOr[String] = js.undefined
  var contentId: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var multipartAccept: js.UndefOr[String] = js.undefined
  var requestType: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[String] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var take: js.UndefOr[String] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object ODataAdaptorOptions {
  @scala.inline
  def apply(
    accept: String = null,
    batch: String = null,
    batchChangeSetContentType: String = null,
    batchContent: String = null,
    batchPre: String = null,
    changeSet: String = null,
    changeSetContent: String = null,
    contentId: String = null,
    count: String = null,
    expand: String = null,
    multipartAccept: String = null,
    requestType: String = null,
    search: String = null,
    select: String = null,
    skip: String = null,
    sortBy: String = null,
    take: String = null,
    where: String = null
  ): ODataAdaptorOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (batchChangeSetContentType != null) __obj.updateDynamic("batchChangeSetContentType")(batchChangeSetContentType)
    if (batchContent != null) __obj.updateDynamic("batchContent")(batchContent)
    if (batchPre != null) __obj.updateDynamic("batchPre")(batchPre)
    if (changeSet != null) __obj.updateDynamic("changeSet")(changeSet)
    if (changeSetContent != null) __obj.updateDynamic("changeSetContent")(changeSetContent)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (count != null) __obj.updateDynamic("count")(count)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (multipartAccept != null) __obj.updateDynamic("multipartAccept")(multipartAccept)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (search != null) __obj.updateDynamic("search")(search)
    if (select != null) __obj.updateDynamic("select")(select)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (take != null) __obj.updateDynamic("take")(take)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[ODataAdaptorOptions]
  }
}

