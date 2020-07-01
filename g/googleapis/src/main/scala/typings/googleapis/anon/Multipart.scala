package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipart extends js.Object {
  var multipart: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
}

object Multipart {
  @scala.inline
  def apply(multipart: js.UndefOr[Boolean] = js.undefined, path: String = null): Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipart]
  }
}

