package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoUpgradeOptions extends js.Object {
  /**
    * [Output only] This field is set when upgrades are about to commence
    * with the approximate start time for the upgrades, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var autoUpgradeStartTime: js.UndefOr[String] = js.native
  /**
    * [Output only] This field is set when upgrades are about to commence
    * with the description of the upgrade.
    */
  var description: js.UndefOr[String] = js.native
}

object AutoUpgradeOptions {
  @scala.inline
  def apply(): AutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoUpgradeOptions]
  }
  @scala.inline
  implicit class AutoUpgradeOptionsOps[Self <: AutoUpgradeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoUpgradeStartTime(value: String): Self = this.set("autoUpgradeStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpgradeStartTime: Self = this.set("autoUpgradeStartTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

