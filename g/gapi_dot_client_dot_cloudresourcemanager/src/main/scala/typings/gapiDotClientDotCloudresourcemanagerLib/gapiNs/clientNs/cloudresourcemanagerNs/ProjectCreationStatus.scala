package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectCreationStatus extends js.Object {
  /** Creation time of the project creation workflow. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True if the project can be retrieved using GetProject. No other operations
    * on the project are guaranteed to work until the project creation is
    * complete.
    */
  var gettable: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the project creation process is complete. */
  var ready: js.UndefOr[scala.Boolean] = js.undefined
}

object ProjectCreationStatus {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    gettable: js.UndefOr[scala.Boolean] = js.undefined,
    ready: js.UndefOr[scala.Boolean] = js.undefined
  ): ProjectCreationStatus = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (!js.isUndefined(gettable)) __obj.updateDynamic("gettable")(gettable)
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[ProjectCreationStatus]
  }
}

