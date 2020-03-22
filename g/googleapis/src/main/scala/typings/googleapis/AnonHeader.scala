package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeader extends js.Object {
  var header: js.UndefOr[AnonArgs] = js.native
  var urls: js.UndefOr[js.Array[AnonResult]] = js.native
}

object AnonHeader {
  @scala.inline
  def apply(header: AnonArgs = null, urls: js.Array[AnonResult] = null): AnonHeader = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}

