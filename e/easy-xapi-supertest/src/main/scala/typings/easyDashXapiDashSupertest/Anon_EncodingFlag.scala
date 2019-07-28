package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlag extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object Anon_EncodingFlag {
  @scala.inline
  def apply(encoding: String = null, flag: String = null, mode: Int | Double = null): Anon_EncodingFlag = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlag]
  }
}

