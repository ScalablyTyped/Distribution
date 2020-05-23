package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hits[T] extends js.Object {
  var hits: js.Array[Explanation[T]]
  var max_score: Double
  var total: Double
}

object Hits {
  @scala.inline
  def apply[T](hits: js.Array[Explanation[T]], max_score: Double, total: Double): Hits[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hits[T]]
  }
}

