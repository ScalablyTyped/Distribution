package typings.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMd5 extends js.Object {
  var md5: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Boolean] = js.undefined
}

object AnonMd5 {
  @scala.inline
  def apply(md5: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Boolean] = js.undefined): AnonMd5 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(md5)) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMd5]
  }
}

