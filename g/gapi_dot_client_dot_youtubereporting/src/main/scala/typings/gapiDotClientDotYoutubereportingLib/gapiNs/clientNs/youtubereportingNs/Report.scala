package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** The date/time when this report was created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The URL from which the report can be downloaded (max. 1000 characters). */
  var downloadUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The end of the time period that the report instance covers. The value is
    * exclusive.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated ID of the report. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The date/time when the job this report belongs to will expire/expired. */
  var jobExpireTime: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the job that created this report. */
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The start of the time period that the report instance covers. The value is
    * inclusive.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    downloadUrl: java.lang.String = null,
    endTime: java.lang.String = null,
    id: java.lang.String = null,
    jobExpireTime: java.lang.String = null,
    jobId: java.lang.String = null,
    startTime: java.lang.String = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (jobExpireTime != null) __obj.updateDynamic("jobExpireTime")(jobExpireTime)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[Report]
  }
}

