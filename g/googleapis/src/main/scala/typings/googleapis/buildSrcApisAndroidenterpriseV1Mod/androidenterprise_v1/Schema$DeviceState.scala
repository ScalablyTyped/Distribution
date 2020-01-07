package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of a user&#39;s device, as accessed by the getState and setState
  * methods on device resources.
  */
@js.native
trait Schema$DeviceState extends js.Object {
  /**
    * The state of the Google account on the device. &quot;enabled&quot;
    * indicates that the Google account on the device can be used to access
    * Google services (including Google Play), while &quot;disabled&quot; means
    * that it cannot. A new device is initially in the &quot;disabled&quot;
    * state.
    */
  var accountState: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#deviceState&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DeviceState {
  @scala.inline
  def apply(accountState: String = null, kind: String = null): Schema$DeviceState = {
    val __obj = js.Dynamic.literal()
    if (accountState != null) __obj.updateDynamic("accountState")(accountState.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceState]
  }
}

