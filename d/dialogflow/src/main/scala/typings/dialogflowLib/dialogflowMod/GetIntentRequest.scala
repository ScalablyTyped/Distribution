package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntentRequest extends js.Object {
  var intentView: js.UndefOr[IntentView] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object GetIntentRequest {
  @scala.inline
  def apply(name: java.lang.String, intentView: IntentView = null, languageCode: java.lang.String = null): GetIntentRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[GetIntentRequest]
  }
}

