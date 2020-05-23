package typings.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: js.UndefOr[String] = js.undefined
  var resetNamespace: js.UndefOr[Boolean] = js.undefined
}

object Path {
  @scala.inline
  def apply(path: String = null, resetNamespace: js.UndefOr[Boolean] = js.undefined): Path = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(resetNamespace)) __obj.updateDynamic("resetNamespace")(resetNamespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

