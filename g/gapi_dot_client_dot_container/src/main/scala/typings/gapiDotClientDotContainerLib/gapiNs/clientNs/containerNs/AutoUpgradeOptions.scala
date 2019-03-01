package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoUpgradeOptions extends js.Object {
  /**
    * [Output only] This field is set when upgrades are about to commence
    * with the approximate start time for the upgrades, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var autoUpgradeStartTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] This field is set when upgrades are about to commence
    * with the description of the upgrade.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object AutoUpgradeOptions {
  @scala.inline
  def apply(autoUpgradeStartTime: java.lang.String = null, description: java.lang.String = null): AutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    if (autoUpgradeStartTime != null) __obj.updateDynamic("autoUpgradeStartTime")(autoUpgradeStartTime)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[AutoUpgradeOptions]
  }
}

