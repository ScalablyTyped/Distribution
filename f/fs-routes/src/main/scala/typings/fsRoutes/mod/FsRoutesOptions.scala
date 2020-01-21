package typings.fsRoutes.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsRoutesOptions extends js.Object {
  var glob: js.UndefOr[String] = js.undefined
  var indexFileRegExp: js.UndefOr[RegExp] = js.undefined
}

object FsRoutesOptions {
  @scala.inline
  def apply(glob: String = null, indexFileRegExp: RegExp = null): FsRoutesOptions = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (indexFileRegExp != null) __obj.updateDynamic("indexFileRegExp")(indexFileRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsRoutesOptions]
  }
}

