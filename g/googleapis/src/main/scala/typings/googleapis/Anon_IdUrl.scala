package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IdUrl extends js.Object {
  var id: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_IdUrl {
  @scala.inline
  def apply(id: String = null, url: String = null): Anon_IdUrl = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdUrl]
  }
}

