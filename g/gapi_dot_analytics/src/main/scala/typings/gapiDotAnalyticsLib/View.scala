package typings
package gapiDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var webViewId: js.UndefOr[java.lang.String] = js.undefined
}

object View {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    webPropertyId: java.lang.String = null,
    webViewId: java.lang.String = null
  ): View = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    if (webViewId != null) __obj.updateDynamic("webViewId")(webViewId)
    __obj.asInstanceOf[View]
  }
}

