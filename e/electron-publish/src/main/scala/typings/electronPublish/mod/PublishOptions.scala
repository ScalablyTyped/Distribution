package typings.electronPublish.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  var publish: js.UndefOr[PublishPolicy | Null] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(publish: js.UndefOr[Null | PublishPolicy] = js.undefined): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishOptions]
  }
}

