package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_N extends js.Object {
  var N: js.UndefOr[Double] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
}

object Anon_N {
  @scala.inline
  def apply(N: Int | Double = null, p: Int | Double = null, r: Int | Double = null): Anon_N = {
    val __obj = js.Dynamic.literal()
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_N]
  }
}

