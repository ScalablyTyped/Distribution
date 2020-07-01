package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}

object WebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: SchemaWebPropertyRef = null): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPropertyRef]
  }
}

