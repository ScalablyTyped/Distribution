package typings.fuseJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  var score: Double
}

object Score {
  @scala.inline
  def apply(score: Double): Score = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
}

