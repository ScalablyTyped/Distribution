package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScore extends js.Object {
  var score: js.UndefOr[Double] = js.native
}

object AnonScore {
  @scala.inline
  def apply(score: Int | Double = null): AnonScore = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScore]
  }
}

