package typings.ethersprojectBytes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R extends js.Object {
  var _vs: js.UndefOr[String] = js.undefined
  var r: String
  var recoveryParam: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[String] = js.undefined
  var v: js.UndefOr[Double] = js.undefined
}

object R {
  @scala.inline
  def apply(
    r: String,
    _vs: String = null,
    recoveryParam: js.UndefOr[Double] = js.undefined,
    s: String = null,
    v: js.UndefOr[Double] = js.undefined
  ): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    if (_vs != null) __obj.updateDynamic("_vs")(_vs.asInstanceOf[js.Any])
    if (!js.isUndefined(recoveryParam)) __obj.updateDynamic("recoveryParam")(recoveryParam.get.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
}

