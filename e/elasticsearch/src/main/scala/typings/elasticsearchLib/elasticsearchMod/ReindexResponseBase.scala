package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexResponseBase extends js.Object {
  var batches: scala.Double
  var deleted: scala.Double
  var noops: scala.Double
  var requests_per_second: scala.Double
  var retries: elasticsearchLib.Anon_Bulk
  var throttled_millis: scala.Double
  var throttled_until_millis: scala.Double
  var total: scala.Double
  var updated: scala.Double
  var version_conflicts: scala.Double
}

object ReindexResponseBase {
  @scala.inline
  def apply(
    batches: scala.Double,
    deleted: scala.Double,
    noops: scala.Double,
    requests_per_second: scala.Double,
    retries: elasticsearchLib.Anon_Bulk,
    throttled_millis: scala.Double,
    throttled_until_millis: scala.Double,
    total: scala.Double,
    updated: scala.Double,
    version_conflicts: scala.Double
  ): ReindexResponseBase = {
    val __obj = js.Dynamic.literal(batches = batches, deleted = deleted, noops = noops, requests_per_second = requests_per_second, retries = retries, throttled_millis = throttled_millis, throttled_until_millis = throttled_until_millis, total = total, updated = updated, version_conflicts = version_conflicts)
  
    __obj.asInstanceOf[ReindexResponseBase]
  }
}

