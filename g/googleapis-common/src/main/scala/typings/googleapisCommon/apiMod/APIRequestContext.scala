package typings.googleapisCommon.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIRequestContext extends js.Object {
  var _options: GlobalOptions
  var google: js.UndefOr[GoogleConfigurable] = js.undefined
}

object APIRequestContext {
  @scala.inline
  def apply(_options: GlobalOptions, google: GoogleConfigurable = null): APIRequestContext = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
    if (google != null) __obj.updateDynamic("google")(google.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIRequestContext]
  }
}

