package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Multipart extends js.Object {
  var multipart: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
}

object Anon_Multipart {
  @scala.inline
  def apply(multipart: js.UndefOr[Boolean] = js.undefined, path: String = null): Anon_Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Multipart]
  }
}

