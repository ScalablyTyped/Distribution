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

