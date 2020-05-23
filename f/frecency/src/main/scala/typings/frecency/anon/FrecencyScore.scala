package typings.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrecencyScore extends js.Object {
  var _frecencyScore: js.UndefOr[Double] = js.undefined
}

object FrecencyScore {
  @scala.inline
  def apply(_frecencyScore: js.UndefOr[Double] = js.undefined): FrecencyScore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_frecencyScore)) __obj.updateDynamic("_frecencyScore")(_frecencyScore.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrecencyScore]
  }
}

