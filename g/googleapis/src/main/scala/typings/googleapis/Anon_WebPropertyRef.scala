package typings.googleapis

import typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Schema$WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_WebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[Schema$WebPropertyRef] = js.native
}

object Anon_WebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: Schema$WebPropertyRef = null): Anon_WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WebPropertyRef]
  }
}

