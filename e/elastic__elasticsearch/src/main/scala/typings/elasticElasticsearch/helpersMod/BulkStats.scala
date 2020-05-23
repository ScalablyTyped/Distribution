package typings.elasticElasticsearch.helpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkStats extends js.Object {
  var aborted: Boolean
  var bytes: Double
  var failed: Double
  var retry: Double
  var successful: Double
  var time: Double
  var total: Double
}

object BulkStats {
  @scala.inline
  def apply(
    aborted: Boolean,
    bytes: Double,
    failed: Double,
    retry: Double,
    successful: Double,
    time: Double,
    total: Double
  ): BulkStats = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkStats]
  }
}

