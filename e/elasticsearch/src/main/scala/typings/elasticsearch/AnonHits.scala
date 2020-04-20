package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHits[T] extends js.Object {
  var hits: js.Array[AnonExplanation[T]]
  var max_score: Double
  var total: Double
}

object AnonHits {
  @scala.inline
  def apply[T](hits: js.Array[AnonExplanation[T]], max_score: Double, total: Double): AnonHits[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHits[T]]
  }
}

