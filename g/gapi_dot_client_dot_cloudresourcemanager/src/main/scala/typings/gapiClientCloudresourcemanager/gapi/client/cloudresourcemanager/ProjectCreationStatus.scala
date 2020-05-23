package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectCreationStatus extends js.Object {
  /** Creation time of the project creation workflow. */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * True if the project can be retrieved using GetProject. No other operations
    * on the project are guaranteed to work until the project creation is
    * complete.
    */
  var gettable: js.UndefOr[Boolean] = js.undefined
  /** True if the project creation process is complete. */
  var ready: js.UndefOr[Boolean] = js.undefined
}

object ProjectCreationStatus {
  @scala.inline
  def apply(
    createTime: String = null,
    gettable: js.UndefOr[Boolean] = js.undefined,
    ready: js.UndefOr[Boolean] = js.undefined
  ): ProjectCreationStatus = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (!js.isUndefined(gettable)) __obj.updateDynamic("gettable")(gettable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectCreationStatus]
  }
}

