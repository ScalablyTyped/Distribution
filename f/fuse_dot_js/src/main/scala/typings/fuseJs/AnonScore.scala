package typings.fuseJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScore extends js.Object {
  var score: Double
}

object AnonScore {
  @scala.inline
  def apply(score: Double): AnonScore = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScore]
  }
}

