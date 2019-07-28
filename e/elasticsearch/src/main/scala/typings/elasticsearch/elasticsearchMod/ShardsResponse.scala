package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardsResponse extends js.Object {
  var failed: Double
  var skipped: Double
  var successful: Double
  var total: Double
}

object ShardsResponse {
  @scala.inline
  def apply(failed: Double, skipped: Double, successful: Double, total: Double): ShardsResponse = {
    val __obj = js.Dynamic.literal(failed = failed, skipped = skipped, successful = successful, total = total)
  
    __obj.asInstanceOf[ShardsResponse]
  }
}

