package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidDevicePolicyConfig extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#androidDevicePolicyConfig". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The state of Android Device Policy. "enabled" indicates that Android Device Policy is enabled for the enterprise and the EMM is allowed to manage
    * devices with Android Device Policy, while "disabled" means that it cannot.
    */
  var state: js.UndefOr[String] = js.undefined
}

object AndroidDevicePolicyConfig {
  @scala.inline
  def apply(kind: String = null, state: String = null): AndroidDevicePolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[AndroidDevicePolicyConfig]
  }
}

