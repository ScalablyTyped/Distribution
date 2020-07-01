package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pass extends js.Object {
  var pass: js.UndefOr[Boolean] = js.native
  var score: js.UndefOr[Double] = js.native
}

object Pass {
  @scala.inline
  def apply(pass: js.UndefOr[Boolean] = js.undefined, score: js.UndefOr[Double] = js.undefined): Pass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pass)) __obj.updateDynamic("pass")(pass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
}

