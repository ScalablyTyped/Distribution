package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a contact group.
  */
@js.native
trait Schema$ContactGroupMetadata extends js.Object {
  /**
    * True if the contact group resource has been deleted. Populated only for
    * [`ListContactGroups`](/people/api/rest/v1/contactgroups/list) requests
    * that include a sync token.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The time the group was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$ContactGroupMetadata {
  @scala.inline
  def apply(deleted: js.UndefOr[Boolean] = js.undefined, updateTime: String = null): Schema$ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContactGroupMetadata]
  }
}

