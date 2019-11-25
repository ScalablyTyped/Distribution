package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItem extends js.Object {
  var _arguments: js.Object
  var activityId: String
  var availabilityZone: js.UndefOr[String] = js.undefined
  var id: String
  var status: js.UndefOr[String] = js.undefined
  var statusDetail: js.UndefOr[js.Object] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object WorkItem {
  @scala.inline
  def apply(
    _arguments: js.Object,
    activityId: String,
    id: String,
    availabilityZone: String = null,
    status: String = null,
    statusDetail: js.Object = null,
    timestamp: String = null,
    version: Int | Double = null
  ): WorkItem = {
    val __obj = js.Dynamic.literal(_arguments = _arguments.asInstanceOf[js.Any], activityId = activityId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetail != null) __obj.updateDynamic("statusDetail")(statusDetail.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
}

