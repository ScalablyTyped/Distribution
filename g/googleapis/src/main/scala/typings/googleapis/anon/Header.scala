package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  var header: js.UndefOr[Args] = js.native
  var urls: js.UndefOr[js.Array[Result]] = js.native
}

object Header {
  @scala.inline
  def apply(header: Args = null, urls: js.Array[Result] = null): Header = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

