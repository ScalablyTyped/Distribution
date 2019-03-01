package typings
package electronDashPublishLib.electronDashPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  var publish: js.UndefOr[PublishPolicy | scala.Null] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(publish: PublishPolicy = null): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (publish != null) __obj.updateDynamic("publish")(publish)
    __obj.asInstanceOf[PublishOptions]
  }
}

