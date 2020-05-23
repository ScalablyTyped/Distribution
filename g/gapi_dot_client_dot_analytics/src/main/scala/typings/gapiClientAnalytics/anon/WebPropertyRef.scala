package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.undefined
}

object WebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: typings.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef = null): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPropertyRef]
  }
}

