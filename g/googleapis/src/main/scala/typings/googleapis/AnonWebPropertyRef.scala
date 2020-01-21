package typings.googleapis

import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWebPropertyRef extends js.Object {
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}

object AnonWebPropertyRef {
  @scala.inline
  def apply(webPropertyRef: SchemaWebPropertyRef = null): AnonWebPropertyRef = {
    val __obj = js.Dynamic.literal()
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWebPropertyRef]
  }
}

