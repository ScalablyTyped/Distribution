package typings.globrex.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  /** This property only exists if the option `filepath` is true. */
  var path: js.UndefOr[Path] = js.undefined
  /** JavaScript RegExp instance. */
  var regex: RegExp
}

object Results {
  @scala.inline
  def apply(regex: RegExp, path: Path = null): Results = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

