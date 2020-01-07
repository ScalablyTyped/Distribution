package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A report&#39;s metadata including the URL from which the report itself can
  * be downloaded.
  */
@js.native
trait Schema$Report extends js.Object {
  /**
    * The date/time when this report was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The URL from which the report can be downloaded (max. 1000 characters).
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * The end of the time period that the report instance covers. The value is
    * exclusive.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The server-generated ID of the report.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The date/time when the job this report belongs to will expire/expired.
    */
  var jobExpireTime: js.UndefOr[String] = js.native
  /**
    * The ID of the job that created this report.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The start of the time period that the report instance covers. The value
    * is inclusive.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$Report {
  @scala.inline
  def apply(
    createTime: String = null,
    downloadUrl: String = null,
    endTime: String = null,
    id: String = null,
    jobExpireTime: String = null,
    jobId: String = null,
    startTime: String = null
  ): Schema$Report = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobExpireTime != null) __obj.updateDynamic("jobExpireTime")(jobExpireTime.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Report]
  }
}

