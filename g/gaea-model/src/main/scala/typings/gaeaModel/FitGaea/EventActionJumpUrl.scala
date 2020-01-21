package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActionJumpUrl extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object EventActionJumpUrl {
  @scala.inline
  def apply(url: String = null): EventActionJumpUrl = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventActionJumpUrl]
  }
}

