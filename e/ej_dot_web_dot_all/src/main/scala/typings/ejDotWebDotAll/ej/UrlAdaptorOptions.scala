package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlAdaptorOptions extends js.Object {
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
  var select: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[String] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var take: js.UndefOr[String] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object UrlAdaptorOptions {
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
    select: String = null,
    skip: String = null,
    sortBy: String = null,
    take: String = null,
    where: String = null
  ): UrlAdaptorOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (batchChangeSetContentType != null) __obj.updateDynamic("batchChangeSetContentType")(batchChangeSetContentType.asInstanceOf[js.Any])
    if (batchContent != null) __obj.updateDynamic("batchContent")(batchContent.asInstanceOf[js.Any])
    if (batchPre != null) __obj.updateDynamic("batchPre")(batchPre.asInstanceOf[js.Any])
    if (changeSet != null) __obj.updateDynamic("changeSet")(changeSet.asInstanceOf[js.Any])
    if (changeSetContent != null) __obj.updateDynamic("changeSetContent")(changeSetContent.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (multipartAccept != null) __obj.updateDynamic("multipartAccept")(multipartAccept.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlAdaptorOptions]
  }
}

