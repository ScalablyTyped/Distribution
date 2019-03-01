package typings
package dialogflowLib.dialogflowMod.gaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  var backoffSettings: BackoffSettings
  var retryCodes: js.Array[java.lang.String]
}

object RetryOptions {
  @scala.inline
  def apply(backoffSettings: BackoffSettings, retryCodes: js.Array[java.lang.String]): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backoffSettings")(backoffSettings)
    __obj.updateDynamic("retryCodes")(retryCodes)
    __obj.asInstanceOf[RetryOptions]
  }
}

