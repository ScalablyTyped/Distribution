package typings.googleCloudCommon.anon

import typings.teenyRequest.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqOpts extends js.Object {
  var reqOpts: js.UndefOr[CoreOptions] = js.undefined
}

object ReqOpts {
  @scala.inline
  def apply(reqOpts: CoreOptions = null): ReqOpts = {
    val __obj = js.Dynamic.literal()
    if (reqOpts != null) __obj.updateDynamic("reqOpts")(reqOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqOpts]
  }
}

