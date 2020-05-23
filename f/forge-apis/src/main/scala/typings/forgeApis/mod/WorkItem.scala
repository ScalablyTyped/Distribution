package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItem extends js.Object {
  var ActivityId: String
  var Arguments: js.Object
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  var Id: String
  var Status: js.UndefOr[String] = js.undefined
  var StatusDetail: js.UndefOr[js.Object] = js.undefined
  var Timestamp: js.UndefOr[String] = js.undefined
  var Version: js.UndefOr[Double] = js.undefined
}

object WorkItem {
  @scala.inline
  def apply(
    ActivityId: String,
    Arguments: js.Object,
    Id: String,
    AvailabilityZone: String = null,
    Status: String = null,
    StatusDetail: js.Object = null,
    Timestamp: String = null,
    Version: js.UndefOr[Double] = js.undefined
  ): WorkItem = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], Arguments = Arguments.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetail != null) __obj.updateDynamic("StatusDetail")(StatusDetail.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
}

