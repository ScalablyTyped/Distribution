package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUrl extends js.Object {
  var url: js.UndefOr[String] = js.native
}

object AnonUrl {
  @scala.inline
  def apply(url: String = null): AnonUrl = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

