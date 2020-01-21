package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPass extends js.Object {
  var pass: js.UndefOr[Boolean] = js.native
  var score: js.UndefOr[Double] = js.native
}

object AnonPass {
  @scala.inline
  def apply(pass: js.UndefOr[Boolean] = js.undefined, score: Int | Double = null): AnonPass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pass)) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPass]
  }
}

