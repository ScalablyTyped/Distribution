package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidDevicePolicyConfig extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#androidDevicePolicyConfig". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The state of Android Device Policy. "enabled" indicates that Android Device Policy is enabled for the enterprise and the EMM is allowed to manage
    * devices with Android Device Policy, while "disabled" means that it cannot.
    */
  var state: js.UndefOr[String] = js.native
}

object AndroidDevicePolicyConfig {
  @scala.inline
  def apply(): AndroidDevicePolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDevicePolicyConfig]
  }
  @scala.inline
  implicit class AndroidDevicePolicyConfigOps[Self <: AndroidDevicePolicyConfig] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

