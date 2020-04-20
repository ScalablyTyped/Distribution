package typings.googleapisCommon.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleConfigurable extends js.Object {
  var _options: GlobalOptions
}

object GoogleConfigurable {
  @scala.inline
  def apply(_options: GlobalOptions): GoogleConfigurable = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleConfigurable]
  }
}

