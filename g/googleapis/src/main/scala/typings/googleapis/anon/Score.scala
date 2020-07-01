package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Score extends js.Object {
  var score: js.UndefOr[Double] = js.native
}

object Score {
  @scala.inline
  def apply(score: js.UndefOr[Double] = js.undefined): Score = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

