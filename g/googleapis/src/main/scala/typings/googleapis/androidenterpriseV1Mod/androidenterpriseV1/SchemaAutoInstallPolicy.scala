package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAutoInstallPolicy extends js.Object {
  /**
    * The constraints for auto-installing the app. You can specify a maximum of
    * one constraint.
    */
  var autoInstallConstraint: js.UndefOr[js.Array[SchemaAutoInstallConstraint]] = js.native
  /**
    * The auto-install mode. If unset defaults to &quot;doNotAutoInstall&quot;.
    */
  var autoInstallMode: js.UndefOr[String] = js.native
  /**
    * The priority of the install, as an unsigned integer. A lower number means
    * higher priority.
    */
  var autoInstallPriority: js.UndefOr[Double] = js.native
  /**
    * The minimum version of the app. If a lower version of the app is
    * installed, then the app will be auto-updated according to the
    * auto-install constraints, instead of waiting for the regular auto-update.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
}

object SchemaAutoInstallPolicy {
  @scala.inline
  def apply(
    autoInstallConstraint: js.Array[SchemaAutoInstallConstraint] = null,
    autoInstallMode: String = null,
    autoInstallPriority: js.UndefOr[Double] = js.undefined,
    minimumVersionCode: js.UndefOr[Double] = js.undefined
  ): SchemaAutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    if (autoInstallConstraint != null) __obj.updateDynamic("autoInstallConstraint")(autoInstallConstraint.asInstanceOf[js.Any])
    if (autoInstallMode != null) __obj.updateDynamic("autoInstallMode")(autoInstallMode.asInstanceOf[js.Any])
    if (!js.isUndefined(autoInstallPriority)) __obj.updateDynamic("autoInstallPriority")(autoInstallPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumVersionCode)) __obj.updateDynamic("minimumVersionCode")(minimumVersionCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoInstallPolicy]
  }
}

