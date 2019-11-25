package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hits[T] extends js.Object {
  var hits: js.Array[Anon_Explanation[T]]
  var max_score: Double
  var total: Double
}

object Anon_Hits {
  @scala.inline
  def apply[T](hits: js.Array[Anon_Explanation[T]], max_score: Double, total: Double): Anon_Hits[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hits[T]]
  }
}

