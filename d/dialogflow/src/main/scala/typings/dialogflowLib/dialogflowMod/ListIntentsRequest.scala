package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIntentsRequest extends js.Object {
  var intentView: js.UndefOr[IntentView] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var parent: java.lang.String
}

object ListIntentsRequest {
  @scala.inline
  def apply(
    parent: java.lang.String,
    intentView: IntentView = null,
    languageCode: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null
  ): ListIntentsRequest = {
    val __obj = js.Dynamic.literal(parent = parent)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIntentsRequest]
  }
}

