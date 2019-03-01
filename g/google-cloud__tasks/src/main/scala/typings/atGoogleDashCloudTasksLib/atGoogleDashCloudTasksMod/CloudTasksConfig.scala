package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait CloudTasksConfig extends js.Object {
  var autoRetry: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var libName: js.UndefOr[java.lang.String] = js.undefined
  var libVersion: js.UndefOr[java.lang.String] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
}

object CloudTasksConfig {
  @scala.inline
  def apply(
    autoRetry: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    libName: java.lang.String = null,
    libVersion: java.lang.String = null,
    maxRetries: scala.Int | scala.Double = null,
    promise: stdLib.PromiseConstructor = null
  ): CloudTasksConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry)
    if (key != null) __obj.updateDynamic("key")(key)
    if (libName != null) __obj.updateDynamic("libName")(libName)
    if (libVersion != null) __obj.updateDynamic("libVersion")(libVersion)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[CloudTasksConfig]
  }
}

