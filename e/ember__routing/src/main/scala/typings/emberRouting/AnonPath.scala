package typings.emberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: js.UndefOr[String] = js.undefined
  var resetNamespace: js.UndefOr[Boolean] = js.undefined
}

object AnonPath {
  @scala.inline
  def apply(path: String = null, resetNamespace: js.UndefOr[Boolean] = js.undefined): AnonPath = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(resetNamespace)) __obj.updateDynamic("resetNamespace")(resetNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
}

