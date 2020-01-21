package typings.elasticsearch.mod

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
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShardsResponse]
  }
}

