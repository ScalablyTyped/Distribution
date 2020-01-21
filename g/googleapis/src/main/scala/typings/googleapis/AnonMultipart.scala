package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMultipart extends js.Object {
  var multipart: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
}

object AnonMultipart {
  @scala.inline
  def apply(multipart: js.UndefOr[Boolean] = js.undefined, path: String = null): AnonMultipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultipart]
  }
}

