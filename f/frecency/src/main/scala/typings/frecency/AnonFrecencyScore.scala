package typings.frecency

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrecencyScore extends js.Object {
  var _frecencyScore: js.UndefOr[Double] = js.undefined
}

object AnonFrecencyScore {
  @scala.inline
  def apply(_frecencyScore: Int | Double = null): AnonFrecencyScore = {
    val __obj = js.Dynamic.literal()
    if (_frecencyScore != null) __obj.updateDynamic("_frecencyScore")(_frecencyScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrecencyScore]
  }
}

