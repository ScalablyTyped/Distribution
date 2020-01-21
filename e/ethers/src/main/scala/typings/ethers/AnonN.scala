package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonN extends js.Object {
  var N: js.UndefOr[Double] = js.undefined
  var p: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
}

object AnonN {
  @scala.inline
  def apply(N: Int | Double = null, p: Int | Double = null, r: Int | Double = null): AnonN = {
    val __obj = js.Dynamic.literal()
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonN]
  }
}

