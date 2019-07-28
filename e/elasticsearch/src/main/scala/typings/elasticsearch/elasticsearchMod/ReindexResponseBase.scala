package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexResponseBase extends js.Object {
  var batches: Double
  var deleted: Double
  var noops: Double
  var requests_per_second: Double
  var retries: Anon_Bulk
  var throttled_millis: Double
  var throttled_until_millis: Double
  var total: Double
  var updated: Double
  var version_conflicts: Double
}

object ReindexResponseBase {
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    noops: Double,
    requests_per_second: Double,
    retries: Anon_Bulk,
    throttled_millis: Double,
    throttled_until_millis: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexResponseBase = {
    val __obj = js.Dynamic.literal(batches = batches, deleted = deleted, noops = noops, requests_per_second = requests_per_second, retries = retries, throttled_millis = throttled_millis, throttled_until_millis = throttled_until_millis, total = total, updated = updated, version_conflicts = version_conflicts)
  
    __obj.asInstanceOf[ReindexResponseBase]
  }
}

