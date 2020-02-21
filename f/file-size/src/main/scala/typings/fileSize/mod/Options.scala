package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fixed: js.UndefOr[Double] = js.undefined
  var spacer: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(fixed: Int | Double = null, spacer: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

