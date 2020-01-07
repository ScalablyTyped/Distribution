package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Score extends js.Object {
  var score: js.UndefOr[Double] = js.native
}

object Anon_Score {
  @scala.inline
  def apply(score: Int | Double = null): Anon_Score = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Score]
  }
}

