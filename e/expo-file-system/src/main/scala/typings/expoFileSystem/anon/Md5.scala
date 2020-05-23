package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Md5 extends js.Object {
  var md5: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Boolean] = js.undefined
}

object Md5 {
  @scala.inline
  def apply(md5: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Boolean] = js.undefined): Md5 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(md5)) __obj.updateDynamic("md5")(md5.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md5]
  }
}

