package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Header extends js.Object {
  var header: js.UndefOr[Anon_Args] = js.native
  var urls: js.UndefOr[js.Array[Anon_DetailsResult]] = js.native
}

object Anon_Header {
  @scala.inline
  def apply(header: Anon_Args = null, urls: js.Array[Anon_DetailsResult] = null): Anon_Header = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Header]
  }
}

