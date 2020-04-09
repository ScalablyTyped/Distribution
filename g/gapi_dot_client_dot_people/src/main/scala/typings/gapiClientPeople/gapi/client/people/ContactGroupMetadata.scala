package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupMetadata extends js.Object {
  /**
    * Output only. True if the contact group resource has been deleted. Populated only for
    * [`ListContactGroups`](/people/api/rest/v1/contactgroups/list) requests
    * that include a sync token.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /** Output only. The time the group was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}

object ContactGroupMetadata {
  @scala.inline
  def apply(deleted: js.UndefOr[Boolean] = js.undefined, updateTime: String = null): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactGroupMetadata]
  }
}

