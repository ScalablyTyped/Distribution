package typings.gapiDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
  var webViewId: js.UndefOr[String] = js.undefined
}

object View {
  @scala.inline
  def apply(accountId: String = null, webPropertyId: String = null, webViewId: String = null): View = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    if (webViewId != null) __obj.updateDynamic("webViewId")(webViewId)
    __obj.asInstanceOf[View]
  }
}

