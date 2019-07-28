package typings.gapiDotClientDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Score extends js.Object {
  /**
    * The score (0-100) for this rule group, which indicates how much better a page could be in that category (e.g. how much faster, or how much more
    * usable). A high score indicates little room for improvement, while a lower score indicates more room for improvement.
    */
  var score: js.UndefOr[Double] = js.undefined
}

object Anon_Score {
  @scala.inline
  def apply(score: Int | Double = null): Anon_Score = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Score]
  }
}

