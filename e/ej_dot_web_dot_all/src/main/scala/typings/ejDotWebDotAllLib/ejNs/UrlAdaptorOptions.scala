package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlAdaptorOptions extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var batch: js.UndefOr[java.lang.String] = js.undefined
  var batchChangeSetContentType: js.UndefOr[java.lang.String] = js.undefined
  var batchContent: js.UndefOr[java.lang.String] = js.undefined
  var batchPre: js.UndefOr[java.lang.String] = js.undefined
  var changeSet: js.UndefOr[java.lang.String] = js.undefined
  var changeSetContent: js.UndefOr[java.lang.String] = js.undefined
  var contentId: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[java.lang.String] = js.undefined
  var expand: js.UndefOr[java.lang.String] = js.undefined
  var multipartAccept: js.UndefOr[java.lang.String] = js.undefined
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[java.lang.String] = js.undefined
  var skip: js.UndefOr[java.lang.String] = js.undefined
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  var take: js.UndefOr[java.lang.String] = js.undefined
  var where: js.UndefOr[java.lang.String] = js.undefined
}

object UrlAdaptorOptions {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    batch: java.lang.String = null,
    batchChangeSetContentType: java.lang.String = null,
    batchContent: java.lang.String = null,
    batchPre: java.lang.String = null,
    changeSet: java.lang.String = null,
    changeSetContent: java.lang.String = null,
    contentId: java.lang.String = null,
    count: java.lang.String = null,
    expand: java.lang.String = null,
    multipartAccept: java.lang.String = null,
    requestType: java.lang.String = null,
    select: java.lang.String = null,
    skip: java.lang.String = null,
    sortBy: java.lang.String = null,
    take: java.lang.String = null,
    where: java.lang.String = null
  ): UrlAdaptorOptions = {
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
    if (select != null) __obj.updateDynamic("select")(select)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (take != null) __obj.updateDynamic("take")(take)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[UrlAdaptorOptions]
  }
}

