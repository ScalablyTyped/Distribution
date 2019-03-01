package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.WebPropertyRef] = js.undefined
}

object Anon_WebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.WebPropertyRef = null): Anon_WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef)
    __obj.asInstanceOf[Anon_WebPropertyRef]
  }
}

