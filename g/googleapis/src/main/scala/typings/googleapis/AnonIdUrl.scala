package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIdUrl extends js.Object {
  var id: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonIdUrl {
  @scala.inline
  def apply(id: String = null, url: String = null): AnonIdUrl = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdUrl]
  }
}

