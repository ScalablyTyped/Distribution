package typings.atEmberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: js.UndefOr[String] = js.undefined
  var resetNamespace: js.UndefOr[Boolean] = js.undefined
}

object Anon_Path {
  @scala.inline
  def apply(path: String = null, resetNamespace: js.UndefOr[Boolean] = js.undefined): Anon_Path = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(resetNamespace)) __obj.updateDynamic("resetNamespace")(resetNamespace)
    __obj.asInstanceOf[Anon_Path]
  }
}

