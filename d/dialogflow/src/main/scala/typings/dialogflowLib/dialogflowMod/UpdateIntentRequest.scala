package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIntentRequest extends js.Object {
  var intent: Intent
  var intentView: js.UndefOr[IntentView] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var updateMask: js.UndefOr[js.Any] = js.undefined
}

object UpdateIntentRequest {
  @scala.inline
  def apply(
    intent: Intent,
    intentView: IntentView = null,
    languageCode: java.lang.String = null,
    updateMask: js.Any = null
  ): UpdateIntentRequest = {
    val __obj = js.Dynamic.literal(intent = intent)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[UpdateIntentRequest]
  }
}

