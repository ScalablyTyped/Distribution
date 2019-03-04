package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIntentRequest extends js.Object {
  var intent: Intent
  var intentView: js.UndefOr[IntentView] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
}

object CreateIntentRequest {
  @scala.inline
  def apply(
    intent: Intent,
    parent: java.lang.String,
    intentView: IntentView = null,
    languageCode: java.lang.String = null
  ): CreateIntentRequest = {
    val __obj = js.Dynamic.literal(intent = intent, parent = parent)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[CreateIntentRequest]
  }
}

