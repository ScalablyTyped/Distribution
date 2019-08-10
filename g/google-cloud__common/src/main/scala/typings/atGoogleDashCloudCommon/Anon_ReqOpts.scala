package typings.atGoogleDashCloudCommon

import typings.teenyDashRequest.teenyDashRequestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReqOpts extends js.Object {
  var reqOpts: js.UndefOr[CoreOptions] = js.undefined
}

object Anon_ReqOpts {
  @scala.inline
  def apply(reqOpts: CoreOptions = null): Anon_ReqOpts = {
    val __obj = js.Dynamic.literal()
    if (reqOpts != null) __obj.updateDynamic("reqOpts")(reqOpts)
    __obj.asInstanceOf[Anon_ReqOpts]
  }
}

