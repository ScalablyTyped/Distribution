package typings.gapiClientPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  /**
    * The score (0-100) for this rule group, which indicates how much better a page could be in that category (e.g. how much faster, or how much more
    * usable). A high score indicates little room for improvement, while a lower score indicates more room for improvement.
    */
  var score: js.UndefOr[Double] = js.undefined
}

object Score {
  @scala.inline
  def apply(score: js.UndefOr[Double] = js.undefined): Score = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

