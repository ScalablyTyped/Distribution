package typings.googleCloudTasks.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait CloudTasksConfig extends js.Object {
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var libName: js.UndefOr[String] = js.undefined
  var libVersion: js.UndefOr[String] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
}

object CloudTasksConfig {
  @scala.inline
  def apply(
    autoRetry: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    libName: String = null,
    libVersion: String = null,
    maxRetries: Int | Double = null,
    promise: PromiseConstructor = null
  ): CloudTasksConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (libName != null) __obj.updateDynamic("libName")(libName.asInstanceOf[js.Any])
    if (libVersion != null) __obj.updateDynamic("libVersion")(libVersion.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudTasksConfig]
  }
}

