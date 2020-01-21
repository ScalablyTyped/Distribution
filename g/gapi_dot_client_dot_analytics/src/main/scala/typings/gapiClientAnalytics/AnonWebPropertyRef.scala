package typings.gapiClientAnalytics

import typings.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.undefined
}

object AnonWebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: WebPropertyRef = null): AnonWebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWebPropertyRef]
  }
}

