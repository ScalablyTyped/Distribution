package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Url extends js.Object {
  var url: js.UndefOr[String] = js.native
}

object Anon_Url {
  @scala.inline
  def apply(url: String = null): Anon_Url = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Url]
  }
}

