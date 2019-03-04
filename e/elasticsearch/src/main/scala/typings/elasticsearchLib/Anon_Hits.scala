package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hits[T] extends js.Object {
  var hits: js.Array[Anon_Explanation[T]]
  var max_score: scala.Double
  var total: scala.Double
}

object Anon_Hits {
  @scala.inline
  def apply[T](hits: js.Array[Anon_Explanation[T]], max_score: scala.Double, total: scala.Double): Anon_Hits[T] = {
    val __obj = js.Dynamic.literal(hits = hits, max_score = max_score, total = total)
  
    __obj.asInstanceOf[Anon_Hits[T]]
  }
}

