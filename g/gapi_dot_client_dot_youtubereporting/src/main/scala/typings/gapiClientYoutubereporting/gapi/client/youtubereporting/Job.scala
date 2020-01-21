package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /** The creation date/time of the job. */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * The date/time when this job will expire/expired. After a job expired, no
    * new reports are generated.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  /** The server-generated ID of the job (max. 40 characters). */
  var id: js.UndefOr[String] = js.undefined
  /** The name of the job (max. 100 characters). */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The type of reports this job creates. Corresponds to the ID of a
    * ReportType.
    */
  var reportTypeId: js.UndefOr[String] = js.undefined
  /**
    * True if this a system-managed job that cannot be modified by the user;
    * otherwise false.
    */
  var systemManaged: js.UndefOr[Boolean] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    createTime: String = null,
    expireTime: String = null,
    id: String = null,
    name: String = null,
    reportTypeId: String = null,
    systemManaged: js.UndefOr[Boolean] = js.undefined
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reportTypeId != null) __obj.updateDynamic("reportTypeId")(reportTypeId.asInstanceOf[js.Any])
    if (!js.isUndefined(systemManaged)) __obj.updateDynamic("systemManaged")(systemManaged.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

