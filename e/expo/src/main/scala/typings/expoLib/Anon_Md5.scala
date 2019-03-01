package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Md5 extends js.Object {
  var md5: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Md5 {
  @scala.inline
  def apply(md5: java.lang.String = null, size: js.UndefOr[scala.Boolean] = js.undefined): Anon_Md5 = {
    val __obj = js.Dynamic.literal()
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Md5]
  }
}

