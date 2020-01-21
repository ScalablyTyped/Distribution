package typings.googleCloudCommon

import typings.teenyRequest.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReqOpts extends js.Object {
  var reqOpts: js.UndefOr[CoreOptions] = js.undefined
}

object AnonReqOpts {
  @scala.inline
  def apply(reqOpts: CoreOptions = null): AnonReqOpts = {
    val __obj = js.Dynamic.literal()
    if (reqOpts != null) __obj.updateDynamic("reqOpts")(reqOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReqOpts]
  }
}

