package typings.expoDashFileDashSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Md5 extends js.Object {
  var md5: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Boolean] = js.undefined
}

object Anon_Md5 {
  @scala.inline
  def apply(md5: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Boolean] = js.undefined): Anon_Md5 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(md5)) __obj.updateDynamic("md5")(md5)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Md5]
  }
}

