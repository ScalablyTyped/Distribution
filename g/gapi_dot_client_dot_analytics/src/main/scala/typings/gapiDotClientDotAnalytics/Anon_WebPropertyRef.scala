package typings.gapiDotClientDotAnalytics

import typings.gapiDotClientDotAnalytics.gapi.client.analytics.WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.undefined
}

object Anon_WebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: WebPropertyRef = null): Anon_WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WebPropertyRef]
  }
}

